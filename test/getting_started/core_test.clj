(ns getting-started.core-test
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [clojure.test :refer :all]
            [getting-started.core :refer :all]
            [getting-started.module :refer :all]))

(deftest start-test
  (testing "FIXME, I fail."
    (is (string? (devs)))))
