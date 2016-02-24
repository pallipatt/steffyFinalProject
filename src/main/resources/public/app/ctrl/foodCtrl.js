angular.module('app').controller('foodCtrl', ['$scope', '$state','foodService', function( $scope, $state, foodService) {

	$scope.food = {};
	$scope.favfood = {};
	console.log("$scope.favfood" + $scope.favfood );
	console.log("$scope.favfood outside" + $scope.favfood);
	
	/**
	 * To retrieve all fav_food details  
	 */
	  foodService.getAllFavFood().then(function(response){	
		  console.log("inside getAllFavFood");
		  $scope.favfood = response.data;
		  console.log("responce " +response);
		  console.log("inside function " +$scope.favfood);
	  });

	/**
	 * To retrieve all category 
	 */
	  foodService.getAllCategory().then(function(response){	
		  $scope.categories = response.data;
		  console.log("$scope.categories------------>" + $scope.categories);
	  });
	
   /**
	* To retrieve all vendors  
	*/
	 foodService.getAllVendors().then(function(response){	
			  $scope.vendors = response.data;
			  console.log($scope.vendors);
	 });
	  /**
	   * add food from the website 
	   */
	 $scope.addFood = function(){
			
			foodService.createFood($scope.food).then(function(){	
				//console.log("$scope.food");
			//	 console.log($scope.food + $scope.food.category +  $scope.food.vendor);
			//	console.log("response" + response );
	        //    $state.go('viewFoodList', ({reportid : $scope.report.reportId}));
	        }, function(response){
	       //     console.log(response);
	        });	
		};
	 
}]);