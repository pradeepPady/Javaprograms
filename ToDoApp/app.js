var app=angular.module("myApp",['ui.router','ngMaterial','ngAnimate','ngAria','ngMessages']);
app.config(['$stateProvider', '$urlRouterProvider',
 function($stateProvider, $urlRouterProvider) {
   $stateProvider
     .state('readjson', {
       url : '/readjson',
       templateUrl : 'Templates/JsonData.html',
       controller : 'jsonCtrl'
     })
     .state('login', {
       url : '/login',
       templateUrl : 'Templates/login.html',
      controller : 'loginctrl'
       })
     .state('registration', {
       url : '/registration',
       templateUrl : 'Templates/registration.html',
       controller : 'loginctrl'
     })
     .state('home', {
       url : '/home',
       templateUrl : 'Templates/home.html',
       controller:'homeCtrl'
     });
      $urlRouterProvider.otherwise('/home');
 }]);
