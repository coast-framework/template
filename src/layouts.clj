(ns layouts
  (:require [coast]))


(defn app [request response]
  (let [{:keys [body title]} response]
    (coast/render :html
      (coast/html
        (coast/doctype :html5)
        [:html {:lang "en"}
         [:head
          [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
          [:title (or title "Coast on Clojure")]
          (coast/css "bundle.css")]
         [:body
          body
          (coast/js "bundle.js")]]))))
