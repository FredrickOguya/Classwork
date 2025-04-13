/*
 Check if a String is a Palindrome (Simple):
	Given a string, determine if it reads the same forwards and backward. For this easy version,
	you can ignore spaces and case.
	Example: "madam" -> True, "racecar" -> True, "hello" -> False
*/

let string = "racecar";

let reverse = string.split('').reverse().join('');

console.log(string===reverse)