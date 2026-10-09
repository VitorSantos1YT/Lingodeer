package com.lingodeer.data.model;

import android.net.Uri;
import b7.e0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import hh.p0;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentence {
    private final Uri audioUri;
    private final List<CourseWord> courseWords;
    private final List<CourseWord> displayCourseWords;
    private final List<List<CourseWord>> displaySpellCharWords;
    private final List<CourseWord> displaySpellWords;
    private final String explain;
    private final boolean isCorrectedAnswer;
    private final boolean isEnabled;
    private final boolean isSelected;
    private final int randomId;
    private final String recordPath;
    private final OptionItemSelectedState selectedState;
    private final String sentence;
    private final long sentenceId;
    private final SentenceMFType sentenceMFType;
    private final String sentenceNotice;
    private final List<List<r>> slowVisemedMap;
    private final List<CourseWord> speechDisplayCourseWords;
    private float speechScore;
    private final String translation;
    private final Uri videoUri;
    private final List<r> visemedMap;
    private final String wordList;

    /* JADX WARN: Multi-variable type inference failed */
    public CourseSentence(long j11, String sentence, String wordList, String sentenceNotice, String translation, String explain, Uri videoUri, Uri audioUri, String recordPath, boolean z11, boolean z12, boolean z13, List<CourseWord> courseWords, List<CourseWord> displayCourseWords, List<CourseWord> speechDisplayCourseWords, List<CourseWord> displaySpellWords, List<? extends List<CourseWord>> displaySpellCharWords, OptionItemSelectedState selectedState, SentenceMFType sentenceMFType, List<r> visemedMap, List<? extends List<r>> slowVisemedMap, float f5, int i11) {
        m.f(sentence, "sentence");
        m.f(wordList, "wordList");
        m.f(sentenceNotice, "sentenceNotice");
        m.f(translation, "translation");
        m.f(explain, "explain");
        m.f(videoUri, "videoUri");
        m.f(audioUri, "audioUri");
        m.f(recordPath, "recordPath");
        m.f(courseWords, "courseWords");
        m.f(displayCourseWords, "displayCourseWords");
        m.f(speechDisplayCourseWords, "speechDisplayCourseWords");
        m.f(displaySpellWords, "displaySpellWords");
        m.f(displaySpellCharWords, "displaySpellCharWords");
        m.f(selectedState, "selectedState");
        m.f(sentenceMFType, "sentenceMFType");
        m.f(visemedMap, "visemedMap");
        m.f(slowVisemedMap, "slowVisemedMap");
        this.sentenceId = j11;
        this.sentence = sentence;
        this.wordList = wordList;
        this.sentenceNotice = sentenceNotice;
        this.translation = translation;
        this.explain = explain;
        this.videoUri = videoUri;
        this.audioUri = audioUri;
        this.recordPath = recordPath;
        this.isSelected = z11;
        this.isCorrectedAnswer = z12;
        this.isEnabled = z13;
        this.courseWords = courseWords;
        this.displayCourseWords = displayCourseWords;
        this.speechDisplayCourseWords = speechDisplayCourseWords;
        this.displaySpellWords = displaySpellWords;
        this.displaySpellCharWords = displaySpellCharWords;
        this.selectedState = selectedState;
        this.sentenceMFType = sentenceMFType;
        this.visemedMap = visemedMap;
        this.slowVisemedMap = slowVisemedMap;
        this.speechScore = f5;
        this.randomId = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseSentence copy$default(CourseSentence courseSentence, long j11, String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, String str6, boolean z11, boolean z12, boolean z13, List list, List list2, List list3, List list4, List list5, OptionItemSelectedState optionItemSelectedState, SentenceMFType sentenceMFType, List list6, List list7, float f5, int i11, int i12, Object obj) {
        int i13;
        float f11;
        long j12 = (i12 & 1) != 0 ? courseSentence.sentenceId : j11;
        String str7 = (i12 & 2) != 0 ? courseSentence.sentence : str;
        String str8 = (i12 & 4) != 0 ? courseSentence.wordList : str2;
        String str9 = (i12 & 8) != 0 ? courseSentence.sentenceNotice : str3;
        String str10 = (i12 & 16) != 0 ? courseSentence.translation : str4;
        String str11 = (i12 & 32) != 0 ? courseSentence.explain : str5;
        Uri uri3 = (i12 & 64) != 0 ? courseSentence.videoUri : uri;
        Uri uri4 = (i12 & 128) != 0 ? courseSentence.audioUri : uri2;
        String str12 = (i12 & 256) != 0 ? courseSentence.recordPath : str6;
        boolean z14 = (i12 & 512) != 0 ? courseSentence.isSelected : z11;
        boolean z15 = (i12 & 1024) != 0 ? courseSentence.isCorrectedAnswer : z12;
        boolean z16 = (i12 & 2048) != 0 ? courseSentence.isEnabled : z13;
        List list8 = (i12 & 4096) != 0 ? courseSentence.courseWords : list;
        long j13 = j12;
        List list9 = (i12 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? courseSentence.displayCourseWords : list2;
        List list10 = (i12 & 16384) != 0 ? courseSentence.speechDisplayCourseWords : list3;
        List list11 = (i12 & 32768) != 0 ? courseSentence.displaySpellWords : list4;
        List list12 = (i12 & 65536) != 0 ? courseSentence.displaySpellCharWords : list5;
        OptionItemSelectedState optionItemSelectedState2 = (i12 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? courseSentence.selectedState : optionItemSelectedState;
        SentenceMFType sentenceMFType2 = (i12 & 262144) != 0 ? courseSentence.sentenceMFType : sentenceMFType;
        List list13 = (i12 & 524288) != 0 ? courseSentence.visemedMap : list6;
        List list14 = (i12 & 1048576) != 0 ? courseSentence.slowVisemedMap : list7;
        float f12 = (i12 & 2097152) != 0 ? courseSentence.speechScore : f5;
        if ((i12 & 4194304) != 0) {
            f11 = f12;
            i13 = courseSentence.randomId;
        } else {
            i13 = i11;
            f11 = f12;
        }
        return courseSentence.copy(j13, str7, str8, str9, str10, str11, uri3, uri4, str12, z14, z15, z16, list8, list9, list10, list11, list12, optionItemSelectedState2, sentenceMFType2, list13, list14, f11, i13);
    }

    public final long component1() {
        return this.sentenceId;
    }

    public final boolean component10() {
        return this.isSelected;
    }

    public final boolean component11() {
        return this.isCorrectedAnswer;
    }

    public final boolean component12() {
        return this.isEnabled;
    }

    public final List<CourseWord> component13() {
        return this.courseWords;
    }

    public final List<CourseWord> component14() {
        return this.displayCourseWords;
    }

    public final List<CourseWord> component15() {
        return this.speechDisplayCourseWords;
    }

    public final List<CourseWord> component16() {
        return this.displaySpellWords;
    }

    public final List<List<CourseWord>> component17() {
        return this.displaySpellCharWords;
    }

    public final OptionItemSelectedState component18() {
        return this.selectedState;
    }

    public final SentenceMFType component19() {
        return this.sentenceMFType;
    }

    public final String component2() {
        return this.sentence;
    }

    public final List<r> component20() {
        return this.visemedMap;
    }

    public final List<List<r>> component21() {
        return this.slowVisemedMap;
    }

    public final float component22() {
        return this.speechScore;
    }

    public final int component23() {
        return this.randomId;
    }

    public final String component3() {
        return this.wordList;
    }

    public final String component4() {
        return this.sentenceNotice;
    }

    public final String component5() {
        return this.translation;
    }

    public final String component6() {
        return this.explain;
    }

    public final Uri component7() {
        return this.videoUri;
    }

    public final Uri component8() {
        return this.audioUri;
    }

    public final String component9() {
        return this.recordPath;
    }

    public final CourseSentence copy(long j11, String sentence, String wordList, String sentenceNotice, String translation, String explain, Uri videoUri, Uri audioUri, String recordPath, boolean z11, boolean z12, boolean z13, List<CourseWord> courseWords, List<CourseWord> displayCourseWords, List<CourseWord> speechDisplayCourseWords, List<CourseWord> displaySpellWords, List<? extends List<CourseWord>> displaySpellCharWords, OptionItemSelectedState selectedState, SentenceMFType sentenceMFType, List<r> visemedMap, List<? extends List<r>> slowVisemedMap, float f5, int i11) {
        m.f(sentence, "sentence");
        m.f(wordList, "wordList");
        m.f(sentenceNotice, "sentenceNotice");
        m.f(translation, "translation");
        m.f(explain, "explain");
        m.f(videoUri, "videoUri");
        m.f(audioUri, "audioUri");
        m.f(recordPath, "recordPath");
        m.f(courseWords, "courseWords");
        m.f(displayCourseWords, "displayCourseWords");
        m.f(speechDisplayCourseWords, "speechDisplayCourseWords");
        m.f(displaySpellWords, "displaySpellWords");
        m.f(displaySpellCharWords, "displaySpellCharWords");
        m.f(selectedState, "selectedState");
        m.f(sentenceMFType, "sentenceMFType");
        m.f(visemedMap, "visemedMap");
        m.f(slowVisemedMap, "slowVisemedMap");
        return new CourseSentence(j11, sentence, wordList, sentenceNotice, translation, explain, videoUri, audioUri, recordPath, z11, z12, z13, courseWords, displayCourseWords, speechDisplayCourseWords, displaySpellWords, displaySpellCharWords, selectedState, sentenceMFType, visemedMap, slowVisemedMap, f5, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentence)) {
            return false;
        }
        CourseSentence courseSentence = (CourseSentence) obj;
        return this.sentenceId == courseSentence.sentenceId && m.a(this.sentence, courseSentence.sentence) && m.a(this.wordList, courseSentence.wordList) && m.a(this.sentenceNotice, courseSentence.sentenceNotice) && m.a(this.translation, courseSentence.translation) && m.a(this.explain, courseSentence.explain) && m.a(this.videoUri, courseSentence.videoUri) && m.a(this.audioUri, courseSentence.audioUri) && m.a(this.recordPath, courseSentence.recordPath) && this.isSelected == courseSentence.isSelected && this.isCorrectedAnswer == courseSentence.isCorrectedAnswer && this.isEnabled == courseSentence.isEnabled && m.a(this.courseWords, courseSentence.courseWords) && m.a(this.displayCourseWords, courseSentence.displayCourseWords) && m.a(this.speechDisplayCourseWords, courseSentence.speechDisplayCourseWords) && m.a(this.displaySpellWords, courseSentence.displaySpellWords) && m.a(this.displaySpellCharWords, courseSentence.displaySpellCharWords) && this.selectedState == courseSentence.selectedState && this.sentenceMFType == courseSentence.sentenceMFType && m.a(this.visemedMap, courseSentence.visemedMap) && m.a(this.slowVisemedMap, courseSentence.slowVisemedMap) && Float.compare(this.speechScore, courseSentence.speechScore) == 0 && this.randomId == courseSentence.randomId;
    }

    public final Uri getAudioUri() {
        return this.audioUri;
    }

    public final List<CourseWord> getCourseWords() {
        return this.courseWords;
    }

    public final List<CourseWord> getDisplayCourseWords() {
        return this.displayCourseWords;
    }

    public final List<List<CourseWord>> getDisplaySpellCharWords() {
        return this.displaySpellCharWords;
    }

    public final List<CourseWord> getDisplaySpellWords() {
        return this.displaySpellWords;
    }

    public final String getExplain() {
        return this.explain;
    }

    public final int getRandomId() {
        return this.randomId;
    }

    public final String getRecordPath() {
        return this.recordPath;
    }

    public final OptionItemSelectedState getSelectedState() {
        return this.selectedState;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getSentenceId() {
        return this.sentenceId;
    }

    public final SentenceMFType getSentenceMFType() {
        return this.sentenceMFType;
    }

    public final String getSentenceNotice() {
        return this.sentenceNotice;
    }

    public final List<List<r>> getSlowVisemedMap() {
        return this.slowVisemedMap;
    }

    public final List<CourseWord> getSpeechDisplayCourseWords() {
        return this.speechDisplayCourseWords;
    }

    public final float getSpeechScore() {
        return this.speechScore;
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

    public final String getWordList() {
        return this.wordList;
    }

    public int hashCode() {
        return Integer.hashCode(this.randomId) + e.a(p0.b(p0.b((this.sentenceMFType.hashCode() + ((this.selectedState.hashCode() + p0.b(p0.b(p0.b(p0.b(p0.b(e.e(e.e(e.e(e.d((this.audioUri.hashCode() + ((this.videoUri.hashCode() + e.d(e.d(e.d(e.d(e.d(Long.hashCode(this.sentenceId) * 31, 31, this.sentence), 31, this.wordList), 31, this.sentenceNotice), 31, this.translation), 31, this.explain)) * 31)) * 31, 31, this.recordPath), 31, this.isSelected), 31, this.isCorrectedAnswer), 31, this.isEnabled), 31, this.courseWords), 31, this.displayCourseWords), 31, this.speechDisplayCourseWords), 31, this.displaySpellWords), 31, this.displaySpellCharWords)) * 31)) * 31, 31, this.visemedMap), 31, this.slowVisemedMap), this.speechScore, 31);
    }

    public final boolean isCorrectedAnswer() {
        return this.isCorrectedAnswer;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSpeechScore(float f5) {
        this.speechScore = f5;
    }

    public String toString() {
        long j11 = this.sentenceId;
        String str = this.sentence;
        String str2 = this.wordList;
        String str3 = this.sentenceNotice;
        String str4 = this.translation;
        String str5 = this.explain;
        Uri uri = this.videoUri;
        Uri uri2 = this.audioUri;
        String str6 = this.recordPath;
        boolean z11 = this.isSelected;
        boolean z12 = this.isCorrectedAnswer;
        boolean z13 = this.isEnabled;
        List<CourseWord> list = this.courseWords;
        List<CourseWord> list2 = this.displayCourseWords;
        List<CourseWord> list3 = this.speechDisplayCourseWords;
        List<CourseWord> list4 = this.displaySpellWords;
        List<List<CourseWord>> list5 = this.displaySpellCharWords;
        OptionItemSelectedState optionItemSelectedState = this.selectedState;
        SentenceMFType sentenceMFType = this.sentenceMFType;
        List<r> list6 = this.visemedMap;
        List<List<r>> list7 = this.slowVisemedMap;
        float f5 = this.speechScore;
        int i11 = this.randomId;
        StringBuilder sbP = e0.p(j11, "CourseSentence(sentenceId=", ", sentence=", str);
        d.w(sbP, ", wordList=", str2, ", sentenceNotice=", str3);
        d.w(sbP, ", translation=", str4, ", explain=", str5);
        sbP.append(", videoUri=");
        sbP.append(uri);
        sbP.append(", audioUri=");
        sbP.append(uri2);
        sbP.append(", recordPath=");
        sbP.append(str6);
        sbP.append(", isSelected=");
        sbP.append(z11);
        e0.z(", isCorrectedAnswer=", ", isEnabled=", sbP, z12, z13);
        sbP.append(", courseWords=");
        sbP.append(list);
        sbP.append(", displayCourseWords=");
        sbP.append(list2);
        sbP.append(", speechDisplayCourseWords=");
        sbP.append(list3);
        sbP.append(", displaySpellWords=");
        sbP.append(list4);
        sbP.append(", displaySpellCharWords=");
        sbP.append(list5);
        sbP.append(", selectedState=");
        sbP.append(optionItemSelectedState);
        sbP.append(", sentenceMFType=");
        sbP.append(sentenceMFType);
        sbP.append(", visemedMap=");
        sbP.append(list6);
        sbP.append(", slowVisemedMap=");
        sbP.append(list7);
        sbP.append(", speechScore=");
        sbP.append(f5);
        sbP.append(", randomId=");
        sbP.append(i11);
        sbP.append(")");
        return sbP.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CourseSentence(long j11, String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2, String str6, boolean z11, boolean z12, boolean z13, List list, List list2, List list3, List list4, List list5, OptionItemSelectedState optionItemSelectedState, SentenceMFType sentenceMFType, List list6, List list7, float f5, int i11, int i12, f fVar) {
        Uri uri3;
        Uri uri4;
        if ((i12 & 64) != 0) {
            Uri uri5 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri5, "parse(...)");
            uri3 = uri5;
        } else {
            uri3 = uri;
        }
        if ((i12 & 128) != 0) {
            Uri uri6 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri6, "parse(...)");
            uri4 = uri6;
        } else {
            uri4 = uri2;
        }
        String str7 = (i12 & 256) != 0 ? BuildConfig.VERSION_NAME : str6;
        boolean z14 = (i12 & 512) != 0 ? false : z11;
        boolean z15 = (i12 & 1024) != 0 ? false : z12;
        boolean z16 = (i12 & 2048) != 0 ? true : z13;
        int i13 = i12 & 4096;
        ry.r rVar = ry.r.f50854a;
        this(j11, str, str2, str3, str4, str5, uri3, uri4, str7, z14, z15, z16, i13 != 0 ? rVar : list, (i12 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? rVar : list2, (i12 & 16384) != 0 ? rVar : list3, (32768 & i12) != 0 ? rVar : list4, (65536 & i12) != 0 ? rVar : list5, (131072 & i12) != 0 ? OptionItemSelectedState.DEFAULT : optionItemSelectedState, (262144 & i12) != 0 ? SentenceMFType.NORMAL : sentenceMFType, (524288 & i12) != 0 ? rVar : list6, (1048576 & i12) != 0 ? rVar : list7, (2097152 & i12) != 0 ? -1.0f : f5, (i12 & 4194304) != 0 ? UUID.randomUUID().hashCode() : i11);
    }

    public CourseSentence(long j11) {
        this(j11, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8388544, null);
    }
}
