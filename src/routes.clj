(ns routes
  (:require [coast.router :refer [get post put delete resource]]
            [controllers.home :as c.home])
  (:refer-clojure :exclude [get]))

(def routes (get "/" c.home/index))
