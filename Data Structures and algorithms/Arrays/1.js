/* Find the Minimum/Maximum Element in an Array:
	Given an array of numbers, find the smallest and largest number in it.
	Example: [3, 1, 4, 1, 5, 9, 2, 6] -> Minimum: 1, Maximum: 9
*/

let nums = [3, 1, 4, 1, 5, 9, 2, 6];

let ascNums = nums.sort();

let minimum = ascNums[0];

let maximum = ascNums[nums.length - 1];
console.log(maximum)
