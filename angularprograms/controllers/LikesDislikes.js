var app=angular
        .module("MynewApp",[])
        .myController("myController2",function($scope)
      {
        var Technologies=[
          {name:"c#",likes:0,Dislikes:0},
          {name:"Asp.NET",likes:0,Dislikes:0},
          {name:"SQL server",likes:0,Dislikes:0}
        ];
        $scope.Technologies=Technologies;
        $scope.incrementlikes=function(technology)
        {
          technology.likes++;
        }
        $scope.incrementDislikes=function(technology)
        {
          technology.Dislikes++;
        }
      });
