function mergeAlternately(word1, word2) {
  let i = 0;
  let output = "";
  while (i < word1.length && i < word2.length) {
    output += word1[i];
    output += word2[i];
    i += 1;
  }

  if (word1.length < word2.length) {
    output += word2.slice(i);
  } else {
    output += word1.slice(i);
  }

  return output;
};