(ns getting-started.module)


;;------------------------------------Name
#_{:clj-kondo/ignore [:inline-def]}
(def user1 {:name "Devs" :age 35})


;;Name
(def user2 {:name "newDevs" :age 36})


;;Name
(def user3  {:git "Git Hello" :nameGit 45})


;;Name
(def people
  [{:name "Alice", :age 25, :gender "Female", :occupation "Engineer"}
   {:name "Bob", :age 30, :gender "Male", :occupation "Doctor"}
   ; Другие люди...
   ])



;;------------------------------------Hello
#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def say-hello  #(println (:name %) (:age %)))


;;gitHello
#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(def hello_git #(println (:git %) (:nameGit %)))


;;------------------------------------finish dsl


#_{:clj-kondo/ignore [:unused-binding]}
(defn data [a b] (list* (map say-hello [a b])))


;;finish
#_{:clj-kondo/ignore [:unused-binding]}
(defn git [a] (list* (map hello_git [a])))


;;finish
#_{:clj-kondo/ignore [:unused-binding]}
(defn dataCopy [a b] (->> [a b]
                 (map say-hello)
                 (list*)))

;;dsl full
(defn person-dsl [person]
  (str "Person: " (:name person) 
       ", Age: " (:age person) 
       ", Gender: " (:gender person) 
       ", Occupation: " (:occupation person)))


;;dsl -1
#_{:clj-kondo/ignore [:unused-value]}
(defn name-1 [person] 
  (str "Person: " (:name person)
       ", Age: " (:age person)
       ", Gender: " (:gender person)))