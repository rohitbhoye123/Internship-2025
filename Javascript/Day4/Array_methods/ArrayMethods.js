// slice method

const num = [1, 2, 3, 4, 5, 6, 7];

const res1 = num.slice(2);

const res2 = num.slice(0, 4);

console.log(res1);

console.log(res2);


console.log(num);
num.splice(3, 0, "pqr");
num.splice(3, 2, "abc");
console.log(num);



// join method
const charArr = ["B", "C", "O", "R"];
const res = charArr.toString().replaceAll(",", "/");
console.log(res);
let charStr = charArr.join("/");
console.log(charStr, typeof charStr);



let newArray = ["N", 1, 3, 4, 5, "A", 87];
console.log(newArray.includes("A"));
console.log(newArray.includes(2));
console.log(newArray.indexOf(2));
console.log(newArray.indexOf("N"));
console.log(newArray.lastIndexOf("N"));

newArray.forEach((e, index) => {
  console.log(e, index);
});

const newArray1 = newArray.map((e, index) => {
  return e * 3;
});

console.log(newArray1);


