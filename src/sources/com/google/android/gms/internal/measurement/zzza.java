package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzza {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f12203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zzza f12204e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12207c;

    static {
        long jCharAt = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            jCharAt |= (((long) i11) + 1) << ((int) (((long) (" #(+,-0".charAt(i11) - ' ')) * 3));
        }
        f12203d = jCharAt;
        f12204e = new zzza(0, -1, -1);
    }

    public zzza(int i11, int i12, int i13) {
        this.f12205a = i11;
        this.f12206b = i12;
        this.f12207c = i13;
    }

    public static int e(int i11, int i12, String str) {
        if (i11 == i12) {
            throw zzabo.b(i11 - 1, "missing precision", str);
        }
        int i13 = 0;
        for (int i14 = i11; i14 < i12; i14++) {
            char cCharAt = (char) (str.charAt(i14) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.b(i14, "invalid precision character", str);
            }
            i13 = (i13 * 10) + cCharAt;
            if (i13 > 999999) {
                throw zzabo.a("precision too large", i11, i12, str);
            }
        }
        if (i13 != 0) {
            return i13;
        }
        if (i12 == i11 + 1) {
            return 0;
        }
        throw zzabo.a("invalid precision", i11, i12, str);
    }

    public final boolean a() {
        return this == f12204e;
    }

    public final boolean b(int i11, boolean z11) {
        int i12;
        if (a()) {
            return true;
        }
        int i13 = ~i11;
        int i14 = this.f12205a;
        if ((i13 & i14) != 0) {
            return false;
        }
        if ((!z11 && this.f12207c != -1) || (i14 & 9) == 9 || (i12 = i14 & 96) == 96) {
            return false;
        }
        return i12 == 0 || this.f12206b != -1;
    }

    public final boolean c() {
        return (this.f12205a & 128) != 0;
    }

    public final void d(StringBuilder sb2) {
        if (a()) {
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = this.f12205a & (-129);
            int i13 = 1 << i11;
            if (i13 > i12) {
                break;
            }
            if ((i12 & i13) != 0) {
                sb2.append(" #(+,-0".charAt(i11));
            }
            i11++;
        }
        int i14 = this.f12206b;
        if (i14 != -1) {
            sb2.append(i14);
        }
        int i15 = this.f12207c;
        if (i15 != -1) {
            sb2.append('.');
            sb2.append(i15);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzza) {
            zzza zzzaVar = (zzza) obj;
            if (zzzaVar.f12205a == this.f12205a && zzzaVar.f12206b == this.f12206b && zzzaVar.f12207c == this.f12207c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f12205a * 31) + this.f12206b) * 31) + this.f12207c;
    }
}
