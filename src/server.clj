(ns server
  (:require [coast.epsilon :as coast]
            [views.errors]
            [components]
            [routes])
  (:gen-class))

(def opts {:layout components/layout
           :404 views.errors/not-found
           :500 views.errors/internal-server-error})

(def app (coast/app routes/routes opts))

(defn coast [port]
  (coast/server app {:port port}))

(defn -main [& [port]]
  (coast port))
