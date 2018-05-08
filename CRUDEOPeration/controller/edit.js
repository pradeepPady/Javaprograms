app.controller('EditController', ['$scope','$location', '$routeParams', '$firebaseObject', 'FBURL',
    function($scope, $location, $routeParams, $firebaseObject, FBURL){

    var ref = new Firebase(FBURL + $routeParams.id);
    $scope.data = $firebaseObject(ref);
    $scope.editNotes = function() {
        $scope.data.$save({
            title: $scope.data.title,
            text: $scope.data.text,
        });
        $scope.edit_form.$setPristine();
        $scope.data = {};
        $location.path('/datas');

    };
    

}]);
