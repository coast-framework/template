(ns routes.home
  (:require [coast]))


(def routes
  (coast/routes
    [:get "/" ::index]))


(defn index [request]
  [:h1 {:class "tc"}
    "You're coasting on clojure!"])
