angular.module('app').service('enclosureService',
		[ '$http', '$state', function($http, $state) {

			/**
			 * local var to hold end point name
			 */
			var enclosureEndPoint = "/enclosure";
			var animalEndPoint = "/animal";

			/**
			 * Call to web service to return all animal details
			 */
			function getAllAnimalDetails() {
				return $http.get(animalEndPoint + '/animals')
			}

			/**
			 * Call to web service to return all Condition
			 */
			function getAllCondition() {
				return $http.get(enclosureEndPoint + '/condition');
			}

			/**
			 * Call to web service to add new Enclosure details
			 */
			function createEnclosure(data) {
				return $http.post(enclosureEndPoint + '/addEnclosure', data);
			}

			/**
			 * Call to web service to retrieve all Enclosure details
			 */
			function getAllEnclosure(data) {
				return $http.get(enclosureEndPoint + "/enclosure", data);
			}
			/**
			 * Call to retrieve all information about Enclosure with
			 * corresponding ID
			 */
			function getEnclosureID(id) {
				return $http.get(enclosureEndPoint + '/id/' + id);
			}

			/**
			 * Call to web service to update Favorite food item
			 */
			function updateEnclosure(data) {
				return $http.put(enclosureEndPoint + "/updateEnclosure", data);
			}

			function deleteEnclosure(data) {
				return $http.put(enclosureEndPoint + '/deleteEnclosure/' + data);
			}
			return {
				
				getAllAnimalDetails : getAllAnimalDetails,
				getAllCondition : getAllCondition,
				createEnclosure : createEnclosure,
				getAllEnclosure : getAllEnclosure,
				getEnclosureID : getEnclosureID,
				updateEnclosure : updateEnclosure,
				deleteEnclosure : deleteEnclosure
			};

		} ]);