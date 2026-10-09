package j3;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35680d;

    public d(int i11, int i12, Object obj, String str) {
        this.f35677a = obj;
        this.f35678b = i11;
        this.f35679c = i12;
        this.f35680d = str;
    }

    public final f a(int i11) {
        int i12 = this.f35679c;
        if (i12 != Integer.MIN_VALUE) {
            i11 = i12;
        }
        if (!(i11 != Integer.MIN_VALUE)) {
            p3.a.c("Item.end should be set first");
        }
        return new f(this.f35678b, i11, this.f35677a, this.f35680d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f35677a, dVar.f35677a) && this.f35678b == dVar.f35678b && this.f35679c == dVar.f35679c && kotlin.jvm.internal.m.a(this.f35680d, dVar.f35680d);
    }

    public final int hashCode() {
        Object obj = this.f35677a;
        return this.f35680d.hashCode() + defpackage.e.b(this.f35679c, defpackage.e.b(this.f35678b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f35677a);
        sb2.append(kHfjNGauVgdF.oyCnKSdKBAOwjoK);
        sb2.append(this.f35678b);
        sb2.append(", end=");
        sb2.append(this.f35679c);
        sb2.append(", tag=");
        return hh.p0.o(sb2, this.f35680d, ')');
    }

    public /* synthetic */ d(int i11, int i12, int i13, Object obj, String str) {
        this(i11, (i13 & 4) != 0 ? Integer.MIN_VALUE : i12, obj, (i13 & 8) != 0 ? BuildConfig.VERSION_NAME : str);
    }
}
