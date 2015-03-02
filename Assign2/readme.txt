Assignment 2

Recursion is a very powerful programming tool. However, there are places where it is not the best approach. We will look at two cases in this assignment. In the first case, recursion is a terrible approach. In the second example, recursion is not the most efficient approach, but it is easy to implement.

Part 1

The function 'vbrf' (for very bad recursive function) is defined as follows:

vbrf(0) = 2
vbrf(1) = 3
vbrf(2) = 4
vbrf(3) = 5
vbrf(n) = vbrf(n-1) - vbrf(n-2) + 3*vbrf(n-3) - 2*vbrf(n-4) if n > 3
Your job for this problem is to implement the function vbrf as a method in Java. Then write a program that uses this method to compute the function for various values of the argument and time how long it takes to compute. Also, include in this program a part that computes the function for the arguments from 1 to 12 and displays the argument and the results. Once you have the program working and can examine the results, report the following in a comment near the beginning of your program file:

Identify the function and describe a much quicker way to compute it.
Identify the smallest value of the argument for which it takes at least 10 seconds to compute the value of vbrf. Report the argument value and how long the function took, in seconds.
To determine how long it takes to compute vbrf, use code something like the following:

long t0 = System.nanoTime();
int x = vbrf(15);
long t1 = System.nanoTime();
double timeInSeconds = (t1-t0)*1.0e-9;
            
Be aware, the time it takes to compute vbrf(n+1) is almost twice the time it takes to compute vbrf(n). Start with small values of n and work your way up.

Part 2

We will be studying one aspect of permutations in Assignment #5. We will make use of a function that is defined recursively. Your job for this part of the assignment is to implement this function and print the first few values. Implement the method as a static method that takes a long for an argument and returns a long. The method itself should do no printing.

We'll call the function h. It is defined by these conditions:

h(0) = 1
h(1) = 0
h(n) = (n-1)*(h(n-1) + h(n-2)) for n > 1
To check your work, here are the first few values of h:

n	h(n)
0	1
1	0
2	1
3	2
4	9
5	44
6	265
7	1854
8	14833
9	133496
10	1334961
11	14684570
12	176214841
13	2290792932
14	32071101049
15	481066515734
Your program should print the first 10 values or so of the function. Your program should not be interactive!
