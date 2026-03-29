# ログの登録の仕方

logstash_ingest_data/にファイルを投稿するだけです。

```bash
echo "Hello ELK" > ./logstash_ingest_data/sample.log
```

filebeatを利用する場合は

```bash
echo "Hello ELK" > ./filebeat_ingest_data/sample.log
```

# サンプルアプリのビルド方法

Springのサンプルプログラムは./logdemo/Makefileを使って以下のようにビルドしてください。


```bash
make image
```

以下のコンテナイメージが生成されます。

- org.example.k83/logdemo:0.1.0

# 参考リンク
- [Elasticsearch - Doc](https://www.elastic.co/docs/deploy-manage/deploy/self-managed/install-elasticsearch-docker-compose)
- [Kibana - Doc](https://www.elastic.co/docs/deploy-manage/deploy/self-managed/install-kibana-with-docker)
- [ELK - Docker Compose](https://www.elastic.co/docs/deploy-manage/deploy/self-managed/install-elasticsearch-docker-compose)
- [Elastic StackとDocker Composeを使いはじめる：パート1](https://www.elastic.co/jp/blog/getting-started-with-the-elastic-stack-and-docker-compose)