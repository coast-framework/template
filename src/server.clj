(ns server
  (:require [coast.gamma :as coast]
            [coast.server :as server]
            [controllers.errors :as c.errors]
            [routes :refer [routes]]
            [components :as c])
  (:gen-class))

(def opts {:layout c/layout
           :404 c.errors/not-found
           :500 c.errors/internal-server-error})

(def app (coast/app routes opts))

(defn coast []
  (server/restart app))

(defn -main [& args]
  (server/start app))
