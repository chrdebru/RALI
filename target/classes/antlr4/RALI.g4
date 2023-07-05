grammar RALI;

/*
 * Parser Rules
 */

start : expression ;

expression 
	: LABEL														# Relation 
	| left=expression operator='TIMES' right=expression			# CartesianProduct
	| left=expression operator='UNION' right=expression 		# Union
	| left=expression operator='INTERSECT' right=expression 	# Intersection
	| left=expression operator='DIVIDES' right=expression		# Division
	| left=expression operator='JOIN' right=expression 			# NaturalJoin
	| left=expression operator='MINUS' right=expression 		# Difference
	| '(' expression ')'										# Parens
	;

/*
 * Lexer Rules
 */
 
RESERVED 	: 'TIMES' | 'DIVIDES' | 'UNION' | 'UNION' | 'INTERSECT' | 'MINUS' ;

NUMBER : [0-9]+;
LABEL : [A-Z] ([A-Z] | [0-9])*;

WHITESPACE: [ \r\n\t]+ -> skip;
