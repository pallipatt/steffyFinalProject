angular.module('app').controller('animalCtrl', ['$scope', '$state','animalService','foodService',
                                              function( $scope, $state, animalService,foodService) { 
	
	$scope.animals = {};
	$scope.favfoods = {};
	
	/**
	 * To retrieve all fav_food details  
	 */
	  animalService.getAllFavFood().then(function(response){	
		  $scope.favfoods = response.data;
	  });
	  
	  /**
	   * add animal details from the web site 
	   */
	 $scope.addAnimalDetails = function(){
			animalService.createAnimalDetails($scope.animal).then(function(){
				 $state.reload();
	        }, function(response){
	            console.log(response);
	        });	
		};
		/**
		 * To retrieve all animal details  
		 */
		  animalService.getAllAnimalDetails().then(function(response){		 
			  $scope.animals = response.data;
			  console.log("responce " +response);
		  });
}]);