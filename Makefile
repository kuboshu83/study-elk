.PHONY:
build:
	@$(MAKE) -C logdemo --no-print-directory

.PHONY:
clean:
	@rm -rf filebeat_ingest_data
	@rm -rf logstash_ingest_data