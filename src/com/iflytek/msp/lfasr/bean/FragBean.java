package com.iflytek.msp.lfasr.bean;

import java.io.Serializable;
import java.util.List;

//   "bg": 1100, //句子相对于本音频的起始时间，单位为ms
//   "ed": 5950, //句子相对于本音频的终止时间，单位为ms
//   "nc": "1.0", //句子置信度，范围为[0,1]
//   "onebest": "唉，老铁，你出门了吧？",  //句子内容
//   "si": "1", //句子位置，从0开始累加
//   "speaker": "1", //说话人编号(数字“1”和“2”为不同说话人，电话专用版功能)
//   "wordsResultList": [ //分词内容
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

    //    "wc": "1.0", //词置信度，范围为[0,1]
    //    "wordBg": "37", //词相对于本句子的起始帧
    //    "wordEd": "130", //词相对于本句子的终止帧
    //    "wordsName": "唉",
    //    "wp": "s" //词属性
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
        //    "wordsName": "文字",
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