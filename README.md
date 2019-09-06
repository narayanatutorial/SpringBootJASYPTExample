# SpringBootJASYPTExample
Spring Boot Jasypt Example for encrypt sensitive data and decrypt before use it

jasypt decrypt the encrypted value before use it in the program like database passwords.

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

## Step 3:
_HJQnd0Ybtt8jnRmWzbAy7maX6hx/qmzQ_    this is the encrypted text and put into application.properties like as follows.

**application.properties**
~~~
jasypt.encryptor.algorithm=PBEWithMD5AndDES
jasypt.encryptor.password=secretkey
variable.secret-var=ENC(aMuWxS4Wdvhfj9vmfrHKoPyEncdujU+xx7DO87xR90E=)
~~~
in the property file, we need to put **algorithm** and **secretkey** used for encryption.



# Reference
https://github.com/ulisesbocchio/jasypt-spring-boot
