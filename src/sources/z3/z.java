package z3;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import l1.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f58800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f58802f;

    public z(boolean z11, int i11) {
        this((i11 & 1) == 0, (i11 & 4) != 0 ? true : z11, a0.Inherit, true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f58797a == zVar.f58797a && this.f58798b == zVar.f58798b && this.f58799c == zVar.f58799c && this.f58800d == zVar.f58800d && this.f58801e == zVar.f58801e && this.f58802f == zVar.f58802f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58802f) + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(this.f58797a * 31, 31, this.f58798b), 31, this.f58799c), 31, this.f58800d), 31, this.f58801e);
    }

    public /* synthetic */ z(boolean z11, a0 a0Var, boolean z12, int i11) {
        this(false, z11, (i11 & 8) != 0 ? a0.Inherit : a0Var, true, z12);
    }

    public z(boolean z11, boolean z12, a0 a0Var, boolean z13, boolean z14) {
        d0 d0Var = k.f58774a;
        int i11 = !z11 ? 262152 : 262144;
        i11 = a0Var == a0.SecureOn ? i11 | OSSConstants.DEFAULT_BUFFER_SIZE : i11;
        i11 = z13 ? i11 : i11 | 512;
        boolean z15 = a0Var == a0.Inherit;
        this.f58797a = i11;
        this.f58798b = z15;
        this.f58799c = true;
        this.f58800d = z12;
        this.f58801e = true;
        this.f58802f = z14;
    }
}
