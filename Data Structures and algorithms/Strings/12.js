/*
12. Count Vowels in a String:
	Given a string, count the number of vowels (a, e, i, o, u, case-insensitive) present in it.
	Example: "Hello World" -> Output: 3 (e, o, o)
*/
function countVowels(str){
    let vowelCount=0;
    let vowel = "aeiouAEIOU"
    for(i=0;i<str.length;i++){
        if(vowel.includes(str[i])){
            vowelCount+=1

        }
    }
    console.log(vowelCount)
}
countVowels("Hello World");