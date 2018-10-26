;; top-k-words.clj
;; UOIT CSCI 3055U Tutorial 1
;; Ken Pu & Michael Valdron

(defn inc-freq [freq x]
  (if (get freq x)
    (update freq x inc)
    (assoc freq x 1)))

(defn count-freq [xs]
  (reduce inc-freq {} xs))

(let [filename (first *command-line-args*)
      k (Integer/parseInt (nth *command-line-args* 1))
      words (clojure.string/split (slurp filename) #"\s+")
      freqs (count-freq words)]
  (println
   (clojure.string/join
    "\n"
    (take k (reverse (sort-by freqs (keys freqs)))))))
