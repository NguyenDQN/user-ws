To build a new jar: ./gradlew build

TO build docker image:
    cd to the folder contains DockerFiles
    docker build -t user-ws .
    
To run container on docker:
    docker run -p 8081:8080 user-ws
    8081: port on local machine
    8080: exposed port on docker(in docker, spring boot run on this port)

- Start minikubec: `minikube start` (incase it does not work start with--insecure-registry)
- In the new terminal, run `eval $(minikube docker-env)`
- Build image `docker build . -t user-ws`
- Run `kubectl apply -f k8s_deployment.yaml` to create a deployment
- Expose deployment as service, port of service must be the same as port exposed port of the image
- We can use `minikube image load my_image` to load image from our docker to minikube
- After apply deployment for user-ws, run `kubectl apply -f bike-rental-ingress.yaml` to deploy ingress for bike-rental-app
  (We may need to run deployment on bike-rental-back project(https://github.com/NguyenDQN/bike-rental-back) if needed)
  
Note: build a new jar -> build docker image -> update image in yaml file -> apply to kubectrl

To get url of service:
- kubectl get svc
- minikube service service-name --url

Test commit
