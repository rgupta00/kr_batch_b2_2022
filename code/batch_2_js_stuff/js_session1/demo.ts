//what i want to 

class Human{
    constructor(private cat:string ){}
}

class Emp{
    constructor(private name: string, private add: string,private salary:number){}
}

class Programmer extends Emp{
    constructor( name: string,  add: string, salary:number, private pl: string){
        super(name, add, salary);
        this.pl=pl;
    }
}

// interface Friend{
//     name:string,programming?:string
// }
// function printFriends(friends: Friend[]){
//     for(let f of friends){
//         console.log(f.name)
//     }
// }
// let friends=[
//     {name:"raj",programming:"java"},
//     {name:"seema" }
// ];
// printFriends(friends);

// let myString: string | number
// myString=55

// let myString: any
// myString=55

// let arr: Array<number>=[3,5,6];


// function welcome(person: string){
//     console.log(person)
// }
// welcome(55)