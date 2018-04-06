  app.controller('homeCtrl', function ($scope, $timeout, $mdSidenav,$state,jsonProductReader)
  {
       $scope.toggleLeft = buildToggler('left');
       $scope.toggleRight = buildToggler('right');
      function buildToggler(componentId) {
        return function() {
          $mdSidenav(componentId).toggle();
        };
      }
      $scope.sendLogin=function()
    {
     $state.go('login');
    }
    $scope.result=jsonProductReader.readJsonData();
      $scope.result.then(function(response)
      {
        $scope.jsonProductData=response;
      })
  });
