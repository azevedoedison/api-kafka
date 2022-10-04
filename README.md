# API-KAFKA Communication Example.
This is a simple project to test the communication between two microservices in java through Kafka messaging.

The first microservice is the Payment Service, which is responsible to create a new payment. 
You can access the API by Swagger through the link http://localhost:8000/swagger-ui/index.html#/payment-resource-impl/payment. 
This API sends a new payment event for the topic "payment-topic".

The second microservice is the Json Consumer, responsible for hearing the "payment topic" consuming the JSON Objet received and printing some information on the console.
For you to mount this project, it is necessary to install Docker, and run the file docker-compose.yml (with the command 'docker-compose up -d') to run Kafka (you can access 'kafdrop - web version  '  through the URL http://localhost:19000/
