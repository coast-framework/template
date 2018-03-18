(ns controllers.home
  (:require [views.home :as views.home]))

(defn index {:get "/"} [request]
  (views.home/index request))
