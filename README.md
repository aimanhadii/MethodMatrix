# A) MATRIX MANIPULATION AND WRITING INTO FILE [10 MARKS]

A matrix is an array of numbers of size m by n (i.e., m x n). When we multiply 2 matrices, we
multiply the matching numbers, then sum them up. Multiplying a matrix of size m x n with
another matrix ofsize n x q will result in a matrix of size m x q. An example is shown in Figure

1:
[
𝑝 𝑞 𝑟
𝑠 𝑡 𝑢
] x [
𝑎 𝑏
𝑐 𝑑
𝑒 𝑓
] = [
𝑝𝑎 + 𝑞𝑐 + 𝑟𝑒 𝑝𝑏 + 𝑞𝑑 + 𝑟𝑓
𝑠𝑎 + 𝑡𝑐 + 𝑢𝑒 𝑠𝑏 + 𝑡𝑑 + 𝑢𝑓 ]
Figure 1: Multiplication of Matrix 2 x 3 and 3 x 2
Write a Java program that multiplies 2 matrices and return the result of the multiplied matrix.
Your program shall include the following:
a) Define two 2 dimensional arrays, A and B that each represents a matrix of size 2 x 3 and a
matrixof size 3 x 2. Initialize the array values with the following values:
A = [
−9 1 3
14 −5 7
] B = [
1 2
3 4
5 6
]
b) Create a value returning method named multMatrix() that passes as arguments, the
values of array A and B as 2-dimensional arrays, multiplies them and return the results in a
new matrix AB.
c) Write the result of your multiplied arrays into a file named matrix.txt.