var app=angular.module("MyApp2",[]);
              app .controller("myController2",function($scope))
               {
                 var emploeesData=[
                   { name:"Pradeep",Gender:"male",DateOfBirth:new Date("may, 05,1995"),age=22,salary:220000},
                   {name:"rakesh",gender:"male",DateOfBirth:new Date("jun, 05,1996"),age:21,salary:210000},
                    { name:"Sudeep",Gender:"male",DateOfBirth:new Date("aug, 05,1993"),age=25,salary:225000},
                     { name:"sandeep",Gender:"male",DateOfBirth:new Date("may, 05,1992"),age=26,salary:220060},
                      { name:"anideep",Gender:"male",DateOfBirth:new Date("may, 05,1985"),age=42,salary:220000},
                       { name:"Prakash",Gender:"male",DateOfBirth:new Date("may, 05,1978"),age=52,salary:2208800},
                        { name:"Praveen",Gender:"male",DateOfBirth:new Date("may, 05,1980"),age=32,salary:22099000},
                 ];
                 $scope.emploeesData=emploeesData;
                 $scope.employeeView="MyAngular/utiliy/utilityTable.html";
               });
