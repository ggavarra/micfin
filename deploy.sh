pip install --user awscli
export PATH=$PATH:$HOME/.local/bin

add-apt-repository ppa:ggavarra/ppa
apt-get update
apt-get install jq -y

curl https://raw.githubusercontent.com/silinternational/ecs-deploy/master/ecs-deploy | sudo tee -a /usr/bin/ecs-deploy
sudo chmod +x /usr/bin/ecs-deploy

# Use this for AWS ECR
# eval $(aws ecr get-login --region ap-southeast-1)

# Use this for Docker Hub
docker login --username $DOCKER_HUB_USER --password $DOCKER_HUB_PSW $AWS_ECR_URL

docker build -t ggavarra/ecs-auto-deploy .
docker tag ggavarra/ecs-auto-deploy:latest $IMAGE_REPO_URL:latest
docker push $IMAGE_REPO_URL:latest

#ecs-deploy -c $CLUSTER_NAME -n $SERVICE_NAME -i $IMAGE_REPO_URL:latest