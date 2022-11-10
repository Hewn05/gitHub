const clock = document.querySelector("h2#clock");

function getClock() {
    const date = new Date();
    let temp;
    temp = date.getHours()
    temp = temp < 10 ? '0' + temp : temp
    const hours = temp

    temp = date.getMinutes()
    temp = temp < 10 ? '0' + temp : temp
    const minutes = temp 
    
    temp = date.getSeconds()
    temp = temp < 10 ? '0' + temp : temp   
    const seconds = temp
    
    clock.innerText = `${hours}:${minutes}:${seconds}`;
}

getClock();
setInterval(getClock, 1000);