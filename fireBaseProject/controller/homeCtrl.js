
app.controller('homectrl', ['$scope', '$firebaseArray', '$location', 'FBURL', function($scope, $firebaseArray, $location, FBURL){

  $scope.getData= function() {
    var ref = new Firebase(FBURL);
    var data = $firebaseArray(ref);
    console.log(data);
    // $location.path('/');
  };

}]);
