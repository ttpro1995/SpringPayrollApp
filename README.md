# Step by step 

1. Init project on https://start.spring.io/ with dependencies
   - Web
   - JPA
   - H2
    
2. Create github repo

3. Create me.thaithien.turorial.rest.payroll.PayrollApp.model.Employee class

4. Create me.thaithien.turorial.rest.payroll.PayrollApp.model.EmployeeRepository

5. Create LoadDatabase

6. Run `./gradlew bootrun`. Here is the commandline output 

```
(base) tt@tt:~/project/playground/spring-stuff/PayrollApp$ ./gradlew bootrun
Starting a Gradle Daemon, 1 incompatible and 2 stopped Daemons could not be reused, use --status for details

> Task :bootRun

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v2.5.2)

2021-07-03 16:01:19.897  INFO 15024 --- [           main] m.t.t.r.p.P.PayrollAppApplication        : Starting PayrollAppApplication using Java 11.0.11 on tt with PID 15024 (/home/tt/project/playground/spring-stuff/PayrollApp/build/classes/java/main started by tt in /home/tt/project/playground/spring-stuff/PayrollApp)
2021-07-03 16:01:19.898  INFO 15024 --- [           main] m.t.t.r.p.P.PayrollAppApplication        : No active profile set, falling back to default profiles: default
2021-07-03 16:01:20.218  INFO 15024 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2021-07-03 16:01:20.243  INFO 15024 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 20 ms. Found 1 JPA repository interfaces.
2021-07-03 16:01:20.488  INFO 15024 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2021-07-03 16:01:20.494  INFO 15024 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-07-03 16:01:20.494  INFO 15024 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.48]
2021-07-03 16:01:20.533  INFO 15024 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-07-03 16:01:20.534  INFO 15024 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 613 ms
2021-07-03 16:01:20.611  INFO 15024 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2021-07-03 16:01:20.662  INFO 15024 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2021-07-03 16:01:20.685  INFO 15024 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2021-07-03 16:01:20.720  INFO 15024 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.32.Final
2021-07-03 16:01:20.776  INFO 15024 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2021-07-03 16:01:20.825  INFO 15024 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2021-07-03 16:01:21.069  INFO 15024 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-07-03 16:01:21.074  INFO 15024 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2021-07-03 16:01:21.222  WARN 15024 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2021-07-03 16:01:21.384  INFO 15024 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-07-03 16:01:21.391  INFO 15024 --- [           main] m.t.t.r.p.P.PayrollAppApplication        : Started PayrollAppApplication in 1.73 seconds (JVM running for 1.942)
2021-07-03 16:01:21.422  INFO 15024 --- [           main] m.t.t.r.payroll.PayrollApp.LoadDatabase  : Preloading Employee{id=1, name='Bilbo Baggins', role='burglar'}
2021-07-03 16:01:21.423  INFO 15024 --- [           main] m.t.t.r.payroll.PayrollApp.LoadDatabase  : Preloading Employee{id=2, name='Frodo Baggins', role='thief'}
<==========---> 80% EXECUTING [1m 14s]
> :bootRun
```