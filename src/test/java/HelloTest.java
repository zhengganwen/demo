import com.study.demo.Singleton;
import org.junit.Test;

import java.util.Optional;

/**
 * @Description
 * @Author:Mr.Zheng
 * @Date:
 */
public class HelloTest {

    @Test
    public void hello(){
        int i =1;
       int  a = i++;
        System.out.println(a);
        System.out.println(i);
    }



    @Test
    public void test1(){

        Integer a = 12;
        Optional<Integer> a1 = Optional.of(a);
        System.out.println(a1.get());

    }






}
