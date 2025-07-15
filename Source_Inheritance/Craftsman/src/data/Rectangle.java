package data;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

//OOP: Object Oriented Programming/Paradigm
public class Rectangle {
    private String owner; //_____
    private String color; //_____
    private double width; //__5___
    private double length;//__10___
    //private double area;  //__30___ = width * length 
    //area đc tính toán bởi đặc tính khác, area -> derived attribute/field
    //                                     đặc điểm/đặc tính dẫn xuất
    //sl * dg = tt
    //age = current year(2021) - yob
    //chơi với field dẫn xuất, coi chừng tính bất đồng bộ, inconsistency
    //dữ liệu ko nhất quán: đổ qua phễu w 5, l 10, area = 300
    //ko chơi đổ từ phễu, ghi area = w * l; lúc khai báo, tự tin chưa
    //nhưng nếu tao setW(cạnh mới)
    //mà quên cập nhật lại S, toang
    
    //bản chất: area là liên quan tính toán, ko có sẵn
    //       tức nó là hàm xử lí data, vậy hàm phải thuộc về object phù hợp
    //việc tính S() là hàm của HCN hoàn toàn hợp lí: ai có nhiều info...
    
    //nếu ta xem S là đặc điểm của miếng đất hoặc HCN, ko sai nhưng...

    public Rectangle(String owner, String color, double width, double length) { //area  
        this.owner = owner;                                              //kiểm tra tương tích w * l
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner=" + owner + ", color=" + color + ", width=" + width + ", length=" + length + '}';
    }
    
    //hàm soái ca loại 4, reuse ở các lệnh khác
    public double getArea() {
        return width * length;
    }
    
    public void paint() {        //90 x 90  8100.00
        System.out.printf("|RECTANGLE |%-15s|%10s|%4.1f|%4.1f|%7.2f|\n",
                              owner, color, width, length, getArea());
    }                                       //99.9
    
}
