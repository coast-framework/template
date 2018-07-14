(ns routes
  (:require [coast.router]))

(def routes [[:get "/" 'controllers.home/index :home]])

(def url-for (coast.router/url-for-routes routes))
(def action-for (coast.router/action-for-routes routes))
