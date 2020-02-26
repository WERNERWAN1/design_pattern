package yuefanke.cn.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:WanChun
 * @date: 2020/2/26-17:34
 * @description:
 */
public class Product {

    List<String> parts=new ArrayList<>();

    /**
     * 添加部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 展示
     */
    public void show(){
        if(parts.size()>0){
            for(String part:parts){
                System.out.println(part);
            }
        }
    }
}
