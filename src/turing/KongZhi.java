package turing;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


/**
 * @author Administrator
 * @version 1.0
 * @created 19-ÈýÔÂ-2021 10:03:50
 */
public class KongZhi {

	public ShiKuai sk;
	public LuoKuai lk;
	
	public KongZhi() {	}

	public void finalize() throws Throwable {

	}

	public void chuShiHua(){
		sk = new ShiKuai();
		
		lk = new LuoKuai();
	}

	public void dingShi(){
		if (lk.xiaDang(sk) || lk.xiaChu()) {
			sk.heBing(lk);
			
			sk.xiaoHang();
			
			if (sk.siMa()) {
				System.out.println("Game Over");
				
				System.exit(0);
			} else {
				lk = new LuoKuai();
			}
		} else {
			lk.xiaYi();
		}
	}

	public void xiaCZ(){
		if (lk.xiaDang(sk))   return;
		
		if (lk.xiaChu())   return;
		
		lk.xiaYi();
	}

	/**
	 * 
	 * @param g
	 */
	public void xianShi(Graphics g){
		// ±³¾°ÏÔÊ¾
		Image  tu=(new ImageIcon("¶íÂÞË¹Í¼Æ¬/±³¾°.png")).getImage();	//Â·¾¶£ºÍ¼Æ¬-ÓÒ¼ü-ÊôÐÔ-Â·¾¶src/	
		g.drawImage(tu,0,0,null);	
		// Âä¿éÏÔÊ¾
		lk.xianShi(g);
		
		//Êµ¿éÏÔÊ¾
		sk.xianShi(g);
		
	}

	public void youCZ(){
		if (lk.youDang(sk))   return;
		
		if (lk.youChu())   return;
		
		lk.youYi();
	}

	public void zhuanCZ(){
		if (lk.zhuanDang(sk))   return;
		
		if (lk.zhuanChu())   return;
		
		lk.zhuan();
	}

	public void zuoCZ(){
		if (lk.zuoDang(sk))   return;
		
		if (lk.zuoChu())   return;
		
		lk.zuoYi();
	}

}