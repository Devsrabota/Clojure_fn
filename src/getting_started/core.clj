(ns getting-started.core
  (:gen-class) 
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [getting-started.module :refer :all]))


;;Print
#_{:clj-kondo/ignore [:unused-binding]}
(defn -main
  "I don't do a whole lot ... yet."
  [& args] 
  (list* (map say-hello [devs newdevs])))


(list* (map hello_git [git_name]))












