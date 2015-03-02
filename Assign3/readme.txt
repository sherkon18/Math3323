These two java file are implementing a ".jar" file named Math3323-sp15.jar 
A required path build will be required
link for math3323-sp15.jar 
https://drive.google.com/open?id=0B1Bg2ou0gihDVm1ZMFF5LXdtelk&authuser=0

Assignment 3

Relationships in Sequences

The document Relations in Sequences explains the underlying concepts of this lab.

Coding

To carry out this exercise will require writing one or two programs using the 3323 library. Check the 3323 Library Page for details on installing and using the library.

The library was compiled under Java 8, so you may need to install that version of Java to be able to use the library.

In the lab we'll walk through the example of finding a relationship for the square function. Here are the basic steps:

Create a project and install the library
Create a class file for the example and create a main method
Define a Sequence class or object that computes the square function
Demonstrate the equations that a linear relationship implies.
Create a matrix by filling with the sequence and compare the result with the equations we just created
Reduce the matrix and retrieve the simplified equations
Write down the relationship
Write some code that checks the relationship
The document Relations in Sequences contains a more complex example. The code used to analyze that example is in the Java source file CombinationOfPowersSequenceForDocument.java You may find that example as a good basis for the second problem.

Part 1

Determine a candidate relationship for the sequence that goes like this:

0 0 0 0 1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4 5 5 5 5 6 6 6 6 7 7 7 7 8 8 8 8 9 9 9 9 10 10 10 10 11 11 11 11 12 12  ...
            
That is, each number is repeated four times. There is actually a very simple way to compute this directly in Java, but you can work by just putting the values directly into your program.

Part 2

Determine a candidate relationship for the sequence that goes like this:

0, 1, 2, 3, 2, 1, 0, 1, 2, 3,  2, 1, 0, 1, 2, 3, 2, 1, 0, 1, 2, 3,  2, 1, 0, 1, 2, 3, 2, 1, 0, 1, 2, 3,  2, 1, 0, 1, 2, 3, 2, 1, 0, 1, 2, 3,  2, 1,
            
This is a 'sawtooth' wave, it goes up and down like the teeth on a saw. The relationship you present should use no more than the terms q[i] through q[i-4] (or q[i] through q[i+4] if you present it that way).

You can use the numbers above to create an array that you can use for values.

