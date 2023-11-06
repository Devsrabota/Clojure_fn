(ns getting-started.module)


;;------------------------------------Name
#_{:clj-kondo/ignore [:inline-def]}
(def name1 {:name "Devs" :age 35})


;;Name
(def name2 {:name "newDevs" :age 36})


;;Name
(def name3 {:git "Git hello!!!" :nameGit "DevsGit"})


;;------------------------------------Hello
#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def say-hello  #(println (:name %) (:age %)))


;;gitHello
#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def hello_git #(println (:git %) (:nameGit %)))


;;------------------------------------finish
#_{:clj-kondo/ignore [:unused-binding]}
(defn fin [a b] (list* (map say-hello [a b])))


;;finish
#_{:clj-kondo/ignore [:unused-binding]}
(defn fin1 [a] (list* (map hello_git [a])))


;;finish
#_{:clj-kondo/ignore [:unused-binding]}
(defn fin2 [a b] (->> [a b]
                 (map say-hello)
                 (list*)))