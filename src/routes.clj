(ns routes
  (:require [coast.router]))

(def routes [[:get "/" `home.index/view]])

(def url-for (coast.router/url-for-routes routes))
(def action-for (coast.router/action-for-routes routes))
