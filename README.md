# {{name}}

## Start

```bash
git clone git@github.com:your-user-name/{{name}}.git
cd {{name}}
make db/create
make db/migrate
```

## Dev

```bash
make nrepl # starts an nrepl server
```

```clojure
; in your editor to the nrepl server
(coast)
```

```bash
curl http://localhost:1337 # or just open it in your browser
```

## Prod
```bash
make db/migrate
make clean
make uberjar
java $JVM_OPTS -cp target/{{name}}.jar clojure.main -m server
```
