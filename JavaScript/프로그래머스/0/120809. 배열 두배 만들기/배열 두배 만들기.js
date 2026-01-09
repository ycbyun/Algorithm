function solution(numbers) {
    let answer = []
    for (let i=0; i < numbers.length; i++) {
        let double = numbers[i] * 2;
        answer.push(double);
    }
    
    return answer;
}