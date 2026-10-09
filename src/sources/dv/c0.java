package dv;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class c0 {
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24437a;

    public /* synthetic */ c0(int i11, String str) {
        if ((i11 & 1) == 0) {
            this.f24437a = BuildConfig.VERSION_NAME;
        } else {
            this.f24437a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && kotlin.jvm.internal.m.a(this.f24437a, ((c0) obj).f24437a);
    }

    public final int hashCode() {
        return this.f24437a.hashCode();
    }

    public final String toString() {
        return ep.a.g("GeminiPart(text=", this.f24437a, ")");
    }
}
