public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); 
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0 ){
            return -1;
        }
        double areaNeeded = width * height;
        int totalBucketsNeeded = (int) Math.ceil(areaNeeded/areaPerBucket);

        return totalBucketsNeeded - extraBuckets;
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        return (int) Math.ceil(area/areaPerBucket);
    }
}

