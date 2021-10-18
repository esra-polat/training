const todos = [
    { title: "ToDo1", description: "ipsum amet 1" },
    { title: "ToDo2", description: "ipsum amet 2" },
    { title: "ToDo3", description: "ipsum amet 3" }
];

let todoListElement = document.getElementById("todoList")

function toDoList() {
    setTimeout(() => {
        let todoItems = ""
        todos.forEach(i => {
            todoItems += `<li>
            <b>${i.title}</b>
            <p>${i.description}</p>
            </li>`
        })
        todoListElement.innerHTML = todoItems
    }, 1000);
}

// resolve: hersey basarili oldugunda promise'den geri donecek olan sonucu verir
// reject: herhangi bir hata oldugunda promise'den geri donecek olan sonucu verir
function newToDo(todo) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            todos.push(todo)
            const e = false
            // const e = true;
            if (!e) {
                resolve()
            } else {
                reject("hata var")
            }
        }, 2000);
    })

}

newToDo({
    title: "ToDo4", description: "ipsum amet 4"
}).then(response => {
    toDoList()
}).catch(e => {
    console.log(e)
})

//hersey yolunda gidiyorsa then ile cevabi gelir yani resolve donecekse then ile yakalanabilir

const p1 = Promise.resolve("P1")
// const p2 = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve("ben 2. promise")
//     }, 2000);
// })
const p2 = new Promise((resolve, reject) =>
    setTimeout(resolve, 2000, "Deneme")
)
const p3 = 13579
// const p4 = fetch("https://jsonplaceholder.typicode.com/posts")
const p4 = fetch("https://jsonplaceholder.typicode.com/posts").then(res => res.json())

Promise.all([p1, p2, p3, p4]).then(promises => {
    console.log("promises", promises)
})