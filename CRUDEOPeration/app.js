
var app = angular.module('myApp', ['ngRoute', 'firebase']);

app.config(function($routeProvider){
  $routeProvider
  .when('/', {
    controller: 'ListController',
    templateUrl: 'templates/notes.html'
    // templateUrl: 'templates/trash.html'

  })
  .when('/add', {
    controller: 'AddController',
    templateUrl: 'templates/add.html'
  })
  .when('/edit/:id', {
    controller: 'EditController',
    templateUrl: 'templates/edit.html'

  })
  .when('/archive/:id', {
    controller: 'ArchiveController',
    templateUrl: 'templates/archive.html'

  })
  .otherwise({
    redirectTo: '/'
  });
});

app.constant('FBURL',
  'https://crudeoperation-2a9ea.firebaseio.com/'

);
