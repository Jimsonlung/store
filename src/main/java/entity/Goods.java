package main.java.entity;

/**
 * 商品类
 *
 */
public class Goods {
    private String id;
    private String name;
    private GoodsType goodsTypeId;
    private String descript;    //商品详情
    private String image;   //图片路径
    private String price;   //价格

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GoodsType getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(GoodsType goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
