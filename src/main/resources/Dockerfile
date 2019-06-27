#设置基础镜像
FROM java
#设置维护者信息
MAINTAINER "MF"<mf@xx.com>
#设置需要添加到容器中的文件 @project.build.finalName@.jar
COPY ${JAR_FILE} /app.jar
ADD msa-api-hello-1.0.0.jar /a.jar
#暴露端口
EXPOSE 58080
#设置镜像制作过程中需要执行的命令
#RUN bash -c "touch /app.jar"
#设置环境变量
#ENV JAVA_HOME /opt/jdk
#ENV PATH $JAVA_HOME/bin:$PATH
#设置容器启动时需要执行的命令
CMD java -jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
