package com.entity;

public class Deposit {
    private Integer id;
	private String dingdanhao;
	private String dingdanjine;
	private String dingdanneirong;
	private String yonghuming;
	private String xingming;
	private String shouji;
	private String dizhi;
	private String beizhu;
	private String issh;
	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getDingdanhao() {
        return dingdanhao;
    }
    public void setDingdanhao(String dingdanhao) {
        this.dingdanhao = dingdanhao == null ? null : dingdanhao.trim();
    }
	public String getDingdanjine() {
        return dingdanjine;
    }
    public void setDingdanjine(String dingdanjine) {
        this.dingdanjine = dingdanjine == null ? null : dingdanjine.trim();
    }
	public String getDingdanneirong() {
        return dingdanneirong;
    }
    public void setDingdanneirong(String dingdanneirong) {
        this.dingdanneirong = dingdanneirong == null ? null : dingdanneirong.trim();
    }
	public String getYonghuming() {
        return yonghuming;
    }
    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming == null ? null : yonghuming.trim();
    }
	public String getXingming() {
        return xingming;
    }
    public void setXingming(String xingming) {
        this.xingming = xingming == null ? null : xingming.trim();
    }
	public String getShouji() {
        return shouji;
    }
    public void setShouji(String shouji) {
        this.shouji = shouji == null ? null : shouji.trim();
    }
	public String getDizhi() {
        return dizhi;
    }
    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }
	public String getBeizhu() {
        return beizhu;
    }
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
	public String getIssh() {
        return issh;
    }
    public void setIssh(String issh) {
        this.issh = issh == null ? null : issh.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   ??????????????????
