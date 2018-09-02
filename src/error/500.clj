(ns error.500
  (:require [coast :refer [css js internal-server-error]]))

(defn view [request]
  (internal-server-error
    [:html
      [:head
       [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
       (css "bundle.css")
       (js "bundle.js")]
      [:body
       "Something went wrong!"]]))
