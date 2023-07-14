# Chapter 1 - Arrays and Strings
## Hash Tables
Hash tables use a key:value system for lookup.
When an underlying array is used, the `key's` integer/long representation is hashed.
The value of that operation is then mod by the length of the array.
This result is the index of the array to store/retrieve the `value`.
Rather than an array of type `value`, a linked list is used to store the `values` as it will handle collisions.
The nodes of the linked list will need an identifier to distinguish them from each other.
This identifier can be the pre-mod hash value or the result of a different hash operation.

For most cases, the time complexity of hash tables is n(1).
If there are multiple collisions then the worst case time complexity is O(N).
We can reduce the worst case time by substituting out a linked list for a binary search tree, O(log N).

## ArrayList & Resizable Arrays
Depending on the language, arrays are automatically resized.
For other languages, such as Java and C++, arrays have a declared size.
To get around this, an ArrayList is used to abstract away the resizing capabilities.
It must retain that ability to access items with a known index with O(1) speed.
The resizing operation will take O(N) time as it involves copying the values from the old array to the new one.
The typical resizing factor can change from language to language, but it is typically a double in size.

Insertion (new element) can be a costly operation at O(N) as the following indices will need to be pushed back one-by-one.

## StringBuilder
Recall: Strings are built upon arrays in most languages.
When concatenating a string M to another string N, a new string O is created rather than N being modified.
This is where StringBuilders come into play as they are built upon ArrayLists.
Therefore they are more efficient for more operations.

# Interview Questions
## 1.1.1: Implement an algorithm to determine if a string has all unique characters.
Recall that the keys of a hash table are unique.
We can iterate through our given string to check if they are already within our hash table.
  If they are, we have our reused character and can return `false`.
  Else, we can add them to our hash table and continue to the next character.
If we finish through our loop, then we only had unique characters and can return `true`.

## 1.1.2: What if you cannot use additional data structures?
Since a string is an array of characters, then arrays should still be usable.
While more costly, we can create a new string where the characters are sorted.
Then we can iterate through comparing the current character and the next character if they match.
  If they match, we have our reused character and can return `false`.
If we finish through our loop, then we only had unique characters and can return `true`.

## 1.2: Given two strings write a method to decide if one is a permutation of each other.
Recall: A permutation is a rearrangement of all items from the original set.
We can compare length of the two strings to avoid costlier operations.
Math route:
  Recall: Characters are mapped to numerical values.
  Note: Our strings have the same length.
  We can add up our characters and then compare their results to determine if they have the same value.
Hash Table route:
  As we iterate through the first string, we enter all the characters into a hashtable as the key and their occurrence count as the value.
  As we iterate through the second string, we lookup each character and decrement their value.
    If a key is not available, we can return `false`.
    If a value goes below 0, we can remove the key from the hash table.
  After the loop we can get an array of the still available keys. We can return `keys.length() == 0`.

While both approaches are O(n) and the hash table approach may exit quicker, the math approach is more conservative on memory as no data structures are generated.

## 1.3 URLify: Write a method to replace all spaces in a string with '%20'. Assume that the URL string has additional spaces.
As we'll need to iterate through our array and move characters backwards, it will be more efficient to use a reverse for-loop.
Since we're guaranteed to have the exact extra space, we can replace the space character with a `%` and then shift the following characters back by two indices.
  After the back up operation is finished, we can insert `20`.