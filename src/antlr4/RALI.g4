grammar RALI;

/*
 * Parser Rules
 */

start : expression ;

expression 
	: LABEL														# Relation 
//	| inlinerelation											# InlineRelation
	| left=expression operator='PRODUCT' right=expression		# CartesianProduct
	| left=expression operator='UNION' right=expression 		# Union
	| left=expression operator='INTERSECTION' right=expression 	# Intersection
	| left=expression operator='DIVISION' right=expression		# Division
	| left=expression operator='JOIN' right=expression 			# NaturalJoin
	| left=expression operator='DIFFERENCE' right=expression 	# Difference
	| '(' expression ')'										# Parens
	;

/*
 * Lexer Rules
 */
 
RESERVED 	: 'TIMES' | 'DIVISION' | 'INTERSECTION' | 'UNION' | 'PRODUCT' | 'DIFFERENCE' ;

NUMBER : [0-9]+;
LABEL : [A-Z] ([A-Z] | [0-9])*;

WHITESPACE: [ \r\n\t]+ -> skip;
