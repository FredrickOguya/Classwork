/*
Factorial of a Number:
	Given a non-negative integer n, calculate its factorial (the product of all positive integers less
	than or equal to n).
	Example: 5! = 5 * 4 * 3 * 2 * 1 = 120

    How to approach: Use a loop that iterates from 1 to n, multiplying the current result by the
	loop counter. The factorial of 0 is 1.
*/

function factorial(integer){
    let factorial = 1;
    if(integer===0){
        return 1;
    }
    for(i=1;i<=integer;i++){
        factorial*=i;
    }
    return factorial;
}
console.log(factorial(5));