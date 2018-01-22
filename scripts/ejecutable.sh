#!/bin/bash
export MAVEN_HOME=/opt/Maven/apache-maven-3.5.2

export M2_HOME=/opt/Maven/apache-maven-3.5.2
export PATH=$PATH:$M2_HOME/bin 

cd /home/ec2-user/ejemploMvnEC2CodeDeployCodePipelineGithub/ejemplo1
mvn compile
mvn package
cd /home/ec2-user/ejemploMvnEC2CodeDeployCodePipelineGithub/ejemplo1/target
java -jar ejemplo1-0.0.1-SNAPSHOT.jar
