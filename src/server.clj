(ns server
  (:require [coast.beta :as coast]
            [coast.server :as server]
            [components :as c]
            [controllers.errors :as c.errors]
            [routes :refer [routes]])
  (:gen-class))

(def opts {:layout c/layout
           :error-fn c.errors/internal-server-error
           :not-found-fn c.errors/not-found})

(def app (coast/app routes opts))

(defn coast []
  (server/restart app))

(defn -main [& args]
  (server/start app))
