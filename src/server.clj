(ns server
  (:require [coast.alpha :as coast]
            [routes :refer [routes]]
            [components :as c]
            [controllers.errors :as c.errors])
  (:gen-class))

(def opts {:layout c/layout
           :error-fn c.errors/internal-server-error
           :not-found-fn c.errors/not-found})

(def app (coast/app routes opts))

(defn coast []
  (coast/start app))

(defn -main [& [port]]
  (coast/start app {:port port}))
