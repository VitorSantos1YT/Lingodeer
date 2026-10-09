package j7;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36143d;

    public j(String str, long j11, long j12) {
        this.f36142c = str == null ? BuildConfig.VERSION_NAME : str;
        this.f36140a = j11;
        this.f36141b = j12;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String strZ = b7.a.z(str, this.f36142c);
        if (jVar != null) {
            long j11 = jVar.f36141b;
            if (strZ.equals(b7.a.z(str, jVar.f36142c))) {
                long j12 = this.f36141b;
                if (j12 != -1) {
                    long j13 = this.f36140a;
                    jVar2 = null;
                    if (j13 + j12 == jVar.f36140a) {
                        return new j(strZ, j13, j11 != -1 ? j12 + j11 : -1L);
                    }
                } else {
                    jVar2 = null;
                }
                if (j11 == -1) {
                    return jVar2;
                }
                long j14 = jVar.f36140a;
                if (j14 + j11 == this.f36140a) {
                    return new j(strZ, j14, j12 != -1 ? j11 + j12 : -1L);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f36140a == jVar.f36140a && this.f36141b == jVar.f36141b && this.f36142c.equals(jVar.f36142c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f36143d == 0) {
            this.f36143d = this.f36142c.hashCode() + ((((527 + ((int) this.f36140a)) * 31) + ((int) this.f36141b)) * 31);
        }
        return this.f36143d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f36142c);
        sb2.append(", start=");
        sb2.append(this.f36140a);
        sb2.append(", length=");
        return defpackage.e.i(this.f36141b, ")", sb2);
    }
}
