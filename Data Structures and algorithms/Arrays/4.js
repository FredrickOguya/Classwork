/*Reverse an Array (in place):
	Given an array, modify it so that the elements are in reverse order. You should aim to do this 	without creating a new array.
    Example: [1, 2, 3, 4, 5] becomes [5, 4, 3, 2, 1]
*/
let arr = [1, 2, 3, 4, 5];
let left = 0;
let right = arr.length -1;

while(left<right){
    [arr[left],arr[right]] = [arr[right],arr[left]];
    left++;
    right--;
}
console.log(arr)