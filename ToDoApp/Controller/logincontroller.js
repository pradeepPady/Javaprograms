
app.controller('loginctrl',function($scope,$state){
  $scope.sendHome=function()
  {
   $state.go('home');
 }
});
