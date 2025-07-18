//Parameters Destructuring :
const person = {
    firstname :"vikas",
    gender : "male",
}

function printpersonDetails(obj){

    console.log(obj.firstname); 
    console.log(obj.gender);  
    console.log(obj.age);  
}

printpersonDetails(person);
