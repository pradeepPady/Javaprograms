var app1=angular.module("myApp1",[])
                .controller("myController1",function($scope)
              {
                var employees = [{Name:"pradeep",Id:100,Gmail:"pradeepdesai063@gmail.com"},
                {Name:"rakesh",Id:200,Gmail:"rockrakes123@gmail.com"},
                {Name:"Abhi",Id:300,Gmail:"sabhi001@gmail.com"}];
                $scope.employees = employees;
              });
