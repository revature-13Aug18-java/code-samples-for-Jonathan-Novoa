# code-samples-for-Jonathan-Novoa
Code sample of various projects I have worked on. 

p3-jonathan-novoa
The final batch-wide project. I worked on the Maps Microservice team where I created test for the services, reduced vulnerabilities and contributed to the creation of the saved feature location. 

Our microservice utilized the Google Maps API to retrieve the unique location with their global latitude and longitude. It also was used to determine the distance and duration of a trip that was later used by another microservice. 

Technologies: Spring Boot, Junit, Google Maps API, Spring MVC, ECL Emma, SonarLint, Spring Data

Project folders: 

Controllers: FavoriteLocation Controller
	Handled the http requests passed on from the dispatcher servlet for the GET, POST, and DELETE methods. 
Services: FavoriteLocationService
	Called the repository methods and all of the verification and implementation logic for the controller
Repositories: FavoriteLocation Repository
	Used JPA repository to implement database retrieval

Test: Route Service test
	tested the RouteServiceFile using JUnit
