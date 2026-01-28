function solution(my_string) {
    const my = [...my_string]; 
    const reverse = []; 
    for (let i = my.length - 1; i >= 0; i--) {
        reverse.push(my[i]);
    }
    return reverse.join("");
}
