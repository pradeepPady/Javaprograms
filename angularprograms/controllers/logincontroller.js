
app.controller("loginctrl",function($scope,$rootScope)
{
  $scope.message="";
  $scope.loginCheck=function(email,password)
  {
    if(($rootScope.email==$scope.email)&&($rootScope.password==$scope.password))
    {
      $scope.message="Login sucsessfully....!"
    }
    else
    {
      $scope.message="Please enter correct....! password"
    }
  }
});
