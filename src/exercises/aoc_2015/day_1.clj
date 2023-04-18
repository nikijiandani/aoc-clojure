(ns src.exercises.aoc_2015.day-1
  (:require [clojure.string :as str]))


(def input
  (-> (slurp "src/exercises/aoc_2015/input.txt")
      (str/split #"")))

(reduce
 (fn [acc curr]
   (if (= curr "(")
     (inc acc)
     (dec acc)))
 0 input)