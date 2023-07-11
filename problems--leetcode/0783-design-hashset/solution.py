class LinkedNode:
    def __init__(self, key):
        self.key = key
        self.next = None


class MyHashSet:
    def __init__(self):
       self.data = [LinkedNode(key=0) for i in range(1000) ]

    def hashToIndex(self, key: int):
        return key % len(self.data)

    def add(self, key: int) -> None:
        node = self.data[self.hashToIndex(key=key)]
        while node.next is not None:
            if node.next.key == key:
                return
            node = node.next
        node.next = LinkedNode(key=key)

    def remove(self, key: int) -> None:
        node = self.data[self.hashToIndex(key=key)]
        while node.next is not None:
            if node.next.key == key:
                node.next = node.next.next
                return
            node = node.next

    def contains(self, key: int) -> bool:
        node = self.data[self.hashToIndex(key=key)]
        while node.next is not None:
            node = node.next
            if node.key == key:
                return True
        return False

    # def __str__(self):
    #     output = ''
    #     for i in range(len(self.data)):
    #         node = self.data[i]
    #         if node.next is not None:
    #             output += str(i) + ': '
    #             while node is not None:
    #                 output += str(node.key)
    #                 if node.next is not None:
    #                     output += ' > '
    #                 node = node.next
    #             output += '\n'
    #     return output


# if __name__ == '__main__':
#     # Your MyHashSet object will be instantiated and called as such:
#     # obj = MyHashSet()
#     # obj.add(key)
#     # obj.remove(key)
#     # param_3 = obj.contains(key)
#     my_hashset = MyHashSet()
#     print(my_hashset.add(1))
#     print(my_hashset.add(2))
#     print(my_hashset.contains(1))
#     print(my_hashset.contains(3))
#     print(my_hashset.remove(10005))
#     print(my_hashset.add(80005))
#     print(my_hashset)
#     print(my_hashset.contains(10005))
#     print(my_hashset.contains(80005))