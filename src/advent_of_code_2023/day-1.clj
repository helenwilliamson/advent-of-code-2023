(ns advent-of-code-2023.day-1
  (:gen-class)
  (:require [advent-of-code-2023.utils :as utils]
            [clojure.string :as string]))



(defn parse-input
  [name]
  (->> (utils/read-input name)
       (map #(list (re-find #"\d" %1) 
                   (->> (reverse %1)
                        (apply str) 
                        (re-find #"\d"))))
       (map #(->> (string/join %1)
                  Integer/parseInt))
       (reduce +)))

