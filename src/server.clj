(ns server
  (:require [coast]
            [layout]
            [routes]))


(def db (coast/db))


(def app (-> (coast/app routes/app)
             (coast/layout layout/app)
             (coast/set-db db)
             (coast/not-found)
             (coast/server-error)
             (coast/sessions)
             (coast/body-parser)
             (coast/cookies)
             (coast/head)
             (coast/security-headers)
             (coast/logger)
             (coast/assets)
             (coast/reload)))


(defn -main [& [port]]
  (coast/server app {:port port}))


(comment
  (-main))
