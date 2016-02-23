angular.module('app').controller('foodCtrl', ['$scope', '$state','foodService', function( $scope, $state, foodService) {

	$scope.food = {};
	
	$scope.addFood = function(){	
		
		foodService.createFood($scope.food).then(function(response){	
			console.log();
        //    $state.go('viewFoodList', ({reportid : $scope.report.reportId}));
        }, function(response){
            console.log(response);
        });	
	};
	
	/**
	 * To retrieve all category in data base 
	 */
	/*  foodService.getCategory().then(function(response){	
		  $scope.categories = response.data;
		  console.log($scope.categories);
	  });
	*/
	  /**
		* To retrieve all category in data base 
		*/
		  foodService.getVendors().then(function(response){	
			  $scope.vendors = response.data;
			  console.log($scope.vendors);
		  });
	  
	  
}]);