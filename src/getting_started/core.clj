(ns getting-started.core
  (:gen-class) 
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [getting-started.module :refer :all]))


;;Print
#_{:clj-kondo/ignore [:unused-binding]}
(defn -main
  "I don't do a whole lot ... yet."
  [& args] 
  (list* (map #(println (:name %) "Age" (:age %)) [devs newdevs])))

(list* (map println (map git_hello [:git :nameGit])))












