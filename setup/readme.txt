Step 1: build docker

	cd mongodb
	docker build -t mongo-pcs .

	cd rabbitmq
	docker build -t rabbitmq-pcs .

Step 2: run container

	docker stack deploy -c docker-compose.yml pcs-stack 

Step 3: create user db and import database

	docker exec -it <container-id of mongo> sh
	use pcs-db
	db.createUser({ user: 'smacuser', pwd: 'Smac123', roles: [ {role:'readWrite', db:'pcs-db'} ]})
	



