// Function Inside Function 

const app = () => {

     const myfunction = () =>{
        console.log("Inside myFunction");
     }
         
     const addition = (num1,num2) =>{
        return num1+num2;
     }

     const multiply = (num1,num2) => num1*num2; 
    
    console.log("inside app");

    myfunction();

    console.log(addition(5,3));

    console.log(multiply(5,3));

}

app(); 
