package kv;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f38733e;

    public e0(List characterRuns, List romanizationRuns, String character, String romanization, String note) {
        kotlin.jvm.internal.m.f(character, "character");
        kotlin.jvm.internal.m.f(romanization, "romanization");
        kotlin.jvm.internal.m.f(note, "note");
        kotlin.jvm.internal.m.f(characterRuns, "characterRuns");
        kotlin.jvm.internal.m.f(romanizationRuns, "romanizationRuns");
        this.f38729a = character;
        this.f38730b = romanization;
        this.f38731c = note;
        this.f38732d = characterRuns;
        this.f38733e = romanizationRuns;
    }

    public static e0 a(e0 e0Var, String character) {
        String romanization = e0Var.f38730b;
        String note = e0Var.f38731c;
        List characterRuns = e0Var.f38732d;
        List romanizationRuns = e0Var.f38733e;
        kotlin.jvm.internal.m.f(character, "character");
        kotlin.jvm.internal.m.f(romanization, "romanization");
        kotlin.jvm.internal.m.f(note, "note");
        kotlin.jvm.internal.m.f(characterRuns, "characterRuns");
        kotlin.jvm.internal.m.f(romanizationRuns, "romanizationRuns");
        return new e0(characterRuns, romanizationRuns, character, romanization, note);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.m.a(this.f38729a, e0Var.f38729a) && kotlin.jvm.internal.m.a(this.f38730b, e0Var.f38730b) && kotlin.jvm.internal.m.a(this.f38731c, e0Var.f38731c) && kotlin.jvm.internal.m.a(this.f38732d, e0Var.f38732d) && kotlin.jvm.internal.m.a(this.f38733e, e0Var.f38733e);
    }

    public final int hashCode() {
        return this.f38733e.hashCode() + hh.p0.b(defpackage.e.d(defpackage.e.d(this.f38729a.hashCode() * 31, 31, this.f38730b), 31, this.f38731c), 31, this.f38732d);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("JPSyllableExample(character=", this.f38729a, kHfjNGauVgdF.QwalKCfyqOw, this.f38730b, ", note=");
        sbS.append(this.f38731c);
        sbS.append(", characterRuns=");
        sbS.append(this.f38732d);
        sbS.append(", romanizationRuns=");
        return b7.e0.n(sbS, this.f38733e, ")");
    }
}
