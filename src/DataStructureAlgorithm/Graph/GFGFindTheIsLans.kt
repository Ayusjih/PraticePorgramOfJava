package DataStructureAlgorithm.Graph

class GFGFindTheIsLans {
    class Pair {
        int row;
        int col;
        Pair(int row, int col)
        {

            this.row = row;
            this.col = col;
        }

    }

    class Solution {

        public void bfs(int row, int col, int[][]vis, char[][] grid)
        {
            Queue<Pair>q = new LinkedList<>();
            q.add(new Pair(row, col));
            vis[row][col] = 1;
            int n = grid.length;
            int m = grid[0].length;

            while (!q.isEmpty())
            {
                Pair curr = q.poll();
                int r = curr.row; int c = curr.col;
                for (int i = -1; i<2; i++)
                {
                    for (int j = -1; j<2; j++)
                    { int newRow = r + i;
                        int newCol = c + j;

                        if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && vis[newRow][newCol] == 0 && grid[newRow][newCol] == 'L')
                        {
                            vis[newRow][newCol] = 1;
                            q.add(new Pair(newRow, newCol));
                        }

                    }

                }

            }

        }

        public int countIslands(char[][] grid) {

            int n = grid.length;
            int m = grid[0].length;
            int [] [] vis = new int[n][m];
            int count = 0;

            for (int i = 0; i<n; i++)
            {
                for (int j = 0; j<m; j++)
                {
                    if (vis[i][j] == 0 && grid[i][j] == 'L')
                    {
                        count++;
                        bfs(i, j, vis, grid);
                    }
                }
            }
            return count;

        }
    }

}