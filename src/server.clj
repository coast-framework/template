(ns server
  (:require [coast])
  (:gen-class))

(def app (coast/app))

(defn -main [& [port]]
  (coast/server app {:port port}))
