IMAGE=org.example.k83/logdemo:0.1.0

.PHONY:
image:
	@if podman image inspect $(IMAGE) > /dev/null 2>&1; then \
		echo "skip build image"; \
	else \
		./gradlew clean build bootBuildImage --imageName=$(IMAGE); \
	fi