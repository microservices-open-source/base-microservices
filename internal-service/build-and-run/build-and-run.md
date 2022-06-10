# Internal Service

## Maven
### Build
mvn clean install
### Run
cd target
java -jar internal-service-1.0.0.jar
java -jar internal-service-1.0.0.jar --spring.profiles.active=localhost
java -jar internal-service-1.0.0.jar --spring.profiles.active=development
java -jar internal-service-1.0.0.jar --spring.profiles.active=production

## Docker
### Build
docker build -t internal-service:1.0.0 -f Dockerfile .

### Run
docker run -it --name internal-service -p 1003:1003 -e SPRING_PROFILES_ACTIVE=localhost internal-service:1.0.0

#### SPRING_PROFILES_ACTIVE (env)
localhost, development, production