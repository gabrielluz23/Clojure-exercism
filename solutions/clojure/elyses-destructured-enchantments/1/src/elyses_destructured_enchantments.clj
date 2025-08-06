(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (first deck)
)

(defn second-card
  "Returns the second card from deck."
  [deck]
  (second deck)
)

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (assoc deck 0 (deck 1) 1 (deck 0)) 
)

(defn discard-top-card
  "Returns a sequence containing the first card and
   a sequence of the remaining cards in the deck."
  [deck]
 (let [[top-deck & rest-deck] deck]
    [top-deck rest-deck]
    )
)

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
 (let [first-card (first deck) rest-deck (rest deck)]
     (vec (remove nil? (flatten [first-card face-cards rest-deck])))
    ))

