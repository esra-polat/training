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

function newToDo(todo, callback) {
    setTimeout(() => {
        todos.push(todo)
        callback()
    }, 2000);
}

newToDo({
    title:"ToDo4", description:"Okulu ara"
}, toDoList)

// toDoList()