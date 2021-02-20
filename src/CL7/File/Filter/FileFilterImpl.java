package CL7.File.Filter;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Promise
 * @create 2019-08-15-16:33
 */
//创建过滤器FileFilter的实现类，重写过滤方法accept,定义过滤规则
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        //过滤规则：以.java结尾返回true，否则返回false
        //如果pathname为文件夹，也返回true,继续遍历文件夹
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getAbsolutePath().toLowerCase().endsWith(".java");
    }
}
