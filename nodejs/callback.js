// const promise1 = new Promise((resolve, reject) => {
//     reject('BAĞLANTI HATASI');
//     resolve("VERILER ALINDI");
// });

// promise1
//     .then((value) => {
//         console.log(value);
//     })
//     .catch((error) => {
//         console.log(error);
//     });

const books = [
    { name: "Kitap 1", author: "Yazar 1" },
    { name: "Kitap 2", author: "Yazar 2" },
    { name: "Kitap 3", author: "Yazar 3" },
  ];
  
  const listBooks = () => {
    books.map((book) => {
      console.log(book.name);
    });
  };
  
  const addBook = (newBook, callback) => {
    books.push(newBook);
    callback();
  };
  
  addBook({ name: "Kitap 4", author: "Yazar 4" }, listBooks);
  
  //Çıktımız
  //Kitap 1
  //Kitap 2
  //Kitap 3
  //Kitap 4