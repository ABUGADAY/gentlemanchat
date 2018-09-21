package example.controller;

import com.blade.mvc.annotation.*;

/**
 * @Auther: Fengld
 * @Date: 2018/9/21 18:17
 * @Description:
 */
@Path
public class IndexController {
    @GetRoute("")
    public String index0() {
        return "index.html";
    }

    @GetRoute("/")
    public String index() {
        return "index.html";
    }

    @PostRoute("/save")
    public void saveUser(@Param String username) {
        System.out.println("username:" + username);
    }

    @PutRoute("/update")
    public void updateUser(@Param String username) {
        System.out.println("username:" + username);
    }

    @DeleteRoute("/delete/:uid")
    public void updateUser(@PathParam Integer uid) {
        System.out.println("delete user:" + uid);
    }

}
