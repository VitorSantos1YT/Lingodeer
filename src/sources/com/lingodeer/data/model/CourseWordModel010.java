package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import java.util.List;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseWordModel010 {
    private final String answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22302id;
    private final String imageOptions;
    private final List<CourseWord> optionList;
    private final CourseWord word;
    private final long wordId;

    public CourseWordModel010(long j11, long j12, String imageOptions, String answer, CourseWord word, List<CourseWord> optionList) {
        m.f(imageOptions, "imageOptions");
        m.f(answer, "answer");
        m.f(word, "word");
        m.f(optionList, "optionList");
        this.f22302id = j11;
        this.wordId = j12;
        this.imageOptions = imageOptions;
        this.answer = answer;
        this.word = word;
        this.optionList = optionList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CourseWordModel010 copy$default(CourseWordModel010 courseWordModel010, long j11, long j12, String str, String str2, CourseWord courseWord, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseWordModel010.f22302id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseWordModel010.wordId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = courseWordModel010.imageOptions;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            str2 = courseWordModel010.answer;
        }
        return courseWordModel010.copy(j13, j14, str3, str2, (i11 & 16) != 0 ? courseWordModel010.word : courseWord, (i11 & 32) != 0 ? courseWordModel010.optionList : list);
    }

    public final long component1() {
        return this.f22302id;
    }

    public final long component2() {
        return this.wordId;
    }

    public final String component3() {
        return this.imageOptions;
    }

    public final String component4() {
        return this.answer;
    }

    public final CourseWord component5() {
        return this.word;
    }

    public final List<CourseWord> component6() {
        return this.optionList;
    }

    public final CourseWordModel010 copy(long j11, long j12, String imageOptions, String answer, CourseWord word, List<CourseWord> optionList) {
        m.f(imageOptions, "imageOptions");
        m.f(answer, "answer");
        m.f(word, "word");
        m.f(optionList, "optionList");
        return new CourseWordModel010(j11, j12, imageOptions, answer, word, optionList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseWordModel010)) {
            return false;
        }
        CourseWordModel010 courseWordModel010 = (CourseWordModel010) obj;
        return this.f22302id == courseWordModel010.f22302id && this.wordId == courseWordModel010.wordId && m.a(this.imageOptions, courseWordModel010.imageOptions) && m.a(this.answer, courseWordModel010.answer) && m.a(this.word, courseWordModel010.word) && m.a(this.optionList, courseWordModel010.optionList);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22302id;
    }

    public final String getImageOptions() {
        return this.imageOptions;
    }

    public final List<CourseWord> getOptionList() {
        return this.optionList;
    }

    public final CourseWord getWord() {
        return this.word;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public int hashCode() {
        return this.optionList.hashCode() + ((this.word.hashCode() + e.d(e.d(e.f(this.wordId, Long.hashCode(this.f22302id) * 31, 31), 31, this.imageOptions), 31, this.answer)) * 31);
    }

    public String toString() {
        long j11 = this.f22302id;
        long j12 = this.wordId;
        String str = this.imageOptions;
        String str2 = this.answer;
        CourseWord courseWord = this.word;
        List<CourseWord> list = this.optionList;
        StringBuilder sbJ = c.j(j11, "CourseWordModel010(id=", ", wordId=");
        e0.w(j12, ", imageOptions=", str, sbJ);
        sbJ.append(", answer=");
        sbJ.append(str2);
        sbJ.append(", word=");
        sbJ.append(courseWord);
        sbJ.append(", optionList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }
}
