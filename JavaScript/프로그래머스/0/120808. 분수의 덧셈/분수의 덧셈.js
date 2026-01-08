function solution(numer1, denom1, numer2, denom2) {
    let n = numer1 * denom2 + numer2 * denom1; 
    let d = denom1 * denom2;                   

    let a = n, b = d;
    while (b !== 0) {
        let r = a % b;
        a = b;
        b = r;
    }

    return [n / a, d / a];
}