// Array forEach Metotu
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/TypedArray/forEach
// https://www.w3schools.com/jsref/jsref_foreach.asp

const PRODUCTS = ["Laptop", "Phone", "Speaker", "Desktop PC", "Server", "Mouse", "Keyboard"]

// PRODUCTS.forEach((product, index, array) => array[index] = product + " 111" )
PRODUCTS.forEach((product, index, array) => array[index] = `${product.toUpperCase()}` )  // toUpperCase

console.log(PRODUCTS)

/*****
const userListDOM = document.querySelector('#userList')

for (index = 0; index < users.length; index++) {
  const liDOM = document.createElement('li')
  liDOM.innerHTML = users[index]
  userListDOM.appendChild(liDOM)
}
*/

const userListDOM = document.querySelector('#userList')

PRODUCTS.forEach( item => {
  const liDOM = document.createElement('li')
  liDOM.innerHTML = item
  userListDOM.append(liDOM)
})


// JavaScript'de forEach Nasıl Kullanılır?
// JavaScript'de forEach , döngü oluşturmamızı ve bu döngüyü sırayla çalıştırmamızı sağlayan bir array metodudur.

// forEach fonksiyonu item, index, array olmak üzere 3 parametre alabilir.

// arr.forEach(function(value, index, array) {
//   // index ve array kullanmak opsiyoneldir
// }
// Konuyu daha iyi anlamak için her parametrenin aldığı değeri gösteren bir örnek yapalım.

// const animals = ["cat" , "dog" , "bird", "horse"];
  
// animals.forEach((value , index , array) => {
//   console.log('value: ', value );
//   console.log('value parametresinin aldığı index :', index );
//   console.log('array:' , array );
// });
// Aynı fonksiyonu her zaman kullanmak zorunda olduğumuz index parametresiyle yazalım.

// const animals = ["cat" , "dog" , "bird", "horse"];
// animals.forEach( animal => console.log( animal ) );
// //Arrow function gosterimi(ES6)
// Şimdi de forEach kullanarak yeni bir array oluşturabileceğimiz bir fonksiyon yazalım.

// const numbers = [4, 11, 9];
// const newArray = [];

// numbers.forEach(function(numbers){
//   newArray.push(numbers*3);
// });
// console.log(newArray);

// // output = [12, 33, 27]
// Numbers array'ini kullanarak her elemanının iki fazlasına sahip olan başka bir array oluşturunuz.

//  const numbers = [12, 24, 36]; 

//  numbers.forEach(() => {
//      //...
//  })