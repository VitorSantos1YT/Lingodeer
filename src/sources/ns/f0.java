package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class f0 {
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43969b;

    public /* synthetic */ f0(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f43968a = BuildConfig.VERSION_NAME;
        } else {
            this.f43968a = str;
        }
        if ((i11 & 2) == 0) {
            this.f43969b = BuildConfig.VERSION_NAME;
        } else {
            this.f43969b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.m.a(this.f43968a, f0Var.f43968a) && kotlin.jvm.internal.m.a(this.f43969b, f0Var.f43969b);
    }

    public final int hashCode() {
        return this.f43969b.hashCode() + (this.f43968a.hashCode() * 31);
    }

    public final String toString() {
        return ep.a.h("CourseMistakeExplainHeader(title=", this.f43968a, ", subtitle=", this.f43969b, ")");
    }

    public f0() {
        this.f43968a = BuildConfig.VERSION_NAME;
        this.f43969b = BuildConfig.VERSION_NAME;
    }
}
