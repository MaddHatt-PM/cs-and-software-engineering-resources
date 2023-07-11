from typing import List


class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if len(flowerbed) == 1:
            return n == 0 or flowerbed[0] != n

        for i in range(len(flowerbed)):
            if i == 0:
                if flowerbed[i] == 0 and flowerbed[i+1] == 0:
                    n -= 1
                    flowerbed[i] = 1

            elif i == len(flowerbed) - 1:
                if flowerbed[i-1] == 0 and flowerbed[i] == 0:
                    n -= 1
                    flowerbed[i] = 1

            else:
                if flowerbed[i-1] == 0 and flowerbed[i] == 0 and flowerbed[i+1] == 0:
                    n -= 1
                    flowerbed[i] = 1

        return n <= 0


if __name__ == '__main__':
    print(Solution().canPlaceFlowers([0], 1))