/*
Check if a Number is Prime:
	Given an integer greater than 1, determine if it is a prime number (only divisible by 1 and 	itself).
	Example: 7 -> True, 10 -> False
*/

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

console.log(prime(10));
