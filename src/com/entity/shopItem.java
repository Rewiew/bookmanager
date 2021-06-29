package com.entity;

public class shopItem {
    private Integer id;
	private String shangpinbianhao;
	private String shangpinmingcheng;
	private String leixing;
	private String pinpai;
	private String xiaoliang;
	private String kucun;
	private String jiage;
	private String tupian;
	private String shangpinjianjie;
	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getShangpinbianhao() {
        return shangpinbianhao;
    }
    public void setShangpinbianhao(String shangpinbianhao) {
        this.shangpinbianhao = shangpinbianhao == null ? null : shangpinbianhao.trim();
    }
	public String getShangpinmingcheng() {
        return shangpinmingcheng;
    }
    public void setShangpinmingcheng(String shangpinmingcheng) {
        this.shangpinmingcheng = shangpinmingcheng == null ? null : shangpinmingcheng.trim();
    }
	public String getLeixing() {
        return leixing;
    }
    public void setLeixing(String leixing) {
        this.leixing = leixing == null ? null : leixing.trim();
    }
	public String getPinpai() {
        return pinpai;
    }
    public void setPinpai(String pinpai) {
        this.pinpai = pinpai == null ? null : pinpai.trim();
    }
	public String getXiaoliang() {
        return xiaoliang;
    }
    public void setXiaoliang(String xiaoliang) {
        this.xiaoliang = xiaoliang == null ? null : xiaoliang.trim();
    }
	public String getKucun() {
        return kucun;
    }
    public void setKucun(String kucun) {
        this.kucun = kucun == null ? null : kucun.trim();
    }
	public String getJiage() {
        return jiage;
    }
    public void setJiage(String jiage) {
        this.jiage = jiage == null ? null : jiage.trim();
    }
	public String getTupian() {
        return tupian;
    }
    public void setTupian(String tupian) {
        this.tupian = tupian == null ? null : tupian.trim();
    }
	public String getShangpinjianjie() {
        return shangpinjianjie;
    }
    public void setShangpinjianjie(String shangpinjianjie) {
        this.shangpinjianjie = shangpinjianjie == null ? null : shangpinjianjie.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
