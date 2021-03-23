package turing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


/**
 * @author Administrator
 * @version 1.0
 * @created 19-三月-2021 10:03:50
 */
public class KongZhi {

	private ShiKuai sk;
	private LuoKuai lk;
	private static int score = 0;
	private final Font ft = new Font("华文新魏", Font.BOLD, 20);
	
	public KongZhi() {	}

	public void finalize() throws Throwable {

	}

	public void chuShiHua(){
		sk = new ShiKuai();
		
		lk = new LuoKuai();
	}

	public void dingShi(){
		score = sk.xiaoHang();
		
		if (lk.xiaDang(sk) || lk.xiaChu()) {
			sk.heBing(lk);
			
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
		// 背景显示
		Image  tu=(new ImageIcon("俄罗斯方块图片/背景.png")).getImage();	//路径：图片-右键-属性-路径src/	
		g.drawImage(tu,0,0,null);	
		
		
		
		g.setFont(ft); //设置字体
		g.setColor(Color.RED);
        g.drawString(Integer.toString(score),400, 243); //设置文字
		// 落块显示
		lk.xianShi(g);
		
		//实块显示
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

	public void wanLai()
	{
		sk.tianMan19();
		
		sk.xiaoHang();
	}

}