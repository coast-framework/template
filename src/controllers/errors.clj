(ns controllers.errors
  (:require [views.errors :as views.errors]
            [coast.responses :as res]))

(defn not-found [request]
  (res/not-found
    (views.errors/not-found request)))

(defn internal-server-error [request]
  (res/internal-server-error
    (views.errors/internal-server-error request)))
