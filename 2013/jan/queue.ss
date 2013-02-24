; Revo program
;
; Queue implementation

(define (make-queue) '())
(define (enqueue queue val)
  (cons val queue))

(define (dequeue queue)
  (cond ((null? queue) (error "empty queue"))
        ((null? (cdr queue) '()))
        (else (cons (car queue) (dequeue (cdr queue))))))

(define (queue-head queue)
  (cond ((null? queue) (error "empty queue"))
        ((null? (cdr queue)) (car queue))
        (else (queue-head (cdr queue)))))

(define (queue-tail queue)
  (if (null? queue) (error "empty queue")
      (car queue)))

(define print-queue debug)

(define (prompt text)
  (display "===") (display text) (display "===") (newline))


(define myqueue (make-queue))
(prompt "enquque 1,2,3")
(set! myqueue (enqueue myqueue 1))
(set! myqueue (enqueue myqueue 2))
(set! myqueue (enqueue myqueue 3))
(print-queue myqueue)

(prompt "dequque once")
(set! myqueue (dequeue myqueue))
(print-queue myqueue)

(prompt "head")
(display (queue-head myqueue))
(newline)

(prompt "tail")
(display (queue-tail myqueue))
(newline)
