import com.blade.Blade;

/**
 * @Auther: Fengld
 * @Date: 2018/9/21 18:00
 * @Description:
 */
public class Test {
    public static void main(String... args){
        Blade.of().get("/",ctx -> ctx.text("Hello BieZhi")).start();
    }
}
