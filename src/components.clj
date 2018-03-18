(ns components)

(defn layout [request body]
  [:html
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     [:link {:href "/css/app.css" :type "text/css" :rel "stylesheet"}]]
    [:body
     body
     [:script {:src "/js/app.s" :type "text/javascript"}]]])
