class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        row=len(grid)
        col=len(grid[0])
        def islands(row,col):
            if(row<0 or row>=len(grid) or col<0 or col>=len(grid[0]) or grid[row][col]=='0'):
                return 0
            grid[row][col]="0"
            islands(row,col-1)
            islands(row-1,col)
            islands(row,col+1)
            islands(row+1,col)
        count=0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j]=="1":
                    count=count+1
                    islands(i,j)
        return (count)

        