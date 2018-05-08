app.controller('AddController', ['$scope', '$firebaseArray', '$location', 'FBURL', function($scope, $firebaseArray, $location, FBURL){

  $scope.addNotes = function() {
    var ref = new Firebase(FBURL);
    var data = $firebaseArray(ref);
    data.$add({
      title: $scope.data.title,
      text:  $scope.data.text,
      isArchived:$scope.data.isArchived=false,
        // id:  $scope.data.id,
    });
    // console.log("datas",data);

    $location.path('/');
  };

}]);
