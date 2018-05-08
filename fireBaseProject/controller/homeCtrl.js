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

// $scope.findSeriesWithoutFactory = function() {
//     var seriesRef = new Firebase('https://todoapp-32c3a.firebaseio.com/mobileData');
//     var seriesCollection = $firebaseArray(seriesRef);
//      // seriesCollection.$ref().orderByChild("name").equalTo($scope.seriesName).once("value", function(dataSnapshot){
//         var series = dataSnapshot.val();
//         if(series){
//           console.log("Found", series);
//           $scope.series = series;
//         } else {
//           console.warn("Not found.");
//         }
//     );
//   };



  // var ref = new Firebase("https://todoapp-32c3a.firebaseio.com");
  //
  // var artists=ref.child("mobileData");
  //
  //
  // // download the data into a local object
  // $scope.data = $firebaseObject(ref);
  //
  // // putting a console.log here won't work, see below
  //   ref.on("value", function(snapshot)
  //   {
  //     console.log(snapshot.val());
  //   }, function (errorObject)
  //   {
  //     console.log("The read failed: " + errorObject.code);
  //   });
  //
  //
  //  var artistsRef=new Firebase("https://todoapp-32c3a.firebaseio.com");

});

// var config = {
//   apiKey: "AIzaSyB9EiNLusE87QlcFj2s7y22R8JGOCDvKDU",
//   authDomain: "todoapp-32c3a.firebaseapp.com",
//   databaseURL: "https://todoapp-32c3a.firebaseio.com",
//   projectId: "todoapp-32c3a",
//   storageBucket: "todoapp-32c3a.appspot.com",
//   messagingSenderId: "614617625148"
// };
// firebase.initializeApp(config);
// var ref = firebase.database().ref();
// ref.on("value", function(snapshot) {
//  var data=snapshot.val();
//  console.log("Data",data);
// }, function (error) {
//  console.log("Error: " + error.code);
// });
