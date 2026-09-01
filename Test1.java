public class Test1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.ensureCapacity(50);

        System.out.println(sb.capacity());
    }
}

