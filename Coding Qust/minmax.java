// public class minmax {
//     public static void main(String[] args) {
//         int[] array={10,1,23,43,98,100,45454,4};
//         int min=array[0];
//         int max=array[0];
//         for(int i=0;i<array.length;i++){
//             if(min>array[i]){
//                 min=array[i];
//             }
//             if(max<array[i]){
//                 max=array[i];
//             }
//         }
//         System.out.println("Max Value Element : "+max);
//         System.out.println("Min Value Element : "+min);

//     }
// }Big-O(n)
public class minmax {
    static class getMinMax {
        int min;
        int max;
    }

    static getMinMax getMinMaxFunc(int[] array) {
        getMinMax obj = new getMinMax();

        if (array.length == 1) {
            obj.min = array[0];
            obj.max = array[0];
            return obj;
        }

        if (array[0] > array[1]) {
            obj.min = array[1];
            obj.max = array[0];
        } else {
            obj.min = array[0];
            obj.max = array[1];
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] < obj.min) {
                obj.min = array[i];
            } else if (array[i] > obj.max) {
                obj.max = array[i];
            }
        }

        return obj;

    }

    public static void main(String[] args) {
        int[] array = { 10, 1, 23, 43, 98, 100, 45454, 4 };
        getMinMax object = getMinMaxFunc(array);
        System.out.println("Max Value Element : " + object.max);
        System.out.println("Min Value Element : " + object.min);
    }
}
//Time Big-O (n)