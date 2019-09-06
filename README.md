# SpringBootJASYPTExample
Spring Boot Jasypt Example for encrypt sensitive data and decrypt before use it by using Jasypt spring boot intergration

# Generate Encrypt value
First up  download Jasypt jar and then encrypt the plain test by using security key and algorithm as follows.

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


# Reference
https://github.com/ulisesbocchio/jasypt-spring-boot
