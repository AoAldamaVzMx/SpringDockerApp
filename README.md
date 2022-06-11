# SpringDockerApp
Simple Interest microservice:

Steps to use this code

Clone or download the zip file

 ##build the jar

 ##To create the container
 
 docker build -t springio/gs-spring-boot-docker .
 
 ##To run the container
 Docker run -p 8080:8080 springio/gs-spring-boot-docker

## Remarks

 This example use H2 database but only in memory, to view the data in the table check running on the IDE or using the jar no the container 
 http://localhost:8080/h2-console
 
 use http://localhost:8080/ to check if is running
 
 use http://localhost:8080/actuator/health to check the health
 
 use postman or similar tool to do the request (Calculate ) use POST 
 ##  url
localhost:8080/calculate

put in the body the below json 
{
  "terms": 13,
  "amount": 32000,
  "rate": 50 
}

send the request...

the response must be similar to below

[
    {
        "creditApplication": 1.0,
        "paymentNumber": 1,
        "paymentAmount": 7221.756024169324,
        "paymentDate": "2022-06-11T17:21:55.2921404"
    },
    {
        "creditApplication": 1.0,
        "paymentNumber": 2,
        "paymentAmount": 7221.756024169324,
        "paymentDate": "2022-06-18T17:21:55.2921404"
    },
    {
        "creditApplication": 1.0,
        "paymentNumber": 3,
        "paymentAmount": 7221.756024169324,
        "paymentDate": "2022-06-25T17:21:55.2921404"
    },
    {
        "creditApplication": 1.0,
        "paymentNumber": 4,
        "paymentAmount": 7221.756024169324,
        "paymentDate": "2022-07-02T17:21:55.2921404"
    },
    {
        "creditApplication": 1.0,
        "paymentNumber": 5,
        "paymentAmount": 7221.756024169324,
        "paymentDate": "2022-07-09T17:21:55.2921404"
    }
]
 

 The code was made using Sprint tools suite 4, java 1.8 y openjdk version "17.0.2" para el container docker 
 
 
 


