/**
 * @param {number} value
 * @return {number[]}
 */
var countBits = function (value) {
  let results = Array(value + 1).fill(0);
  for (let i = 0; i <= value; i++) {
    let j = i;
    while (j !== 0) {
      results[i]++;
      j = j & (j - 1);
    }
  }

  return results;
};