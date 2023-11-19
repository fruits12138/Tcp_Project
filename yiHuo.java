import java.util.ArrayList;
public class yiHuo {
    private int a[];
    private int b[];
    public yiHuo(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }
    public void yihuo(){
        ArrayList c = new ArrayList();
        ArrayList d = new ArrayList();

       int k=0;
       int l=0;

        for(int i=0;i<this.a.length;i++){
            for(int j=0;j<this.b.length;j++){
                if(this.a[i]==this.b[j]){
                    c.add(this.a[i]);
                }
            }
        }

        int flag=1;
        for(int i=0;i<this.a.length;i++) {
            flag=1;

            for(int j=0;j<c.size();j++){
                if(this.a[i]==(int)c.get(j)){
                   flag=0;
                }
            }
            if(flag==1){
                d.add(this.a[i]);
            }
        }
        flag=1;
        for(int i=0;i<this.b.length;i++) {
            flag=1;

            for(int j=0;j< c.size();j++){
                if(this.b[i]==(int)c.get(j)){
                   flag=0;
                }
            }
            if(flag==1){
                d.add(this.b[i]);
            }
        }
        int[] arr=new int[d.size()];
        for(int j=0;j<d.size();j++){
            arr[j]=(int)d.get(j);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
