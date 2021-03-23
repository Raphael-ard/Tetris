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

	protected int[][] ges;

	public void finalize() throws Throwable {

	}

	public LuoKuai(){
		ges = new int[20][10];
		
		switch ( (int)(Math.random()*10)  ) {
			case 0:
				ges[0][3] = 0;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 0;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 1:
				ges[0][3] = 0;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 0;
				break;
			case 2:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 1;
				ges[1][3] = 0;			ges[1][4] = 0;			ges[1][5] = 0;			ges[1][6] = 0;
				break;
			case 3:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 0;			ges[0][6] = 0;
				ges[1][3] = 1;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 4:
				ges[0][3] = 0;			ges[0][4] = 1;			ges[0][5] = 0;			ges[0][6] = 0;
				ges[1][3] = 1;			ges[1][4] = 1;			ges[1][5] = 0;			ges[1][6] = 0;
				break;
			case 5:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 1;			ges[1][5] = 0;			ges[1][6] = 0;
				break;
			case 6:
				ges[0][3] = 0;			ges[0][4] = 0;			ges[0][5] = 1;			ges[0][6] = 1;
				ges[1][3] = 1;			ges[1][4] = 1;			ges[1][5] = 1;			ges[1][6] = 1;
				break;
			case 7:
				ges[0][3] = 1;			ges[0][4] = 0;			ges[0][5] = 0;			ges[0][6] = 0;
				ges[1][3] = 1;			ges[1][4] = 0;			ges[1][5] = 0;			ges[1][6] = 0;
				break;
			default:
				ges[0][3] = 1;			ges[0][4] = 1;			ges[0][5] = 1;			ges[0][6] = 0;
				ges[1][3] = 0;			ges[1][4] = 0;			ges[1][5] = 1;			ges[1][6] = 0;
				break;
		}
	}

	public boolean xiaChu(){
		for (int l=0;l<=9;l++) {
			if (ges[19][l] == 1) 
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean xiaDang(ShiKuai sk){
		for (int h=1;h<=19;h++) {
			for (int l=0;l<=9;l++) {
				if (sk.ges[h][l] == 1 && ges[h-1][l] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param g
	 */
	public void xianShi(Graphics g){
		
		Image  tu=(new ImageIcon("¶íÂŞË¹·½¿éÍ¼Æ¬/Âä¿é.png")).getImage();	//Â·¾¶£ºÍ¼Æ¬-ÓÒ¼ü-ÊôĞÔ-Â·¾¶src/	
		for (int h=0;h<=19;h++) {
			for (int l=0;l<=9;l++) {
				if (ges[h][l] == 1) {
					g.drawImage(tu,30+30*l,5+30*h,null);	
				}
			}
		}
	}

	public void xiaYi(){
		for (int h=18;h>=0;h--) {
			for (int l=0;l<=9;l++) {
				ges[h+1][l] = ges[h][l];
				ges[h][l] = 0;
			}
		}
	}

	public boolean youChu(){
		for (int h=0;h<=19;h++) {
			if (ges[h][9] == 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean youDang(ShiKuai sk){
		for (int h =0;h<=19;h++) {
			for (int l=1;l<=9;l++) {
				if (sk.ges[h][l] ==1 && ges[h][l-1] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public void youYi(){
		for (int l=8;l>=0;l--) {
			for (int h=0;h<=19;h++) {
				ges[h][l+1] = ges[h][l];
				ges[h][l] = 0;
			}
		}
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
		for (int h=0;h<=19;h++) {
			if (ges[h][0] == 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param sk
	 */
	public boolean zuoDang(ShiKuai sk){
		for (int h=0;h<=19;h++) {
			for (int l=0;l<=8;l++) {
				if (sk.ges[h][l] == 1 && ges[h][l+1] == 1) {
					return true;
				}
			}
		}
		return false;
	}

	public void zuoYi() {
		for (int l=1;l<=9;l++) {
			for (int h=0;h<=19;h++) {
				ges[h][l-1] = ges[h][l];
				ges[h][l] = 0;
			}
		}
	}

}