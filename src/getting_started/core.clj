(ns getting-started.core
  (:gen-class) 
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [getting-started.module :refer :all]))


;;Print
#_{:clj-kondo/ignore [:unused-binding]}
(defn -main
  "I don't do a whole lot ... yet."
  [& args] 
  (fin name1 name2)
  (fin1 name3)
  (fin2 name1 name2))
















