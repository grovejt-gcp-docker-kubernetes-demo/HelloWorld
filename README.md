GCP Hello World Tutorial for Docker and Kubernetes:
https://cloud.google.com/run/docs/quickstarts/build-and-deploy

   gcloud builds submit --tag gcr.io/gcp-docker-kubernetes-demo/helloworld
   gcloud beta run deploy --image gcr.io/gcp-docker-kubernetes-demo/helloworld --set-env-vars="JAVA_TOOL_OPTIONS=-XX:MaxRAM=256m"