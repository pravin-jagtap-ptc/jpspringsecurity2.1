# springSecurity3.3

• https://github.com/koushikkothagal/spring-boot-security  :  All code from this tutorial
* Spring security project using spring 2.1.7.RELEASE version. Java 11 is used.

• AuthenticationManager   -> AuthenticationManagerBuilder

• I faced compatibility issue, I solved this problem by below steps:
		a. Spring 2.1.3 version is supported till java 12, so installed java 11 and set Installed Jre path to it.
		b. Then copy pasted all Pom.xml file from repo.
		c. Run as -> Maven Clean
		d. Run as -> Maven Install
		e. Clean project

	Above steps solved my problem.
	
    After doing any change, I have to do step C and D.
    
* If you are doing roles entry manualy, use 'ROLE_' prefix for role.
* JPA failed to create tables manually, I had to create it by myself. Problem is, engine is used 'ISMYAM' which is not supported for latest mySql, so better to create it manually.
