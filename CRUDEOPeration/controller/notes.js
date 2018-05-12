app.controller('ListController', ['$scope', '$firebaseArray','$routeParams','$firebaseObject','FBURL', function($scope,$firebaseArray,$routeParams,$firebaseObject, FBURL){
  // FirebaseDatabase.getInstance().setPersistenceEnabled(true);
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



 $scope.isArchived = function(id) {

    var ref = new Firebase(FBURL + id);
    $scope.data = $firebaseObject(ref);
    console.log($scope.data);
     data.$save({
          isArchive : $scope.data.isArchived,
     });
    // $scope.edit_form.$setPristine();
    console.log( $scope.data.isArchived)
     $scope.data = {};
     $location.path('/datas');

 };


 // var provider = new firebase.auth.GoogleAuthProvider();
 // function googleSignin() {
 //    firebase.auth()
 //    .signInWithPopup(provider).then(function(result) {
 //       var token = result.credential.accessToken;
 //       var user = result.user;
 //
 //       console.log(token)
 //       console.log(user)
 //    }).catch(function(error) {
 //       var errorCode = error.code;
 //       var errorMessage = error.message;
 //
 //       console.log(error.code)
 //       console.log(error.message)
 //    });
 // }
 //
 // function googleSignout() {
 //    firebase.auth().signOut()
 //    .then(function() {
 //       console.log('Signout Succesfull')
 //    }, function(error) {
 //       console.log('Signout Failed')
 //    });
 // }

}]);
