app.filter('unique',function(){
  return function(datas,key){
    var filtered = [];
if(datas!==undefined)
{
      for(var i=0;i < datas.length;i++)
       {
              var item = datas[i];
              var flag = false;

              if(i==0){
                filtered.push(item);
              }else
              {
                for(var j=0;j < filtered.length;j++){
                  var filteredItem = filtered[j];

                  if(item.specs[key] === filteredItem.specs[key]){
                    flag = true;
                  }
                }

                if(!flag){
                  filtered.push(item);
                }
           }
      }
    }
    return filtered;
  };
});
app.filter('uniqueData', function() {
  return function(datas, selected) {
    var filtered = [];

    if (selected.length > 0) {
      for (var i = 0; i < datas.length; i++) {
        var item = datas[i];

        if (selected.indexOf(item.specs.manufacturer) >= 0 || selected.indexOf(item.specs.storage) >= 0
            || selected.indexOf(item.specs.os) >= 0 || selected.indexOf(item.specs.camera) >= 0) {
          filtered.push(item);
        }
      }
    } else {
      return datas;
    }
    return filtered;
  };
});
app.factory('JsonService',function($http){
  return $http.get('products.json');
});
