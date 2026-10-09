package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Phrase {
    public String Audios;
    public String Lessons;
    public String Luoma;
    public String Option1;
    public String Option2;
    public String Phrase;
    public long PhraseId;
    public int Status1;
    public int Status2;
    public String Translations;
    public String Zhuyin;
    private boolean isTrans = false;

    public Phrase(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, int i12) {
        this.PhraseId = j11;
        this.Phrase = str;
        this.Zhuyin = str2;
        this.Luoma = str3;
        this.Translations = str4;
        this.Lessons = str5;
        this.Audios = str6;
        this.Option1 = str7;
        this.Option2 = str8;
        this.Status1 = i11;
        this.Status2 = i12;
    }

    public String getAudios() {
        return this.Audios;
    }

    public String getLessons() {
        return this.Lessons;
    }

    public String getLuoma() {
        return this.Luoma;
    }

    public String getOption1() {
        return this.Option1;
    }

    public String getOption2() {
        return this.Option2;
    }

    public String getPhrase() {
        return this.Phrase.replace("_1", BuildConfig.VERSION_NAME).replace("_2", BuildConfig.VERSION_NAME).replace("_4", BuildConfig.VERSION_NAME).replace("_5", BuildConfig.VERSION_NAME).replace("_6", BuildConfig.VERSION_NAME).replace("_7", BuildConfig.VERSION_NAME).replace("_8", BuildConfig.VERSION_NAME).replace("_9", BuildConfig.VERSION_NAME);
    }

    public long getPhraseId() {
        return this.PhraseId;
    }

    public int getStatus1() {
        return this.Status1;
    }

    public int getStatus2() {
        return this.Status2;
    }

    public String getTranslations() {
        return this.Translations;
    }

    public String getZhuyin() {
        return this.Zhuyin;
    }

    public boolean isTrans() {
        return this.isTrans;
    }

    public void setAudios(String str) {
        this.Audios = str;
    }

    public void setLessons(String str) {
        this.Lessons = str;
    }

    public void setLuoma(String str) {
        this.Luoma = str;
    }

    public void setOption1(String str) {
        this.Option1 = str;
    }

    public void setOption2(String str) {
        this.Option2 = str;
    }

    public void setPhrase(String str) {
        this.Phrase = str;
    }

    public void setPhraseId(long j11) {
        this.PhraseId = j11;
    }

    public void setStatus1(int i11) {
        this.Status1 = i11;
    }

    public void setStatus2(int i11) {
        this.Status2 = i11;
    }

    public void setTrans(boolean z11) {
        this.isTrans = z11;
    }

    public void setTranslations(String str) {
        this.Translations = str;
    }

    public void setZhuyin(String str) {
        this.Zhuyin = str;
    }

    public Phrase() {
    }
}
