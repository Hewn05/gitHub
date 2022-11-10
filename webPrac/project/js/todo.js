const toDoForm = document.getElementById('todo-form')
const toDoInput = document.querySelector('#todo-form input')
const toDoList = document.getElementById('todo-list')
const NAME = document.querySelector('#login-form input')

let toDos = []

//해야할 일을 저장
function saveToDos() {
  localStorage.setItem(NAME.value, JSON.stringify(toDos))
}

//해야할 일을 삭제
function deleteToDo(event) {
  // 요소 찾고
  let temp = event.target.parentElement
  // toDos 지우고
  let idx = toDos.findIndex((item) => item.id == temp.id)
  if (idx !== -1) toDos.splice(idx, 1)
  // 요소 지우고
  temp.remove()
  // LS 다시 저장
  saveToDos()
}

//해야할 일 출력
function paintToDo(newTodo) {
  const li = document.createElement('li')
  li.id = newTodo.id
  const span = document.createElement('span')
  span.innerText = newTodo.text
  const button = document.createElement('button')
  button.innerText = 'ⓧ'
  button.addEventListener('click', deleteToDo)
  li.appendChild(span)
  li.appendChild(button)
  toDoList.appendChild(li)
}

//해야할 일을 객체로 생성 저장을 호출
function handleToDoSubmit(event) {
  event.preventDefault()
  const newTodo = toDoInput.value
  toDoInput.value = ''
  const newTodoObj = {
    text: newTodo,
    id: Date.now(),
  }
  toDos.push(newTodoObj)
  paintToDo(newTodoObj)
  saveToDos()
}

toDoForm.addEventListener('submit', handleToDoSubmit)

//화면 최초 로드시 이전의 해야할 일을 화면에 표시
// const savedToDos = localStorage.getItem(NAME.value)
// if (savedToDos !== null) {
//   const parsedToDos = JSON.parse(savedToDos)
//   toDos = parsedToDos
//   parsedToDos.forEach(paintToDo)
// }

const parsedToDos = JSON.parse(localStorage.getItem(NAME.value))
toDos = parsedToDos
parsedToDos.forEach(paintToDo)
