(ns routes
  (:require [coast.alpha :as coast]
            [controllers.home :as c.home]
            [controllers.errors :as c.errors]))

(def routes
  (-> (coast/get "/" c.home/index)))

