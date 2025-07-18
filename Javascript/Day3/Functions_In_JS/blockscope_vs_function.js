// Block Scope Vs Function Scope

console.log(name_var);

function myApp(){
    if(true){
        let firstname = "yatin"; // case 1: block scoped
        console.log(firstname); // accessed 
    }
    console.log(firstname);
    
}

myApp();