grammar RALI;

/*
 * Parser Rules
 */

statement 
	: label=LABEL '=' expression								# Assignment
	| expression												# Query
;

expression 
	: LABEL														# Relation 
	| inlinerelation											# Constant
	| projection                                                # Pi
	| selection													# Sigma
	| left=expression operator='PRODUCT' right=expression		# CartesianProduct
	| left=expression operator='UNION' right=expression 		# Union
	| left=expression operator='INTERSECTION' right=expression 	# Intersection
	| left=expression operator='DIVISION' right=expression		# Division
	| left=expression operator='JOIN' right=expression 			# NaturalJoin
	| left=expression operator='MINUS' right=expression 	    # Difference
	| '(' expression ')'										# Parens
	;

selection :
	'SELECT'
	condition
	'('
		expression
	')'
;

condition 
    : atomicformula												# atom
    | 'NOT' cond=condition										# negation
    | left=condition op='AND' right=condition 					# and
    | left=condition op='OR' right=condition 					# or
	| '(' condition ')'											# cond
;


atomicformula :
	left=attributeorvalue
	op=('=' | '<' | '<=' | '>' | '>=' | '<>')
	right=attributeorvalue
;

attributeorvalue : (LABEL | value) ;

projection :
	'PROJECT'
	'{' 
		attributes+=LABEL (',' attributes+=LABEL)* 
	'}'
	'('
		expression
	')'
;
	
inlinerelation :
	'[' 
		attributes+=attribute (',' attributes+=attribute)* 
	']'
	'{'
		(tuples+=tuple (',' tuples+=tuple)*)?
	'}'
;

attribute:
	label=LABEL (':' type=('STRING' | 'INTEGER' | 'DECIMAL' | 'DATE' ))?
;

tuple:
	'(' values+=value (',' values+=value)* ')'
;

value:
	INTEGER | DECIMAL | STRING | DATE
;


/*
 * Lexer Rules
 */
 
RESERVED 	: 'TIMES' | 'DIVISION' | 'INTERSECTION' | 'UNION' | 'PRODUCT' | 'DIFFERENCE' 
			  'STRING' | 'INTEGER' | 'DECIMAL' | 'DATE' ;

LABEL : [A-Z] ([A-Z] | [0-9] | '_')*;
INTEGER : '-'? [0-9]+;
DECIMAL : '-'? [0-9]+ ('.' [0-9]+)?;
STRING : '"' (~[\r\n"])* '"' ;
DATE: [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9];

WHITESPACE: [ \r\n\t]+ -> skip;
