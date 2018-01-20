package com.iflytek.msp.lfasr;
import com.iflytek.msp.lfasr.bean.FragBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VoideTextParser {

    static Gson mGson = new Gson();

    public static void main(String[] args) {

        new VoideTextParser().run();

    }


    public void run() {
        //从文件解析出来
        String jsonStr = readFileToString("/Users/franer/Desktop/AA.txt");
        //进行解析
        ArrayList<FragBean> beans = mGson.fromJson(jsonStr, new TypeToken<ArrayList<FragBean>>() {}.getType());
        StringBuilder sb = new StringBuilder();
        for (FragBean bean : beans){
            sb.append(bean.getOnebest());
            sb.append("\n\n");
        }
        //写到一个文件里面去
        writeBeanToFile(sb.toString(),"/Users/franer/Desktop/180116丛聪2语音的最终格式.txt");
    }
    
    public void run(String jsonStr) {
        //进行解析
        ArrayList<FragBean> beans = mGson.fromJson(jsonStr, new TypeToken<ArrayList<FragBean>>() {}.getType());
        StringBuilder sb = new StringBuilder();
        for (FragBean bean : beans){
            sb.append(bean.getOnebest());
            sb.append("\n\n");
        }
        //写到一个文件里面去
        writeBeanToFile(sb.toString(),"/Users/franer/Desktop/180116丛聪2语音的最终格式.txt");
    }
    
    private void writeBeanToFile(String result, String filePath) {
        try {
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(result);
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readFileToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }

}
