//find out if the first number is larger than the second
function ifFirstIsLarger(num1,num2){
    return num1>num2;
};

console.log(ifFirstIsLarger(40,30));


//get the current date and time
function getCurrentDateAndTime(){
    return new Date();
};

//console.log(getCurrentDateAndTime());

//code to show example of a local and a global variable

var globalVar=29;
function myFunction(){
    var localVar = 20;

    //console.log(globalVar)
}
console.log(globalVar);
//console.log(localVar); error

//printing from 1 to 10
for(i=0;i<=10;i++){
    console.log(i)
}