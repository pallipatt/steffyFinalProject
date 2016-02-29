angular.module('app').controller('enclosureCtrl', ['$scope', '$state','enclosureService',
                                              function( $scope, $state, enclosureService) {

	$scope.enclosure = {};
	$scope.animals = {};
	$scope.conditions = {};
	
	/**
	 * To retrieve all animal details  
	 */
	enclosureService.getAllAnimalDetails().then(function(response){		 
		  $scope.animals = response.data;
	  });

	/**
	 * To retrieve all category 
	 */
	enclosureService.getAllCondition().then(function(response){	
		  $scope.conditions = response.data;		
	  });
	
	/**
	 * To retrieve all enclosure details  
	 */
	enclosureService.getAllEnclosure().then(function(response){		 
		  $scope.enclosures = response.data;
	  });
	  /**
	   * Add enclosure details
	   */
	 $scope.addEnclosure = function(){	
		 
		 enclosureService.createEnclosure($scope.enclosure).then(function(){
			 console.log($scope.enclosure.time); 
				 $state.reload();
	        }, function(response){
	            console.log(response);
	        });	
		};
	 
}]);