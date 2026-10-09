package n9;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43597d;

    public i2(int i11, int i12, int i13, int i14) {
        this.f43594a = i11;
        this.f43595b = i12;
        this.f43596c = i13;
        this.f43597d = i14;
    }

    public final int a(y loadType) {
        kotlin.jvm.internal.m.f(loadType, "loadType");
        int i11 = h2.f43584a[loadType.ordinal()];
        if (i11 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i11 == 2) {
            return this.f43594a;
        }
        if (i11 == 3) {
            return this.f43595b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.f43594a == i2Var.f43594a && this.f43595b == i2Var.f43595b && this.f43596c == i2Var.f43596c && this.f43597d == i2Var.f43597d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f43597d) + Integer.hashCode(this.f43596c) + Integer.hashCode(this.f43595b) + Integer.hashCode(this.f43594a);
    }
}
