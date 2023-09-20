# Generate Java models

[toc]

## usage

A demo is in `./generate_api.sh`

First, you need to make sure docker has been pulled

```bash
DOCKER_IMAGE="ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6"
# Pull the Docker image if not already pulled
docker pull $DOCKER_IMAGE
```

and modify your CRD file path and other configurations for the last docker command. Then

```bash
bash ./generate_api.sh
```

One thing you need to pay more attention is that the one configuration item `-n`

```bash
-n: <the target CRD group name, which is in the **reverse** order of ".spec.group">
```

## reference

[docs on kubernetes-client: Guide to generate Java codes from CRD][https://github.com/kubernetes-client/java/blob/master/docs/generate-model-from-third-party-resources.md]
