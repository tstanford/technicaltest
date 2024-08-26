## SimpleController.java

Q: Is the class level annotation correct?
A: Use @RestController,this is designed to return Json by default and not MVC views.

Q: Can you think of a better way to create an instance of SimpleService?
A: Use dependency injection, Beans needs to be annotation with @Component, @Service or @Repository

Q: Why not use @Autowired on fields or setters?
A: 1. It preferrable to use contructor injection because you can guarantee that the dependencies are being passed to the contructor as it is being instantiated. 2. There is no need to use @Autowired on constructors anymore.3. Field injection is useful in integration test classes when using spring boot test runner as you can inject dependencies into the test class which won't usually have a constructor. 4. Constructor injection improve unit tests as you can inject mock objects directly into the constuctor when instantiating. It is a two step process if using field injection.

Q: How do you handle exceptions and what will spring return to the client default? How can you custom this?
A: Default Exception handler will return a 500. This can be customised at a project level using a class decorated with @ControllerAdvice and exception handlers created for different exceptions and return status codes.

## SimpleService.java

Use interface.

Class should use `@Service` rather than `@Component`. Not essential but good practice, just syntactical sugar. 

Use dependency inject for SimpleRepository rather than concrete instantiation.

task: 

```
getAllDocIds() {

	return repository.getAll().stream().map(d -> d.getId()).toList().sorted();

}
```

Q: How do we handle returning a large data set? is it ok to return 100000 array items? If not what can we do to improve?
A: Use pagination. New two extra parameters on method signatures, page and page size. The return object should be a page class which return some meta data to show the number of pages and the current page.


## SimpleRepository.java

Use interface.

should use `@Repository` annotation
