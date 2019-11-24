package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("server 1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("server 2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("server 3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("server 4");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("before groups");
    }
    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("after groups");
    }

}
