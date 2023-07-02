start:
	docker-compose up -d webserver

nginx_reload:
	docker exec webserver nginx -s reload

certbot:
	docker-compose up -d certbot
	docker-compose up -d certbot-test
	docker-compose up -d certbot-front

certbot_prod:
	docker-compose up -d certbot

certbot_test:
	docker-compose up -d certbot-test
