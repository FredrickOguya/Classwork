/*
Factorial of a Number:
	Given a non-negative integer n, calculate its factorial (the product of all positive integers less
	than or equal to n).
	Example: 5! = 5 * 4 * 3 * 2 * 1 = 120
*/

let integer = 5;

let factorial = 1;

for(i=1;i<=integer;i++){
    factorial*=i;
}
console.log(factorial);