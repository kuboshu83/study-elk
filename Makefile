.PHONY:
build:
	@$(MAKE) -C logdemo --no-print-directory image

.PHONY:
clean:
	@rm -rf filebeat_ingest_data
	@rm -rf logstash_ingest_data