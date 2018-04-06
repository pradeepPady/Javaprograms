app.controller("jsonProductCtrl",function($scope,jsonProductReader)
{
  $scope.result=jsonProductReader.readJsonData();
    $scope.result.then(function(response)
    {
      $scope.jsonProductData=response;
    })
});
