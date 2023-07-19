/**
 * @param {Object} obj
 * @return {Object}
 */
var compactObject = function (obj) {
  if (typeof obj !== 'object' || obj === null) {
    return obj;
  }

  if (Array.isArray(obj)) {
    const output = []
    for (let i = 0; i < obj.length; i++) {
      const val = compactObject(obj[i]);
      if (val) {
        output.push(val);
      }
    }
    return output;

  } else {
    const output = {}
    for (let key in obj) {
      const val = compactObject(obj[key]);
      if (val) {
        output[key] = val;
      }
    }
    return output;
  }
};