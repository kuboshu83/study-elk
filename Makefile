SPRING_PRO_DIR=logdemo

.PHONY:
build:
	@$(MAKE) -C $(SPRING_PRO_DIR) --no-print-directory image

.PHONY:
clean:
	@rm -rf filebeat_ingest_data
	@rm -rf logstash_ingest_data
	@$(MAKE) -C $(SPRING_PRO_DIR) --no-print-directory clean