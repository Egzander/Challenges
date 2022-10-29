def prime_finder(n):
  primes = [2]

  for i in range(2, n + 1):
    prime = True
    for j in range(0, len(primes)):
      if i % primes[j] == 0:
        prime = False

    if prime:
      primes.append(i)
  
  return primes
 
print(prime_finder(11))
