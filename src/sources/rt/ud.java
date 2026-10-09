package rt;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f50506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50509h;

    public ud(String id2, String unitName, String title, String subtitle, long j11, long j12, long j13, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(unitName, "unitName");
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subtitle, "subtitle");
        this.f50502a = id2;
        this.f50503b = unitName;
        this.f50504c = title;
        this.f50505d = subtitle;
        this.f50506e = j11;
        this.f50507f = j12;
        this.f50508g = j13;
        this.f50509h = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return kotlin.jvm.internal.m.a(this.f50502a, udVar.f50502a) && kotlin.jvm.internal.m.a(this.f50503b, udVar.f50503b) && kotlin.jvm.internal.m.a(this.f50504c, udVar.f50504c) && kotlin.jvm.internal.m.a(this.f50505d, udVar.f50505d) && this.f50506e == udVar.f50506e && this.f50507f == udVar.f50507f && this.f50508g == udVar.f50508g && this.f50509h == udVar.f50509h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50509h) + defpackage.e.f(this.f50508g, defpackage.e.f(this.f50507f, defpackage.e.f(this.f50506e, defpackage.e.d(defpackage.e.d(defpackage.e.d(this.f50502a.hashCode() * 31, 31, this.f50503b), 31, this.f50504c), 31, this.f50505d), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("CustomizeReviewSrsSuggestionItemUi(id=", this.f50502a, ", unitName=", this.f50503b, ", title=");
        com.google.android.material.datepicker.d.w(sbS, this.f50504c, ", subtitle=", this.f50505d, ", originalReviewTime=");
        sbS.append(this.f50506e);
        ep.a.y(this.f50507f, ", recommendedReviewTime=", ", selectedReviewTime=", sbS);
        sbS.append(this.f50508g);
        sbS.append(", isSelected=");
        sbS.append(this.f50509h);
        sbS.append(")");
        return sbS.toString();
    }

    public static ud a(ud udVar, long j11, boolean z11, int i11) {
        String id2 = udVar.f50502a;
        String str = udVar.f50503b;
        String title = udVar.f50504c;
        String subtitle = udVar.f50505d;
        long j12 = udVar.f50506e;
        long j13 = udVar.f50507f;
        long j14 = (i11 & 64) != 0 ? udVar.f50508g : j11;
        boolean z12 = (i11 & 128) != 0 ? udVar.f50509h : z11;
        udVar.getClass();
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(str, xTCJ.IUoH);
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subtitle, "subtitle");
        return new ud(id2, str, title, subtitle, j12, j13, j14, z12);
    }
}
