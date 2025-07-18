//  Every Method 
const numbers = [2,4,6,8,10];

const ans = numbers.every((number)=>{
    return number % 2 ===0;
})


console.log(ans);




const userCart = [
    {product_Id : 1,product_Name : "mobile", price : 12000},
    {product_Id : 2,product_Name : "TV", price : 22000},
    {product_Id : 3,product_Name : "Laptop", price : 35000},
    {product_Id : 4,product_Name : "charger", price : 1000},

]

const giveDiscount = userCart.every((product)=>{
    return product.price<=35000;
})

console.log(giveDiscount);


