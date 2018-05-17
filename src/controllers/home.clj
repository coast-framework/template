(ns controllers.home
  (:require [views.home]))

(defn index [request]
  (views.home/index request))

(defn hello [request]
  (views.home/hello request))
