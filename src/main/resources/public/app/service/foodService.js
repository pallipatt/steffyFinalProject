angular.module('app').service('foodService', ['$http' ,'$state',
  function($http, $state){
	
	 // local var to hold end point name
    var foodEndPoint = "/food";

    /**
	 * Call to web service to return all Vendors 
	 */
    function getAllVendors() {
        return $http.get(foodEndPoint + '/vendors' );
      }
    /**
	 * Call to web service to return all Categories 
	 */
    function getAllCategory() {
    	return $http.get(foodEndPoint + '/catagory' );
    }
    /**
	 * Call to web service to create Favorite food item 
	 */
    function createFood(fooddata) {
    	 return $http.post(foodEndPoint + "/createfood", fooddata);
    }
    /**
	 * Call to web service to return all fav food details  
	 */
    function getAllFavFood() {
    	console.log("createFood foodservices.js" );
    	return $http.get(foodEndPoint + '/favfood' )
    }
    /**
     * Call to retrieve all information about fav Food with corresponding ID
     */
    function getFavFoodDetailsID(foodid) {
    	return $http.get(foodEndPoint + '/id/' + foodid);
    }
    /**
	 * Call to web service to update Favorite food item 
	 */
    function updateCurentFood(fooddata) {
    	 return $http.put(foodEndPoint + "/updatefood", fooddata);
    }
    return {
    	getAllVendors : getAllVendors,
    	getAllCategory : getAllCategory,
    	createFood : createFood,
    	getAllFavFood : getAllFavFood,
    	getFavFoodDetailsID : getFavFoodDetailsID,
    	updateCurentFood : updateCurentFood
    };
    
    
    
}]);