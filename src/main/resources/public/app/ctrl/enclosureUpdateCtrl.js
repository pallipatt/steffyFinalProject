angular
		.module('app')
		.controller(
				'enclosureUpdateCtrl',
				['$scope','$state','enclosureService','getEnclosureDetailsID','getCondiiton','getAnimal',
						function($scope, $state, enclosureService,getEnclosureDetailsID, getCondiiton, getAnimal) {
							
							$scope.animals = getAnimal.data;
							$scope.conditions = getCondiiton.data;
							$scope.updateEnclosure = {};
							$scope.updateEnclosure = getEnclosureDetailsID.data;
							$scope.updateEnclosure.name = getEnclosureDetailsID.data.name;
							$scope.updateEnclosure.animal = getEnclosureDetailsID.data.animal.cname;
							$scope.updateEnclosure.count = getEnclosureDetailsID.data.count;
							$scope.updateEnclosure.time = getEnclosureDetailsID.data.time;
							$scope.updateEnclosure.condition = getEnclosureDetailsID.data.condition.name;
							$scope.animal = $scope.updateEnclosure.animal;
							$scope.condition = $scope.updateEnclosure.condition;
							$scope.id= getEnclosureDetailsID.data.enclosureid;
							/**
							 * updates food from the web site
							 */
							$scope.updateEnclosureDetails = function() {
								console.log("$scope.updateEnclosure update " + $scope.updateEnclosure);
								enclosureService.updateEnclosure($scope.updateEnclosure).then(
										
										function() {
											$state.go('enclosure');
										}, function(response) {
											console.log(response);
										});
							}
							/**
							 * Delete a record
							 */
							$scope.deleteEnclosureDetails =  function() {
								enclosureService.deleteEnclosure($scope.id).then(
										function() {
											$state.go('enclosure');
										},function(response) {
											console.log(response);
										});
							};
						} ]);