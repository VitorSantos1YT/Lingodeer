package dv;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class z {
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24533a;

    public /* synthetic */ z(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f24533a = BuildConfig.VERSION_NAME;
        } else {
            this.f24533a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.m.a(this.f24533a, ((z) obj).f24533a);
    }

    public final int hashCode() {
        return this.f24533a.hashCode();
    }

    public final String toString() {
        return ep.a.g("GeminiGenerateTextResult(completions=", this.f24533a, ")");
    }

    public z() {
        this.f24533a = BuildConfig.VERSION_NAME;
    }
}
