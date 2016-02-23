angular.module('app').service('foodService', ['$http' ,
  function($http){
	
	 // local var to hold end point name
    var reportEndPoint = "/food";

    /**
	 * Returns All vendors from DB
	 * 
	 * @returns
	 */
    function getAllVendors() {
        return $http.get(reportEndPoint + '/vendors' );
      }
    
    function createFood() {
    	return null;
    }
    return {
    	getAllVendors : getAllVendors
    };
    
    
    
}]);