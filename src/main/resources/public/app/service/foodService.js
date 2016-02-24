angular.module('app').service('foodService', ['$http' ,'$state',
  function($http, $state){
	
	 // local var to hold end point name
    var reportEndPoint = "/food";

    /**
	 * Call to web service to return all Vendors 
	 */
    function getAllVendors() {
        return $http.get(reportEndPoint + '/vendors' );
      }
    /**
	 * Call to web service to return all Categories 
	 */
    function getAllCategory() {
    	return $http.get(reportEndPoint + '/catagory' );
    }
    /**
	 * Call to web service to create Favorite food item 
	 */
    function createFood(fooddata) {
    	 return $http.post(reportEndPoint + "/createfood", fooddata);
    }
    /**
	 * Call to web service to return all favfood details  
	 */
    function getAllFavFood() {
    	console.log("createFood foodservices.js" );
    	return $http.get(reportEndPoint + '/favfood' )
    }
    /**
     * Call to retrieve all information about fav Food with corresponding ID
     */
    function getFavFoodDetailsID(foodid) {
    	return $http.get(reportEndPoint + '/id' + foodid);
    }
    return {
    	getAllVendors : getAllVendors,
    	getAllCategory : getAllCategory,
    	createFood : createFood,
    	getAllFavFood : getAllFavFood,
    	getFavFoodDetailsID : getFavFoodDetailsID
    };
    
    
    
}]);