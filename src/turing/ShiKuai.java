package turing;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


/**
 * @author Administrator
 * @version 1.0
 * @created 19-三月-2021 10:03:49
 */
public class ShiKuai {

	protected int[][] ges;
	private int score = 0;

	public void finalize() throws Throwable {

	}

	public ShiKuai(){
		ges = new int[20][10];
	}

	/**
	 * 
	 * @param lk
	 */
	public void heBing(LuoKuai lk){
		for (int h=0;h<=19;h++) {
			for (int l=0;l<=9;l++) {
				if (lk.ges[h][l] == 1) {
					ges[h][l] = 1;
					lk.ges[h][l] = 0;
				}
			}
		}
	}

	public boolean siMa(){
		for (int l=0;l<=9;l++) {
			if (ges[0][l] == 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param g
	 */
	public void xianShi(Graphics g){
		Image  tu=(new ImageIcon("俄罗斯方块图片/实块.png")).getImage();	//路径：图片-右键-属性-路径src/	
		for (int h=0;h<=19;h++) {
			for (int l=0;l<=9;l++) {
				if (ges[h][l] == 1) {
					g.drawImage(tu,30+30*l,5+30*h,null);	
				}
			}
		}
	}

	public int xiaoHang(){
		for (int h=19;h>=1;h--) {
			//判断  求和
			int he = 0;
			for (int l=0;l<=9;l++) {
				he += ges[h][l];
			}
//			判断  消行
			if (he == 10) {
				score++;
				for (int xh =h-1;xh>=0;xh--) {
					for (int l=0;l<=9;l++) {
						ges[xh+1][l] = ges[xh][l];
						ges[xh][l] = 0;
					}
				}
			}
		}
		return score;
	}

	public void tianMan19()
	{
		for (int l=0;l<=9;l++) {
			ges[19][l] = 1;
		}
	}
}