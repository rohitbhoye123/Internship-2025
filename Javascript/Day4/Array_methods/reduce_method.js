
// Reduce Method

const numbers = [1,2,3,4,5,10];



const total = numbers.reduce((accumulator,currentvalue,currentindex,arr)=>{
    console.log(accumulator);
    console.log(currentvalue);
    console.log(currentindex);
    console.log(arr);
       return accumulator + currentvalue;
});

console.log(total);

// Example


const userCart = [
    {product_Id : 1,product_Name : "mobile", price : 12000},
    {product_Id : 2,product_Name : "TV", price : 22000},
    {product_Id : 3,product_Name : "Laptop", price : 35000},
    {product_Id : 4,product_Name : "charger", price : 1000},

]

const cartTotal = userCart.reduce((totalPrice,currentProduct)=>{
     return totalPrice + currentProduct.price ;
},0);

console.log(cartTotal);

