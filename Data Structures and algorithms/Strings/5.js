/*
Reverse a String:
	Given a string, create a new string that is the reverse of the original.
	Example: "hello" -> "olleh"


let string = "hello";

let reverse = string.split('').reverse().join('');

console.log(reverse);
*/

let string = "hello";
let reverse = '';

for(i=string.length-1;i>=0;i--){
    reverse+=`${string[i]}`;
}
console.log(reverse);
