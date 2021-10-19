const posts = [
    { name: "Post 1", user: "User 1" },
    { name: "Post 2", user: "User 2" },
    { name: "Post 3", user: "User 3" },
    { name: "Post 4", user: "User 4" },
];

const listPosts = () => {
    posts.map((post) => console.log(post.name))
}

const addPost = (newPost) => {
    return new Promise((resolve, reject) => {
        posts.push(newPost)
        const err = false
        if (!err) resolve()
        else reject("hata var")
    })
}

async function showPosts() {
    try {
        await addPost({ name: "New Post", user: "New User" })
        listPosts()
    } catch (error) {
        console.log(error)
    }
}

showPosts()