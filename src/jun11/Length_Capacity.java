package jun11;

public class Length_Capacity {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java"); // Capacity = 16 + 4 = 20
        System.out.println("Length: " + sb.length());     // 4
        System.out.println("Capacity: " + sb.capacity()); // 20

        sb.append(" is awesome!"); // adds 12 more chars, total = 16
        System.out.println("Length: " + sb.length());     // 16
        System.out.println("Capacity: " + sb.capacity()); // Still 20 (enough space)

        sb.append(" And it is fast."); // Now total chars > 16+16 → capacity expands
        System.out.println("Length: " + sb.length());     // 32
        System.out.println("Capacity: " + sb.capacity()); // (20 * 2) + 2 = 42
    }
}
