package barcode;

public class BarcodeSaveToDB implements BarcodeSaveService {
    
    public BarcodeSaveToDB(){
        //连接数据库
    }
    
    @Override
    public void save(String barcode) {
        System.out.println("条形码输出了：" + barcode);
        //把条码保存到数据库
    }

    @Override
    public void finish() {
        //关闭数据库连接
    }


}
