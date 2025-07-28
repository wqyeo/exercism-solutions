(ns annalyns-infiltration)

(defn can-fast-attack?
  "Returns true if a fast-attack can be made, false otherwise."
  [knight-awake?]
  (not knight-awake?)
  )

(defn can-spy?
  "Returns true if the kidnappers can be spied upon, false otherwise."
  [knight-awake? archer-awake? prisoner-awake?]
  (or knight-awake? archer-awake? prisoner-awake?)
  )

(defn can-signal-prisoner?
  "Returns true if the prisoner can be signalled, false otherwise."
  [archer-awake? prisoner-awake?]
  (and (not archer-awake?) prisoner-awake?)
  )

(defn can-sneak?
  "Return true if sneak is an option"
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (and prisoner-awake? (not knight-awake?) (not archer-awake?) (not dog-present?))
)

(defn can-free-prisoner?
  "Returns true if prisoner can be freed, false otherwise."
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (or 
    (and
      dog-present?
      knight-awake?
      (not archer-awake?)
    )
    (can-sneak? knight-awake? archer-awake? prisoner-awake? dog-present?)
  )
)
