app.service("jsonProductReader",function($http)
{
  this.readJsonData=function(){
    return $http.get("products.json").then(function(response){
       return response.data;
  });
}
});
