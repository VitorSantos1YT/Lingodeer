package e0;

import g2.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24640e;

    public c(long j11, long j12, long j13, long j14, long j15) {
        this.f24636a = j11;
        this.f24637b = j12;
        this.f24638c = j13;
        this.f24639d = j14;
        this.f24640e = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.d(this.f24636a, cVar.f24636a) && x.d(this.f24637b, cVar.f24637b) && x.d(this.f24638c, cVar.f24638c) && x.d(this.f24639d, cVar.f24639d) && x.d(this.f24640e, cVar.f24640e);
    }

    public final int hashCode() {
        int i11 = x.f28623j;
        return Long.hashCode(this.f24640e) + defpackage.e.f(this.f24639d, defpackage.e.f(this.f24638c, defpackage.e.f(this.f24637b, Long.hashCode(this.f24636a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        com.google.android.material.datepicker.d.t(this.f24636a, ", textColor=", sb2);
        com.google.android.material.datepicker.d.t(this.f24637b, ", iconColor=", sb2);
        com.google.android.material.datepicker.d.t(this.f24638c, ", disabledTextColor=", sb2);
        com.google.android.material.datepicker.d.t(this.f24639d, ", disabledIconColor=", sb2);
        sb2.append((Object) x.j(this.f24640e));
        sb2.append(')');
        return sb2.toString();
    }
}
