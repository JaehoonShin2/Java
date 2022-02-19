package com.algorithm.lecture;

public class Chap06_N_QueensProblem {

//         m*n의 크기의 체스판이 있다.
//         그리고 n개의 말을 체스판에 놓을 것이다.
//         n개의 말이 놓일 좌표 (x, y) 를 기준으로 가로, 세로, 대각선 그 어떤 방향에도
//         또다른 말이 존재하면 안된다.
//
//
//         backtracking(되추적 기법) : 내가 지나온 트랙, 궤적을 뒤로 돌아가서  번복하고 다시 시도하는 것.
//         ...? 후입선출.. 스택 구조?
//
//         상태공간트리! 깊이우선탐색!
//         상태공간트리란 찾는 해를 포함하는 트리
//         즉 해가 존재한다면 그것은 반드시 이 트리의 어떤 한 노드에 해당함
//         따라서 이 트리를 체계적을 탐색하면 해를 구할 수 있음.
//         다만 상태공간트리의 모든 노드를 탐색해야 하는 것은 아님.
//         가능성이 막힌 선택지는 infeasible, 꽝이다 라고 표현한다.
//         그리고 infeasible 인 노드는 다음 스탭으로 나갈 필요가 없다.
//
//         recursion 을 사용하는 방법이 1;
//         stack 자료구조를 사용하는 것이 2;
//
//
           /*
           int[] cols = new int [N+1] == 매개변수 level 행의  cols[i] 번째 노드에 위치해있다. (level, cols[i]) 좌표.
           return-type queens ( arguments == int level // 트리 상 몇 번째 단계의 노드인지(몇번째 행인지 ) {
                if (non-promising) {
                    // 꽝이라면
                    report failure and return;
                } else if (success) {
                    report answer and return;
                } else {
                    visit children recursively;
                }
            }
           */

//    static int level = 8;
    static int N = 4;
    static int[] cols = new int [N+1];

    public static void main(String[] args) {

        queens(0);

    }

    static boolean queens(int level) {

        if (!promising(level)) {
            // primising 이라 함은 가로, 세로, 대각으로 겹침이 있는지 없는지를 확인하는 것.
            // 그런데 이러한 겹침은 모든 구간에서 이루어질 필요는 없다.
            // 즉 level(행의 값)이 N(열의 값)과 같아졌을 때!
            // 즉 트리의 가장 아랫단계에 다다랐을 때, 가장 마지막 행에 다다랐을 때
            // 그 때 1 ~ (level-1) 값들과
            // level=N 인 것 사이의 겹침이 있는지아닌지를 판별하면 된다.
            return false;
        } else if (level == N) {
            for (int i = 1; i <= N; i++) {
                System.out.println("(" + i + ", " + cols[i] +  ")");
            }
            return true;
        }
        for (int i = 1; i <= N; i++) {
                cols[level+1] = i;
                if (queens(level + 1)) {
                    return true;
                }
        }
        return false;
    }

    static boolean promising(int level) {
        for (int i = 1; i < level; i++) {
            if (cols[i] == cols[level]) {
                return false;
            } else if ( level-i == Math.abs(cols[level]-cols[i])) {
                return false;
            }
        }
        return true;
    }
 }
