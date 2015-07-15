grammar Cymbol;

file: (functionDecl | varDecl)+ ;

varDecl: type ID ('=' expr)? ';' ;

type: 'float' | 'int' | 'void' ; // user-defined types

functionDecl: type ID '(' formalParameters? ')' block ; // "void f(int x) {...}"

formalParameters: formalParameter (',' formalParameter)* ;

formalParameter: type ID;

block: '{' stat* '}' ; // possibly empty statement block
stat: block
	| varDecl
	| 'if' expr 'then' stat ('else' stat)?
	| 'return' expr? ';'
	| expr '=' expr ';' // assignment
	| expr ';' // func call
	;
	
expr: ID '(' exprList? ')' 	# Call
	| expr '[' expr ']' 	# Index
	| '-' expr 				# Negate
	| '!' expr 				# Not
	| expr '*' expr 		# Mult
	| expr ('+'|'-') expr 	# AddSub
	| expr '==' expr 		# Equal
	| ID 					# Var
	| INT 					# Int
	| '(' expr ')' 			# Parens
	;

exprList : expr (',' expr)* ; // arg list

DIGIT : [0-9] ;

ID : LETTER (LETTER|DIGIT)*;
fragment
LETTER : [a-zA-Z\u0080-\u00FF_] ;

INT : '-'? DIGIT+ ;
