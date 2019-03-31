package me.qping.learning.util.tree;

/**
 * @ClassName Tree
 * @Description 树
 * @Author qping
 * @Date 2018/8/14 09:36
 * @Version 1.0
 **/
public interface Tree {

    public Tree find(Object key);

    public boolean insert(Object key);

    public boolean delete(Object key);

}
