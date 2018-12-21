(ns server-test
  (:require [clojure.test :refer [deftest testing is]]
            [server]))

(deftest home-test
  (testing "home route"
    (let [response (server/app {:uri "/" :request-method :get})]
      (is (= (:status response) 200)))))

(deftest not-found-test
  (testing "not-found route"
    (let [response (server/app {:uri "/not-found" :request-method :get})]
      (is (= (:status response) 404)))))
