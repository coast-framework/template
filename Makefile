.PHONY: test

test:
	COAST_ENV=test clj -Atest

clean:
	rm -rf target

repl:
	clj -Arepl

assets:
	clj -m coast.assets

server:
	clj -m server

db/migrate:
	clj -m coast.db migrate

db/rollback:
	clj -m coast.db rollback

db/create:
	clj -m coast.db create

db/drop:
	clj -m coast.db drop
