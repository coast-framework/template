(ns error.not-found
  (:require [coast.components :refer [js css]]))

(defn view [request]
  [:html
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:link {:href "/css/app.css" :type "text/css" :rel "stylesheet"}]
    (css "bundle.css")
    (js "bundle.js")]
   [:body
    "Cound't find what you were looking for"]])

(defn internal-server-error [request]
  [:html
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (css "bundle.css")
     (js "bundle.js")]
    [:body
     "Something went wrong!"]])
