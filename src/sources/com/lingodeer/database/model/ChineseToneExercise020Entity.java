package com.lingodeer.database.model;

import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;
import zt.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneExercise020Entity {
    private final a answer;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22360id;
    private final a options;
    private final long wordId;

    public ChineseToneExercise020Entity(long j11, long j12, a aVar, a aVar2) {
        this.f22360id = j11;
        this.wordId = j12;
        this.options = aVar;
        this.answer = aVar2;
    }

    public static /* synthetic */ ChineseToneExercise020Entity copy$default(ChineseToneExercise020Entity chineseToneExercise020Entity, long j11, long j12, a aVar, a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneExercise020Entity.f22360id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = chineseToneExercise020Entity.wordId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            aVar = chineseToneExercise020Entity.options;
        }
        a aVar3 = aVar;
        if ((i11 & 8) != 0) {
            aVar2 = chineseToneExercise020Entity.answer;
        }
        return chineseToneExercise020Entity.copy(j13, j14, aVar3, aVar2);
    }

    public final long component1() {
        return this.f22360id;
    }

    public final long component2() {
        return this.wordId;
    }

    public final a component3() {
        return this.options;
    }

    public final a component4() {
        return this.answer;
    }

    public final ChineseToneExercise020Entity copy(long j11, long j12, a aVar, a aVar2) {
        return new ChineseToneExercise020Entity(j11, j12, aVar, aVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneExercise020Entity)) {
            return false;
        }
        ChineseToneExercise020Entity chineseToneExercise020Entity = (ChineseToneExercise020Entity) obj;
        return this.f22360id == chineseToneExercise020Entity.f22360id && this.wordId == chineseToneExercise020Entity.wordId && m.a(this.options, chineseToneExercise020Entity.options) && m.a(this.answer, chineseToneExercise020Entity.answer);
    }

    public final a getAnswer() {
        return this.answer;
    }

    public final long getId() {
        return this.f22360id;
    }

    public final a getOptions() {
        return this.options;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public int hashCode() {
        int iF = e.f(this.wordId, Long.hashCode(this.f22360id) * 31, 31);
        a aVar = this.options;
        int iHashCode = (iF + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.answer;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        long j11 = this.f22360id;
        long j12 = this.wordId;
        a aVar = this.options;
        a aVar2 = this.answer;
        StringBuilder sbJ = c.j(j11, "ChineseToneExercise020Entity(id=", ", wordId=");
        sbJ.append(j12);
        sbJ.append(", options=");
        sbJ.append(aVar);
        sbJ.append(", answer=");
        sbJ.append(aVar2);
        sbJ.append(")");
        return sbJ.toString();
    }
}
