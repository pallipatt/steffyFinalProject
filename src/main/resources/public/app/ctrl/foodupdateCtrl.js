angular.module('app').controller('foodUpdateCtrl', ['$scope', '$state','foodService','getfavFoodDetailsID','getCatagory','getVendor',
                                   function( $scope, $state, foodService, getfavFoodDetailsID, getCatagory,getVendor) {

	$scope.catagory = getCatagory.data;
	$scope.vendor= getVendor.data;
	$scope.updatefood = {};
	$scope.updatefood = getfavFoodDetailsID.data;
	$scope.updatefood.name = getfavFoodDetailsID.data.name;
	$scope.updatefood.catagory = getfavFoodDetailsID.data.catagory.name;
	$scope.updatefood.vendor= getfavFoodDetailsID.data.vendor.name;
	$scope.catagoryName = $scope.updatefood.catagory;
	$scope.vendorName = $scope.updatefood.vendor
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