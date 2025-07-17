# History of JavaScript (Short Summary)
1995: Created by Brendan Eich at Netscape in 10 days, originally called Mocha, then LiveScript, and finally JavaScript (named to ride on Java's hype).

1996: Microsoft released JScript in Internet Explorer.

1997: JavaScript was standardized by ECMA as ECMAScript (ES).

Major updates:

ES5 (2009): Added many new features.

ES6 (2015): Biggest update (let, const, arrow functions, classes, etc.)

TC39: Committee that maintains and updates JavaScript.



# JavaScript Defined (Short Explanation):
JavaScript is a lightweight, interpreted scripting language used to make web pages interactive.
It runs in the browser, allowing you to create features like:

-Pop-ups

-Form validation

-Animations

-Dynamic content updates

It is one of the core technologies of the web, alongside HTML and CSS.


# Introduction to Variables

// Declare a Variable.
var firstname;

// 1. Variables can store some information.
firstname = "vikas";

// 2. We can use that information later.
console.log(firstname);

// 3. We can Change that information as well.
firstname = "omkar";
console.log(firstname);

// JavaScript is Case Sensitive.
/*
 use strict mode to avoid the errors and case 
sensitive error issues.
*/

# variable keyword

 - Var keyword 

// #1. declare variable with var keyword.

var firstName = "Yatin";
// Can store information and declare variable.

firstName ="Siddesh";
// Can change existing value.

var firstName ="Mohit"; 
// can be declared with same variable and overwrite value.

console.log(firstName);

- let keyword

// #1 . declare variable with let keyword.

let first_Name = "Sachin"; 
// Can store information and declare variable.

first_Name = "rohit"; 
// Can change existing value.

//  let first_Name ="Siddhi"; 
// (Already has been Declared error)
// Cannot redeclare same variable.
console.log(first_Name);

- const keyword 

// declare constants
// whose values cannot be changed.

const pi = 3.14;
console.log(pi);
// Can store information and declare constant.
