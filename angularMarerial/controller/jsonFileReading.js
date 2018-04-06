
app.controller("jsonCtrl",function($scope,jsonReader)
{
  $scope.result=jsonReader.readJsonData();
    $scope.result.then(function(response){
      $scope.jsonData=response;
    })
});
