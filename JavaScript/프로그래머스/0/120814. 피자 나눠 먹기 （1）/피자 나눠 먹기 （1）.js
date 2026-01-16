function solution(n) {
    for(let p = 1; p > 0; p++){   
        if(7 * p / n >= 1){
            return Math.ceil(p);
            break;
        }
    }
}