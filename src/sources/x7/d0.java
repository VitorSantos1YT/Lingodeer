package x7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f55870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55872d;

    public d0(int i11, byte[] bArr, int i12, int i13) {
        this.f55869a = i11;
        this.f55870b = bArr;
        this.f55871c = i12;
        this.f55872d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class == obj.getClass()) {
            d0 d0Var = (d0) obj;
            if (this.f55869a == d0Var.f55869a && this.f55871c == d0Var.f55871c && this.f55872d == d0Var.f55872d && Arrays.equals(this.f55870b, d0Var.f55870b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f55870b) + (this.f55869a * 31)) * 31) + this.f55871c) * 31) + this.f55872d;
    }
}
