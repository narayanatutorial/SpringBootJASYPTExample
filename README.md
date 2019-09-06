# SpringBootJASYPTExample
Spring Boot Jasypt Example for encrypt sensitive data and decrypt before use it

jasypt decrypt the encrypted value before use it in the program like database passwords.

# Generate Encrypt value
First up all download **Jasypt** jar and then encrypt the plain test by using security key and algorithm as follows.

## Step 1 :
Download jasypt jar from maven https://mvnrepository.com/artifact/org.jasypt/jasypt/1.9.3

## Step 2:
Go to jar location in command prompt and then Execute the following command
~~~
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="Admin1234" password=supersecretKey
~~~
**Output**

~~~
----ENVIRONMENT-----------------

Runtime: Oracle Corporation Java HotSpot(TM) Client VM 25.221-b11



----ARGUMENTS-------------------

input: Admin1234
password: supersecretKey



----OUTPUT----------------------

HJQnd0Ybtt8jnRmWzbAy7maX6hx/qmzQ
~~~

## Step 3:
_HJQnd0Ybtt8jnRmWzbAy7maX6hx/qmzQ_    this is the encrypted text and put into application.properties like as follows.

**application.properties**
~~~
jasypt.encryptor.algorithm=PBEWithMD5AndDES
jasypt.encryptor.password=secretkey
variable.secret-var=ENC(aMuWxS4Wdvhfj9vmfrHKoPyEncdujU+xx7DO87xR90E=)
~~~
in the property file, we need to put **algorithm** and **secretkey** used for encryption.

## Step 4:

add the following maven dependency in pom.xml

~~~
    <dependency>
			<groupId>org.jasypt</groupId>
			<artifactId>jasypt</artifactId>
			<version>1.9.3</version>
		</dependency>
		<dependency>
			<groupId>com.github.ulisesbocchio</groupId>
			<artifactId>jasypt-spring-boot-starter</artifactId>
			<version>2.0.0</version>
		</dependency>
~~~

# References

* https://github.com/ulisesbocchio/jasypt-spring-boot
* https://www.ricston.com/blog/encrypting-properties-in-spring-boot-with-jasypt-spring-boot/
* https://www.ru-rocker.com/2017/01/13/spring-boot-encrypting-sensitive-variable-properties-file/
* https://avaldes.com/jasypt-password-encryption-with-spring-mvc-rest-api-and-mongodb-example/
