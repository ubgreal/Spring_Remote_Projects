# Spring-Data

If you want the database to be saved on disk, you must add the following properties to the application.properties file:

spring.jpa.show-sql=true

spring.datasource.url=jdbc:h2:file:C:/data/sample

spring.datasource.username=sa

spring.datasource.password=

spring.datasource.driverClassName=org.h2.Driver

#spring.jpa.hibernate.ddl-auto=creat

spring.jpa.hibernate.ddl-auto=update

spring.sql.init.mode=always

spring.jpa.defer-datasource-initialization=true