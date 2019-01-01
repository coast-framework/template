.PHONY: test

test:
	COAST_ENV=test clj -A\:test

clean:
	rm -rf target

uberjar:
	clj -A\:uberjar

repl:
	clj -R:repl bin/repl.clj

assets:
	clj -m coast.assets

routes:
	clj -m coast.router

migrate:
	clj -m coast.db migrate $(OPTS)

rollback:
	clj -m coast.db rollback $(OPTS)
