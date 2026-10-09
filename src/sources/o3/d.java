package o3;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g {
    @Override // o3.g
    public final void a(b7.p pVar) {
        pVar.f(0, ((ar.f) pVar.f4020f).e(), BuildConfig.VERSION_NAME);
    }

    public final boolean equals(Object obj) {
        return obj instanceof d;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.z.a(d.class).hashCode();
    }

    public final String toString() {
        return "DeleteAllCommand()";
    }
}
