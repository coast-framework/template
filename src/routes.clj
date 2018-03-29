(ns routes
  (:require [coast.router :refer [get post put delete]]
            [controllers.home :as c.home]))

(def routes (-> (get "/" c.home/index)
                (get "/hello/:name" c.home/hello)))
