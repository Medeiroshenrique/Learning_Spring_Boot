# Learning Java Spring Boot

In this repository I am going to share what I'm learning so that it can be useful for you and me, hope you like this content as much as I am enjoying this learning process :)

<img src="Screenshot from 2024-07-12 10-28-17.png" alt="banner that says Learning Java Spring Boot">

## Roadmap

- Download an Integrated Development Environment(In this case I'm going to use IntelliJ Idea)
- Install a Java Development Kit(version 17 or above)
- After create a project, create a new class called Main
- Configure your pom.xml file
- Include @SpringBootApplication above your Main class declaration
- Call the method SpringApplication.run(Main.class, args) in your Main class
-> We will make a Servlet here, wich is a process to handle HTTP requests, so Tomcat will run in the background and we'll have to configure the Port to 8080

Next Steps:
- In the folther src/main/resources of our project, create a new file called application.yml
- Define the Port to be used by our Servlet like:
    ```yaml
    server:
        port:8080

- Configure the spring servlet also in the application.yml this way:
    ```yaml
    spring:
        main:
            web-application-type: servlet

You can run it and you'll see that it is really running on Port 8080 :) 
