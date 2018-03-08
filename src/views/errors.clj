(ns views.errors
  (:require [components :as c]
            [coast.alpha :as coast]))

(defn not-found [request]
  (coast/html5
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (coast/include-css "/css/app.css")]
    [:body
     "Cound't find what you were looking for"
     (coast/include-js "/js/app.js")]))

(defn internal-server-error [request]
  (coast/html5
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (coast/include-css "/css/app.css")]
    [:body
     "Something went wrong!"
     (coast/include-js "/js/app.js")]))
