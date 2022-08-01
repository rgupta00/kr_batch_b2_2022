//how to write something to to the file

const fs = require('fs')
console.log('start')
let data = 'i love teaching and traveling and food';
fs.writeFile('data.txt', data, function (err) {
    if (err)
        console.log('some error doing it')
    console.log('copied ..')

})
console.log('done')