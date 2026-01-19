function solution(n) {
  function gcd(a, b) {
    while (b !== 0) {
      let r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  const lcm = (n * 6) / gcd(n, 6);

  return lcm / 6;
}
