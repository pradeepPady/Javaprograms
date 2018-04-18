 app.factory('JsonService',function($http){
   return $http.get('products.json');
 });
