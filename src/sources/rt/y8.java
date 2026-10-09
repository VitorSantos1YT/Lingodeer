package rt;

import androidx.drawerlayout.widget.ktFt.FpIL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f50691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f50699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f50700j;

    public y8(long j11, int i11, String unitName, int i12, int i13, boolean z11, boolean z12, boolean z13, boolean z14, List list) {
        kotlin.jvm.internal.m.f(unitName, "unitName");
        this.f50691a = j11;
        this.f50692b = i11;
        this.f50693c = unitName;
        this.f50694d = i12;
        this.f50695e = i13;
        this.f50696f = z11;
        this.f50697g = z12;
        this.f50698h = z13;
        this.f50699i = z14;
        this.f50700j = list;
    }

    public static y8 a(y8 y8Var, int i11, int i12, boolean z11, boolean z12, boolean z13, ArrayList arrayList, int i13) {
        long j11 = y8Var.f50691a;
        int i14 = y8Var.f50692b;
        String unitName = y8Var.f50693c;
        int i15 = (i13 & 8) != 0 ? y8Var.f50694d : i11;
        int i16 = (i13 & 16) != 0 ? y8Var.f50695e : i12;
        boolean z14 = (i13 & 32) != 0 ? y8Var.f50696f : z11;
        boolean z15 = (i13 & 64) != 0 ? y8Var.f50697g : z12;
        boolean z16 = (i13 & 128) != 0 ? y8Var.f50698h : true;
        boolean z17 = (i13 & 256) != 0 ? y8Var.f50699i : z13;
        List list = (i13 & 512) != 0 ? y8Var.f50700j : arrayList;
        y8Var.getClass();
        kotlin.jvm.internal.m.f(unitName, "unitName");
        return new y8(j11, i14, unitName, i15, i16, z14, z15, z16, z17, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return this.f50691a == y8Var.f50691a && this.f50692b == y8Var.f50692b && kotlin.jvm.internal.m.a(this.f50693c, y8Var.f50693c) && this.f50694d == y8Var.f50694d && this.f50695e == y8Var.f50695e && this.f50696f == y8Var.f50696f && this.f50697g == y8Var.f50697g && this.f50698h == y8Var.f50698h && this.f50699i == y8Var.f50699i && kotlin.jvm.internal.m.a(this.f50700j, y8Var.f50700j);
    }

    public final int hashCode() {
        return this.f50700j.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.b(this.f50695e, defpackage.e.b(this.f50694d, defpackage.e.d(defpackage.e.b(this.f50692b, Long.hashCode(this.f50691a) * 31, 31), 31, this.f50693c), 31), 31), 31, this.f50696f), 31, this.f50697g), 31, this.f50698h), 31, this.f50699i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(FpIL.XMAmM);
        sb2.append(this.f50691a);
        sb2.append(", sortIndex=");
        sb2.append(this.f50692b);
        sb2.append(", unitName=");
        sb2.append(this.f50693c);
        sb2.append(", count=");
        sb2.append(this.f50694d);
        sb2.append(", selectedCount=");
        sb2.append(this.f50695e);
        sb2.append(", checked=");
        sb2.append(this.f50696f);
        b7.e0.z(", expanded=", ", enable=", sb2, this.f50697g, this.f50698h);
        sb2.append(", canAccess=");
        sb2.append(this.f50699i);
        sb2.append(", reviewContents=");
        sb2.append(this.f50700j);
        sb2.append(")");
        return sb2.toString();
    }
}
