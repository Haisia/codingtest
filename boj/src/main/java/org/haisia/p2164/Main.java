package org.haisia.p2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    for (int i = 1; i <= N; i++) {
      q.offer(i);
    }

    while (q.size() > 1) {
      q.poll();
      if (q.size() == 1) break;
      q.offer(q.poll());
    }
    System.out.println(q.poll());
  }
}
