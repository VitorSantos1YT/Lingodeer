package com.lingodeer.data.model;

import defpackage.e;
import ep.a;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LanStaticsInfo {
    private final int lan;
    private final float progress;
    private final int sentencesCount;
    private final int wordsCount;
    private final int wordsSentencesCount;

    public LanStaticsInfo(int i11, float f5, int i12, int i13, int i14) {
        this.lan = i11;
        this.progress = f5;
        this.wordsCount = i12;
        this.sentencesCount = i13;
        this.wordsSentencesCount = i14;
    }

    public static /* synthetic */ LanStaticsInfo copy$default(LanStaticsInfo lanStaticsInfo, int i11, float f5, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = lanStaticsInfo.lan;
        }
        if ((i15 & 2) != 0) {
            f5 = lanStaticsInfo.progress;
        }
        if ((i15 & 4) != 0) {
            i12 = lanStaticsInfo.wordsCount;
        }
        if ((i15 & 8) != 0) {
            i13 = lanStaticsInfo.sentencesCount;
        }
        if ((i15 & 16) != 0) {
            i14 = lanStaticsInfo.wordsSentencesCount;
        }
        int i16 = i14;
        int i17 = i12;
        return lanStaticsInfo.copy(i11, f5, i17, i13, i16);
    }

    public final int component1() {
        return this.lan;
    }

    public final float component2() {
        return this.progress;
    }

    public final int component3() {
        return this.wordsCount;
    }

    public final int component4() {
        return this.sentencesCount;
    }

    public final int component5() {
        return this.wordsSentencesCount;
    }

    public final LanStaticsInfo copy(int i11, float f5, int i12, int i13, int i14) {
        return new LanStaticsInfo(i11, f5, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanStaticsInfo)) {
            return false;
        }
        LanStaticsInfo lanStaticsInfo = (LanStaticsInfo) obj;
        return this.lan == lanStaticsInfo.lan && Float.compare(this.progress, lanStaticsInfo.progress) == 0 && this.wordsCount == lanStaticsInfo.wordsCount && this.sentencesCount == lanStaticsInfo.sentencesCount && this.wordsSentencesCount == lanStaticsInfo.wordsSentencesCount;
    }

    public final int getLan() {
        return this.lan;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSentencesCount() {
        return this.sentencesCount;
    }

    public final int getWordsCount() {
        return this.wordsCount;
    }

    public final int getWordsSentencesCount() {
        return this.wordsSentencesCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.wordsSentencesCount) + e.b(this.sentencesCount, e.b(this.wordsCount, e.a(Integer.hashCode(this.lan) * 31, this.progress, 31), 31), 31);
    }

    public String toString() {
        int i11 = this.lan;
        float f5 = this.progress;
        int i12 = this.wordsCount;
        int i13 = this.sentencesCount;
        int i14 = this.wordsSentencesCount;
        StringBuilder sb2 = new StringBuilder("LanStaticsInfo(lan=");
        sb2.append(i11);
        sb2.append(", progress=");
        sb2.append(f5);
        sb2.append(", wordsCount=");
        a.v(i12, i13, ", sentencesCount=", ", wordsSentencesCount=", sb2);
        return p0.i(i14, ")", sb2);
    }
}
