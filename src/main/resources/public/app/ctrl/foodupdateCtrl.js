angular.module('app').controller('foodupdateCtrl', ['$scope', '$state','foodService','getfavFoodDetailsID','getCatagory','getVendor',
                                   function( $scope, $state, foodService, getfavFoodDetailsID, getCatagory,getVendor) {

	$scope.catagory = getCatagory.data;
	$scope.vendor= getVendor.data;
	$scope.updatefood = {};
	$scope.updatefood = getfavFoodDetailsID.data;
	$scope.updatefood.name = getfavFoodDetailsID.data.name;
	$scope.updatefood.catagory = getCatagory.data.name;
	$scope.updatefood.vendor= getVendor.data.name;
	
	  /**
	   * updates food from the web site 
	   */
	 $scope.updateFood = function(){		
			foodService.updateCurentFood($scope.updatefood).then(function(){
				$state.go('food');
	        }, function(response){
	            console.log(response);
	            
	        });	
		};
		
}]);