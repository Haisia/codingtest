package org.haisia.p1920;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < N; i++) {
      set.add(sc.nextInt());
    }

    int M = sc.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      if (set.contains(sc.nextInt())) {
        sb.append("1");
      } else {
        sb.append("0");
      }
      sb.append("\n");
    }
    System.out.println(sb);
  }
}
