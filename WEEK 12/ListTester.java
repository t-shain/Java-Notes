public class ListTester {
  public static void main(String arg[]) {
    
    ListInterface<Integer> nums = new ListArrayBased<>();
    
    nums.add(1, 10);
    nums.add(2, 11);
    nums.add(1, 40);
    nums.add(3, 30);
    System.out.println(nums);
    
    nums.remove(2);
    System.out.println(nums);
  
  }
}
