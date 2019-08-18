(ns routes.home
  (:require [coast]))


(defn index [request]
  [:h1 {:class "tc"}
    "You're coasting on clojure!"])


(def routes
  (coast/routes
    [:get "/" index]))
