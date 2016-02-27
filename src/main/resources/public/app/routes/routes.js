angular.module('app').config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/main');

$stateProvider

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
	controller: "foodUpdateCtrl",
	resolve :{
		 getfavFoodDetailsID: ['foodService', '$stateParams',function(foodService, $stateParams) {
		        return foodService.getFavFoodDetailsID($stateParams.foodid);   	
		      }],
		      getCatagory: ['foodService',function(foodService){
		    	  return foodService.getAllCategory();
		      }],
		      getVendor: ['foodService',function(foodService){	    
		    	  return foodService.getAllVendors();
		      }],
	}
})

.state('updateAnimal', {
	url: '/updateAnimal/:animalid',
	templateUrl: 'views/partials/updateanimal.html',
	controller: "animalUpdateCtrl",
	resolve :{
		 getAnimalDetailsID: ['animalService', '$stateParams',function(animalService, $stateParams) {
		        return animalService.getAnimalDetailsID($stateParams.animalid);   	
		      }],
		      getFavFood: ['animalService',function(animalService){
		    	  return animalService.getAllFavFood();
		      }],	     
	}
})

.state('updateEnclosure', {
	url: '/updateEnclosure/:enclosureid',
	templateUrl: 'views/partials/updateEnclosure.html',
	controller: "enclosureUpdateCtrl",
	resolve :{
		 getEnclosureDetailsID: ['enclosureService', '$stateParams',function(enclosureService, $stateParams) {
		        return enclosureService.getEnclosureID($stateParams.enclosureid);   	
		      }],
		      getCondiiton: ['enclosureService',function(enclosureService){
		    	  return enclosureService.getAllCondition();
		      }],	
		      getAnimal: ['enclosureService',function(enclosureService){
  	 			 return enclosureService.getAllAnimalDetails();
		      }],
	}
});

}]);
