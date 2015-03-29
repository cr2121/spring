spring
======

spring3 + hibernate4 + struts2
spring3 + mybatis + struts2

when first run this,
should change the database setting in applicationContext-database.xml

    <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/world" />
    <property name="user" value="root" />
    <property name="password" value="123456" />
as your database setting

and run the following command in your mysql

    create table student(
    id bigint NOT NULL auto_increment,
    name VARCHAR(30),
    age INT,
    primary key (id));

