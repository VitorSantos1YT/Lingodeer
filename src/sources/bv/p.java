package bv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6341c;

    public p(String syllable, int i11, String toneMarkPinyin) {
        kotlin.jvm.internal.m.f(syllable, "syllable");
        kotlin.jvm.internal.m.f(toneMarkPinyin, "toneMarkPinyin");
        this.f6339a = syllable;
        this.f6340b = i11;
        this.f6341c = toneMarkPinyin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f6339a, pVar.f6339a) && this.f6340b == pVar.f6340b && kotlin.jvm.internal.m.a(this.f6341c, pVar.f6341c);
    }

    public final int hashCode() {
        return this.f6341c.hashCode() + defpackage.e.b(this.f6340b, this.f6339a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ep.a.k(defpackage.e.q(this.f6340b, "PinyinInfo(syllable=", this.f6339a, ", tone=", ", toneMarkPinyin="), this.f6341c, ")");
    }
}
