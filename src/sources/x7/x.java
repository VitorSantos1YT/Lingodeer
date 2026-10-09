package x7;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f55956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f55957b;

    public x(z zVar, z zVar2) {
        this.f55956a = zVar;
        this.f55957b = zVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f55956a.equals(xVar.f55956a) && this.f55957b.equals(xVar.f55957b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f55957b.hashCode() + (this.f55956a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(xTCJ.PMAxEFjYtBww);
        z zVar = this.f55956a;
        sb2.append(zVar);
        z zVar2 = this.f55957b;
        if (zVar.equals(zVar2)) {
            str = BuildConfig.VERSION_NAME;
        } else {
            str = ", " + zVar2;
        }
        return ep.a.k(sb2, str, "]");
    }
}
