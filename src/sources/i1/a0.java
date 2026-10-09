package i1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f33968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33969c;

    public a0(String str, char c11) {
        this.f33967a = str;
        this.f33968b = c11;
        this.f33969c = oz.x.q0(str, String.valueOf(c11), BuildConfig.VERSION_NAME);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.f33967a, a0Var.f33967a) && this.f33968b == a0Var.f33968b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f33968b) + (this.f33967a.hashCode() * 31);
    }

    public final String toString() {
        return OYAvlbfUyD.hQqYRyx + this.f33967a + ", delimiter=" + this.f33968b + ')';
    }
}
