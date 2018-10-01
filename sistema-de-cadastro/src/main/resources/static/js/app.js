var app = angular.module('app',['ngRoute']);

app.controller('HomeCtrl', function($rootScope, $location, $http)
		{
		   $rootScope.activetab = $location.path();
		   $rootScope.ListaClientes = [];
		   
		   $http({
				  method: 'GET',
				  url: 'http://localhost:8080/clientes/listar'
				}).then(function successCallback(response) {
				    console.log(response.data);
				    console.log(response.status);
				  }, function errorCallback(response) {
					  console.log(response.data);
					  console.log(response.status);
				  });

		   
		});


app.config(['$routeProvider',
  function($routeProvider) {
	 // remove o # da url
	   $locationProvider.html5Mode(true);
    $routeProvider.
  

   .when('/', {  templateUrl : 'lista.html',
	   			 controller  : 'HomeCtrl',
   })

   // caso não seja nenhum desses, redirecione para a rota '/'
   .otherwise ({ redirectTo: '/' });
});


