/*
Sum of Elements in an Array:
	Given an array of numbers, calculate the sum of all the elements.
	Example: [1, 2, 3, 4, 5] -> Sum: 15
*/

let arr = [1, 2, 3, 4, 5];

let sum =0;

for(i=0;i<arr.length;i++){
    sum+=arr[i];
}
console.log(sum);