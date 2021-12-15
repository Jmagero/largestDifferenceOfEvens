public static int largestDifferenceOfEvens(int[] a){
    int largestValue;
    int minValue = 0, maxValue = 0, evenCount = 0;
    for(int i = 0; i < a.length; i++){
      if(a[i] % 2 == 0){
        if(evenCount == 0){
          minValue = a[i];
          maxValue = a[i];
        }
        evenCount++;
        if(a[i] < minValue){
          minValue = a[i];
        }
        if(a[i] > maxValue){
          maxValue = a[i];
        }        
      }
    }

    if(evenCount < 2){
      return -1;
    }

    largestValue = maxValue - minValue;
    return largestValue;

  }
}
