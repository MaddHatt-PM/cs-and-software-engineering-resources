# CanConstruct
Write a function `canConstruct(target, wordbank)` that accepts a target string and an array of strings.  
The function should return a boolean indicating whether or not the `target` can be constructed by concatenating elements of the `wordbank` array.  
You may reuse elements of `wordbank` as many times as needed.

## Example
canConstruct("abcdef", ["ab", "abc", "cd", "def", "abcd"]) $\to true$ with "abc" + "def"  
canConstruct("skateboard", ["bo", "rd", "ate", "t", "ska", "sk", "boar"]) $\to false$  
canConstruct("", ["cat", "dog", "mouse"]) $\to true$ as we pick no element

## Algorithm Approach
Recall that there is usually a built-in function to determine if a string is a prefix of another string. We can use this along with recursion to keep checking our result for an empty string. Recall that an empty string is always true as we can choose to pick no elements. As we will need to iterate via for-loop and then bubble up our results via boolean OR.

## Initial Brute Force
```javascript
const canConstruct = (target, workBank) => {
    if (target === "") return true;

    for (let word of wordBank) {
        if (target.indexOf(word) === 0) {
            const suffix = target.slice(word.length);
            if (canConstruct(suffix, wordBank)) {
                return true;
            }
        }
    }

    return false;
}
```

Time Complexity: $O(n^m \times m)$ where $m$ is the length of `target` and $n$ is the length of `wordBank`.  
Space Complexity: $O(m^2)$ due to the max depth and each stack frame having their own sliced version of `target`.

## Memoized Version
```javascript
const canConstruct = (target, workBank, memo={}) => {
    if (target in memo) return memo[target];
    if (target === "") return true;

    for (let word of wordBank) {
        if (target.indexOf(word) === 0) {
            const suffix = target.slice(word.length);
            if (canConstruct(suffix, wordBank)) {
                memo[target] = true;
                return true;
            }
        }
    }

    memo[target] = false;
    return false;
}
```
Time Complexity: $O(n^m \times m) \to O(n \times m^2)$ as we gained an m from the checked slice.  
Space Complexity: $O(m^2) \to O(m^2)$