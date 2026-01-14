function solution(array) {
    const cnt = {};
    array.forEach(v => cnt[v] = (cnt[v] || 0) +1);
    
    const max = Math.max(...Object.values(cnt));
    const modes = Object.keys(cnt).filter(k => cnt[k] === max);
    
    return modes.length === 1 ? Number(modes[0]) : -1;
}