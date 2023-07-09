# microservices-using-spring-boot3
Microservices using Spring Boot 3

=========================

1) Adding the zipkin server

Step-1: https://hub.docker.com/r/openzipkin/zipkin


Step-2: Run as a docker:
$ docker run -d -p 9411:9411 openzipkin/zipkin


Or,

Run the jar server
$ curl -sSL https://zipkin.io/quickstart.sh | bash -s
$ java -jar zipkin.jar


Step-3: Open the zipkin

open this link
http://localhost:9411/zipkin/


