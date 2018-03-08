# {{name}}

## Start

```bash
git clone git@github.com:your-user-name/{{name}}.git
cd {{name}}
coast db:create
coast db:migrate
```

## Dev

```bash
coast nrepl # starts an nrepl server
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
coast db:migrate
coast clean
coast uberjar
java $JVM_OPTS -cp target/{{name}}.jar clojure.main -m server
```