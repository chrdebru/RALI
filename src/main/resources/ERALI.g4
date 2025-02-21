grammar ERALI;

/*
 * Parser Rules
 */

statement 
	: label=LABEL EQ expression							    	# Assignment
	| expression												# Query
;

expression 
	: LABEL														# Relation 
	| inlinerelation											# Constant
	
	// Unary operators first
	| projection                                                # Pi
	| aggregation												# Gamma
	| sort                                                		# Tau
	| selection													# Sigma
	| rename													# Rho
	| distinct													# Delta

	// Then cartesian products and joins
	| left=expression 
	  operator=joinsOperator 
	  (cond=condition)? 
	  right=expression											# Joins

	// Then intersection
	| left=expression INTERSECTION right=expression 			# Intersection
	// Then set intersection
	| left=expression SET INTERSECTION right=expression 	    # SetIntersection

	// Then difference and union
	| left=expression 
	  operator=diffUnionOperator 
	  right=expression 	    									# DifferenceOrUnion
	  
	// Then difference and union
	| left=expression 
	  SET operator=diffUnionOperator
	  right=expression 	    									# SetDifferenceOrUnion
	  
	
	| LPAREN expression RPAREN									# Parens
	;
	
distinct :
	DISTINCT LPAREN expression RPAREN
;

joinsOperator
	: PRODUCT
	| (dir=(LEFT | RIGHT)? outer=OUTER)? JOIN
	| (set=SET)? DIVISION
;

diffUnionOperator:
	MINUS | UNION
;

selection :
	SELECT
	condition
	LPAREN
		expression
	RPAREN
;

rename :
	RENAME
	aliases+=alias (COMMA aliases+=alias)*
	LPAREN
		expression
	RPAREN
;

alias :
	LABEL LEFTARROW LABEL
;

condition 
    : atomicformula												# atom
    | NOT cond=condition										# negation
    | left=condition op=AND right=condition 					# and
    | left=condition op=OR right=condition 			    		# or
	| LPAREN condition RPAREN									# cond
;


atomicformula :
	left=attributeorvalue
	op=(EQ | LT | LTE | GT | GTE | NEQ)
	right=attributeorvalue
;

attributeorvalue : (LABEL | value) ;

projection :
	PROJECT
	LCURLY 
		attributes+=projectionAttribute (COMMA attributes+=projectionAttribute)*
	RCURLY
	LPAREN
		expression
	RPAREN
;

aggregation :
	GROUP
	(by=LABEL COMMA)?
	aggregationOperation RIGHTARROW attributename=LABEL
	LPAREN
		expression
	RPAREN
;

aggregationOperation :
	op = (AVG | SUM | MIN | MAX | COUNT)
	LPAREN
		projectionExpression
	RPAREN
;

projectionAttribute :
	(exp=projectionExpression RIGHTARROW)? attributename=LABEL
;

projectionExpression
	: projectionExpression op=(NUMMUL | NUMDIV) projectionExpression
    | projectionExpression op=(NUMPLU | NUMMIN) projectionExpression
    | LPAREN projectionExpression RPAREN
    | (LABEL | DECIMAL | INTEGER)
;

sort :
	SORT
	LCURLY 
		attributes+=LABEL (COMMA attributes+=LABEL)*
	RCURLY
	LPAREN
		expression
	RPAREN
;
	
inlinerelation :
	LBRACKET
		attributes+=attribute (COMMA attributes+=attribute)*
	RBRACKET
	LCURLY
		(tuples+=tuple (COMMA tuples+=tuple)*)?
	RCURLY
;

attribute:
	label=LABEL (COLON type=(STRINGTYPE | INTEGERTYPE | DECIMALTYPE | DATETYPE ))?
;

tuple:
	LPAREN values+=value (COMMA values+=value)* RPAREN
;

value:
	INTEGER | DECIMAL | STRING | DATE | null
;

null: 'NULL' ;

/*
 * Lexer Rules
 */
 
SELECT : 'SELECT' ;
RENAME : 'RENAME' ;
PROJECT : 'PROJECT' ;

SET: 'SET' ;
INTERSECTION : 'INTERSECTION' ;
DIVISION : 'DIVISION' ;
PRODUCT : 'PRODUCT' ;
MINUS : 'MINUS' ;
JOIN : 'JOIN' ;
TIMES : 'TIMES' ;
UNION : 'UNION' ;
DIFFERENCE : 'DIFFERENCE' ;

DISTINCT: 'DISTINCT' ;
SORT: 'SORT' ;
LEFT: 'LEFT' ;
RIGHT: 'RIGHT' ;
OUTER: 'OUTER' ;

GROUP: 'GROUP' ;
AVG: 'AVG' ;
SUM: 'SUM' ;
MIN: 'MIN' ;
MAX: 'MAX' ;
COUNT: 'COUNT' ;

STRINGTYPE : 'STRING' ;
INTEGERTYPE : 'INTEGER' ;
DECIMALTYPE : 'DECIMAL' ;
DATETYPE : 'DATE' ;

EQ : '=' ;
NEQ : '<>' ;
LT : '<' ;
GT : '>' ;
LTE : '<=' ;
GTE : '>=' ;

LEFTARROW : '<-' ;
RIGHTARROW : '->' ;

COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
COLON : ':' ;

AND : 'AND' ;
OR : 'OR' ;
NOT : 'NOT' ;

LABEL : [A-Z] ([A-Z] | [0-9] | '_')*;
INTEGER : '-'? [0-9]+;
DECIMAL : '-'? [0-9]+ ('.' [0-9]+)?;
STRING : '"' (~[\r\n"])* '"' ;
DATE: [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9];

NUMMIN : '-' ;
NUMPLU : '+' ;
NUMDIV : '/' ;
NUMMUL : '*' ;

WHITESPACE: [ \r\n\t]+ -> skip;
