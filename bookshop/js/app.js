var myApp = angular.module('myApp',[]);

myApp.controller('BookCtrl', function BookCtrl($scope){
        $scope.books = [
                {'name': 'Effective Java', 'author':'Joshua Bloch'},
                {'name': 'Year without Pants', 'author':'Scott Berkun'},
                { 'name':'Confessions of public speaker','author':'Scott Berkun'},
                {'name':'JavaScript Good Parts','author':'Douglas Crockford'}
        ]
});


