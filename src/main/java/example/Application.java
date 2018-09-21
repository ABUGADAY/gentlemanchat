package example;

import com.blade.Blade;

/**
 * @Auther: Fengld
 * @Date: 2018/9/21 18:08
 * @Description:
 */
public class Application {
    public static void main(String... args){
        Blade blade = Blade.of();
        blade.start(Application.class,args);
//        Blade.of().get("/", ctx -> ctx.text("Hello World!")).start(Application.class, args);

    }
}
