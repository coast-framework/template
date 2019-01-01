(ns routes
  (:require [coast]))

(def routes
  (coast/routes

    (coast/wrap-with-layout :components/layout
      [:get "/" :routes.home/index])

    [:get "/404" :routes.home/not-found]
    [:get "/500" :routes.home/server-error]))
