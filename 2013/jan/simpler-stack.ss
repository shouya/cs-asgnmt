;

(define (make-stack) '())

(define (push stack val)
  (cons val stack))

(define (pop stack)
  (if (null? stack) (error "empty stack!")
      (cdr stack)))

(define (top stack)
  (if (null? stack) (error "empty stack!")
      (car stack)))

; the testing operations are neglected

;
