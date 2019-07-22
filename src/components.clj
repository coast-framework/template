(ns components
  (:require [coast]))


(defn container
  ([m body]
   (let [class (get m :class)
         attrs (dissoc m :class)]
     [:div (merge attrs {:class (str "pa4 center " class)})
      body]))
  ([body]
   (container {:class "mw8"} body)))


(defn table [& body]
  [:table {:class "f6 w-100" :cellspacing 0}
   body])


(defn thead [& body]
  [:thead body])


(defn tbody [& body]
  [:tbody {:class "lh-copy"} body])


(defn tr [& body]
  [:tr {:class "stripe-dark"}
   body])


(defn th
  ([s]
   [:th {:class "fw6 tl pa3 bg-white"} s])
  ([]
   (th "")))


(defn td [& body]
  [:td {:class "pa3"} body])


(defn dt [s]
  [:dt {:class "f6 b mt2"} s])


(defn dd [s]
  [:dd {:class "ml0"} s])


(defn dl [& body]
  [:dl body])


(defn label [m s]
  [:label (merge {:for s :class "f6 b db mb2"} m) s])


(defn vstack [m & body]
  [:vstack m body])


(defn hstack [m & body]
  [:hstack m body])


(defn form-for [v & body]
  (coast/form (apply coast/action-for v)
    body))


(defn field [type table column & {:as options}]
  (let [table (name table)
        column (name column)]
    [:input (assoc options
              :type type
              :name (str table "[" column "]"))]))


(def text-field (partial field "text"))
(def email-field (partial field "email"))
(def password-field (partial field "password"))
(def number-field (partial field "number"))
(def tel-field (partial field "tel"))


(defn field-error [error]
  [:span {:class "f6"}
   error])


(defn submit [value & {:as options}]
  [:input (merge {:type "submit" :value value} options)])


(defn link-to
  ([url-vector m body]
   [:a (merge {:href (apply coast/url-for url-vector)} m)
     body])
  ([url-vector body]
   (link-to url-vector {} body)))


(defn button-to
  ([action-vector m body]
   (coast/form (merge (apply coast/action-for action-vector) {:class "dib ma0"})
     [:button m body]))
  ([action-vector body]
   (button-to action-vector {} body)))
