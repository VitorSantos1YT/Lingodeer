package com.lingo.lingoskill.deskill.ui.speak.object;

import com.lingo.lingoskill.speak.object.PodTrans;
import com.tbruyelle.rxpermissions3.BuildConfig;
import op.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DEPodWord extends b {
    private String begin;
    private String luoma;
    private PodTrans trans;
    private long wid;
    private String word;
    private String zhuyin;

    @Override // op.b
    public String getBegin() {
        return this.begin;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getExplanation() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getLuoma() {
        return this.luoma;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getMainPic() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getPos() {
        return null;
    }

    public PodTrans getTrans() {
        return this.trans;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getTranslations() {
        return this.trans.getTrans();
    }

    public long getWid() {
        return this.wid;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getWord() {
        return this.word.replace("■", " ");
    }

    @Override // com.lingo.lingoskill.object.Word
    public long getWordId() {
        return this.wid;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getZhuyin() {
        return this.zhuyin;
    }

    public void setBegin(String str) {
        this.begin = str;
    }

    public void setTrans(PodTrans podTrans) {
        this.trans = podTrans;
    }

    public void setWid(long j11) {
        this.wid = j11;
    }

    @Override // com.lingo.lingoskill.object.Word
    public void setWord(String str) {
        this.word = str;
    }

    @Override // com.lingo.lingoskill.object.Word
    public void setZhuyin(String str) {
        this.zhuyin = str;
    }
}
