public class Frenemy {

    public int isPath(int n, String[] matrix, int start, int end, String path){
        return exploreRow(n, matrix, start, end, path, 0, 0);
    }

    private int exploreRow(int n, String[] matrix, int start, int end, String path, int pathIndex, int refNode){
       for (int friend = 0; friend < n; friend++){
           if (matrix[start].charAt(friend) == path.charAt(pathIndex) && refNode != friend) {
               pathIndex++;
               if (pathIndex == path.length() && friend == end) {
                   return 1;
               }
               int foundPath = exploreRow(n, matrix, friend, end, path, pathIndex, start);
               if (foundPath == 1){
                   return 1;
               }
               // decrease pathIndex because didn't find valid path and now backing up graph
               pathIndex--;
           }
       }
        return 0;
    }
}
