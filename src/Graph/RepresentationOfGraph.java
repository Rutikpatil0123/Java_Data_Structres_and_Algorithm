package Graph;

import Oops.access.A;

import java.util.ArrayList;
import java.util.Scanner;

public class RepresentationOfGraph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");

        int n = sc.nextInt();

        System.out.println("Enter the number of edges : ");

        int m = sc.nextInt();

        //matrixRepresentation(n,m);
        listRepresentation(n,m);
    }

    public static void matrixRepresentation(int n, int m) {

        int[][] adj = new int[n + 1][n + 1];

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < n+1; j++){
                adj[i][j] = 0;
            }
        }

        Scanner sc = new Scanner(System.in);

        int u;
        int v;

        for (int i = 0; i < m; i++) {

            System.out.println("Enter the edge :");

            u = sc.nextInt();
            v = sc.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        printGraph(n,m,adj);

    }

    public static void printGraph(int n, int m, int [][] adj){

        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < n+1; j++){
                if(adj[i][j] == 1){
                    System.out.println("edge " + i + " -> " + j);
                }
            }
        }
    }

    public static void listRepresentation(int n, int m){

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < n+1 ;i++){
            list.add(new ArrayList<Integer>());
        }

        Scanner sc = new Scanner(System.in);

        int u;
        int v;

        for (int i = 0; i < m; i++) {

            System.out.println("Enter the edge :");

            u = sc.nextInt();
            v = sc.nextInt();

            list.get(u).add(v);
            list.get(v).add(u);
        }


        printListRepresentation(n,m,list);

    }

    public static void printListRepresentation(int n, int m, ArrayList<ArrayList<Integer>> list){

        for(int i = 0; i < n+155; i++){

            for(int j = 0; j < list.get(i).size(); j++){

                System.out.println("edge : " + i + " ->  " + list.get(i).get(j));
            }

        }
    }
}