package data;

/**
 * @author giao.lang | fb/giao.lang.bis | youtube/channel/UChsPO5CLUjOWfgwjfC2Y-Wg
 * version 21.06
 */

//phát hiện 1 điều thú vị: HV IS A (KIND OF), A SPECIAL CASE, A VERSION OF
//                                 HCN
//nói ngắn gọn: HV là HCN, luôn đúng, đọc 1 chiều thoy hen
//                 dư sức tham dự vào mảng HCN
//độ lại 1 Khuôn mới từ Khuôn cũ, mới có đc câu HV là phiên bản mới
//                                từ HCN
//HV là HCN, KHUÔN HV rõ ràng là 1 dạng KHUÔN HCN
//V, CN CÙNG NHÀ, CHUNG MẢNG, FOR SẮP XẾP ĐC
//cách tiếp cận sự tương đồng giữa các Khuôn, kế thừa dùng lại
//                                       INHERIT/INHERITANCE
//viết theo cách cũ: 2 Khuôn độc lập, ko chung mảng
//               kế thừa: 2 anh em chung 1 nhà
//kế thừa chỉ dành cho gần gũi người nhà, series phiên bản
//HCN gọi tên là class CHA, parent, super, base, phiên bản gốc
//HV                   CON, child,  sub  , derived
//HV là HCN, cho nên HV sẽ có tất cả mọi thứ mà HCN có, ko cần viết lại code
//HV là HCN, nó phải hành xử như HCN, hàm xài lại luôn
//KẾ THỪA O PHẢI LÀ COPY/PASTE NHƯ HỒI NÃY, ĐÂY LÀ CÁCH LƯỜI GÕ CODE
//KẾ THỪA LÀ XÀI LẠI 100% O CẦN GÕ LẠI CODE - ĐÚNG NGOÀI ĐỜI LUÔN

//1!!!!!! Khi chơi với kế thừa, phải tôn trọng phễu gốc của Con
//Vuông trước khi chơi với Rectangle, V vẫn là V, phễu có 3 tham số
//để đúc 1 V: owner, color, edge
//phễu V vẫn cần, Khuôn cần có phễu nhận vật liệu
//                phễu chảy thẳng lên CN, vì V là CN
//                dữ liệu của V chính là dữ liệu CN
//TÔN TRỌNG CST CỦA CON, ĐỘ LẠI 1 TÍ PHỄU CON


//2!!!!!! Nhân tử chung

//3!!!!!!

public class Square extends Rectangle {
    
    //HV là HCN, o cần làm lại những gì CN đã làm, o cần field, HCN có rồi
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        //DUNG HÒA CHA CON, ĐỌC HAY LĂM LUÔN
        //HV CÓ CẠNH EDGE CHÍNH LÀ HCN CÓ CẠNH EDGE, EDGE
        
    }   //super chính là ~~~~ new Rectangle(o, c, w, l);
    //          đẩy/đổ vật liệu cho Cha giữ giùm, vì ko cần làm lại 
    //new Square() -> cắt HV, tạo HV
    //                             chính là cắt HCN
    //  new Square() chính là new HCN(), cắt HV, chính là cắt HCN
    
    //Con có hàm trùng tên 100% với hàm Cha
    //Con qua mặt Cha, phủ quyết, vờ như ko thấy hàm Cha
    //đặc trưng cho 1 thứ gọi là tính đa hình đa xạ đa ánh xa đa nhân cách
    //50 sắc thái, transformer, POLYMORPHISM
    @Override
    public void paint() {        //90 x 90  8100.00
        System.out.printf("|SQUARE    |%-15s|%10s|%4.1f| -  |%7.2f|\n",
                              owner, color, width, getArea());
        
    }                                       //99.9
    
}
