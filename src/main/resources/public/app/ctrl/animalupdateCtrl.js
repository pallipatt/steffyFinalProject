angular.module('app').controller('animalUpdateCtrl', ['$scope', '$state','animalService','getAnimalDetailsID','getFavFood',
                                   function( $scope, $state, animalService, getAnimalDetailsID, getFavFood) {
console.log("inside update anialstate ");
	$scope.favfoods = getFavFood.data;
	$scope.updateAnimal = {};
	$scope.updateAnimal = getAnimalDetailsID.data;
	$scope.updateAnimal.cname =  getAnimalDetailsID.data.cname;
	$scope.updateAnimal.sname =  getAnimalDetailsID.data.sname;
	$scope.updateAnimal.link =  getAnimalDetailsID.data.link;
	$scope.updateAnimal.favfood =  getAnimalDetailsID.data.favfood.name;
	$scope.fave=$scope.updateAnimal.favfood;
	
	  /**
	   * updates food from the web site 
	   */

	 $scope.updateAnimalDetails = function(){		
			animalService.updateCurentAnimal($scope.updateAnimal).then(function(){
				$state.go('animal');
	        }, function(response){
	            console.log(response);
	            
	        });	
		};
	
}]);