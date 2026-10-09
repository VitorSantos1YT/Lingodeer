package eh;

import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import hh.p0;
import java.util.LinkedHashMap;
import lt.AJC.PQgum;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f25537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f25539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25540i;

    public b(int i11, int i12, int i13, int i14, int i15, LinkedHashMap linkedHashMap, int i16, int i17, int i18) {
        this.f25532a = i11;
        this.f25533b = i12;
        this.f25534c = i13;
        this.f25535d = i14;
        this.f25536e = i15;
        this.f25537f = linkedHashMap;
        this.f25538g = i16;
        this.f25539h = i17;
        this.f25540i = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25532a == bVar.f25532a && this.f25533b == bVar.f25533b && this.f25534c == bVar.f25534c && this.f25535d == bVar.f25535d && this.f25536e == bVar.f25536e && this.f25537f.equals(bVar.f25537f) && this.f25538g == bVar.f25538g && this.f25539h == bVar.f25539h && this.f25540i == bVar.f25540i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25540i) + defpackage.e.b(this.f25539h, defpackage.e.b(this.f25538g, (this.f25537f.hashCode() + defpackage.e.b(this.f25536e, defpackage.e.b(this.f25535d, defpackage.e.b(this.f25534c, defpackage.e.b(this.f25533b, Integer.hashCode(this.f25532a) * 31, 31), 31), 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("CourseReviewIndexSrsSummary(characterCount=", this.f25532a, kHfjNGauVgdF.QlIlKoRjUyCdjLC, this.f25533b, ", sentenceCount=");
        ep.a.v(this.f25534c, this.f25535d, ", newReviewCount=", ", dueReviewCount=", sbK);
        sbK.append(this.f25536e);
        sbK.append(", candidateItemIdsByType=");
        sbK.append(this.f25537f);
        sbK.append(", sessionCharacterCount=");
        ep.a.v(this.f25538g, this.f25539h, ", sessionWordCount=", PQgum.CcDXBfHCS, sbK);
        return p0.i(this.f25540i, anrPHlQ.QYhATq, sbK);
    }
}
