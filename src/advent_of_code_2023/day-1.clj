(ns advent-of-code-2023.day-1
  (:gen-class)
  (:require [advent-of-code-2023.utils :as utils]
            [clojure.string :as string]))

(defn parse-input
  [name]
  (->> (utils/read-input name)
       (map #(re-seq #"\d" %1))
       (map #(->> (list (first %1) (last %1))
                  string/join
                  Integer/parseInt))
       (reduce +)))
