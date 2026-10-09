package j3;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35692d;

    public f(int i11, int i12, Object obj, String str) {
        this.f35689a = obj;
        this.f35690b = i11;
        this.f35691c = i12;
        this.f35692d = str;
        if (i11 <= i12) {
            return;
        }
        p3.a.a("Reversed range is not supported");
    }

    public static f a(f fVar, c0 c0Var, int i11, int i12) {
        Object obj = c0Var;
        if ((i12 & 1) != 0) {
            obj = fVar.f35689a;
        }
        int i13 = fVar.f35690b;
        if ((i12 & 4) != 0) {
            i11 = fVar.f35691c;
        }
        return new f(i13, i11, obj, fVar.f35692d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f35689a, fVar.f35689a) && this.f35690b == fVar.f35690b && this.f35691c == fVar.f35691c && kotlin.jvm.internal.m.a(this.f35692d, fVar.f35692d);
    }

    public final int hashCode() {
        Object obj = this.f35689a;
        return this.f35692d.hashCode() + defpackage.e.b(this.f35691c, defpackage.e.b(this.f35690b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f35689a);
        sb2.append(", start=");
        sb2.append(this.f35690b);
        sb2.append(", end=");
        sb2.append(this.f35691c);
        sb2.append(", tag=");
        return hh.p0.o(sb2, this.f35692d, ')');
    }

    public f(Object obj, int i11, int i12) {
        this(i11, i12, obj, BuildConfig.VERSION_NAME);
    }
}
