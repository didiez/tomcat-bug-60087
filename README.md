# tomcat-bug-60087

Project to test the problem resolving resources inside a dependency in a spring boot executable artifact. (jar inside BOOT-INF/lib/, see http://docs.spring.io/spring-boot/docs/current/reference/html/executable-jar.html )

Issue that introduced the problem:
https://bz.apache.org/bugzilla/show_bug.cgi?id=60087#c3

Resource url returned by JarWarResource.getURL() (notice the double `"!/!/"`) :
```
"jar:war:file:{project-path}/target/main-app-0.0.1-SNAPSHOT.jar*/BOOT-INF/lib/template-dep-0.0.1-SNAPSHOT.jar!/!/META-INF/resources/template.xhtml"
```
