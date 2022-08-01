var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var mongoose = require('mongoose');
var Book = require('./Book.model');
const { response } = require('express');

var port = 8092;
var db = 'mongodb://localhost/rajdbbt2'

mongoose.connect(db, { useNewUrlParser: true, useUnifiedTopology: true});

app.use(bodyParser.json())

app.use(bodyParser.urlencoded({
  extended: true
}));
// app.get('/book/:id', async(req, res) => {
//     const book = await Book.findOne({ _id: req.params.id}); 
//     console.log(book)
// });

//-------get one book by id---------
app.get('/book/:id', function(req,res){
    Book.findOne({
        _id: req.params.id
    }).exec(function(err, book){
        if(err)
            res.send('some error ...')
        else if(book==null){
            res.status(404).send('book is not found')
        }else{
            res.json(book)
        }
    })
})


//-------get all books---------
app.get('/book', function(req,res){
    Book.find({}).exec(function(err, books){
        if(err)
            res.send('some error ...')
        else if(books==null){
            res.status(404).send('book is not found')
        }else{
            res.json(books)
        }
    })
})

//-------update the book---------
app.put('/book/:id', function(req,res){
    Book.findOneAndUpdate({
        _id: req.params.id
    },{$set:{title: req.body.title}},{ new: true }, function(err, book){
        if(err)
            res.send('error updating')
        else{
            console.log(book)
            res.send(book)
        }
    })
})
//-------delete the book---------
app.delete('/book/:id', function(req,res){
    Book.findOneAndRemove({
        _id: req.params.id
    }).exec(function(err, book){
        if(err)
            res.send('some error ...')
        else if(book==null){
            res.status(404).send('book is not found')
        }else{
            console.log(book)
            res.status(204).send();
        }
    })
})
//-------add the book---------
app.post('/book', function(req,res){
    Book.create(req.body, function(err, book){
        if(err)
            res.send('some error')
        else{
            res.status(201).send(book)
        }
    })
})



app.listen(port, function() {
  console.log('app listening on port ' + port);
});
