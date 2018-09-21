(ns routes)

(def routes [[:get "/" :home.index/view :home]
             [:get "/404" :error.404/view :404]
             [:get "/500" :error.500/view :500]])
