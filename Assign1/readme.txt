Assignment 1

Objective

To investigate how functions can be defined both recursively and by formulas using standard mathematical operations.

Cases to Investigate

In each of the 3 cases you are asked to implement a function in two ways. You are then to write a program that computes the values of the function in both ways and verifies that both methods return the same values. Compute the functions for a range of values, say up to 15. Each case will consist of one Java file with the two functions implemented as methods and the main program.1

When implementing the functions, each should take a single long parameter and return a long value.

In one case the two methods actually do not match.

This is very important: Put a comment at the top of each Java file that explains whether the two methods of computing match or do not match. This is a very important part of this project, you will lose points for omitting this analysis.

Case A

The first function can be computed by the simple formula

A(x) = x2

The function can also be computed recursively:

A(0) = 0

A(1) = 1

A(2) = 4

A(n) = 3·A(n-1) - 3·A(n-2) + A(n-3)   if n >= 3

Case B

The second function can be computed by the formula

B(x) = n2·2n + n·3n

The function can also be computed recursively

B(0) = 0

B(1) = 5

B(2) = 34

B(3) = 153

B(4) = 580

B(n) = 12·B(n-1) - 57·B(n-2) + 134·B(n-3) - 156·B(n-4) + 72·B(n-5)   if n >= 5

Case C

The third function can be computed by the formula

C(x) = 12 + 8·n - 3·n2 + n3

The function can also be computed recursively

C(0) = 12

C(1) = 18

C(n) = 2·C(n-1) - C(n-2) for n >= 2
