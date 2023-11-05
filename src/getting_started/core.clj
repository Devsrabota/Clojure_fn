(ns getting-started.core
  (:gen-class) 
  #_{:clj-kondo/ignore [:refer-all]}
  (:require [getting-started.module :refer :all]))


;;Print
#_{:clj-kondo/ignore [:unused-binding]}
(defn -main
  "I don't do a whole lot ... yet."
  [& args] 
  (list* 
   (map say-hello 
        (map (fn [x] (list*(map x [:name :age])))[devs newdevs]))))

(list* (map println (map git_hello [:git :nameGit])))














