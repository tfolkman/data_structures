import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenemyTest {

    @Test
    public void test_frenemy_input4(){

        int n = 3;
        String[] graph = new String[n];
        graph[0] = "-FE";
        graph[1] = "F-F";
        graph[2] = "EF-";
        int start = 0;
        int end = 2;
        String path = "FF";

        Frenemy frenemy = new Frenemy();
        int isPath = frenemy.isPath(n, graph, start, end, path);

        assertEquals(isPath, 1);
    }

    @Test
    public void test_frenemy_input7(){

        int n = 5;
        String[] graph = new String[n];
        graph[0] = "-EFEF";
        graph[1] = "E-FF-";
        graph[2] = "FF-EF";
        graph[3] = "EFE-F";
        graph[4] = "F-FF-";
        int start = 0;
        int end = 4;
        String path = "FFEEE";

        Frenemy frenemy = new Frenemy();
        int isPath = frenemy.isPath(n, graph, start, end, path);

        assertEquals(isPath, 0);
    }
}