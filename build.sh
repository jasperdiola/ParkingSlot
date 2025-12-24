#!/bin/bash

app_name="parking-slot-app"
container_name="parking-app"

build_docker() {
    echo "Building Docker Image..."
    docker build -t "$app_name" .
}

run_docker() {
    echo "Running Docker Container..."
    docker run -d \
        --name "$container_name" \
        -p 8080:8080 \
        "$app_name"
    echo "App is running..."
}

# Build & Run
if [[ "$1" == "br" ]]; then
    build_docker
    run_docker
fi
