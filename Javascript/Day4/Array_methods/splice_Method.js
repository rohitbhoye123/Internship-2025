// Splice Method 



// insert using Splice 

// input : ['item1', 'item2', 'item3', 'item4', 'item5']

// start from 1st ,  delete 0 elements, add from 1st index 
// array.splice(1,0,'newitem');
// console.log(array);
// output : ['item1', 'newitem','item2', 'item3', 'item4', 'item5']


// insert and delete simultaneously

const array = ['item1' , 'item2','item3','item4','item5'];

const deletedElements = array.splice(1,2,"insertitem1",'insertitem2');
console.log(array);
console.log(deletedElements);
