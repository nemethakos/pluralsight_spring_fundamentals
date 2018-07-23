<!doctype HTML>
<html ng-app>
<head>
<title>Hello Events Angular</title>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.0.8/angular.js"></script>
<script src="events.js"></script>

</head>
<body>
	<div ng-controller="Events">
		I have {{Events.length}} events!
		<ul class="events-container">
			<li ng-repeat="event in events">{{event.name}}</li>
		</ul>
	</div>
</body>
</html>