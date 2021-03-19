package turing;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;


/**
 * @author Administrator
 * @version 1.0
 * @created 19-ÈıÔÂ-2021 10:03:48
 */
public class LuoKuai {

	int[][] ges;

	public void finalize() throws Throwable {

	}

	public LuoKuai(){
		ges = new int[20][10];
		
		switch ( (int)(7*Math.random()) ) {
			case 0:
				ges[0][3] = 1;			ges[0][4] = 0;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 0;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 1:
				ges[0][3] = 0;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 2:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 3:
				ges[0][3] = 1;			ges[0][4] = 0;			ges[0][5] = 0;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 4:
				ges[0][3] = 1;			ges[0][4] = 0;			ges[0][5] = 0;			ges[0][6] = 0;
				ges[1][3] = 1;			ges[1][4] = 0;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 5:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 0;			ges[1][5] = 0;			ges[1][6] = 1;
				break;
			case 6:
				ges[0][3] = 1;			ges[0][4] = 0;			ges[0][5] = 0;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 7:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
		}
//		for (int i=0;i<19;i++) {
//			for (int j=0;j<9;j++) {
//				ges[i][j] = (int)(10*Math.random()) / 2;
//			}
//		}
	}

	public boolean xiaChu(){
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean xiaDang(ShiKuai sk){
		return false;
	}

	/**
	 * 
	 * @param g
	 */
	public void xianShi(Graphics g){
		
		Image  tu=(new ImageIcon("¶íÂŞË¹Í¼Æ¬/Âä¿é.png")).getImage();	//Â·¾¶£ºÍ¼Æ¬-ÓÒ¼ü-ÊôĞÔ-Â·¾¶src/	
		for (int h=0;h<=19;h++) {
			for (int l=0;l<=9;l++) {
				if (ges[h][l] == 1) {
					g.drawImage(tu,30+30*l,5+30*h,null);	
				}
			}
		}
	}

	public void xiaYi(){

	}

	public boolean youChu(){
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean youDang(ShiKuai sk){
		return false;
	}

	public void youYi(){

	}

	public void zhuan(){

	}

	public boolean zhuanChu(){
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean zhuanDang(ShiKuai sk){
		return false;
	}

	public boolean zuoChu(){
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean zuoDang(ShiKuai sk){
		return false;
	}

	public void zuoYi(){

	}

}