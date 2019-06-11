#设置基础镜像
FROM java
#设置维护者信息
MAINTAINER "MF"<mf@xx.com>
#设置需要添加到容器中的文件 @project.build.finalName@.jar
ADD ${JAR_FILE} app.jar
#暴露端口
EXPOSE 8080
#设置镜像制作过程中需要执行的命令
#RUN ln -s /opt/jdk1.8.0_144 /opt/jdk
RUN sh -c "touch /app.jar"
#设置环境变量
#ENV JAVA_HOME /opt/jdk
#ENV PATH $JAVA_HOME/bin:$PATH
#设置容器启动时需要执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]
#ENTRYPOINT ["java","-jar","/app.jar"]
