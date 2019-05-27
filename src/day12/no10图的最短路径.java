package day12;

import java.util.Set;

public class no10图的最短路径 {
	public static void main(String[] args) {
		int m = Integer.MAX_VALUE;
		int[][] graph = new int[][] {
			{0 ,m ,10,m ,30,100},
			{m ,0 ,5 ,m ,m ,m  },
			{10,5 ,0 ,50,m ,m  },
			{m ,m ,5 ,0 ,20,10 },
			{30,m ,m ,20,0 ,60 },
			{100,m,m ,10,60,0  }
		};
		
		boolean[] isVisted = new boolean[6];
		isVisted[0] = true;
		
		// 存当前状态0点到各个点的最短距离
		int[] dis = new int[]{0 ,m ,10,m ,30,100};
		
		
		// 循环求v1到所有点的最短路径
		while (true) {
			// 先找最短的边开始
			int minindex = -1;
			int min = m;
			// 找到当前距离最短的一个点的值和下标
			for (int i = 0; i < dis.length; i++) {
				if (isVisted[i]) {
					continue;
				}
				if (dis[i] < min) {
					min = dis[i];
					minindex = i;
				}
			}
			
			if (minindex == -1) {
				break;
			}
			
			isVisted[minindex] = true;
			for (int i = 0; i < 6; i++) {
				// 如果minindex点到i可达
				if (graph[minindex][i] != m) {
					// 比较dis里到达各点的距离，和通过minindex点到达各点的距离
					dis[i] = Math.min(dis[i], min + graph[minindex][i]);
				}
			}
		}
		
		
		
	}
}
