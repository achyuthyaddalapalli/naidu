def call(creds,tomcatIp,username,warName){
   sshagent([creds]){
      //copy war file to tomcat webapss floder
      sh "scp -o stictHostkeychecking=no target/${warName}.war ${userName}@${tomcatIp}:/opt/tomcat9/webapps/"
      sh "ssh ${userName}@${tomcatIp} /opt/tomcat9/bin/shutdown.sh"
      sh "ssh ${userName}@${tomcatIp} /opt/tomcat9/bin/startup.sh"
}
