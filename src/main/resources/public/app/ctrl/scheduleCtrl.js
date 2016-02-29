angular.module('app').controller('scheduleCtrl', ['$scope', '$state','getschedules','scheduleService',
                                              function( $scope, $state, getschedules, scheduleService) {

	 $scope.schedules = getschedules.data; 
}]);