import sys

c = True
while (c):
    a, b = map(int, sys.stdin.readline().split())
    if (a==0 and b ==0):
        c = False
    else:
        print(a+b)