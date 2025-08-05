(ns cars-assemble)

(def success-rate 
  { 
    [0] 0
    [1 2 3 4] 1
    [5 6 7 8] 0.9
    [9] 0.8
    [10] 0.77
   })

(defn calc-hour [speed]
    (*(* 221 speed) 
      (some (fn [[success-key success-value]]
          (when (some #{speed} success-key)
            success-value))
        success-rate))
  )

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (calc-hour speed)
  )

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (calc-hour speed) 60))
  )
