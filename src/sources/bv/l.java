package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class l {
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6317d;

    public /* synthetic */ l(String str, int i11, int i12, int i13, int i14) {
        if (15 != (i11 & 15)) {
            d1.k(i11, 15, j.f6312a.getDescriptor());
            throw null;
        }
        this.f6314a = i12;
        this.f6315b = str;
        this.f6316c = i13;
        this.f6317d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f6314a == lVar.f6314a && kotlin.jvm.internal.m.a(this.f6315b, lVar.f6315b) && this.f6316c == lVar.f6316c && this.f6317d == lVar.f6317d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6317d) + defpackage.e.b(this.f6316c, defpackage.e.d(Integer.hashCode(this.f6314a) * 31, 31, this.f6315b), 31);
    }

    public final String toString() {
        return "AudioParams(sampleBytes=" + this.f6314a + ", audioType=" + this.f6315b + ", channel=" + this.f6316c + ", sampleRate=" + this.f6317d + ")";
    }
}
