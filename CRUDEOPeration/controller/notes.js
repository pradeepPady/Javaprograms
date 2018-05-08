app.controller('ListController', ['$scope', '$firebaseArray','$routeParams','$firebaseObject','FBURL', function($scope,$firebaseArray,$routeParams,$firebaseObject, FBURL){
  var datas = new Firebase(FBURL);
  $scope.datas = $firebaseArray(datas);
  // angular.forEach('$scope.datas',function(value,key){
  //   console.log("size",key);
  // })
  // var itemsLength = Object.keys($scope.datas).length;
  //
  // console.log("lenght",$scope.datas.length);
  // console.log("lenght1",itemsLength);
//   var key, count = 0;
// for(key in $scope.datas) {
//   if($scope.datas.hasOwnProperty(key)) {
//     count++;
//   }
// }
// console.log("count",count);
  $scope.removeData = function(id) {
  var ref = new Firebase(FBURL + id);
  var data = $firebaseObject(ref)
  console.log("RemovedData",data);
  data.$remove();
 };
 $scope.callRestService= function() {
   $http({method: 'GET', url: FBURL}).
     success(function(data, status, headers, config) {
          $scope.results.push(data);
     })
 }

 // $scope.isArchived = function(id, a) {
 //    var ref = new Firebase(FBURL + id);
 //    $scope.data = $firebaseObject(ref);
 //     $scope.data.$save({
 //         data.isArchived = a.isArchived
 //     });
 //     $scope.edit_form.$setPristine();
 //     $scope.data = {};
 //     $location.path('/datas');
 //
 // };


}]);
