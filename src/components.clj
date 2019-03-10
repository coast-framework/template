(ns components
  (:require [coast]))


(defn layout [request body]
  [:html
    [:head
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     (coast/css "bundle.css")
     (coast/js "bundle.js")]
    [:body
     body]])


(defn link-to [k & args]
  (let [m (if (map? (first args))
            (first args)
            {})
        body (if (and (empty? m)
                      (or (vector? (first args))
                          (string? (first args))))
              (first args)
              (second args))
        params (merge {:class "f6 link dim br2 ph3 pv2 dib blue underline"
                       :href (coast/url-for k m)}
                      m)]
    [:a params body]))


(defn th
  ([s]
   [:th {:class "fw6 tl pa3 bg-white"} s])
  ([]
   (th "")))

(defn a
  ([k s]
   (a k {} s))
  ([k m s]
   [:a {:href (coast/url-for k m) :class "f6 link underline blue"}
    s]))


(defn td [& body]
  [:td {:class "pa2"} body])


(defn submit [value]
  [:input {:class "input-reset pointer dim ml3 db bn f6 br2 ph3 pv2 dib white bg-blue"
           :type "submit"
           :value value}])


(defn dt [s]
  [:dt {:class "f6 b mt2"} s])


(defn dd [s]
  [:dd {:class "ml0"} s])


(defn delete-button [k & args]
  (let [m (if (map? (first args))
            (first args)
            {})
        s (if (and (empty? m)
                   (string? (first args)))
            (first args)
            (second args))]
    (coast/form-for k m {:class "dib ma0"}
     [:input {:class "input-reset pointer link underline db bn f6 br2 ph3 pv2 dib blue bg-transparent"
              :type "submit"
              :value s
              :data-confirm "Are you sure?"}])))


(defn form-for
  ([k body]
   (form-for k {} body))
  ([k m body]
   (form-for k m {} body))
  ([k m params body]
   (coast/form-for k m (merge params {:class "pa4"})
     [:div {:class "measure"}
      body])))


(defn label [m s]
  [:label (merge {:for s :class "f6 b db mb2"} m) s])


(defn input [m]
  [:input (merge {:class "input-reset ba b--black-20 pa2 mb2 db w-100"} m)])
