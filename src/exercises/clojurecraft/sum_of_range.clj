(ns exercises.clojurecraft.sum-of-range)


;; (defn sum-to [n]
;;   (if (odd? n)
;;     (int (* (Math/ceil (/ n 2)) n))
;;     (int (+ (* (Math/ceil (/ n 2)) n) (/ n 2)))))

(defn sum-to [n]
  (let [inter (* (Math/ceil (/ n 2)) n)]
    (if (odd? n)
      (int inter)
      (int (+ inter (/ n 2))))))

(is (= 15 (sum-to 5)))
(is (= 21 (sum-to 6)))
(is (= 180300 (sum-to 600)))

; raf's solution
;; (defn sum-to-raf [n] (apply + (range (inc n))))

