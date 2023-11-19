//举例(结合类的使用)：
//        定义一个People类




//自定义异常类：


 
//在主方法中使用年龄输入：
public class First {
    public static void main(String args[]) {

        People wang=new People(),
                zhang=new People();

        try{
            wang.setAge(180);
            System.out.println(wang.getAge());

        }
        catch(IntegerException e) {

            System.out.println(e.toString());
        }

        try {

            zhang.setAge(37);
            System.out.println(zhang.getAge());
        }
        catch(IntegerException e) {

            System.out.println(e.toString());
        }
    }
}