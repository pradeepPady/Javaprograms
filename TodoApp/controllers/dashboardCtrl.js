app.controller('dashboardCtrl',function($scope,$mdDialog){
  //$scope.customFullscreen = $mdMedia('xs') || $mdMedia('sm');
  $scope.dailogView= function(clickEvent,x) {
      $mdDialog.show({
        locals : {d : x},
        controller: DialogController,
        templateUrl: 'templates/dialog.html',
        parent: angular.element(document.body),
        targetEvent: clickEvent,
        clickOutsideToClose:true,
        fullscreen: $scope.customFullscreen
      });
    };
  function DialogController($scope, $mdDialog,d) {
    $scope.elements = d;
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
});
