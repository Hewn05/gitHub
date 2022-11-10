const item = document.querySelector('.item')
item.addEventListener('dragstart', dragStartHandler)

function dragStartHandler(e) {
  console.log('Drag Start')
  console.log(e.target, e.target.id)
  e.dataTransfer.setData('text/plain', e.target.id)
  console.log(e.dataTransfer)
  setTimeout(() => {
    e.target.classList.add('hide')
  })
}

const boxes = document.querySelectorAll('.box')
console.log(boxes)

boxes.forEach((box) => {
  console.log(box)
  box.addEventListener('dragover', dragOverHandler)
  box.addEventListener('drop', dropHandler)
  box.addEventListener('dragenter', dragEnterHandler)
  box.addEventListener('dragleave', dragLeaveHandler)
})

function dragOverHandler(e) {
  console.log('Drag Over')
  e.preventDefault()
  e.target.classList.add('drag-over')
}

function dropHandler(e) {
  console.log('Drop!')
  e.preventDefault()
  const id = e.dataTransfer.getData('text/plain')
  console.log(id)
  const dragThing = document.getElementById(id)
  e.target.appendChild(dragThing)
  e.target.classList.remove('drag-over')
  dragThing.classList.remove('hide')
}

function dragEnterHandler(e) {
  console.log('Drag Enter')
  e.preventDefault()
  e.target.classList.add('drag-over')
}

function dragLeaveHandler(e) {
  console.log('Drag Leave')
  e.target.classList.remove('drag-over')
}
