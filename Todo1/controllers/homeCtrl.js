app.controller('homeCtrl', function($scope,$mdDialog, Json, $timeout, $mdSidenav, $state, $filter) {
  $scope.loading = true;
  var data;
  var data2;
  var selected = [];
  $timeout(function() {
    Json.then(function(response) {
      $scope.data = response.data;
      $scope.loading = false;
      $scope.data2 = response.data;
    });
  }, 1);
  $scope.toggleLeft = buildToggler('left');
  $scope.toggleRight = buildToggler('right');

  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
      var isOpen = $mdSidenav(componentId).isOpen();
      if(isOpen){
        document.getElementById('dashboard').style.marginLeft = '320px';
      }else{
        document.getElementById('dashboard').style.marginLeft ='0px';
      }
    };
  }
  $state.go('home.dashboard');

  $scope.toggle = function(keyword) {
    var index = selected.indexOf(keyword);
    if (index > -1) {
      selected.splice(index, 1);
    } else {
      selected.push(keyword);
    }
    console.log(selected);
  };
  // $scope.array=["abc","bcd"]
  $scope.arrData = selected;

});

app.filter('commonString', function() {
  return function(items, selected) {
    var filtered = [];

    if (selected.length > 0) {
      for (var i = 0; i < items.length; i++) {
        var item = items[i];

        if (selected.indexOf(item.specs.manufacturer) >= 0 || selected.indexOf(item.specs.storage) >= 0
            || selected.indexOf(item.specs.os) >= 0 || selected.indexOf(item.specs.camera) >= 0) {
          filtered.push(item);
        }
      }
    } else {
      return items;
    }
    //console.log(filtered);
    return filtered;
  };
});
