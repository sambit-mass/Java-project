======================== DEPLOY JAVA-FULL-STACK-APP ==========================



==============USING TOOLS==================
1. GIT
2. MAVEN
3. JENKINS
4. DOCKER
5. UBUNTU VIRTUAL BUX (MASTER NODE)
6. AWS EC2 UBUNTU


==========STEP BY STEP===================

1. CREATE EC2 INSTANCE (AGENT NODE)------

   INSTALL DOCKER, OPENJDK-21-JDK, GIT, DOCKER-COMPOSE
   sudo gpasswd -a docker usergroup
   sudo gpasswd -a user docker
   THEN GIVE PERMISSION TO PRIVATE - 777 "UBUNTU.POM"

2. UBUNTU MACHINE INSTALL (MASTER NODE)------
   
  ----- OPENJDK-21-JDK, GIT, MAVEN, JENKINS, DOCKER, DOCKER-COMPOSE-----

   sudo gpasswd -a docker sambit/ubuntu
  sudo gpasswd -a sambit docker
  sudo gpasswd -a jenkins sambit/ubuntu
  sudo gpasswd -a sambit jenkins
  sudo gpasswd -a docker jenkins
  
  ---------WRITE DOCKER FILE FOR BACKEND & FORTEND ALSO COMPOSE-FILE PUSH YOUR GIT REPOSITORY----------
     
3. OPEN JENKINS THEN STEP=========
    -------INSTALL PLUGINS--
     1. DELIVERY VIEW
     2. DOCKER 3 PLUGINS
    ----CREATE NODE/AGENT -----
        1. CREATE PIPE LINE JOB AND WRITE SCRIPT
  
   
