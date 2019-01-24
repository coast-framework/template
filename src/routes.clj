(ns routes)

(def routes [[:get "/" :home/index]
             [:get "/404" :home/not-found :404]
             [:get "/500" :home/server-error :500]])
