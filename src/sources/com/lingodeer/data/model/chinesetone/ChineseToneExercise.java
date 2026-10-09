package com.lingodeer.data.model.chinesetone;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ChineseToneExercise {
    private final String answer;
    private final ExerciseType exerciseType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f22327id;
    private final String options;
    private final long wordId;

    public ChineseToneExercise(long j11, long j12, ExerciseType exerciseType, String options, String answer) {
        m.f(exerciseType, "exerciseType");
        m.f(options, "options");
        m.f(answer, "answer");
        this.f22327id = j11;
        this.wordId = j12;
        this.exerciseType = exerciseType;
        this.options = options;
        this.answer = answer;
    }

    public static /* synthetic */ ChineseToneExercise copy$default(ChineseToneExercise chineseToneExercise, long j11, long j12, ExerciseType exerciseType, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = chineseToneExercise.f22327id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = chineseToneExercise.wordId;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            exerciseType = chineseToneExercise.exerciseType;
        }
        ExerciseType exerciseType2 = exerciseType;
        if ((i11 & 8) != 0) {
            str = chineseToneExercise.options;
        }
        String str3 = str;
        if ((i11 & 16) != 0) {
            str2 = chineseToneExercise.answer;
        }
        return chineseToneExercise.copy(j13, j14, exerciseType2, str3, str2);
    }

    public final long component1() {
        return this.f22327id;
    }

    public final long component2() {
        return this.wordId;
    }

    public final ExerciseType component3() {
        return this.exerciseType;
    }

    public final String component4() {
        return this.options;
    }

    public final String component5() {
        return this.answer;
    }

    public final ChineseToneExercise copy(long j11, long j12, ExerciseType exerciseType, String options, String answer) {
        m.f(exerciseType, "exerciseType");
        m.f(options, "options");
        m.f(answer, "answer");
        return new ChineseToneExercise(j11, j12, exerciseType, options, answer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChineseToneExercise)) {
            return false;
        }
        ChineseToneExercise chineseToneExercise = (ChineseToneExercise) obj;
        return this.f22327id == chineseToneExercise.f22327id && this.wordId == chineseToneExercise.wordId && this.exerciseType == chineseToneExercise.exerciseType && m.a(this.options, chineseToneExercise.options) && m.a(this.answer, chineseToneExercise.answer);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final ExerciseType getExerciseType() {
        return this.exerciseType;
    }

    public final long getId() {
        return this.f22327id;
    }

    public final String getOptions() {
        return this.options;
    }

    public final long getWordId() {
        return this.wordId;
    }

    public int hashCode() {
        return this.answer.hashCode() + e.d((this.exerciseType.hashCode() + e.f(this.wordId, Long.hashCode(this.f22327id) * 31, 31)) * 31, 31, this.options);
    }

    public String toString() {
        long j11 = this.f22327id;
        long j12 = this.wordId;
        ExerciseType exerciseType = this.exerciseType;
        String str = this.options;
        String str2 = this.answer;
        StringBuilder sbJ = c.j(j11, "ChineseToneExercise(id=", ", wordId=");
        sbJ.append(j12);
        sbJ.append(", exerciseType=");
        sbJ.append(exerciseType);
        d.w(sbJ, ", options=", str, ", answer=", str2);
        sbJ.append(")");
        return sbJ.toString();
    }
}
