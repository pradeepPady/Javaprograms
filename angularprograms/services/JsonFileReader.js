app.service("jsonReader",function($http)
{
  this.readJsonData=function(){
    return $http.get("CompanyShares1.json").then(function(response){
       return response.data.Share_Info;
  });
}
});
