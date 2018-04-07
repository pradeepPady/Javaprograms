var app=angular.module("myApp",['ui.router','ngMaterial','ngAnimate','ngAria','ngMessages','angular.filter']);
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
     .state('home', {
       url : '/home',
       templateUrl : 'Templates/home.html',
       controller:'homeCtrl'
     })
     .state('readjsonProduct', {
       url : '/readjsonProduct',
       templateUrl : 'Templates/jsonProductRead.html',
       controller:'homeCtrl'
     })
     .state('home.dashbord', {
       url : '/dashbord',
       templateUrl : 'Templates/dashbord.html',

     });
      $urlRouterProvider.otherwise('/home');
 }]);
