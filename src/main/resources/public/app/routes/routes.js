angular.module('app').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/main');

$stateProvider
  .state('home', {
    url: '/home',
    templateUrl: 'views/partials/home.html',
    controller: 'homeCtrl'
  })
  
.state('enclosure', {
	url: '/enclosure',
	templateUrl: 'views/partials/enclosure.html',
	controller: "enclosureCtrl"
})

.state('animal', {
	url: '/animal',
	templateUrl: 'views/partials/animal.html',
	controller: "animalCtrl"
})

.state('food', {
	url: '/food',
	templateUrl: 'views/partials/food.html',
	controller: "foodCtrl"
})

.state('updateFavFood', {
	url: '/updateFavFood/:foodid',
	templateUrl: 'views/partials/updatefood.html',
	controller: "foodCtrl",
	resolve :{
		 getfavFoodDetailsID: ['foodService', '$stateParams',function(foodService, $stateParams) {
		        return foodService.getFavFoodDetailsID($stateParams.foodid);
		        	
		      }]
	}
});

}]);
