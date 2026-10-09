package rt;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u5 implements w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50475a = BuildConfig.VERSION_NAME;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5) && this.f50475a.equals(((u5) obj).f50475a);
    }

    public final int hashCode() {
        return this.f50475a.hashCode() * 31;
    }

    public final String toString() {
        return ep.a.g("Loading(thinkingStream=", this.f50475a, ", partialResponse=null)");
    }
}
