/*
Find the Second Largest Element:
	Given an array of distinct numbers, find the second largest element.
	Example: [10, 5, 8, 12, 9] -> Second largest: 10
    How to approach: You can iterate through the array, keeping track of the largest and second largest elements found so far. Initialize them carefully (e.g., with the smallest possible value or	the first two distinct elements)
*/

function secondLargest(arr){
   return arr.sort((a,b)=>a-b)[arr.length-2]
}

console.log(secondLargest([10, 5, 8, 12, 9]))