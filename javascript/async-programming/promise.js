const todos = [
    { title: "ToDo1", description: "odevi tamamla" },
    { title: "ToDo2", description: "bootcamp basvur" },
    { title: "ToDo3", description: "veterinere git" }
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
            // const e = false
            const e = true;
            if (!e) {
                resolve()
            } else {
                reject("hata var")
            }
        }, 2000);
    })

}

newToDo({
    title: "ToDo4", description: "Okulu ara"
}).then(response => {
    toDoList()
}).catch(e => {
    console.log(e)
})

//hersey yolunda gidiyorsa then ile cevabi gelir yani resolve donecekse then ile yakalanabilir