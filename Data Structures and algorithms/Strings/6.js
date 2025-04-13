/*
 Check if a String is a Palindrome (Simple):
	Given a string, determine if it reads the same forwards and backward. For this easy version,
	you can ignore spaces and case.
	Example: "madam" -> True, "racecar" -> True, "hello" -> False
    How to approach: Convert the string to lowercase. Compare the original string with itsreversed 	version. If they are the same, it's a palindrome.



let string = "racecar";

let reverse = string.split('').reverse().join('');

console.log(string===reverse)

*/

let string = "Racecar";

let reverse = string.split('').reverse().join('').toLowerCase();

console.log(string.toLowerCase()===reverse)