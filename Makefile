.PHONY: test

run:
	clj -m server

test:
	clj -A\:test

clean:
	rm -rf target

uberjar:
	clj -A\:uberjar

server: uberjar
	java -jar target/{{name}}.jar -m server

nrepl:
	clj -R:nrepl:cider bin/nrepl.clj

db/migrate:
	clj -m coast.db/create {{name}}
