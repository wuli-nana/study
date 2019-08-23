class largestPerimete  {
    public int largestPerimeter(int[] A) {
      if(A.length < 3){
        return 0;
      }
      Arrays.sort(A);
      for(int i = A.length - 2;i >= 1; i--){
        if(A[i - 1]+A[i] > A[i + 1]){
          int m =  A[i+1] + A[i] + A[ i -1];
          return m;
        }
      }
      return 0;  
    }
}