app.factory('Json',function($http){
  return $http.get('products.json');
});
