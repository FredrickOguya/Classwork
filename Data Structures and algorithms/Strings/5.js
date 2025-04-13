/*
Reverse a String:
	Given a string, create a new string that is the reverse of the original.
	Example: "hello" -> "olleh"


let string = "hello";

let reverse = string.split('').reverse().join('');

console.log(reverse);

//How to approach: You can iterate through the original string from the last character to the
	first and build the reversed string character by character. Alternatively, many programming
	languages have built-in functions or simple ways to reverse a string.
*/


let string = "hello";
let reverse = '';

for(i=string.length-1;i>=0;i--){
    reverse+=`${string[i]}`;
}
console.log(reverse);
