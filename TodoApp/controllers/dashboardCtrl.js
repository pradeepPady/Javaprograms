app.controller('dashboardCtrl',function($scope,$mdDialog){
  $scope.showDialog = function(clickEvent,item) {
      $mdDialog.show({
        locals : {mobileData : item},
        controller: DialogController,
        templateUrl: 'templates/mobileDialog.html',
        parent: angular.element(document.body),
        targetEvent: clickEvent,
        clickOutsideToClose:true,
        fullscreen: $scope.customFullscreen // Only for -xs, -sm breakpoints.
      });
    };

  function DialogController($scope, $mdDialog,mobileData) {
    $scope.mobileData = mobileData;
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
});
