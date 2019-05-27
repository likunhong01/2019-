package day12;

import java.util.Set;

public class no10ͼ�����·�� {
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
		
		// �浱ǰ״̬0�㵽���������̾���
		int[] dis = new int[]{0 ,m ,10,m ,30,100};
		
		
		// ѭ����v1�����е�����·��
		while (true) {
			// ������̵ı߿�ʼ
			int minindex = -1;
			int min = m;
			// �ҵ���ǰ������̵�һ�����ֵ���±�
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
				// ���minindex�㵽i�ɴ�
				if (graph[minindex][i] != m) {
					// �Ƚ�dis�ﵽ�����ľ��룬��ͨ��minindex�㵽�����ľ���
					dis[i] = Math.min(dis[i], min + graph[minindex][i]);
				}
			}
		}
		
		
		
	}
}
