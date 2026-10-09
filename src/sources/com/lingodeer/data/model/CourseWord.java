package com.lingodeer.data.model;

import android.net.Uri;
import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import mf.sOm.txBUGYhC;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import oz.q;
import oz.x;
import qy.r;
import ry.l;
import w4.c;
import xt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseWord {
    private final int animation;
    private final Uri animationUri;
    private final Uri audioUri;
    private final ChineseToneMetaData chineseToneMetaData;
    private final List<CourseWord> displayCharWords;
    private final DisplayType displayType;
    private final List<CourseWord> displayZhuyinCharWords;
    private final String explain;
    private final String featured;
    private final String hepburnLuoMa;
    private final Uri imageUri;
    private final boolean isEnabled;
    private final boolean isMatched;
    private final boolean isMatchedAndAnimate;
    private final boolean isNextCorrectAnswer;
    private final boolean isQuestionWord;
    private final boolean isSelected;
    private final boolean isSelectedCorrectAnswer;
    private final String kunreiShikiLuoMa;
    private final String luoMa;
    private final String mainPic;
    private final String originalWord;
    private final String pos;
    private final int randomId;
    private final String realLuoMa;
    private final String realWord;
    private final String realZhuYin;
    private final OptionItemSelectedState selectedState;
    private final String soundChangePronunciation;
    private final int speechScore;
    private final SyllablePhonemeResult syllablePhonemeResult;
    private final String translation;
    private final Uri videoUri;
    private final List<r> visemedMap;
    private final String word;
    private final long wordId;
    private final int wordType;
    private final String zhuYin;

    public CourseWord(long j11, String word, String zhuYin, String luoMa, String translation, String explain, int i11, int i12, String kunreiShikiLuoMa, String hepburnLuoMa, String mainPic, String pos, String featured, String soundChangePronunciation, Uri videoUri, Uri audioUri, Uri imageUri, Uri animationUri, int i13, SyllablePhonemeResult syllablePhonemeResult, boolean z11, boolean z12, String realWord, String realZhuYin, String realLuoMa, String originalWord, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, DisplayType displayType, List<CourseWord> displayCharWords, List<CourseWord> displayZhuyinCharWords, OptionItemSelectedState selectedState, List<r> visemedMap, ChineseToneMetaData chineseToneMetaData, int i14) {
        m.f(word, "word");
        m.f(zhuYin, "zhuYin");
        m.f(luoMa, "luoMa");
        m.f(translation, "translation");
        m.f(explain, "explain");
        m.f(kunreiShikiLuoMa, "kunreiShikiLuoMa");
        m.f(hepburnLuoMa, "hepburnLuoMa");
        m.f(mainPic, "mainPic");
        m.f(pos, "pos");
        m.f(featured, "featured");
        m.f(soundChangePronunciation, "soundChangePronunciation");
        m.f(videoUri, "videoUri");
        m.f(audioUri, "audioUri");
        m.f(imageUri, "imageUri");
        m.f(animationUri, "animationUri");
        m.f(realWord, "realWord");
        m.f(realZhuYin, "realZhuYin");
        m.f(realLuoMa, "realLuoMa");
        m.f(originalWord, "originalWord");
        m.f(displayType, "displayType");
        m.f(displayCharWords, "displayCharWords");
        m.f(displayZhuyinCharWords, "displayZhuyinCharWords");
        m.f(selectedState, "selectedState");
        m.f(visemedMap, "visemedMap");
        m.f(chineseToneMetaData, "chineseToneMetaData");
        this.wordId = j11;
        this.word = word;
        this.zhuYin = zhuYin;
        this.luoMa = luoMa;
        this.translation = translation;
        this.explain = explain;
        this.wordType = i11;
        this.animation = i12;
        this.kunreiShikiLuoMa = kunreiShikiLuoMa;
        this.hepburnLuoMa = hepburnLuoMa;
        this.mainPic = mainPic;
        this.pos = pos;
        this.featured = featured;
        this.soundChangePronunciation = soundChangePronunciation;
        this.videoUri = videoUri;
        this.audioUri = audioUri;
        this.imageUri = imageUri;
        this.animationUri = animationUri;
        this.speechScore = i13;
        this.syllablePhonemeResult = syllablePhonemeResult;
        this.isQuestionWord = z11;
        this.isEnabled = z12;
        this.realWord = realWord;
        this.realZhuYin = realZhuYin;
        this.realLuoMa = realLuoMa;
        this.originalWord = originalWord;
        this.isSelected = z13;
        this.isMatched = z14;
        this.isNextCorrectAnswer = z15;
        this.isSelectedCorrectAnswer = z16;
        this.isMatchedAndAnimate = z17;
        this.displayType = displayType;
        this.displayCharWords = displayCharWords;
        this.displayZhuyinCharWords = displayZhuyinCharWords;
        this.selectedState = selectedState;
        this.visemedMap = visemedMap;
        this.chineseToneMetaData = chineseToneMetaData;
        this.randomId = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseWord copy$default(CourseWord courseWord, long j11, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, String str8, String str9, String str10, String str11, Uri uri, Uri uri2, Uri uri3, Uri uri4, int i13, SyllablePhonemeResult syllablePhonemeResult, boolean z11, boolean z12, String str12, String str13, String str14, String str15, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, DisplayType displayType, List list, List list2, OptionItemSelectedState optionItemSelectedState, List list3, ChineseToneMetaData chineseToneMetaData, int i14, int i15, int i16, Object obj) {
        int i17;
        ChineseToneMetaData chineseToneMetaData2;
        long j12 = (i15 & 1) != 0 ? courseWord.wordId : j11;
        String str16 = (i15 & 2) != 0 ? courseWord.word : str;
        String str17 = (i15 & 4) != 0 ? courseWord.zhuYin : str2;
        String str18 = (i15 & 8) != 0 ? courseWord.luoMa : str3;
        String str19 = (i15 & 16) != 0 ? courseWord.translation : str4;
        String str20 = (i15 & 32) != 0 ? courseWord.explain : str5;
        int i18 = (i15 & 64) != 0 ? courseWord.wordType : i11;
        int i19 = (i15 & 128) != 0 ? courseWord.animation : i12;
        String str21 = (i15 & 256) != 0 ? courseWord.kunreiShikiLuoMa : str6;
        String str22 = (i15 & 512) != 0 ? courseWord.hepburnLuoMa : str7;
        String str23 = (i15 & 1024) != 0 ? courseWord.mainPic : str8;
        String str24 = (i15 & 2048) != 0 ? courseWord.pos : str9;
        String str25 = (i15 & 4096) != 0 ? courseWord.featured : str10;
        long j13 = j12;
        String str26 = (i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? courseWord.soundChangePronunciation : str11;
        Uri uri5 = (i15 & 16384) != 0 ? courseWord.videoUri : uri;
        Uri uri6 = (i15 & 32768) != 0 ? courseWord.audioUri : uri2;
        Uri uri7 = (i15 & 65536) != 0 ? courseWord.imageUri : uri3;
        Uri uri8 = (i15 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? courseWord.animationUri : uri4;
        int i21 = (i15 & 262144) != 0 ? courseWord.speechScore : i13;
        SyllablePhonemeResult syllablePhonemeResult2 = (i15 & 524288) != 0 ? courseWord.syllablePhonemeResult : syllablePhonemeResult;
        boolean z18 = (i15 & 1048576) != 0 ? courseWord.isQuestionWord : z11;
        boolean z19 = (i15 & 2097152) != 0 ? courseWord.isEnabled : z12;
        String str27 = (i15 & 4194304) != 0 ? courseWord.realWord : str12;
        String str28 = (i15 & 8388608) != 0 ? courseWord.realZhuYin : str13;
        String str29 = (i15 & 16777216) != 0 ? courseWord.realLuoMa : str14;
        String str30 = (i15 & 33554432) != 0 ? courseWord.originalWord : str15;
        boolean z20 = (i15 & 67108864) != 0 ? courseWord.isSelected : z13;
        boolean z21 = (i15 & 134217728) != 0 ? courseWord.isMatched : z14;
        boolean z22 = (i15 & 268435456) != 0 ? courseWord.isNextCorrectAnswer : z15;
        boolean z23 = (i15 & 536870912) != 0 ? courseWord.isSelectedCorrectAnswer : z16;
        boolean z24 = (i15 & 1073741824) != 0 ? courseWord.isMatchedAndAnimate : z17;
        DisplayType displayType2 = (i15 & Integer.MIN_VALUE) != 0 ? courseWord.displayType : displayType;
        List list4 = (i16 & 1) != 0 ? courseWord.displayCharWords : list;
        List list5 = (i16 & 2) != 0 ? courseWord.displayZhuyinCharWords : list2;
        OptionItemSelectedState optionItemSelectedState2 = (i16 & 4) != 0 ? courseWord.selectedState : optionItemSelectedState;
        List list6 = (i16 & 8) != 0 ? courseWord.visemedMap : list3;
        ChineseToneMetaData chineseToneMetaData3 = (i16 & 16) != 0 ? courseWord.chineseToneMetaData : chineseToneMetaData;
        if ((i16 & 32) != 0) {
            chineseToneMetaData2 = chineseToneMetaData3;
            i17 = courseWord.randomId;
        } else {
            i17 = i14;
            chineseToneMetaData2 = chineseToneMetaData3;
        }
        return courseWord.copy(j13, str16, str17, str18, str19, str20, i18, i19, str21, str22, str23, str24, str25, str26, uri5, uri6, uri7, uri8, i21, syllablePhonemeResult2, z18, z19, str27, str28, str29, str30, z20, z21, z22, z23, z24, displayType2, list4, list5, optionItemSelectedState2, list6, chineseToneMetaData2, i17);
    }

    public final long component1() {
        return this.wordId;
    }

    public final String component10() {
        return this.hepburnLuoMa;
    }

    public final String component11() {
        return this.mainPic;
    }

    public final String component12() {
        return this.pos;
    }

    public final String component13() {
        return this.featured;
    }

    public final String component14() {
        return this.soundChangePronunciation;
    }

    public final Uri component15() {
        return this.videoUri;
    }

    public final Uri component16() {
        return this.audioUri;
    }

    public final Uri component17() {
        return this.imageUri;
    }

    public final Uri component18() {
        return this.animationUri;
    }

    public final int component19() {
        return this.speechScore;
    }

    public final String component2() {
        return this.word;
    }

    public final SyllablePhonemeResult component20() {
        return this.syllablePhonemeResult;
    }

    public final boolean component21() {
        return this.isQuestionWord;
    }

    public final boolean component22() {
        return this.isEnabled;
    }

    public final String component23() {
        return this.realWord;
    }

    public final String component24() {
        return this.realZhuYin;
    }

    public final String component25() {
        return this.realLuoMa;
    }

    public final String component26() {
        return this.originalWord;
    }

    public final boolean component27() {
        return this.isSelected;
    }

    public final boolean component28() {
        return this.isMatched;
    }

    public final boolean component29() {
        return this.isNextCorrectAnswer;
    }

    public final String component3() {
        return this.zhuYin;
    }

    public final boolean component30() {
        return this.isSelectedCorrectAnswer;
    }

    public final boolean component31() {
        return this.isMatchedAndAnimate;
    }

    public final DisplayType component32() {
        return this.displayType;
    }

    public final List<CourseWord> component33() {
        return this.displayCharWords;
    }

    public final List<CourseWord> component34() {
        return this.displayZhuyinCharWords;
    }

    public final OptionItemSelectedState component35() {
        return this.selectedState;
    }

    public final List<r> component36() {
        return this.visemedMap;
    }

    public final ChineseToneMetaData component37() {
        return this.chineseToneMetaData;
    }

    public final int component38() {
        return this.randomId;
    }

    public final String component4() {
        return this.luoMa;
    }

    public final String component5() {
        return this.translation;
    }

    public final String component6() {
        return this.explain;
    }

    public final int component7() {
        return this.wordType;
    }

    public final int component8() {
        return this.animation;
    }

    public final String component9() {
        return this.kunreiShikiLuoMa;
    }

    public final CourseWord copy(long j11, String word, String zhuYin, String luoMa, String translation, String explain, int i11, int i12, String kunreiShikiLuoMa, String hepburnLuoMa, String mainPic, String pos, String featured, String soundChangePronunciation, Uri videoUri, Uri audioUri, Uri imageUri, Uri animationUri, int i13, SyllablePhonemeResult syllablePhonemeResult, boolean z11, boolean z12, String realWord, String realZhuYin, String realLuoMa, String originalWord, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, DisplayType displayType, List<CourseWord> displayCharWords, List<CourseWord> displayZhuyinCharWords, OptionItemSelectedState selectedState, List<r> visemedMap, ChineseToneMetaData chineseToneMetaData, int i14) {
        m.f(word, "word");
        m.f(zhuYin, "zhuYin");
        m.f(luoMa, "luoMa");
        m.f(translation, "translation");
        m.f(explain, "explain");
        m.f(kunreiShikiLuoMa, "kunreiShikiLuoMa");
        m.f(hepburnLuoMa, "hepburnLuoMa");
        m.f(mainPic, "mainPic");
        m.f(pos, "pos");
        m.f(featured, "featured");
        m.f(soundChangePronunciation, "soundChangePronunciation");
        m.f(videoUri, "videoUri");
        m.f(audioUri, "audioUri");
        m.f(imageUri, "imageUri");
        m.f(animationUri, "animationUri");
        m.f(realWord, "realWord");
        m.f(realZhuYin, "realZhuYin");
        m.f(realLuoMa, "realLuoMa");
        m.f(originalWord, "originalWord");
        m.f(displayType, "displayType");
        m.f(displayCharWords, "displayCharWords");
        m.f(displayZhuyinCharWords, "displayZhuyinCharWords");
        m.f(selectedState, "selectedState");
        m.f(visemedMap, "visemedMap");
        m.f(chineseToneMetaData, "chineseToneMetaData");
        return new CourseWord(j11, word, zhuYin, luoMa, translation, explain, i11, i12, kunreiShikiLuoMa, hepburnLuoMa, mainPic, pos, featured, soundChangePronunciation, videoUri, audioUri, imageUri, animationUri, i13, syllablePhonemeResult, z11, z12, realWord, realZhuYin, realLuoMa, originalWord, z13, z14, z15, z16, z17, displayType, displayCharWords, displayZhuyinCharWords, selectedState, visemedMap, chineseToneMetaData, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseWord)) {
            return false;
        }
        CourseWord courseWord = (CourseWord) obj;
        return this.wordId == courseWord.wordId && m.a(this.word, courseWord.word) && m.a(this.zhuYin, courseWord.zhuYin) && m.a(this.luoMa, courseWord.luoMa) && m.a(this.translation, courseWord.translation) && m.a(this.explain, courseWord.explain) && this.wordType == courseWord.wordType && this.animation == courseWord.animation && m.a(this.kunreiShikiLuoMa, courseWord.kunreiShikiLuoMa) && m.a(this.hepburnLuoMa, courseWord.hepburnLuoMa) && m.a(this.mainPic, courseWord.mainPic) && m.a(this.pos, courseWord.pos) && m.a(this.featured, courseWord.featured) && m.a(this.soundChangePronunciation, courseWord.soundChangePronunciation) && m.a(this.videoUri, courseWord.videoUri) && m.a(this.audioUri, courseWord.audioUri) && m.a(this.imageUri, courseWord.imageUri) && m.a(this.animationUri, courseWord.animationUri) && this.speechScore == courseWord.speechScore && m.a(this.syllablePhonemeResult, courseWord.syllablePhonemeResult) && this.isQuestionWord == courseWord.isQuestionWord && this.isEnabled == courseWord.isEnabled && m.a(this.realWord, courseWord.realWord) && m.a(this.realZhuYin, courseWord.realZhuYin) && m.a(this.realLuoMa, courseWord.realLuoMa) && m.a(this.originalWord, courseWord.originalWord) && this.isSelected == courseWord.isSelected && this.isMatched == courseWord.isMatched && this.isNextCorrectAnswer == courseWord.isNextCorrectAnswer && this.isSelectedCorrectAnswer == courseWord.isSelectedCorrectAnswer && this.isMatchedAndAnimate == courseWord.isMatchedAndAnimate && this.displayType == courseWord.displayType && m.a(this.displayCharWords, courseWord.displayCharWords) && m.a(this.displayZhuyinCharWords, courseWord.displayZhuyinCharWords) && this.selectedState == courseWord.selectedState && m.a(this.visemedMap, courseWord.visemedMap) && m.a(this.chineseToneMetaData, courseWord.chineseToneMetaData) && this.randomId == courseWord.randomId;
    }

    public final int getAnimation() {
        return this.animation;
    }

    public final Uri getAnimationUri() {
        return this.animationUri;
    }

    public final Uri getAudioUri() {
        return this.audioUri;
    }

    public final ChineseToneMetaData getChineseToneMetaData() {
        return this.chineseToneMetaData;
    }

    public final List<CourseWord> getDisplayCharWords() {
        return this.displayCharWords;
    }

    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    public final List<CourseWord> getDisplayZhuyinCharWords() {
        return this.displayZhuyinCharWords;
    }

    public final String getExplain() {
        return this.explain;
    }

    public final String getFeatured() {
        return this.featured;
    }

    public final String getHepburnLuoMa() {
        return this.hepburnLuoMa;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    public final String getKunreiShikiLuoMa() {
        return this.kunreiShikiLuoMa;
    }

    public final String getLuoMa() {
        return this.luoMa;
    }

    public final String getMainPic() {
        return this.mainPic;
    }

    public final String getOriginalWord() {
        return this.originalWord;
    }

    public final String getPos() {
        return this.pos;
    }

    public final int getRandomId() {
        return this.randomId;
    }

    public final String getRealLuoMa() {
        return this.realLuoMa;
    }

    public final String getRealWord() {
        return this.realWord;
    }

    public final String getRealZhuYin() {
        return this.realZhuYin;
    }

    public final OptionItemSelectedState getSelectedState() {
        return this.selectedState;
    }

    public final String getSoundChangePronunciation() {
        return this.soundChangePronunciation;
    }

    public final int getSpeechScore() {
        return this.speechScore;
    }

    public final SyllablePhonemeResult getSyllablePhonemeResult() {
        return this.syllablePhonemeResult;
    }

    public final String getTranslation() {
        return this.translation;
    }

    public final Uri getVideoUri() {
        return this.videoUri;
    }

    public final List<r> getVisemedMap() {
        return this.visemedMap;
    }

    public final String getWord() {
        return this.word;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public final int getWordType() {
        return this.wordType;
    }

    public final String getZhuYin() {
        return this.zhuYin;
    }

    public int hashCode() {
        int iB = e.b(this.speechScore, (this.animationUri.hashCode() + ((this.imageUri.hashCode() + ((this.audioUri.hashCode() + ((this.videoUri.hashCode() + e.d(e.d(e.d(e.d(e.d(e.d(e.b(this.animation, e.b(this.wordType, e.d(e.d(e.d(e.d(e.d(Long.hashCode(this.wordId) * 31, 31, this.word), 31, this.zhuYin), 31, this.luoMa), 31, this.translation), 31, this.explain), 31), 31), 31, this.kunreiShikiLuoMa), 31, this.hepburnLuoMa), 31, this.mainPic), 31, this.pos), 31, this.featured), 31, this.soundChangePronunciation)) * 31)) * 31)) * 31)) * 31, 31);
        SyllablePhonemeResult syllablePhonemeResult = this.syllablePhonemeResult;
        return Integer.hashCode(this.randomId) + ((this.chineseToneMetaData.hashCode() + p0.b((this.selectedState.hashCode() + p0.b(p0.b((this.displayType.hashCode() + e.e(e.e(e.e(e.e(e.e(e.d(e.d(e.d(e.d(e.e(e.e((iB + (syllablePhonemeResult == null ? 0 : syllablePhonemeResult.hashCode())) * 31, 31, this.isQuestionWord), 31, this.isEnabled), 31, this.realWord), 31, this.realZhuYin), 31, this.realLuoMa), 31, this.originalWord), 31, this.isSelected), 31, this.isMatched), 31, this.isNextCorrectAnswer), 31, this.isSelectedCorrectAnswer), 31, this.isMatchedAndAnimate)) * 31, 31, this.displayCharWords), 31, this.displayZhuyinCharWords)) * 31, 31, this.visemedMap)) * 31);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isMatched() {
        return this.isMatched;
    }

    public final boolean isMatchedAndAnimate() {
        return this.isMatchedAndAnimate;
    }

    public final boolean isNextCorrectAnswer() {
        return this.isNextCorrectAnswer;
    }

    public final boolean isQuestionWord() {
        return this.isQuestionWord;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isSelectedCorrectAnswer() {
        return this.isSelectedCorrectAnswer;
    }

    public final String getFixedZhuYin() {
        return (q.W0(this.zhuYin, new String[]{" "}, 0, 6).size() < this.word.length() && x.k0(this.zhuYin, "r", false) && l.D(new Integer[]{11, 0}, Integer.valueOf(b.b().keyLanguage))) ? q.z0(this.zhuYin).concat(OYAvlbfUyD.GZu) : this.zhuYin;
    }

    public String toString() {
        long j11 = this.wordId;
        String str = this.word;
        String str2 = this.zhuYin;
        String str3 = this.luoMa;
        String str4 = this.translation;
        String str5 = this.explain;
        int i11 = this.wordType;
        int i12 = this.animation;
        String str6 = this.kunreiShikiLuoMa;
        String str7 = this.hepburnLuoMa;
        String str8 = this.mainPic;
        String str9 = this.pos;
        String str10 = this.featured;
        String str11 = this.soundChangePronunciation;
        Uri uri = this.videoUri;
        Uri uri2 = this.audioUri;
        Uri uri3 = this.imageUri;
        Uri uri4 = this.animationUri;
        int i13 = this.speechScore;
        SyllablePhonemeResult syllablePhonemeResult = this.syllablePhonemeResult;
        boolean z11 = this.isQuestionWord;
        boolean z12 = this.isEnabled;
        String str12 = this.realWord;
        String str13 = this.realZhuYin;
        String str14 = this.realLuoMa;
        String str15 = this.originalWord;
        boolean z13 = this.isSelected;
        boolean z14 = this.isMatched;
        boolean z15 = this.isNextCorrectAnswer;
        boolean z16 = this.isSelectedCorrectAnswer;
        boolean z17 = this.isMatchedAndAnimate;
        DisplayType displayType = this.displayType;
        List<CourseWord> list = this.displayCharWords;
        List<CourseWord> list2 = this.displayZhuyinCharWords;
        OptionItemSelectedState optionItemSelectedState = this.selectedState;
        List<r> list3 = this.visemedMap;
        ChineseToneMetaData chineseToneMetaData = this.chineseToneMetaData;
        int i14 = this.randomId;
        StringBuilder sbP = e0.p(j11, "CourseWord(wordId=", ", word=", str);
        d.w(sbP, ", zhuYin=", str2, ", luoMa=", str3);
        d.w(sbP, ", translation=", str4, ", explain=", str5);
        c.t(i11, i12, ", wordType=", ", animation=", sbP);
        d.w(sbP, ", kunreiShikiLuoMa=", str6, txBUGYhC.CQPdok, str7);
        d.w(sbP, ", mainPic=", str8, ", pos=", str9);
        d.w(sbP, ", featured=", str10, ", soundChangePronunciation=", str11);
        sbP.append(", videoUri=");
        sbP.append(uri);
        sbP.append(", audioUri=");
        sbP.append(uri2);
        sbP.append(", imageUri=");
        sbP.append(uri3);
        sbP.append(", animationUri=");
        sbP.append(uri4);
        sbP.append(", speechScore=");
        sbP.append(i13);
        sbP.append(", syllablePhonemeResult=");
        sbP.append(syllablePhonemeResult);
        e0.z(", isQuestionWord=", ", isEnabled=", sbP, z11, z12);
        d.w(sbP, ", realWord=", str12, ", realZhuYin=", str13);
        d.w(sbP, ", realLuoMa=", str14, ", originalWord=", str15);
        e0.z(", isSelected=", ", isMatched=", sbP, z13, z14);
        e0.z(", isNextCorrectAnswer=", ", isSelectedCorrectAnswer=", sbP, z15, z16);
        sbP.append(", isMatchedAndAnimate=");
        sbP.append(z17);
        sbP.append(", displayType=");
        sbP.append(displayType);
        sbP.append(", displayCharWords=");
        sbP.append(list);
        sbP.append(", displayZhuyinCharWords=");
        sbP.append(list2);
        sbP.append(", selectedState=");
        sbP.append(optionItemSelectedState);
        sbP.append(", visemedMap=");
        sbP.append(list3);
        sbP.append(", chineseToneMetaData=");
        sbP.append(chineseToneMetaData);
        sbP.append(", randomId=");
        sbP.append(i14);
        sbP.append(")");
        return sbP.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CourseWord(long j11, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, String str8, String str9, String str10, String str11, Uri uri, Uri uri2, Uri uri3, Uri uri4, int i13, SyllablePhonemeResult syllablePhonemeResult, boolean z11, boolean z12, String str12, String str13, String str14, String str15, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, DisplayType displayType, List list, List list2, OptionItemSelectedState optionItemSelectedState, List list3, ChineseToneMetaData chineseToneMetaData, int i14, int i15, int i16, f fVar) {
        Uri uri5;
        Uri uri6;
        Uri uri7;
        Uri uri8;
        String str16 = (i15 & 256) != 0 ? BuildConfig.VERSION_NAME : str6;
        String str17 = (i15 & 512) != 0 ? BuildConfig.VERSION_NAME : str7;
        String str18 = (i15 & 1024) != 0 ? BuildConfig.VERSION_NAME : str8;
        String str19 = (i15 & 2048) != 0 ? BuildConfig.VERSION_NAME : str9;
        String str20 = (i15 & 4096) != 0 ? BuildConfig.VERSION_NAME : str10;
        String str21 = (i15 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str11;
        if ((i15 & 16384) != 0) {
            Uri uri9 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri9, "parse(...)");
            uri5 = uri9;
        } else {
            uri5 = uri;
        }
        if ((32768 & i15) != 0) {
            Uri uri10 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri10, "parse(...)");
            uri6 = uri10;
        } else {
            uri6 = uri2;
        }
        if ((65536 & i15) != 0) {
            Uri uri11 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri11, "parse(...)");
            uri7 = uri11;
        } else {
            uri7 = uri3;
        }
        if ((131072 & i15) != 0) {
            Uri uri12 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri12, "parse(...)");
            uri8 = uri12;
        } else {
            uri8 = uri4;
        }
        int i17 = (262144 & i15) != 0 ? -1 : i13;
        SyllablePhonemeResult syllablePhonemeResult2 = (524288 & i15) != 0 ? null : syllablePhonemeResult;
        boolean z18 = (1048576 & i15) != 0 ? false : z11;
        boolean z19 = (2097152 & i15) != 0 ? true : z12;
        String str22 = (4194304 & i15) != 0 ? BuildConfig.VERSION_NAME : str12;
        String str23 = (8388608 & i15) != 0 ? BuildConfig.VERSION_NAME : str13;
        String str24 = (16777216 & i15) != 0 ? BuildConfig.VERSION_NAME : str14;
        String str25 = (33554432 & i15) != 0 ? BuildConfig.VERSION_NAME : str15;
        boolean z20 = (67108864 & i15) != 0 ? false : z13;
        boolean z21 = (134217728 & i15) != 0 ? false : z14;
        boolean z22 = (268435456 & i15) != 0 ? false : z15;
        boolean z23 = (536870912 & i15) != 0 ? false : z16;
        boolean z24 = (1073741824 & i15) != 0 ? false : z17;
        DisplayType displayType2 = (i15 & Integer.MIN_VALUE) != 0 ? DisplayType.BOTH : displayType;
        int i18 = i16 & 1;
        ry.r rVar = ry.r.f50854a;
        this(j11, str, str2, str3, str4, str5, i11, i12, str16, str17, str18, str19, str20, str21, uri5, uri6, uri7, uri8, i17, syllablePhonemeResult2, z18, z19, str22, str23, str24, str25, z20, z21, z22, z23, z24, displayType2, i18 != 0 ? rVar : list, (i16 & 2) != 0 ? rVar : list2, (i16 & 4) != 0 ? OptionItemSelectedState.DEFAULT : optionItemSelectedState, (i16 & 8) != 0 ? rVar : list3, (i16 & 16) != 0 ? new ChineseToneMetaData() : chineseToneMetaData, (i16 & 32) != 0 ? UUID.randomUUID().hashCode() : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseWord(long j11, String word, int i11) {
        this(j11, word, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, i11, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, word, false, false, false, false, false, null, null, null, null, null, null, 0, -33554688, 63, null);
        m.f(word, "word");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseWord(long j11, String word, String translation) {
        this(j11, word, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, translation, BuildConfig.VERSION_NAME, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, word, false, false, false, false, false, null, null, null, null, null, null, 0, -33554688, 63, null);
        m.f(word, "word");
        m.f(translation, "translation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseWord(long j11, String word, int i11, String translation) {
        this(j11, word, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, translation, BuildConfig.VERSION_NAME, i11, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, word, false, false, false, false, false, null, null, null, null, null, null, 0, -33554688, 63, null);
        m.f(word, "word");
        m.f(translation, "translation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseWord(long j11, String word, String zhuYin, String luoMa, int i11, String translation) {
        this(j11, word, zhuYin, luoMa, translation, BuildConfig.VERSION_NAME, i11, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, word, false, false, false, false, false, null, null, null, null, null, null, 0, -33554688, 63, null);
        m.f(word, "word");
        m.f(zhuYin, "zhuYin");
        m.f(luoMa, "luoMa");
        m.f(translation, "translation");
    }
}
