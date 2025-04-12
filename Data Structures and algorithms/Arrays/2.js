/*
2. Check if a Number Exists in an Array:
	Given an array and a single number, determine if that number is present in the array.
	Example: Array: [10, 25, 5, 15], Number to check: 5 -> True. Number to check: 20 -> False.


let arr = [10, 25, 5, 15]

let num = 20;

console.log(arr.includes(num));
*/
//preffered solution
//How to approach: Iterate through each element of the array and compare it with the target 	number. If you find a match, return True. If you reach the end without a match, return False.

let arr = [10, 25, 5, 15]

let num = 5;

function ifContains(num,arr){
    for(i=0;i<arr.length;i++){
        if(arr[i] ===num){
        return true;
        }
    }
    return false;
}

console.log(ifContains(num,arr));
