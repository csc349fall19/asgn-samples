;; Calculates Fib(n) recursively.
;; CSC 349 sample submission, Fall '17


;; (fib (Long -> Long))
(def fib
  "Calculates the nth Fibonacci number."
  (memoize
    (fn [n]
      (cond
        (< n 0) -1
        (or (= n 0) (= n 1)) n
        :else (+ (fib (- n 1)) (fib (- n 2)))))))

(prn (fib (read-string (first *command-line-args*))))
