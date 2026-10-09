package kv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38721d;

    public c0(long j11, String str, String leftText, String rightText) {
        kotlin.jvm.internal.m.f(leftText, "leftText");
        kotlin.jvm.internal.m.f(rightText, "rightText");
        this.f38718a = j11;
        this.f38719b = str;
        this.f38720c = leftText;
        this.f38721d = rightText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f38718a == c0Var.f38718a && kotlin.jvm.internal.m.a(this.f38719b, c0Var.f38719b) && kotlin.jvm.internal.m.a(this.f38720c, c0Var.f38720c) && kotlin.jvm.internal.m.a(this.f38721d, c0Var.f38721d);
    }

    public final int hashCode() {
        return this.f38721d.hashCode() + defpackage.e.d(defpackage.e.d(Long.hashCode(this.f38718a) * 31, 31, this.f38719b), 31, this.f38720c);
    }

    public final String toString() {
        StringBuilder sbP = b7.e0.p(this.f38718a, "JPSyllableExamOption(wordId=", ", romanization=", this.f38719b);
        com.google.android.material.datepicker.d.w(sbP, ", leftText=", this.f38720c, ", rightText=", this.f38721d);
        sbP.append(")");
        return sbP.toString();
    }
}
