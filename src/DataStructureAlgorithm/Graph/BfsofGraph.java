package DataStructureAlgorithm.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BfsofGraph {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();
        boolean[] vis = new boolean[v];
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        vis[0]=true;
        q.add(0);

        while(!q.isEmpty())
        {
            int curr = q.poll();
            list.add(curr);


            int size = adj.get(curr).size();
            for(int i=0;i<size;i++)
            {   int ele = adj.get(curr).get(i);
                if(vis[ele]==false)
                {
                    vis[ele] = true;
                    q.add(ele);
                }
            }


        }
        return list;


    }
}