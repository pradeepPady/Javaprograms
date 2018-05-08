app.controller('ArchiveController', ['$scope','$location', '$routeParams', '$firebaseObject', 'FBURL',
    function($scope, $location, $routeParams, $firebaseObject, FBURL){

    var ref = new Firebase(FBURL + $routeParams.id);
    $scope.data = $firebaseObject(ref);
    $scope.isArchived = function(a) {
        $scope.data.$save({
            isArchived:$scope.isArchived,
        });
        $scope.edit_form.$setPristine();
        $scope.data = {};
        $location.path('/datas');

    };


}]);
