(ns server
  (:require [coast]
            [layouts]
            [routes])
  (:gen-class))


(def db (coast/db))


(def app (-> (coast/app routes/app)
             (coast/not-found)
             (coast/server-error)
             (coast/layout layouts/app)
             (coast/set-db db)
             (coast/logger)
             (coast/simulated-methods)
             (coast/sessions)
             (coast/body-parser)
             (coast/cookies)
             (coast/head)
             (coast/security-headers)
             (coast/assets)))


(defn -main [& [port]]
  (coast/server app {:port port}))


(comment
  (-main))
