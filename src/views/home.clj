(ns views.home)

(defn index [request]
  [:h1 "You're coasting on clojure!"])

(defn hello [request]
  [:h1 "Hello " (-> request :params :name)])
