package cn.itcast.domain;

import java.util.Date;

public class Items {
   private Integer  id  ;//int(10)       (NULL)           NO      PRI     (NULL)   auto_increment  select,insert,update,references
   private String  name ;//varchar(20)   utf8_general_ci  YES             (NULL)                   select,insert,update,references
   private Double  price ;//float(10,0)   (NULL)           YES             (NULL)                   select,insert,update,references
   private String  pic ;//varchar(40)   utf8_general_ci  YES             (NULL)                   select,insert,update,references
   private Date createtime ;//datetime      (NULL)           YES             (NULL)                   select,insert,update,references
   private String  detail ;//varchar(200)  utf8_general_ci  YES

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
