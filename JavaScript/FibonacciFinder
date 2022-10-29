function fibFinder(n) {
  var fibonacci = [1];

  for(var i = 0; i < n; i++) {
    var lastFib;
    if(i - 1 < 0) {
      lastFib = 0;
    } else {
      lastFib = fibonacci[i - 1];
    }

    fibonacci.push(lastFib + fibonacci[i]);
  }

  if(n == 0) {
    return 0;
  } else {
    return fibonacci[n - 1];
  }
}

console.log(fibFinder(6))

module.exports = fibFinder;
