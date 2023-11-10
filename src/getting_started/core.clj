(ns getting-started.core
  (:gen-class) 
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [getting-started.module :refer :all]))


;;Print
#_{:clj-kondo/ignore [:unused-binding]}
(defn -main
  "I don't do a whole lot ... yet."
  [& args] 
  (data user1 user2)
  (git user3)
  (dataCopy user1 user2)
  #_{:clj-kondo/ignore [:unused-value]}
  (list* (map println (map person-dsl people)))
  #_{:clj-kondo/ignore [:unused-value]}
  (list* (map println (map name-1 people)))
  (println [(:name  {:name "Devs" :age 36})
            (:age  {:name "Devs" :age 36})]))
  












