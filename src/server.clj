(ns server
  (:require [coast.delta :as coast]
            [coast.dev.server :as dev.server]
            [coast.prod.server :as prod.server]
            [views.errors]
            [components]
            [routes])
  (:gen-class))

(def opts {:layout components/layout
           :404 views.errors/not-found
           :500 views.errors/internal-server-error})

(def app (coast/app routes/routes opts))

(defn coast []
  (dev.server/restart app))

(defn -main [& args]
  (prod.server/start app))
