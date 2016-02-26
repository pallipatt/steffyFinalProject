angular.module('app').service('animalService', ['$http' ,'$state',
  function($http, $state){

	 // local var to hold end point name
    var animalEndPoint = "/animal";
    var foodEndPoint = "/food";
    
    /**
	 * Call to retrieve all Favorite food item 
	 */
    function getAllFavFood() {
    	return $http.get(foodEndPoint + '/favfood' )
    }
    
    /**
	 * Call to web service to create animal details 
	 */
    function createAnimalDetails(animaldata) {
    	 return $http.post(animalEndPoint + "/createanimal", animaldata);
    }
    /**
	 * Call to web service to return all animal details  
	 */
    function getAllAnimalDetails() {
    	return $http.get(animalEndPoint + '/animals' )
    }
    /**
     * Call to retrieve all information about animal Details with corresponding ID
     */
    function getAnimalDetailsID(animalid) {
    	return $http.get(animalEndPoint + '/id/' + animalid);
    }
   //updateCurentAnimal
    /**
	 * Call to web service to update Animal Details  
	 */
    function updateCurentAnimal(animaldata) {
    	 return $http.put(animalEndPoint + "/updateanimal", animaldata);
    }
    return {
    	
    	getAllFavFood : getAllFavFood,
    	createAnimalDetails : createAnimalDetails,
    	getAllAnimalDetails : getAllAnimalDetails,
    	getAnimalDetailsID : getAnimalDetailsID,
    	updateCurentAnimal : updateCurentAnimal
    	
    };
}]);