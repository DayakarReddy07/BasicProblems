public class AddComplexNum {
    int real,image;
    public AddComplexNum(int r,int i){
        this.real = r;
        this.image = i;
    }
    public void showC(){
        System.out.println(this.real + "+i" + this.image);
    }
    // Function for addition
    public static AddComplexNum add(AddComplexNum n1,AddComplexNum n2){
        AddComplexNum res = new AddComplexNum(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }


    public static void main(String[] args) {
        AddComplexNum c1 = new AddComplexNum(3, 5);
        AddComplexNum c2 = new AddComplexNum(5, 6);
        System.out.print("first complex number : ");
        c1.showC();
        System.out.print("\n Second complex number : ");
        c2.showC();
        AddComplexNum res = add(c1,c2);
        System.out.println("The addition is : ");
        res.showC();
    }
}
