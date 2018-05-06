// angular.module('starter.services', ['firebase'])
//
// .factory('OtherFriends', ['$firebase', function ($firebase) {
//
//   var ref = new Firebase("https://todoapp-32c3a.firebaseio.com/");
//   var sync = $firebase(ref);
//
//   var mobileList = sync.$asArray();
//
//   return {
//     all: function() {
//       return mobileList;
//     },
//     get: function(Id) {
//       return mobileList[Id];
//     }
//   }
// }])
//
//
// angular.module('app.services', ['firebase'])



// app.factory('MobileService', ['$firebaseArray', function($firebaseArray){
//   var myData = new Firebase("https://todoapp-32c3a.firebaseio.com/");
//   console.log("myData",myData);
//   return {
//     getData: getData
//   }
//   function getData() {
//       return $firebaseArray(myData).then(function(response){
//         return response.data;
//       });
//   }
// }]);


// app.factory('MobileService', ['$firebaseArray', function($firebaseArray){
//     this.myCalTimes = new Firebase("https://todoapp-32c3a.firebaseio.com");
// console.log("ranu",myCalTimes);
//     this.myCalTimes.on("value", function(snapshot) {
//         var calTimes = snapshot.val();
//         return $firebaseArray(calTimes);
//
//     }, function (errorObject) {
//       console.log("Data failed: " + errorObject.code);
//     });
// }])
