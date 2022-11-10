// 이미지를 랜덤하게 화면에 뿌려줌
const images = ['0.jpeg', '1.jpeg', '2.jpeg']
//1.현재 이미지를 랜덤하게 변수에 할당
const chosenImage = images[Math.floor(Math.random() * images.length)]
//2.해당 이미지를 이미지요소로 화면에 추가
const bgImage = document.createElement('img')
bgImage.src = `img/${chosenImage}`
document.body.style.backgroundImage = 'url(img/' + chosenImage + ')'
