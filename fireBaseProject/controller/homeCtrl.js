app.controller("homectrl", function($scope)
{
  //var ref = new Firebase("https://todoapp-32c3a.firebaseio.com/");
  //
  // var artists = ref.child("mobileData");
  //
  // $scope.data = new $firebaseArray(mobileData);
  // console.log(data);
//   var config = {
//     apiKey: "AIzaSyB9EiNLusE87QlcFj2s7y22R8JGOCDvKDU",
//     authDomain: "todoapp-32c3a.firebaseapp.com",
//     databaseURL: "https://todoapp-32c3a.firebaseio.com",
//     projectId: "todoapp-32c3a",
//     storageBucket: "todoapp-32c3a.appspot.com",
//     messagingSenderId: "614617625148"
//   };
//   firebase.initializeApp(config);
//   var ref = firebase.database().ref();
//
// ref.on("value", function(snapshot) {
//    console.log(snapshot.val());
// }, function (error) {
//    console.log("Error: " + error.code);
// });

});
var config = {
  apiKey: "AIzaSyB9EiNLusE87QlcFj2s7y22R8JGOCDvKDU",
  authDomain: "todoapp-32c3a.firebaseapp.com",
  databaseURL: "https://todoapp-32c3a.firebaseio.com",
  projectId: "todoapp-32c3a",
  storageBucket: "todoapp-32c3a.appspot.com",
  messagingSenderId: "614617625148"
};
firebase.initializeApp(config);
var ref = firebase.database().ref();

ref.on("value", function(snapshot) {
 console.log(snapshot.val());
 $scope.data=snapshot.val();
 console.log("Data",data);
}, function (error) {
 console.log("Error: " + error.code);
});
