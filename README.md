# spring-hsf-demo

Contains 3 modules: 

- api: contains interfaces & dtos
- consumer: consumer application
- provider: provider application

## How it works

Step 1:

```
git clone https://github.com/projecthsf/spring-hsf-demo.git
cd spring-hsf-demo
-- start consumer app
cd consumer
mvn spring-boot:run

-- start consumer app
cd ../provider
mvn spring-boot:run
```
Or just simply open the project in Intellij and Run app at file:
```
consumer/src/main/java/com/spring/consumer/config/HsfConsumerConfig.java -> will run on port 8081
```
And 
```
provider/src/main/java/com/spring/provider/ProviderApplication.java -> will run on port 8080
```

![Alt text](https://github.com/projecthsf/spring-hsf-demo/blob/main/docs/intellij-run-java-app.png "How to run java app")

After start 2 app successful, you can access 
```
http://localhost:8081/customer -> get list of customers (customerApi.getList) 
http://localhost:8081/customer/detail -> get customer dto (customerApi.getCustomer)
http://localhost:8081/customer/map -> get map<string, CustomerDTO> (customerApi.getMap)
http://localhost:8081/customer/count -> get count (customerApi.getCount)
```

You also can check all the api have been added to providers
```
http://localhost:8080/hsf/list
```


More documents:

[HSF Overview](https://github.com/projecthsf/spring-hsf/blob/main/docs/overview.md)

[HSF Application Properties](https://github.com/projecthsf/spring-hsf/blob/main/docs/properties.md)

[HSF Consumer](https://github.com/projecthsf/spring-hsf/blob/main/docs/consumer.md)

[HSF Provider](https://github.com/projecthsf/spring-hsf/blob/main/docs/provider.md)


