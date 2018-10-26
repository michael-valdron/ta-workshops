;; sandbox.clj
;; UOIT CSCI 3055U Tutorial 1
;; Ken Pu & Michael Valdron

(defn inc-freq [freq x]
  (if (get freq x)
    (update freq x inc)
    (assoc freq x 1)))

(defn count-freq [xs]
  (reduce inc-freq {} xs))

(println (count-freq [:a :b :a :b :c :c :a]))

;; Uncomment to try slurp
;; (println (clojure.string/split (slurp "names.txt") #"\s+"))
