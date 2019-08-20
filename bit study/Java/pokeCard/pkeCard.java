public class pkeCard {
    public int value;
    public String color;
    public pkeCard(int value, String color){
        this.value = value;
        this.color = color;
    }
    @Override
    public String toString(){
        return String.format("[%d,%s]",value,color);
    }
    @Override
    public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        //该对象是否能构造被该对象的类型所引用
        // object对象类型是不是pkeCard 类型的小类型

        if(!(obj instanceof  pkeCard)){
            return false;
        }
        pkeCard other = (pkeCard)obj;
        return this.value ==other.value
                && this.color.equals(other.color);
    }

}
