function printFriendsDetails(friends) {
    for (var _i = 0, friends_1 = friends; _i < friends_1.length; _i++) {
        var friend = friends_1[_i];
        console.log("name is ".concat(friend.name, " and add is ").concat(friend.add, " and salary is ").concat(friend.salary));
    }
}
var friendsArr = [
    { "name": "raj", "add": "del", "salary": 8966 },
    { "name": "abc", "add": "del" }
];
printFriendsDetails(friendsArr);
