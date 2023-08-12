from typing import List


class Solution:
    def uniquePathsWithObstacles(self, obs: List[List[int]]) -> int:
        m = len(obs)
        n = len(obs[0])

        '''
        Obstacle on start wrote
        '''
        if obs[0][0] == 1: return 0

        obs[0][0] = 1

        '''
        Initialize valid/blocked paths of 0-indexed rows and columns
        '''
        for c in range(1, m):
            obs[c][0] = int(obs[c][0] == 0 and obs[c-1][0] == 1)
        
        for r in range(1, n):
            obs[0][r] = int(obs[0][r] == 0 and obs[0][r-1] == 1)

        '''
        0: Unexplored tiles
        1 & Unexplored: Obstacle
        1 & Explored: Traversed path
        '''
        for c in range(1, m):
            for r in range(1, n):
                if obs[c][r] == 0:
                    obs[c][r] = obs[c-1][r] + obs[c][r-1]
                else:
                    obs[c][r] = 0

        return obs[-1][-1]