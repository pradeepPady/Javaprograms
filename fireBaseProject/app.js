var app =angular.module('mobileApp',['ui.router','ngMaterial','firebase']);

app.config(function($stateProvider,$urlRouterProvider){

$urlRouterProvider.otherwise('home');

$stateProvider
   // .state('login',{
   //   url : '/login',
   //   templateUrl : 'templates/login.html',
   // })
   .state('home',{
     url : '/home',
     templateUrl : 'templates/home.html',
     controller : 'homectrl'
   })
   // .state('home.dashboard',{
   //   url : '/dashboard',
   //   templateUrl : 'templates/dashboard.html',
   //   controller : 'dashboardCtrl'
   // });
});
app.constant('FBURL',
  'https://todoapp-32c3a.firebaseio.com/mobileData'

);
