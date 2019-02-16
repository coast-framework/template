(ns routes
  (:require [coast]
            [components]))

(defn routes []
  (coast/wrap-with-layout components/layout
    [:get  "/"                         :home/index]
    [:get  "/404"                      :home/not-found]
    [:get  "/500"                      :home/server-error]))
