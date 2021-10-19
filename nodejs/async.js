// function getData(data) {
//     return new Promise((resolve, reject) => {
//         console.log('veriler alinmaya calisiliyor..')

//         if (data) resolve("veriler alindi")
//         else reject("veriler alinamadi")
//     })
// }

// function cleanData(receivedData) {
//     return new Promise((resolve, reject) => {
//         console.log("veriler duzenleniyor")

//         if (receivedData) resolve("veriler duzenlendi")
//         else reject("veriler duzenlenemedi")
//     })
// }

// // promise ile gereklesen senaryo
// // getData(true).then(
// //     result => {
// //         console.log(result)
// //         return cleanData(true)
// //     }).then(
// //         result => console.log(result)
// //     ).catch(
// //         error => console.log(error)
// //     )

// // async await ile gerceklesen senaryo
// async function processData() {
//     try {
//         const receivedData = await getData(false)
//         console.log(receivedData)
//         const cleanedData = await cleanData(true)
//         console.log(cleanedData)
//     } catch (error) {
//         console.log(error)
//     }
// }

// processData()


// kitap ornegi ile
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

const addBook = (newBook) => {
    const promise1 = new Promise((resolve, reject) => {
        books.push(newBook);
        resolve(books)
        //reject('BIR HATA OLUSTU');
    });

    return promise1;
};

// addBook({ name: "Kitap 4", author: "Yazar 4" })
//     .then(() => {
//         console.log("YENI LISTE");
//         listBooks();
//     })
//     .catch((error) => {
//         console.log(error);
//     });

async function showBooks() {
    try {
        await addBook({ name: "Kitap 5", author: "Yazar 5" })
        listBooks()
    } catch (error) {
        console.log(error)
    }
}

showBooks()