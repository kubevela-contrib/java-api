#!/bin/bash

# Define variables
DOCKER_IMAGE="ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6"
TARGET_GROUP="dev.oam.core"
OUTPUT_PACKAGE="dev.oam.core"
CRD_FILES_PATH="$(pwd)/crds"
OUTPUT_PATH="$(pwd)/tmpclient/java"

# Pull the Docker image if not already pulled
# docker pull $DOCKER_IMAGE

# Create necessary directories and change working directory
mkdir -p "$OUTPUT_PATH" && cd "$OUTPUT_PATH"

# Generate CRD Java client
docker run \
  --rm \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -v "${CRD_FILES_PATH}":"${CRD_FILES_PATH}" \
  --network host \
  -ti \
  $DOCKER_IMAGE \
  /generate.sh \
  -u ${CRD_FILES_PATH}/core.oam.dev_applicationrevisions.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_applications.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_componentdefinitions.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_definitionrevisions.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_policies.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_policydefinitions.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_resourcetrackers.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_traitdefinitions.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_workflows.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_workflowstepdefinitions.yaml \
  -u ${CRD_FILES_PATH}/core.oam.dev_workloaddefinitions.yaml \
  -n "$TARGET_GROUP" \
  -p "$OUTPUT_PACKAGE" \
  -o "$(pwd)"