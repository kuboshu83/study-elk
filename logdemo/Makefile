IMAGE=org.example.k83/logdemo:0.1.0
TRASH_CAN=/dev/null
IS_IMAGE_EXIST=podman image inspect $(IMAGE) > $(TRASH_CAN) 2>&1

.PHONY:
image:
	@if $(IS_IMAGE_EXIST); then \
		echo "skip build image"; \
	else \
		./gradlew clean build bootBuildImage --imageName=$(IMAGE); \
	fi

.PHONY:
clean:
	@rm -rf ./logs

.PHONY:
rmi:
	@if $(IS_IMAGE_EXIST); then \
		podman rmi $(IMAGE); \
	fi
