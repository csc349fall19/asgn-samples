# Calculates Fib(n) recursively.
# CSC 349 sample submission, Summer '17

import sys


def fib(n):
    if n < 0:
        return -1
    elif n == 0 or n == 1:
        return n
    else:
        return fib(n - 1) + fib(n - 2)


def main(argv):
    print(fib(int(argv[1])))


if __name__ == "__main__":
    main(sys.argv)
