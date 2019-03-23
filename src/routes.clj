(ns routes
  (:require [coast]
            [components]))

(def routes
  (coast/site
    (coast/with-layout :components/layout
      [:get "/" :home/index])

    [:404 :home/not-found]
    [:500 :home/server-error]))
