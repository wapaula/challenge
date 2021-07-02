let utcButton = document.getElementById('utcBtn')
let estButton = document.getElementById('estBtn')

estButton.addEventListener("click", evt => {
    
    let trTable = document.getElementById('est')

    fetch('http://worldclockapi.com/api/json/est/now')
    .then(res => res.json())
    .then(data =>{
    trTable.innerHTML += `<td> ${data.currentDateTime} </td>`
})
})

utcButton.addEventListener("click", evt => {
    
    let trTable = document.getElementById('utc')

    fetch('http://worldclockapi.com/api/json/utc/now')
    .then(res => res.json())
    .then(data =>{
    trTable.innerHTML += `<td> ${data.currentDateTime} </td>`
})
})