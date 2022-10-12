package com.sde.algo;

class ArrayProblem {
    public static void main(String[] args) {
        //int = {-1,-1,0,1,1}
        int arr[] = {-1,-1,0,1,1};

        int len = arr.length;
        float floats[] = new float[0];
        int next = 0;
        for (int i= next ; i< len ; i++) {
            int count = 0;
            boolean flag = false;
            for (int j = i; j<len; j ++) {
                if (arr[i] == arr[j]) {
                    count ++;
                    next = j;
                }
            }

            int floatArrLen = floats.length;
            float [] temp = floats;
            floats = new float[floatArrLen + 1];
            if (temp.length > 0 )
                floats = temp;

            floats[floatArrLen] = count / len;
            if (!flag)
               next = next + 1;
        }
        System.out.println("Hello");
    }
}
