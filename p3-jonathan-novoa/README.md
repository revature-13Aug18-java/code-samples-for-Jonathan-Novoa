# code-samples-for-Jonathan-Novoa
Code sample of various projects I have worked on. 

p3-jonathan-novoa
The final batch-wide project. I worked on the Maps Microservice team where I created test for the services, reduced vulnerabilites and contributed to the creation of the saved feature location. 

Our microservice utilized the google maps api to retrieve the unique location with thier global latittue and longitude. It also was used to determine the distance and duration of a trip that was later used by another microservice. 

Project folders: 

Controllers: FavoriteLocation Controller
	Handled the http requests passed on from the dispacher servlet for the GET, POST, and DELETE methods. 
Services: FavoriteLocationService
	Called the repository methods and all of the verification and implementation logic for the controller
Repositories: FavoriteLocation Repository
	Used JPA repository to implement database retieval

Test: Route Service test
	tested the RouteServiceFile using JUnit