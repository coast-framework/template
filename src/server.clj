(ns server
  (:require [coast]
            [routes]
            [components])
  (:gen-class))

(def app (coast/app {:routes routes/routes
                     :layout components/layout}))

(defn -main [& [port]]
  (coast/server app {:port port}))
