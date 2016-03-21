angular.module('app').controller('foodCtrl', ['$scope', '$state','foodService',
                                              function( $scope, $state, foodService) {

	$scope.food = {};
	$scope.favfood = {};
	
	/**
	 * To retrieve all fav_food details  
	 */
	  foodService.getAllFavFood().then(function(response){		 
		  $scope.favfood = response.data;
	  });

	/**
	 * To retrieve all category 
	 */
	  foodService.getAllCategory().then(function(response){	
		  $scope.categories = response.data;		
	  });
	
   /**
	* To retrieve all vendors  
	*/
	 foodService.getAllVendors().then(function(response){	
			  $scope.vendors = response.data;
			  
	 });
	  /**
	   * add food from the web site 
	   */
	 $scope.addFood = function(){		
			foodService.createFood($scope.food).then(function(e){	
				console.log(e);
				 $state.reload();
	        }, function(response){
	            console.log(response);
	        });	
		};
	 
}]);