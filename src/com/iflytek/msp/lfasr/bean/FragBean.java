package com.iflytek.msp.lfasr.bean;

import java.io.Serializable;
import java.util.List;

//   "bg": 1100, //��������ڱ���Ƶ����ʼʱ�䣬��λΪms
//   "ed": 5950, //��������ڱ���Ƶ����ֹʱ�䣬��λΪms
//   "nc": "1.0", //�������Ŷȣ���ΧΪ[0,1]
//   "onebest": "����������������˰ɣ�",  //��������
//   "si": "1", //����λ�ã���0��ʼ�ۼ�
//   "speaker": "1", //˵���˱��(���֡�1���͡�2��Ϊ��ͬ˵���ˣ��绰ר�ð湦��)
//   "wordsResultList": [ //�ִ�����
public class FragBean implements Serializable{

    private int bg;
    private int ed;
    private float nc;
    private String onebest;
    private int si;
    private int speaker;
    private List<WordsResult> wordsResultList;

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public float getNc() {
        return nc;
    }

    public void setNc(float nc) {
        this.nc = nc;
    }

    public String getOnebest() {
        return onebest;
    }

    public void setOnebest(String onebest) {
        this.onebest = onebest;
    }

    public int getSi() {
        return si;
    }

    public void setSi(int si) {
        this.si = si;
    }

    public int getSpeaker() {
        return speaker;
    }

    public void setSpeaker(int speaker) {
        this.speaker = speaker;
    }

    public List<WordsResult> getWordsResultList() {
        return wordsResultList;
    }

    public void setWordsResultList(List<WordsResult> wordsResultList) {
        this.wordsResultList = wordsResultList;
    }

    //    "wc": "1.0", //�����Ŷȣ���ΧΪ[0,1]
    //    "wordBg": "37", //������ڱ����ӵ���ʼ֡
    //    "wordEd": "130", //������ڱ����ӵ���ֹ֡
    //    "wordsName": "��",
    //    "wp": "s" //������
     static class WordsResult implements Serializable{
        private float wc;
        private int wordBg;
        private int wordEd;
        private String wordsName;
        private String wp;
        private List<AlterNative> alternativeList;

        public float getWc() {
            return wc;
        }

        public void setWc(float wc) {
            this.wc = wc;
        }

        public int getWordBg() {
            return wordBg;
        }

        public void setWordBg(int wordBg) {
            this.wordBg = wordBg;
        }

        public int getWordEd() {
            return wordEd;
        }

        public void setWordEd(int wordEd) {
            this.wordEd = wordEd;
        }

        public String getWordsName() {
            return wordsName;
        }

        public void setWordsName(String wordsName) {
            this.wordsName = wordsName;
        }

        public String getWp() {
            return wp;
        }

        public void setWp(String wp) {
            this.wp = wp;
        }

        public List<AlterNative> getAlternativeList() {
            return alternativeList;
        }

        public void setAlternativeList(List<AlterNative> alternativeList) {
            this.alternativeList = alternativeList;
        }

        //    "wc": "0.3638",
        //    "wordsName": "����",
        //    "wp": "n"
        static class AlterNative{
            private float wc;
            private String wordsName;
            private String wp;

            public float getWc() {
                return wc;
            }

            public void setWc(float wc) {
                this.wc = wc;
            }

            public String getWordsName() {
                return wordsName;
            }

            public void setWordsName(String wordsName) {
                this.wordsName = wordsName;
            }

            public String getWp() {
                return wp;
            }

            public void setWp(String wp) {
                this.wp = wp;
            }
        }
    }
}