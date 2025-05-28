/*
Count Occurrences of an Element:
	Given an array and a target value, count how many times the target value appears in the array.
	Example: Array: [1, 2, 2, 3, 2, 4], Target: 2 -> Output: 3
    How to approach: Iterate through the array. For each element, check if it's equal to the target value.
    If it is, increment a counter variable.
*/

function occurrences (arr,target){
    let count = 0;
    for(i=0;i<arr.length;i++){
        if(arr[i]===target){
            count+=1
        }
    }
    console.log(count);
}
occurrences([1,2,2,3,2,4],2)
