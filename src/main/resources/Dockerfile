FROM java:8

VOLUME /home

WORKDIR /home/model

# Prepare by downloading dependencies
ADD pom.xml /home/model/pom.xml
#RUN ["mvn", "dependency:resolve"]
#RUN ["mvn", "verify"]

# Adding source, compile and package into a fat jar
ADD src /home/model/src
RUN ["mvn", "clean", "install"]

RUN ["ls", "/home/model/target"]
RUN ["pwd"]
RUN ["ls", "-ltrh", "/home/model/target/${JAR_FILE}.jar"]

EXPOSE 58080

ENTRYPOINT [ "java", "-jar", "/home/model/target/${JAR_FILE}.jar" ]
