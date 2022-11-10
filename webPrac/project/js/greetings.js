const loginForm = document.querySelector('#login-form')
const loginInput = document.querySelector('#login-form input')
const greeting = document.querySelector('#greeting')

const todoForm = document.querySelector('#todo-form')
todoForm.classList.add('hidden')
const todoList = document.querySelector('#todo-list')
todoList.classList.add('hidden')

const logoutBtn = document.getElementById('logout')

const USER_KEY = 'users'

let users = []

function init() {
  loginForm.classList.remove('hidden')
  loginInput.classList.remove('hidden')
  loginInput.value = ''
  greeting.classList.add('hidden')
  todoForm.classList.add('hidden')
  todoList.classList.add('hidden')
}
init()

function saveUsers() {
  localStorage.setItem(USER_KEY, JSON.stringify(users))
}

function Login(event) {
  let name = loginInput.value
  let idx = users.findIndex((user) => user == name)
  if (idx == -1) {
    users.push(name)
    saveUsers()
  }
  event.preventDefault()
  greeting.innerText = 'Hello ' + name
  greeting.classList.remove('hidden')
  todoForm.classList.remove('hidden')
  todoList.classList.remove('hidden')
  loginForm.classList.add('hidden')
}
loginForm.addEventListener('submit', Login)

function Logout(event) {
  init()
  event.preventDefault()
  savedToDos = null
}

logoutBtn.addEventListener('click', Logout)
