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
        document.getElementById('dashboard').style.marginLeft = '250px';
      }else{
        document.getElementById('dashboard').style.marginLeft ='0px';
      }
    };
  }
 //  $scope.getData = readJson.getJson();
 // $scope.getData.then(function(response) {
 //   $scope.jsonRecord = response;
 // })

  JsonService.then(function(response){
    $scope.data = response.data;
  });
  $scope.manufacturerData = manufacturerArray;
  $scope.storageData = storageArray;
  $scope.osData = osArray;
  $scope.cameraData = cameraArray;
  $scope.allData = picked;
  $scope.toggleLeft = buildToggler('left');
  $state.go('home.dashboard');
  $scope.dataStoreInArray = function(category, keyword){
      switch (category) {
        case 'manufacturer':storingData(manufacturerArray,keyword);
        break;
        case 'storage':storingData(storageArray,keyword);
        break;
        case 'os':storingData(osArray,keyword);
        break;
        case 'camera':storingData(cameraArray,keyword);
        break;
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
});
