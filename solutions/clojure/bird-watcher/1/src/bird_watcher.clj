(ns bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds)
)

(defn inc-bird [birds]
  (assoc
    birds (dec (count birds))
    (+ (last birds) 1)
  )
)

(defn increment-1-if-day-with-bird [a b]
  (cond
    (= b 0) a
    :else (+ a 1)
  )
)

(defn day-without-birds? [birds]
  (not
    (=
      (reduce increment-1-if-day-with-bird 0 birds)
      (count birds)
    )
  )
)

(defn n-days-count [birds n]
  (reduce + (take n birds))
)

(defn increment-1-if-busy-day [a b]
  (cond
    (< b 5) a
    :else (+ a 1)
  )
)

(defn busy-days [birds]
  (reduce increment-1-if-busy-day 0 birds)
)

(defn odd-week? [birds]
  (every?
    (fn [[index value]]
      (cond
        (= index 0) true
        ;; If the previous was a '1', check if current is a '0'
        (if
          (= (nth birds (dec index)) 1)
          true
          false
        ) (= value 0)
        ;; If the previous was a '0', check if current is a '1'
        (if
          (= (nth birds (dec index)) 0)
          true
          false
        ) (= value 1)
        :else false
      )
    )
    (map-indexed vector birds)
  )
)