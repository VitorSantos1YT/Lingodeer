package k8;

import defpackage.e;
import hh.p0;
import java.util.Arrays;
import y6.b0;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f37971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37973c;

    public c(String str, String str2, byte[] bArr) {
        this.f37971a = bArr;
        this.f37972b = str;
        this.f37973c = str2;
    }

    @Override // y6.b0
    public final void b(z zVar) {
        String str = this.f37972b;
        if (str != null) {
            zVar.f57381a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f37971a, ((c) obj).f37971a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37971a);
    }

    public final String toString() {
        return p0.i(this.f37971a.length, "\"", e.s("ICY: title=\"", this.f37972b, "\", url=\"", this.f37973c, "\", rawMetadata.length=\""));
    }
}
