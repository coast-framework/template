(ns controllers.home
  (:require [views.home :as views.home]))

(defn index [request]
  (views.home/index))
