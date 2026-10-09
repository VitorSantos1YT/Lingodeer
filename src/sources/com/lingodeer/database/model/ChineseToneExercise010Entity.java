package com.lingodeer.database.model;

import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneExercise010Entity {
    private final a answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22359id;
    private final a imageOptions;
    private final long wordId;

    public ChineseToneExercise010Entity(long j11, long j12, a aVar, a aVar2) {
        this.f22359id = j11;
        this.wordId = j12;
        this.imageOptions = aVar;
        this.answer = aVar2;
    }

    public static /* synthetic */ ChineseToneExercise010Entity copy$default(ChineseToneExercise010Entity chineseToneExercise010Entity, long j11, long j12, a aVar, a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneExercise010Entity.f22359id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = chineseToneExercise010Entity.wordId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            aVar = chineseToneExercise010Entity.imageOptions;
        }
        a aVar3 = aVar;
        if ((i11 & 8) != 0) {
            aVar2 = chineseToneExercise010Entity.answer;
        }
        return chineseToneExercise010Entity.copy(j13, j14, aVar3, aVar2);
    }

    public final long component1() {
        return this.f22359id;
    }

    public final long component2() {
        return this.wordId;
    }

    public final a component3() {
        return this.imageOptions;
    }

    public final a component4() {
        return this.answer;
    }

    public final ChineseToneExercise010Entity copy(long j11, long j12, a aVar, a aVar2) {
        return new ChineseToneExercise010Entity(j11, j12, aVar, aVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneExercise010Entity)) {
            return false;
        }
        ChineseToneExercise010Entity chineseToneExercise010Entity = (ChineseToneExercise010Entity) obj;
        return this.f22359id == chineseToneExercise010Entity.f22359id && this.wordId == chineseToneExercise010Entity.wordId && m.a(this.imageOptions, chineseToneExercise010Entity.imageOptions) && m.a(this.answer, chineseToneExercise010Entity.answer);
    }

    public final a getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22359id;
    }

    public final a getImageOptions() {
        return this.imageOptions;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public int hashCode() {
        int iF = e.f(this.wordId, Long.hashCode(this.f22359id) * 31, 31);
        a aVar = this.imageOptions;
        int iHashCode = (iF + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.answer;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        long j11 = this.f22359id;
        long j12 = this.wordId;
        a aVar = this.imageOptions;
        a aVar2 = this.answer;
        StringBuilder sbJ = c.j(j11, "ChineseToneExercise010Entity(id=", ", wordId=");
        sbJ.append(j12);
        sbJ.append(", imageOptions=");
        sbJ.append(aVar);
        sbJ.append(", answer=");
        sbJ.append(aVar2);
        sbJ.append(")");
        return sbJ.toString();
    }
}
