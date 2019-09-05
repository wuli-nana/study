import java.util.List;

public class MyArrayList<E> implements List<E> {
    //                  形参                 实参
    private  E[] array;
    private  int size;
    //压制性警告
    @SuppressWarnings("unchecked")
    public MyArrayList(){

        //array = new E[100]   不行的 ，E被擦除为Object类，无法直接被定义为泛型数组
        //了解： 1.泛型无法定义泛型数组
        //压制类型的警告注解

        array = (E[])new Object[100];
        size = 0;
    }

    public void add (E element){
        array[size++] = element;
    }
    public void remove (){
        array[--size] = null;
        //size--;这种写法会引发内存泄漏
        //原本语义上应该死去的对象
        //因为写法问题，到最后没有被GC回收
    }
}
