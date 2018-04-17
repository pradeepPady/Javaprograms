app.controller('dashboardCtrl',function($scope,$mdDialog){
  $scope.showDialog = function(clickEvent,x) {
      $mdDialog.show({
        locals : {dataList : x},
        controller: DialogController,
        templateUrl: 'templates/dialog.html',
        parent: angular.element(document.body),
        targetEvent: clickEvent,
        clickOutsideToClose:true,
        fullscreen: $scope.customFullscreen
      });
    };

  function DialogController($scope, $mdDialog,dataList) {
    $scope.dataList = dataList;
    $scope.cancel = function() {
      $mdDialog.cancel();
    };
  }
});
