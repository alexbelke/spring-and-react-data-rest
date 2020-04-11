# spring-and-react-data-rest
Spring data rest and react ui project

Based on [React.js and Spring Data REST tutorial](https://spring.io/guides/tutorials/react-and-spring-data-rest/)

To run the application use command

``./mvnw spring-boot:run``

Go to http://localhost:8080 and you should see this:

![Image](https://user-images.githubusercontent.com/31535617/79051041-35badd00-7c2e-11ea-83a4-555c233c0859.png)

To add a new employee via curl use this command:

 <pre><code>curl -X POST localhost:8080/api/employees -d "{\"firstName\": \"Bilbo\", \"lastName\": \"Baggins\", \"description\": \"burglar\"}" -H "Content-Type:application/json"</code></pre>

Then there should exist two employees:

![Image2](https://user-images.githubusercontent.com/31535617/79051102-90543900-7c2e-11ea-95f0-73f8d6bcd10a.png)
