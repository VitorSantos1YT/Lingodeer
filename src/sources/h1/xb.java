package h1;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class xb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31325a;

    public final boolean equals(Object obj) {
        if (obj instanceof xb) {
            return this.f31325a == ((xb) obj).f31325a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31325a);
    }

    public final String toString() {
        int i11 = this.f31325a;
        if (i11 == 0) {
            return "Hour";
        }
        return i11 == 1 ? "Minute" : BuildConfig.VERSION_NAME;
    }
}
