.PHONY: test

test:
	clj -A\:test

clean:
	rm -rf target

uberjar:
	clj -A\:uberjar

server:
	clj -m server

nrepl:
	clj -R:nrepl:cider bin/nrepl.clj

db/migrate:
	clj -A\:db/migrate

db/rollback:
	clj -A\:db/rollback

db/create:
	clj -A\:db/create

db/drop:
	clj -A\:db/drop

worker:
	clj -m coast.worker
