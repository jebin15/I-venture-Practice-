// import required essentials
const express = require('express');
// create new router
const router = express.Router();

// create a JSON data array
let data = [
    { userId: 1, title: 'Project Manager',  userName: 'Bharath Sethi', userAddress:'21/172 Unit, Penrith, Sydney'},
    { userId: 2, title: 'Test Analyst',     userName: 'Susheel', userAddress:'1/173 Unit, Paramatta, Sydney'},
    { userId: 3, title: 'Intern', userName:'Priya', userAddress:'241/181 Unit,Emu plains, Sydney'},
    { userId: 4, title: 'Software Developer', userName: 'Jebin', userAddress:'4/11 Unit,Jamison Town, Sydney'},
    { userId: 5, title: 'Consultant', userName: 'Jay', userAddress:'27/190 Unit,Colyton, Sydney'},
];

// this end-point of an API returns JSON data array
router.get('/', function (req, res) {
    res.status(200).json(data);
});

// this end-point returns an object from a data array find by id
// we get `id` from URL end-points
router.get('/:userId', function (req, res) {
    // find an object from `data` array match by `id`
    let found = data.find(function (items) {
        return items.id === parseInt(req.params.id);
    });
    // if object found return an object else return 404 not-found
    if (found) {
        res.status(200).json(found);
    } else {
        res.sendStatus(404);
    }
});

module.exports = router;