angular.module('app').service('scheduleService',
		[ '$http', '$state', function($http, $state) {

			/**
			 * local var to hold end point name
			 */ 
			var schedule = "/schedule";

			/**
			 * Call to web service to return all Vendors
			 */
			function getAllschedule() {
				return $http.get(schedule + '/timings');
			}
		
			return {
				getAllschedule : getAllschedule	
			};

		} ]);