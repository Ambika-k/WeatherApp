# Spring Boot Weather API and MongoDB

### Prerequisites
  * JDK 1.8.X
  * Maven 3.3.X
  * MongoDB
  * Open weather map API keys
### Generating keys
  * Visit https://openweathermap.org/appid
  * SignUp, Select the package and generate API keys
### MongoDB
  * Run MongoDB Instance
  * Create a database (refer to application.properties for name)
  * Create a collection (refer to products.java for the model)
 
### Run 
  * Download/Clone the project on to your local machine
  * Run the project on your machine
  * Create records using Postman 
      ```POST /api/product```
  * Send a request to http://localhost:8081/
  
# WEATHER API APPLICATION
This is a Springboot application and is used to provide product and weather services to user. Product and weather services were independent of each other.
This application consists of Weather app

### WEATHER MODULE
This module is making use of Thymeleaf template.
It consists of two methods.
*	CityForm : 
GET request => http://localhost:8081/weather
When we make this request , an template will be displayed to enter a city name and when the user clicks on submit then getWeather method will be executed.
*	getWeather:
This method retrieves the city from FormCityAttribute, url and apikey from application.properties.
Based on url and apikey , it gets access to OpenWeatherAPI and retrieves the weather details from it based on city.
Following details will be displayed:
City, Latitude, Longitude, Weather description.

	formData.html is used to make thymeleaf template for CityForm method.

	weatherDetails.html is used to make thymeleaf template for getWeathermethod.


PREREQUISITES:
JDK 1.8.X 
Maven 3.3.X 
MongoDB 
Open weather map API keys ### Generating keys 
Visit https://openweathermap.org/appid 
SignUp, Select the package and generate API keys ### MongoDB 
Run MongoDB Instance 
Create a database (refer to application.properties for name) 
Create a collection (refer to products.java for the model)


