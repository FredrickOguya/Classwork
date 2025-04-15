/*
Check if a Number is Prime:
	Given an integer greater than 1, determine if it is a prime number (only divisible by 1 and 	itself).
	Example: 7 -> True, 10 -> False

    How to approach: Iterate from 2 up to the square root of the number.
    If the number is divisible by any integer in this range, it's not prime.


function prime(number){
    let count = 0;

    for(i=1;i<=number;i++){
        if(number%i===0){
        count+=1;
    }
    }
    if(count===2){
        return true;
    }

    return false;
}

*/

function prime(number){
    for(let i = 2;i<number;i++){
        if(number % i ===0){
            return false;
        }
    }
    return true;
}

console.log(prime(7));
