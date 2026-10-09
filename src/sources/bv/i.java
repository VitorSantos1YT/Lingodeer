package bv;

import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import g00.d1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class i {
    public static final h Companion = new h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qy.h[] f6302j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f6303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f6304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f6309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f6310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6311i;

    static {
        qy.j jVar = qy.j.PUBLICATION;
        f6302j = new qy.h[]{null, null, com.bumptech.glide.d.u(jVar, new bq.u(11)), null, com.bumptech.glide.d.u(jVar, new bq.u(12)), null, null, null, null};
    }

    public /* synthetic */ i(int i11, double d5, double d11, List list, String str, List list2, String str2, Double d12, double d13, String str3) {
        if (431 != (i11 & 431)) {
            d1.k(i11, 431, g.f6298a.getDescriptor());
            throw null;
        }
        this.f6303a = d5;
        this.f6304b = d11;
        this.f6305c = list;
        this.f6306d = str;
        if ((i11 & 16) == 0) {
            this.f6307e = null;
        } else {
            this.f6307e = list2;
        }
        this.f6308f = str2;
        if ((i11 & 64) == 0) {
            this.f6309g = null;
        } else {
            this.f6309g = d12;
        }
        this.f6310h = d13;
        this.f6311i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.f6303a, iVar.f6303a) == 0 && Double.compare(this.f6304b, iVar.f6304b) == 0 && kotlin.jvm.internal.m.a(this.f6305c, iVar.f6305c) && kotlin.jvm.internal.m.a(this.f6306d, iVar.f6306d) && kotlin.jvm.internal.m.a(this.f6307e, iVar.f6307e) && kotlin.jvm.internal.m.a(this.f6308f, iVar.f6308f) && kotlin.jvm.internal.m.a(this.f6309g, iVar.f6309g) && Double.compare(this.f6310h, iVar.f6310h) == 0 && kotlin.jvm.internal.m.a(this.f6311i, iVar.f6311i);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(hh.p0.b((Double.hashCode(this.f6304b) + (Double.hashCode(this.f6303a) * 31)) * 31, 31, this.f6305c), 31, this.f6306d);
        List list = this.f6307e;
        int iD2 = defpackage.e.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.f6308f);
        Double d5 = this.f6309g;
        return this.f6311i.hashCode() + ((Double.hashCode(this.f6310h) + ((iD2 + (d5 != null ? d5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssessmentResultData(overall=");
        sb2.append(this.f6303a);
        sb2.append(", pronunciation=");
        sb2.append(this.f6304b);
        sb2.append(", words=");
        sb2.append(this.f6305c);
        sb2.append(", kernel_version=");
        sb2.append(this.f6306d);
        sb2.append(", warning=");
        sb2.append(this.f6307e);
        sb2.append(", duration=");
        sb2.append(this.f6308f);
        sb2.append(", numeric_duration=");
        sb2.append(this.f6309g);
        sb2.append(", tone=");
        sb2.append(this.f6310h);
        sb2.append(", resource_version=");
        return ep.a.k(sb2, this.f6311i, bjXGJ.RbjjyczZG);
    }
}
