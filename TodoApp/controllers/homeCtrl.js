app.controller('homeCtrl', function($scope,$mdDialog, JsonService, $timeout, $mdSidenav, $state, $filter) {
  var data;
  var picked = [];

  $scope.toggle = function(keyword) {
    var index = picked.indexOf(keyword);
    if (index > -1) {
      picked.splice(index, 1);
      console.log(picked.splice(index, 1));
      console.log(index);
    } else {
      picked.push(keyword);
      console.log(picked.push(keyword));
    }
  };

  $scope.allData = picked;
  $timeout(function() {
    JsonService.then(function(response) {
      $scope.data = response.data;
    });
  }, 1);
  $scope.toggleLeft = buildToggler('left');
  $scope.toggleRight = buildToggler('right');

  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
      var isOpen = $mdSidenav(componentId).isOpen();
      if(isOpen){
        document.getElementById('dashboard').style.marginLeft = '350px';
      }else{
        document.getElementById('dashboard').style.marginLeft ='0px';
      }
    };
  }
  $state.go('home.dashboard');
});
