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
      if (manufacturerData.length > 0 || storageData.length > 0 || osData.length > 0 || cameraData.length > 0)
       {
          var j=0;
          while (j<elements.length)
           {
                for (var i = 0; i < manufacturerData.length; i++)
                {
                    if (elements[j].specs.manufacturer == manufacturerData[i])
                    {
                      filteredValues.push(elements[j]);
                    }
                }
                j++;
            }
            if (filteredValues.length > 0)
            {
              temp = filteredValues;
              filteredValues = [];
            }
            else
            {
              temp = elements;
            }
            if (storageData.length > 0)
             {
                var j=0;
                while(j<temp.length)
                {
                    for (var i = 0; i < storageData.length; i++)
                    {
                        if ( temp[j].specs.storage == storageData[i])
                         {
                            filteredValues.push(temp[j]);
                         }
                    }
                    j++;
               }
              temp = filteredValues;
              filteredValues = [];
            }
            if (osData.length > 0)
            {
                var j=0;
                while(j < temp.length)
                {

                  for (var i = 0; i < osData.length; i++)
                   {
                      if (temp[j].specs.os == osData[i])
                      {
                        filteredValues.push(temp[j]);
                      }
                  }
                  j++;
              }
              temp = filteredValues;
              filteredValues = [];
            }
            if (cameraData.length > 0)
            {
                var j=0;
                while(j < temp.length)
                {
                for (var i = 0; i < cameraData.length; i++)
                 {
                  if (temp[j].specs.camera == cameraData[i])
                  {
                    filteredValues.push(temp[j]);
                  }
                }
                j++;
              }
              temp = filteredValues;
              filteredValues = [];
           }
      }
       else
        {
         temp = elements;
        }
    return temp;
  };

});
