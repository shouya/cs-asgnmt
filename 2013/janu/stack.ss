; lang: Revo

(define (make-stack) '())

(define (push stack val)
  (if (null? stack) (list val)
      (cons (car stack) (push (cdr stack) val))))

(define (pop stack)
  (cond ((null? stack) (error "empty stack"))
        ((null? (cdr stack)) '())
        (else (cons (car stack)
                    (pop (cdr stack))))))

(define (top stack)
  (cond ((null? stack) (error "empty stack"))
        ((null? (cdr stack)) (car stack))
        (else (top (cdr stack)))))

(define (print-stack stack)
  (define (print-stack* stack)
    (cond ((null? stack) (display ")"))
          (else (display (car stack))
                (display ", ")
                (print-stack* (cdr stack)))))
  (display "(")
  (print-stack* stack))


(define mystack (make-stack))
(display "push 1,2,3") (newline)
(set! mystack (push mystack 1))
(set! mystack (push mystack 2))
(set! mystack (push mystack 3))
(print-stack mystack)
(newline)

(display "pop twice") (newline)
(set! mystack (pop mystack))
(set! mystack (pop mystack))
(print-stack mystack)
(newline)

(display "top") (newline)
(display (top mystack))
(newline)

; (debug mystack)
