(ns controllers.errors
  (:require [views.errors :as views.errors]
            [coast.alpha :as coast]))

(defn not-found [request]
  (coast/not-found
    (views.errors/not-found request)))

(defn internal-server-error [request]
  (coast/internal-server-error
    (views.errors/internal-server-error request)))

