app.controller("registrationCtrl",function($scope,$rootScope)
{
  $scope.register=function(email,password)
  {
    $rootScope.email=email;
    $rootScope.password=password;
    $scope.message="User registered susessfully......!";
  }
});
