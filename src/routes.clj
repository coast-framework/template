(ns routes
  (:require [coast.alpha :as coast]
            [controllers.home :as c.home]))

(def routes
  (-> (coast/get "/" c.home/index)))
