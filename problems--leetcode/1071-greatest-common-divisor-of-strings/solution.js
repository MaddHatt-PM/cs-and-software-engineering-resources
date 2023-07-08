/**
 * @param {string} str1
 * @param {string} pattern
 * @return {boolean}
 */
const validate = (str1, pattern) => {
  if (str1.length % pattern.length !== 0) {
    return false;
  }

  for (let i = 0; i < str1.length; i++) {
    if (pattern[i % pattern.length] !== str1[i]) {
      return false;
    }
  }

  return true;
}

/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */
var gcdOfStrings = function (str1, str2) {
  const shortest = str1.length <= str2.length ? str1 : str2;

  for (let i = shortest.length; i > 0; i--) {
    if (shortest.length % i !== 0) {
      continue;
    }

    const substring = shortest.slice(0, i);
    if (validate(str1, substring) && validate(str2, substring)) {
      return substring;
    }
  }

  return "";
};