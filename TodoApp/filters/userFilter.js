app.filter('unique',function(){
  return function(datas,key){
    var filtered = [];
if(datas!==undefined)
{
      for(var i=0;i<datas.length;i++)
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
