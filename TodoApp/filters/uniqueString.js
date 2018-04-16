app.filter('uniqueString',function(){
  return function(items,keyword){
    var filtered = [];

    if(items !== undefined){
      for(var i=0;i < items.length;i++){
        var item = items[i];
        var flag = false;

        if(i==0){
          filtered.push(item);
        }else{
          for(var j=0;j < filtered.length;j++){
            var filteredItem = filtered[j];

            if(item.specs[keyword] === filteredItem.specs[keyword]){
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
