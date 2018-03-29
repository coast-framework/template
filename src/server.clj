(ns server
  (:require [coast.beta :as coast]
            [controllers.errors :as c.errors]
            [routes :refer [routes]]
            [components :as c])
  (:gen-class))

(def opts {:layout c/layout
           :error-fn c.errors/internal-server-error
           :not-found-fn c.errors/not-found})

(def app (coast/app routes opts))

(defn coast []
  (coast/restart-server app))

(defn -main [& args]
  (coast/start-server app))
