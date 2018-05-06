app.filter('unique',function()
{
  return function(datas,key)
  {
    var filter = [];
    if(datas!==undefined)
    {
      for(var i=0;i<datas.length;i++)
       {
              var flag = false;
              if(i==0)
              {
                filter.push(datas[i]);
              }
              else
              {
                  for(var j=0;j < filter.length;j++)
                  {
                      if(datas[i].specs[key] === filter[j].specs[key])
                      {
                        flag = true;
                      }
                  }
            if(!flag)
              {
                filter.push(datas[i]);
              }
          }
      }
    }
    return filter;
  };
});
app.filter('uniqueData', function() {
  return function(elements, manufacturerData, storageData, osData, cameraData) {
    var filteredValues = [];
    var temp = [];
    loopingFun=function(arrayData,entries){
      var j=0;
      while (j<entries.length){
            for (var i = 0; i < arrayData.length; i++){
                if (entries[j].specs.manufacturer == arrayData[i]|| entries[j].specs.storage==arrayData[i]||entries[j].specs.os==arrayData[i]||entries[j].specs.camera==arrayData[i]){
                  filteredValues.push(entries[j]);
                }
            }
            j++;
        }
    }
if (manufacturerData.length > 0 || storageData.length > 0 || osData.length > 0 || cameraData.length > 0){
    loopingFun(manufacturerData,elements);
    if (filteredValues.length > 0)
    {temp = filteredValues;
      filteredValues = [];}
    else{temp = elements;}
    if (storageData.length > 0) {
    loopingFun(storageData,temp);
    temp = filteredValues;
    filteredValues = [];}
    if (osData.length > 0){
    loopingFun(osData,temp);
    temp = filteredValues;
    filteredValues = [];}
    if (cameraData.length > 0){
    loopingFun(cameraData,temp);
    temp = filteredValues;
    filteredValues = [];}
      }
       else{
         temp = elements;
        }
    return temp;
  };

});
