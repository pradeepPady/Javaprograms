app.controller('homeCtrl', function($scope,$mdDialog, JsonService, $timeout, $mdSidenav, $state, $filter) {
  var data;
  var picked = [];
  var selectedManufacturer = [];
  var selectedStorage = [];
  var selectedOs = [];
  var selectedCamera = [];

  $scope.toggle = function(category, keyword) {
    switch (category) {
      case 'manufacturer':
        var indexm = selectedManufacturer.indexOf(keyword);
        if (indexm > -1) {
          selectedManufacturer.splice(indexm, 1);
        } else {
          selectedManufacturer.push(keyword);
        }
        break;
      case 'storage':
        var indexs = selectedStorage.indexOf(keyword);
        if (indexs > -1) {
          selectedStorage.splice(indexs, 1);
        } else {
          selectedStorage.push(keyword);
        }
        break;
      case 'os':
        var indexo = selectedOs.indexOf(keyword);
        if (indexo > -1) {
          selectedOs.splice(indexo, 1);
        } else {
          selectedOs.push(keyword);
        }
        break;
      case 'camera':
        var indexc = selectedCamera.indexOf(keyword);
        if (indexc > -1) {
          selectedCamera.splice(indexc, 1);
        } else {
          selectedCamera.push(keyword);
        }
        break;
    }
  };
  $scope.arrManufacturer = selectedManufacturer;
  $scope.arrStorage = selectedStorage;
  $scope.arrOs = selectedOs;
  $scope.arrCamera = selectedCamera;
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

app.filter('uniqueData', function() {
  return function(items, arrManufacturer, arrStorage, arrOs, arrCamera) {
    var filtered = [];
    var temparr = [];

    if (items != undefined) {

      if (arrManufacturer.length > 0 || arrStorage.length > 0 || arrOs.length > 0 || arrCamera.length > 0) {

        for (var j = 0; j < items.length; j++) {
          var item = items[j];

          for (var i = 0; i < arrManufacturer.length; i++) {
            var selectedItem = arrManufacturer[i];
            if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
              item.specs.os == selectedItem || item.specs.camera == selectedItem) {
              filtered.push(item);
            }
          }
        }
        if (filtered.length > 0) {
          temparr = filtered;
          filtered = [];
        } else {
          temparr = items;
        }

        if (arrStorage.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            var item = temparr[j];

            for (var i = 0; i < arrStorage.length; i++) {
              var selectedItem = arrStorage[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filtered.push(item);
              }
            }
          }
          temparr = filtered;
          filtered = [];
        }

        if (arrOs.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            var item = temparr[j];

            for (var i = 0; i < arrOs.length; i++) {
              var selectedItem = arrOs[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filtered.push(item);
              }
            }
          }
          temparr = filtered;
          filtered = [];
        }

        if (arrCamera.length > 0) {
          for (var j = 0; j < temparr.length; j++) {
            var item = temparr[j];

            for (var i = 0; i < arrCamera.length; i++) {
              var selectedItem = arrCamera[i];
              if (item.specs.manufacturer == selectedItem || item.specs.storage == selectedItem ||
                item.specs.os == selectedItem || item.specs.camera == selectedItem) {
                filtered.push(item);
              }
            }

          }
          temparr = filtered;
          filtered = [];
        }
      } else {
        temparr = items;
      }
    }
    return temparr;
  };
});
