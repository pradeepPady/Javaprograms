var app=angular.module("myApp",['ui.router','ngMaterial']);

app.config(['$stateProvider', '$urlRouterProvider',
 function($stateProvider, $urlRouterProvider) {
   $stateProvider
     .state('readjson', {
       url : '/readjson',
       templateUrl : 'templates/JsonData.htmll',
       controller : 'jsonCtrl'
     })
     .state('flexDirective', {
       url : '/flexDirective',
       templateUrl : 'templates/flexDirective.html'
     })
     .state('flexPercentValue', {
       url : '/flexPercentValue',
       templateUrl : 'templates/flexPercentValue.html'
     })
     .state('flexResponsive', {
       url : '/flexResponsive',
       templateUrl : 'templates/flexResponsive.html'
     })

     .state('flexWrap', {
       url : '/flexWrap',
       templateUrl : 'templates/flexWrap.html'
     })

     .state('lauyoutAlign', {
       url : '/lauyoutAlign',
       templateUrl : 'templates/lauyoutAlign.html'
     })
     .state('layoutDirective', {
       url : '/layoutDirective',
       templateUrl : 'templates/layoutDirective.html'
     })

     .state('md_autocomplete', {
       url : '/md_autocomplete',
       templateUrl : 'templates/md_autocomplete.html'
     })

     .state('md_autocomplite1', {
       url : '/md_autocomplete',
       templateUrl : 'templates/md_autocomplite1.html'
     })

     .state('dailog', {
       url : '/dailog',
       templateUrl : 'templates/dailog.html'
     })

    .state('bottomSheat', {
      url : '/bottomSheat',
      templateUrl : 'templates/bottomSheat.html'
    })
    .state('md_button', {
      url : '/md_button',
      templateUrl : 'templates/md_button.html'
    })
    .state('md_card', {
      url : '/md_card',
      templateUrl : 'templates/md_card.html'
    })
    .state('cardWithCaptions', {
      url : '/cardWithCaptions',
      templateUrl : 'templates/cardWithCaptions.html'
    })
    .state('cardWithCaptions', {
      url : '/cardWithCaptions',
      templateUrl : 'templates/cardWithCaptions.html'
    })
    .state('md_checkBox', {
      url : '/md_checkBox',
      templateUrl : 'templates/md_checkBox.html'
    });
      $urlRouterProvider.otherwise('/flexDirective');
 }]);
