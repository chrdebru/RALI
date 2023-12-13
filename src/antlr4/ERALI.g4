grammar ERALI;

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
	| left=expression operator='INTERSECTION' right=expression 	# Intersection

	// Then difference and union
	| left=expression 
	  operator=diffUnionOperator 
	  right=expression 	    									# DifferenceOrUnion
	
	| '(' expression ')'										# Parens
	;

joinsOperator:
	'PRODUCT'| 'JOIN'| 'DIVISION'
;

diffUnionOperator:
	'MINUS'| 'UNION'
;

selection :
	'SELECT'
	condition
	'('
		expression
	')'
;

rename :
	'RENAME'
	aliases+=alias (',' aliases+=alias)* 
	'('
		expression
	')'
;

alias :
	LABEL '<-' LABEL
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
