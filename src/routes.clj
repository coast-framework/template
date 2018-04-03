(ns routes
  (:require [controllers.home :as c.home]))

(def routes [[:get "/" c.home/index]
             [:get "/hello/:name" c.home/hello]])
