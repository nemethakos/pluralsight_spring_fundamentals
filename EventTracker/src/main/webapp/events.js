function Events($scope, $http) {
	// no need for absolute URL
	$http.get('http://localhost:8080/EventTracker/events.json').success(
			function(data) {
				$scope.events = data;
			});
}