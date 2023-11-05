(ns getting-started.module)


#_{:clj-kondo/ignore [:unused-binding]}
;;name
(def devs {:name "Devs" :age 35})


#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
;;newName
(def newdevs {:name "newDevs" :age 36})


;;Hello
#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def say-hello (fn [f] (println "Hello" f)))