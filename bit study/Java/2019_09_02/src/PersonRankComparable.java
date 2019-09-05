public class  PersonRankComparable implements Comparable<Person>{
    @Override
    public int compareTo( Person o){
        if(o.age < 0){
            return -1;
        }else if(o.age > 0){
            return 1;
        }
        return 0;
    }
}