# Arrow function

Arrow function {()=>} is concise way of writing Javascript 
functions in shorter way. Arrow functions were introduced 
in the ES6 version. They make our code more structured and 
readable.

# Function Scope
Variables declared with **var** are function-scoped.

They are only accessible within the function in which they are declared.

Not limited by blocks like if, for, or while.

# Block Scope

Variables declared with **let** or **const** are block-scoped.

They are only accessible within the specific block ({ }) in which they are defined.

Cannot be accessed outside of that block.

# Call Back Function 

A JavaScript callback is a function which is to be executed 
after another function has finished execution.
 A more formal definition would be -
 Any function that is passed as an argument to another 
 function so that it can be executed in that other function
 is called as a callback function.

 
 # Default Parameters in JavaScript
Default parameters allow you to set default values for function parameters if no value (or undefined) is passed when the function is called.

🔹 Syntax:

function funcName(param1 = defaultValue1, param2 = defaultValue2) {
  // function body
}

 #  Function Returning Function in JavaScript
Yes, in JavaScript, functions can return other functions — this is a powerful feature and is often used in closures, currying, and higher-order functions.

🔹 Basic Syntax:

function outerFunction() {
  return function innerFunction() {
    console.log("Hello from inner function");
  };
}

# Function Declaration in JavaScript
A function declaration is the standard way to define a named function in JavaScript using the function keyword.

🔹 Syntax:
function functionName(parameters) {
  // function body
}

# Function Expression in JavaScript
A function expression means assigning a function to a variable. Unlike function declarations, function expressions are not hoisted, and can be anonymous (without a name).

🔹 Syntax:

const variableName = function(parameters) {
  // function body
};

# Function Inside Function in JavaScript

In JavaScript, you can define a function inside another function — this is known as a nested function. The inner function is only accessible inside the outer function, and it can access variables from the outer function due to closures.

🔹 Syntax:

function outerFunction() {
  function innerFunction() {
    // code
  }
}


#  Hoisting in JavaScript

Hoisting is a JavaScript mechanism where variables and function declarations are moved to the top of their scope before the code is executed.

So, you can use some variables or functions before declaring them — but with important rules.

🔹 1. Function Hoisting
Function Declarations are fully hoisted.

You can call them before they're defined in code.

 2. Variable Hoisting with var
Variables declared with **var** are hoisted but initialized as undefined.

You can reference them before declaration, but not safely.

🔹 3. let and const Hoisting (Temporal Dead Zone)
let and const are hoisted but not initialized.

Accessing them before declaration gives a ReferenceError.

They are in the Temporal Dead Zone (TDZ) from start of block to declaration.


 # Lexical Scope
Lexical scope is the ability for a function scope to access 
variables from the parent scope. We call the child function 
to be lexically bound by that of the parent function. 
The diagram below outlines the supposed hierarchy that 
the lexical scope maintains in JavaScript.

# Parameters Destructuring :

What is parameter destructuring in JavaScript?
Destructuring in JavaScript is used to unpack or segregate 
values from arrays or properties from object literals into 
distinct variables, thus it allows us to access only the 
values required


# Rest Parameter 

The rest parameter syntax allows a function to accept an
 indefinite number of arguments as an array, providing a 
 way to represent variadic functions in JavaScript.


#  Difference Between Dot Notation and Bracket Notation in JavaScript
In JavaScript, both dot notation (.) and bracket notation ([]) are used to access properties of objects — but they behave differently in key situations.

🔹 1. Dot Notation (.)
 Syntax:
object.propertyName

- When to Use:
Property name is known, valid identifier, and no spaces/special characters.

🔹 2. Bracket Notation ([])

 Syntax:

object["propertyName"]

✅ When to Use:
Property has spaces or special characters

Property name is dynamic / stored in a variable

#  Computed Properties in JavaScript
Computed properties allow you to use dynamic keys (expressions or variables) when creating object properties. This is useful when you don’t know the property name ahead of time.

🔹 Syntax:

const obj = {
  [expression]: value
};


#  Introduction to Objects in JavaScript
In JavaScript, an object is a collection of key-value pairs used to store and organize data. It can represent real-world entities like a person, car, or student.

🔹 What is an Object?
An object is a non-primitive data type used to group related data (properties) and behavior (methods) together.

 Basic Syntax:

const objectName = {
  key1: value1,
  key2: value2,
  // ...
};


# Iterating Over Objects in JavaScript
When working with objects, you often need to loop through their keys and values. Unlike arrays, objects are not directly iterable with for...of, but there are multiple ways to loop through them

 1. for...in loop
The for...in loop is used to iterate over the keys (property names) of an object.

 Syntax:
for (let key in object) {
  // use key and object[key]
}

2. Object.keys()
The Object.keys() method returns an array of all keys of an object.

 Syntax:

Object.keys(object)