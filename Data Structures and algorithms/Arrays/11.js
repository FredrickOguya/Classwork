/*
Remove Duplicates from an Unsorted Array (using extra space):
	Given an array that may contain duplicate elements, create a new array containing only 
    the 	unique elements in the original array (the order doesn't necessarily need to be preserved).
    Example: [1, 2, 2, 3, 1, 4, 2, 5] -> Output: [1, 2, 3, 4, 5] (the order might vary)
*/

function removeDuplicates(arr){
    let result = [];
    arr.sort((a,b)=>a-b);
    result.push(arr[0])
    for(i=1;i<arr.length;i++){
        if(arr[i]!==arr[i-1]){
            result.push(arr[i])
        }
    }
    console.log(result)
}
removeDuplicates([1, 2, 2, 3, 1, 4, 2, 5])

