app.controller('homeCtrl', function($scope,$mdDialog, JsonService, $timeout, $mdSidenav, $state) {
  var data;
  var picked = [];
  var manufacturerArray = [];
  var storageArray = [];
  var osArray = [];
  var cameraArray = [];
  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
      var isOpen = $mdSidenav(componentId).isOpen();
      if(isOpen){
        document.getElementById('dashboard').style.marginLeft = '300px';
      }else{
        document.getElementById('dashboard').style.marginLeft ='0px';
      }
    };
  }
  JsonService.then(function(response){
    $scope.data = response.data;
  });

    $scope.dataStoreInArray = function(category, keyword){
        if(category=='manufacturer'){
          storingData(manufacturerArray,keyword);
        }
        else if(category=='storage'){
          storingData(storageArray,keyword);
        }
        else if(category=='os'){
          storingData(osArray,keyword);
        }
        else if(category=='camera'){
          storingData(cameraArray,keyword);
        }
  };
storingData=function(Arrays, keyword){
  var index = Arrays.indexOf(keyword);
            if (index > -1){
                Arrays.splice(index, 1);
             }else{
              Arrays.push(keyword);
            }
};
  $scope.manufacturerData = manufacturerArray;
  $scope.storageData = storageArray;
  $scope.osData = osArray;
  $scope.cameraData = cameraArray;
  $scope.allData = picked;
  $scope.toggleLeft = buildToggler('left');
  $state.go('home.dashboard');
});
