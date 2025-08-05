(ns bird-watcher)

(def last-week [0 2 5 3 7 8 4]
  )

(defn today [birds]
   (peek birds)
  )

(defn inc-bird [birds]
          (assoc birds (- (count birds) 1) (inc (peek birds))))

(defn day-without-birds? [birds]
  (not (every? pos? birds))
  )

(defn n-days-count [birds n]
 (reduce + (take n birds))
  )

(defn busy-days [birds]
    (count (filter #(>= % 5) birds))
  )

(defn odd-week? [birds]
    (let [pattern (take (count birds) (cycle [1 0]))]
    (= birds pattern)))
  
