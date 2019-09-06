/**
 * Calculates Fib(n) recursively.
 * CSC 349 sample submission, Winter '19
 */

function fib(n) {
  if (n < 0) {
    return -1;
  }
  else if (n == 0 || n == 1) {
    return n;
  }
  else {
    return fib(n - 1) + fib(n - 2);
  }
}

console.log(fib(parseInt(process.argv[2])))
