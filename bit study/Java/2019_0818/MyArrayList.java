public class MyArrayList implements List{
    //顺序表以数组的形式进行存放
     private int[] array = null;
    //长度
    private int size = 0;
    /**
     * 尾插
     * @param element 数值
     * @return 插入成功 true， 否则失败 false
     */
    @Override
    public boolean add(int element) {
        return add(size,element);
    }

    /**
     * 插入函数
     * @param index 插入下标值
     * @param element 数值
     * @return true 成功 false 失败
     */
    @Override
    public boolean add(int index, int element) {
        //进行下表性检验
        if( index < 0 || index > size){
            System.out.println("插入位置不合法，请重新输入");
            return false;
        }
        System.arraycopy(array,index,array,size+1,size-index);
        return false;
    }

    /**
     *
     * @param index
     * @return
     */

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int set(int index, int val) {
        return 0;
    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
