(ns server
  (:require [error.internal-server-error]
            [coast.zeta :as coast]
            [error.not-found]
            [components]
            [routes])
  (:gen-class))

(def opts {:layout components/layout
           :404 error.not-found/view
           :500 error.internal-server-error/view})

(def app (coast/app routes/routes opts))

(defn -main [& [port]]
  (coast/server app {:port port}))
