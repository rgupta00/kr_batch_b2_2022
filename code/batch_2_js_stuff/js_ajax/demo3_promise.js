//promoise is a java object that have 3 phases
//pending --- resolve-- reject
//clean the room-- removethegarbage ---get the icecream

// let cleantherooms=function(){
//     return new Promise(function(resolve,reject){
//         resolve('clean the rooms')
//     })
// }

// let removethegarbage=function(){
//     return new Promise(function(resolve,reject){
//         reject('removethegarbage')
//     })
// }

// let gettheicecream=function(){
//     return new Promise(function(resolve,reject){
//         resolve('u dont need it')
//     })
// }

// console.log('start')

// const result= async () => {
//     console.log('1')
//     const r1= await cleantherooms();
//     console.log('2')
//     const r2= await removethegarbage();
//     console.log('3')
//     const r3= await gettheicecream();
// }

// result()
// .then(result=>console.log(result))
// .catch(err=> console.log('this is not done'))

// console.log('end')


console.log('start')

const cal = (a, b) => {
    return new Promise((resolve, reject)=> {
        setTimeout(() => {
            if (a < 0 || b < 0) {
                reject('not possible')
            } else
                resolve(a + b)
        }, 100);
    })
}

const add=async ()=>{
    console.log('1')
    const sum1=await cal(1,2)
    console.log('2')
    const sum2=await cal(sum1, -20)
    console.log('3')
    const sum3=await cal(sum2, 30)

    return sum3;
}

add().then(val=> console.log(val)).catch(e=> console.log(e))


console.log('end')





//async is a keyword that is applied to a function that ruturn promise ...
//await: we use awit for a function that return a promise



// cleantherooms().then(result=>{
//     console.log('1')
//     return removethegarbage(result);
// }).then(function(result){
//     console.log('2')
//     return gettheicecream(result)
// }).then(function(result){
//     console.log('3')
//     console.log('done')
// }).catch(function(err){
//     console.log(err)
// })

// cleantherooms().then(function(result){
//     console.log('1')
//     return removethegarbage(result);
// }).then(function(result){
//     console.log('2')
//     return gettheicecream(result)
// }).then(function(result){
//     console.log('3')
//     console.log('done')
// })

//console.log('end')