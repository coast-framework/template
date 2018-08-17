(ns error.internal-server-error
  (:require [coast.components :refer [css js]]))

(defn view [request]
  [:html
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (css "bundle.css")
     (js "bundle.js")]
    [:body
     "Something went wrong!"]])
