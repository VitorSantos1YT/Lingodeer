package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseSentenceModel000 {
    private final String explanation;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22289id;
    private final long sentenceId;

    public CourseSentenceModel000(long j11, long j12, String explanation) {
        m.f(explanation, "explanation");
        this.f22289id = j11;
        this.sentenceId = j12;
        this.explanation = explanation;
    }

    public static /* synthetic */ CourseSentenceModel000 copy$default(CourseSentenceModel000 courseSentenceModel000, long j11, long j12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courseSentenceModel000.f22289id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = courseSentenceModel000.sentenceId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            str = courseSentenceModel000.explanation;
        }
        return courseSentenceModel000.copy(j13, j14, str);
    }

    public final long component1() {
        return this.f22289id;
    }

    public final long component2() {
        return this.sentenceId;
    }

    public final String component3() {
        return this.explanation;
    }

    public final CourseSentenceModel000 copy(long j11, long j12, String explanation) {
        m.f(explanation, "explanation");
        return new CourseSentenceModel000(j11, j12, explanation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseSentenceModel000)) {
            return false;
        }
        CourseSentenceModel000 courseSentenceModel000 = (CourseSentenceModel000) obj;
        return this.f22289id == courseSentenceModel000.f22289id && this.sentenceId == courseSentenceModel000.sentenceId && m.a(this.explanation, courseSentenceModel000.explanation);
    }

    public final String getExplanation() {
        return this.explanation;
    }

    public final long getId() {
        return this.f22289id;
    }

    public final long getSentenceId() {
        return this.sentenceId;
    }

    public int hashCode() {
        return this.explanation.hashCode() + e.f(this.sentenceId, Long.hashCode(this.f22289id) * 31, 31);
    }

    public String toString() {
        long j11 = this.f22289id;
        long j12 = this.sentenceId;
        String str = this.explanation;
        StringBuilder sbJ = c.j(j11, "CourseSentenceModel000(id=", ", sentenceId=");
        e0.w(j12, ", explanation=", str, sbJ);
        sbJ.append(")");
        return sbJ.toString();
    }
}
