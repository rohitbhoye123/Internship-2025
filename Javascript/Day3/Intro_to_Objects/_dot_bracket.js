// Difference Between Dot and Bracket Notation 


const person = {
    name : "Yatin",
    age : 23,
    "person hobbie" : ["chess","games","sketches"]
}

console.log(person["person hobbie"]);


const key = "email";

const person = {
    name : "Yatin",
    age : 23,
    "person hobbie" : ["chess","games","sketches"]
}



person[key] = "abcd2323@gmail.com";
console.log(person);
