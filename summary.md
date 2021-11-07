##Summaries from "Spring in Action" book.

### Chapter 1. Getting started with Spring.
- Spring aims to make developer challenges easy, like creating web applications, working with databases, securing applications, and microservices.
- Spring Boot builds on top of Spring to make Spring even easier with simplified dependency management, automatic configuration, and runtime insights.
- Spring applications can be initialized using the Spring Initializr, which is web- based and supported natively in most Java development environments.
- The components, commonly referred to as beans, in a Spring application con- text can be declared explicitly with Java or XML, discovered by component scanning, or automatically configured with Spring Boot autoconfiguration.

### Chapter 2. Developing web applications.
- Spring offers a powerful web framework called Spring MVC that can be used to develop the web frontend for a Spring application.
- Spring MVC is annotation-based, enabling the declaration of request-handling methods with annotations such as @RequestMapping, @GetMapping, and @Post- Mapping.
- Most request-handling methods conclude by returning the logical name of a view, such as a Thymeleaf template, to which the request (along with any model data) is forwarded.
- Spring MVC supports validation through the Java Bean Validation API and implementations of the Validation API such as Hibernate Validator.
- View controllers can be used to handle HTTP GET requests for which no model data or processing is required.
- In addition to Thymeleaf, Spring supports a variety of view options, including FreeMarker, Groovy Templates, and Mustache.

### Chapter 3. Working with data.
- Spring’s JdbcTemplate greatly simplifies working with JDBC.
- PreparedStatementCreator and KeyHolder can be used together when you
need to know the value of a database-generated ID.
- For easy execution of data inserts, use SimpleJdbcInsert.
- Spring Data JPA makes JPA persistence as easy as writing a repository interface.

### Chapter 4. Securing Spring.
- Spring Security autoconfiguration is a great way to get started with security, but most applications will need to explicitly configure security to meet their unique security requirements.
- User details can be managed in user stores backed by relational databases, LDAP, or completely custom implementations.
- Spring Security automatically protects against CSRF attacks.
- Information about the authenticated user can be obtained via the Security- Context object (returned from SecurityContextHolder.getContext()) or
injected into controllers using @AuthenticationPrincipal.

### Chapter 5. Working with configuration properties.
- Spring beans can be annotated with @ConfigurationProperties to enable injection of values from one of several property sources.
- Configuration properties can be set in command-line arguments, environment variables, JVM system properties, properties files, or YAML files, among other options.
- Configuration properties can be used to override autoconfiguration settings, including the ability to specify a data-source URL and logging levels.
- Spring profiles can be used with property sources to conditionally set configura- tion properties based on the active profile(s).