# Hoen Scanner :shell:
This project is a Java-based microservice that accepts JSON-encoded search queries for car rentals and hotels in specific cities, surfacing results from predefined JSON data files. The project is developed using IntelliJ, Java JDK, Dropwizard for microservice scaffolding, and the Jackson library for JSON processing. To test the application, refer to the testing section for instructions on using Postman for sending requests and validating responses.

# Testing on postman:
1. In the request method section, change GET to POST.
2. In the Enter Request URL input box, add localhost:8080/search.
3. Select the Body tab of the request.
4. Select the Raw radio button.
5. Select JSON from the formatting dropdown.
6. Enter the following request body to search for results in the city of Petalborough:
`{"city": "petalborough"}`
7. Click Send.
8. You should get back existing hotels and car rentals in the city you specified. You can also test out the dollowing cities `{"city": "rustburg"}` and `{"city": "shaleport"}`
9. Try out a random city which isn't predefined for example `{"city": "sao paulo"}` you should get back nothing :)
