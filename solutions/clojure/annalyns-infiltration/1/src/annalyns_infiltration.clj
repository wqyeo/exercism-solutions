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

(defn can-bypass-knight?
  "Return true if we can bypass knight"
  [knight-awake? dog-present?]
  (or (not knight-awake?) (and knight-awake? dog-present?))
)

(defn can-bypass-archer?
  "Return true if we can bypass archer"
  [archer-awake?]
  (not archer-awake?)
)

(defn can-sneak?
  "Return true if sneak is an option"
  [knight-awake? archer-awake? prisoner-awake?]
  (and prisoner-awake? (not knight-awake?) (not archer-awake?))
)

(defn can-free-prisoner?
  "Returns true if prisoner can be freed, false otherwise."
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (or (and can-bypass-knight? knight-awake? dog-present? can-bypass-archer? archer-awake?) can-sneak? knight-awake? archer-awake? prisoner-awake?)
)
