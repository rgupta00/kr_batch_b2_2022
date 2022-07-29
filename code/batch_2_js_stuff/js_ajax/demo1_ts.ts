
interface Friend{
    name: string, add: string, salary?: number
}


function printFriendsDetails(friends: Friend[]){
    for(let friend of friends){
        console.log(`name is ${friend.name} and add is ${friend.add} and salary is ${friend.salary}`)
    }
}

let friendsArr=[
    {"name":"raj","add":"del","salary":8966},
    {"name":"abc","add":"del"}
];

printFriendsDetails(friendsArr)