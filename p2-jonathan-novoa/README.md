# code-samples-for-Jonathan-Novoa
Code sample of various projects I have worked on. 

Complete repository for Project 2:https://github.com/novoa-j/Project2Repo/tree/master

p2-jonathan-novoa
Project 2 was the first team project. It was required to consume an external REST API and incorporate all major aspects of a full stack application. While my primary role was team lead as well as the lead on the DevOps side of the project I contributed to the files present here. 

 Project 2, named Salutem, was designed to help users become better informed about any health-related issues they might have. Users can create an account, select the appropriate symptoms and receive a diagnosis based on the possible diseases or issues they might have. Additionally, it provides the user with the most applicable medical professional specialization, saving them time and money. It is not intended to replace a visit to a doctor but to help them learn more about their personal health.


The application user an API called MedicAPI which returned diagnosis of possible issues based off of a collection of symptoms and personal data.

Technologies:
Java , AWS RDS, CI/CD pipeline (EC2, Maven, Jenkins, GitHub, Slack), Hibernate, Spring MVC, Angular, Bootstrap.
Logging with Log4J, Sonarlint/Sonarcloud for code quality, and unit testing with JUnit 


Project Folders: 
Front-End (Angular)
	Classes: account, pastsymptom, submission
		Each of theses classes were used to model the objects received as JSON from both the back-end and the external API. 
	Components:body-location, diagnosis, nav
		Each of the components correspond to the view returned to the user after requesting a diagnosis or a list of body-locations. 

	Services: health-result
		The main service class of the front end. Holds all of the methods used to send and retrieve data via httpClient to and from the database and the external API
Back-End:
	Controllers: AccountController
		HttpRequest for account related commands were mapped to this controller including logging in and out, account creation and deletion.
	Exceptions: AccountIdNotFoundException
		A custom exception used to inform the user that there is no account with that information in the database. 
	Models: Account, BodyLocations, Diagnosis, Issue, IssueInfo, Specialization, Submission, Symptom 
		Spring beans used to model the data from the API for manipulation and persistance to the database. Repositories: AccountRepository,

 	Repository: SubmissionRepository, AccountRepsitory
 		Repositories that handle the service layer implementation by extending the JPA repository. 
	Services: AccountDaoImpl
		The implementation of the service layer for the accounts service. Enumerated all of the methods used by the controller.

