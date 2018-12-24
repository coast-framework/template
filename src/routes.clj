(ns routes
  (:require [coast]
            [components]))

(def routes
  (concat
    (coast/wrap-with-layout components/layout
      [[:get "/" ::home/index]])

    [[:get "/404" ::home/not-found]
     [:get "/500" ::home/server-error]]))
