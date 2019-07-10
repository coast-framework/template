(ns routes
  (:require [coast]
            [routes.home]))


(def app
  (coast/routes
    routes.home/routes))
