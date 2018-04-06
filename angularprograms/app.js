var app=angular.module("myApp",['ui.router']);

app.config(['$stateProvider', '$urlRouterProvider',
 function($stateProvider, $urlRouterProvider) {
   $stateProvider
     .state('registration', {
       url : '/registration',
       templateUrl : 'templates/registration.html',
       controller : 'registrationCtrl'
     })
     .state('login', {
       url : '/login',
       templateUrl : 'templates/login.html',
       controller : 'loginctrl'
     })
     .state('readjson', {
       url : '/readjson',
       templateUrl : 'templates/JsonData.html',
       controller : 'jsonCtrl'
     })
     .state('orderBySorting',{
       url:'/orderBySorting',
       templateUrl:'templates/OderBySort.html',
       controller:'orderByCtrl'
     });
      $urlRouterProvider.otherwise('/registration');
 }]);
