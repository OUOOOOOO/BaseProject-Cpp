package com.github;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main extends JFrame{
    
    private static final long serialVersionUID = 1L;
    private static String launcherName = "1071-FCU-SE �L���͵��]�e �\�\�Y���n";
    
    public String pathJava;
    
    private static Main instance;
    public SystemManage systemManage;
    public SystemInfo systemInfo;
    public SystemSearch systemSearch;
    public SystemRank systemRank;
    
    /*
     * 
     */
    
    public static enum MainAction {
        Main("�D�e��"),
        Login("�n�J"),
        Search("�j�M"),
        ShowInfo("��ܸ��"),
        Rank("�Ʀ�");
        
        public String code;
        public String str;
        
        MainAction(String str) {
            this.code = this.toString();
            this.str = str;
        }
    }
    
    /*
     * 
     */
    
    public MainAction eventNow;
    
    private BorderLayout layoutMain;
    private Container containerMain;
    private JTextArea taInfo, taPost;
    private JButton butM1, butM2, butM3, butM4;
    private JButton butR1, butR2, butR3, butR4, butR5, butR6;
    
    public static Main getInstance() {
        return instance;
    }
    
    public Main() {
        pathJava = System.getProperty("java.home");
    }

    public static void main(String[] args) {
        //System.out.println("START");
        
        instance = new Main();
        instance.init();
    }
    
    public void init() {
        eventNow = MainAction.Login;
        
        systemInfo = new SystemInfo();
        systemInfo.init();
        systemInfo.showStore();
        
        System.out.println("--------------------------------------");
        
        systemManage = new SystemManage();
        boolean member = systemManage.login();
        
        if(member) {
        	systemSearch = new SystemSearch(systemInfo.getListStore());
        	systemRank = new SystemRank(systemInfo.getListStore());
        }else {
        	systemSearch = new SystemSearch(systemInfo.getListStore());
        }
        Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.println("--------------------------------------");
        	if(member) {
        		System.out.println("1.�j�M");
        		System.out.println("2.�Ʀ�]");
        		System.out.print("�п�J�Q�n�ϥΪ��\��G");
        	}else {
        		System.out.println("1.�j�M");
        		System.out.print("�п�J�Q�n�ϥΪ��\��G");
        	}
        	int type = scan.nextInt();
        	while(true) {
        		if(type == 1) {
        			System.out.println("--------------------------------------");
        			systemSearch.Search();
        			break;
        		}else if (type == 2 && member) {
        			System.out.println("--------------------------------------");
        			systemRank.getRanking();
        			break;
        		}else if(type == 2) { //member == flase
        			System.out.println("�z�ëD�|���A�L�k�ϥΦ��\��C");
        			System.out.println();
        			System.out.print("�п�J�Q�n�ϥΪ��\��G");
        			type = scan.nextInt();
        		}else {
        			System.out.println("�L�Ī��N�X�A�Э��s��J�C");
        			System.out.println();
        			System.out.print("�п�J�Q�n�ϥΪ��\��G");
        			type = scan.nextInt();
        		}
        	}
        }
    }


}
