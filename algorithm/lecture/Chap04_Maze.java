package com.algorithm.lecture;

public class Chap04_Maze {


        /*
          미로찾기(Decision Problem)\ => 답이 yes or no 인 문제풀이 방법

          boolean fondPath(x, y){

            if (x,y) is the exit :: 가 출구라면;
                return true; yes , 출구가 있다고 출력한다.
            else {
                    for each neighbouring cell (x', y') of (x, y) do :: x,y와 인접한 셀들 각각 (x', y') 에 대해
                        if ( x' ,y') is on the pathway :: (x', y')가 뚤려있다면(이동가능하다면)
                            if findPath(x', y')  :: findPath 순환 함수 반복
                                    return true;
                return false;
            }
          }

          but Decision Problem 은 무한루프에 빠지기 쉬운 문제.
          따라서 이 문제를 풀 때에는 베이스 케이스를 설정하고, 수렴하도록 설정해야 한다.
        */


        /*
          미로찾기(Decision Problem) => 답이 yes or no 인 문제풀이 방법
          만약 x, y 와 인접한 셀이 x', y' 가 서로 계속해서 자리만 바꾼다면, 무한루프에 빠진다.
          따라서 위의 함수는 에러다.
          올바른 함수로 수정한다면 아래와 같을 것이다.

          boolean fondPath(x, y){

            if (x,y) is the exit :: 가 출구라면;
                return true; yes , 출구가 있다고 출력한다.
            else {
                mark(x,y) as a visited cell :: (x,y) 셀에는 마크를 설정한다.
                for each neighbouring cell (x', y') of (x, y) do :: x,y와 인접한 셀들 각각 (x', y') 에 대해
                        if ( x' ,y') is on the pathway and not visited: (x', y')가 뚤려있다면(이동가능하다면) 또한 마크가 없다면!!
                            if findPath(x', y')  :: findPath 순환 함수 반복
                                    return true;
                return false;
            }
          }
        */

        /*
          미로찾기(Decision Problem)\ => 답이 yes or no 인 문제풀이 방법

          boolean fondPath(x, y){
            if (x,y) ts either on the wall or a visited cell :: x,y가 벽이거나, 마크되어있다면
                return false;
            if (x,y) is the exit :: 가 출구라면;
                return true; yes , 출구가 있다고 출력한다.
            else {
                mark(x,y) as a visited cell :: (x,y) 셀에는 마크를 설정한다.
                for each neighbouring cell (x', y') of (x, y) do :: x,y와 인접한 셀들 각각 (x', y') 에 대해
                        if findPath(x', y')  :: findPath 순환 함수 반복 // 만약 x'y'가 벽이면, 다음 함수에서 차단될 것이기 때문.
                            return true;
                return false;
            }
          }


        */

    private static int N = 8;
    private static int[][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };

    private static final int path_Way = 0;
    private static final int wall_Way = 1;
    private static final int blodked_Way = 2; // 방문했었는데, 최종적으로 꽝이 나온 길
    private static final int path_Colour = 3; // 방문했는데 아직 꽝인지 아닌지는 모르는 길

    public static boolean findMazePath(int[][] maze, int x, int y) {
        if (x < 0 || y < 0 || x >= 8 || y >= 8) // 미로의 범위에서 벗어났는지 아닌지를 판별.
            return false;
        else if (maze[x][y] != path_Way)
            return false;
        else if (x == N - 1 && y == N - 1) {
            maze[x][y] = path_Colour; // 마크를 하는 것
        return true;
        } else {
            maze[x][y] = path_Colour;
            if (findMazePath(maze,x-1,y) || findMazePath(maze,x+1,y) || findMazePath(maze,x,y+1) || findMazePath(maze,x,y-1))
                return true;
        }
            maze[x][y] = blodked_Way;
            return false;
    }

    public static void main(String[] args) {

        System.out.println(findMazePath(maze,0,0));

    }
}

