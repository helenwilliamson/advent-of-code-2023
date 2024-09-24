(ns advent-of-code-2023.utils
  (:gen-class)
  (:require [clojure.string :as str]))

(defn read-input
  [name]
  (-> (slurp (str "resources/" name))
      (str/split #"\n")))
