grammar RALI;

/*
 * Parser Rules
 */

statement 
	: label=LABEL EQ expression								    # Assignment
	| expression												# Query
;

expression 
	: LABEL														# Relation 
	| inlinerelation											# Constant
	
	// Unary operators first
	| projection                                                # Pi
	| selection													# Sigma
	| rename													# Rho

	// Then cartesian products and joins
	| left=expression 
	  operator=joinsOperator 
	  (cond=condition)? 
	  right=expression											# Joins

	// Then intersection
	| left=expression operator=INTERSECTION right=expression 	# Intersection

	// Then difference and union
	| left=expression 
	  operator=diffUnionOperator 
	  right=expression 	    									# DifferenceOrUnion
	
	| LPAREN expression RPAREN									# Parens
	;

joinsOperator:
	PRODUCT | JOIN | DIVISION
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
    | left=condition op=OR right=condition 					    # or
	| LPAREN condition RPAREN								    # cond
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
	INTEGER | DECIMAL | STRING | DATE
;


/*
 * Lexer Rules
 */
 
SELECT : 'SELECT' ;
RENAME : 'RENAME' ;
PROJECT : 'PROJECT' ;

INTERSECTION : 'INTERSECTION' ;
DIVISION : 'DIVISION' ;
PRODUCT : 'PRODUCT' ;
MINUS : 'MINUS' ;
JOIN : 'JOIN' ;
TIMES : 'TIMES' ;
UNION : 'UNION' ;
DIFFERENCE : 'DIFFERENCE' ;

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

WHITESPACE: [ \r\n\t]+ -> skip;
