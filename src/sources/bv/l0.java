package bv;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class l0 {
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f6322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f6324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f6327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6328k;

    public /* synthetic */ l0(int i11, int i12, String str, String str2, String str3, i iVar, String str4, f fVar, String str5, String str6, Integer num, String str7) {
        if (147 != (i11 & 147)) {
            d1.k(i11, 147, j0.f6313a.getDescriptor());
            throw null;
        }
        this.f6318a = i12;
        this.f6319b = str;
        if ((i11 & 4) == 0) {
            this.f6320c = null;
        } else {
            this.f6320c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f6321d = null;
        } else {
            this.f6321d = str3;
        }
        this.f6322e = iVar;
        if ((i11 & 32) == 0) {
            this.f6323f = null;
        } else {
            this.f6323f = str4;
        }
        if ((i11 & 64) == 0) {
            this.f6324g = null;
        } else {
            this.f6324g = fVar;
        }
        this.f6325h = str5;
        if ((i11 & 256) == 0) {
            this.f6326i = null;
        } else {
            this.f6326i = str6;
        }
        if ((i11 & 512) == 0) {
            this.f6327j = null;
        } else {
            this.f6327j = num;
        }
        if ((i11 & 1024) == 0) {
            this.f6328k = null;
        } else {
            this.f6328k = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f6318a == l0Var.f6318a && kotlin.jvm.internal.m.a(this.f6319b, l0Var.f6319b) && kotlin.jvm.internal.m.a(this.f6320c, l0Var.f6320c) && kotlin.jvm.internal.m.a(this.f6321d, l0Var.f6321d) && kotlin.jvm.internal.m.a(this.f6322e, l0Var.f6322e) && kotlin.jvm.internal.m.a(this.f6323f, l0Var.f6323f) && kotlin.jvm.internal.m.a(this.f6324g, l0Var.f6324g) && kotlin.jvm.internal.m.a(this.f6325h, l0Var.f6325h) && kotlin.jvm.internal.m.a(this.f6326i, l0Var.f6326i) && kotlin.jvm.internal.m.a(this.f6327j, l0Var.f6327j) && kotlin.jvm.internal.m.a(this.f6328k, l0Var.f6328k);
    }

    public final int hashCode() {
        int iD = defpackage.e.d(Integer.hashCode(this.f6318a) * 31, 31, this.f6319b);
        String str = this.f6320c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6321d;
        int iHashCode2 = (this.f6322e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f6323f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        f fVar = this.f6324g;
        int iD2 = defpackage.e.d((iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f6325h);
        String str4 = this.f6326i;
        int iHashCode4 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f6327j;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f6328k;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToneAssessmentResult(eof=");
        sb2.append(this.f6318a);
        sb2.append(", tokenId=");
        sb2.append(this.f6319b);
        sb2.append(", applicationId=");
        com.google.android.material.datepicker.d.w(sb2, this.f6320c, ", audioUrl=", this.f6321d, ", result=");
        sb2.append(this.f6322e);
        sb2.append(", recordId=");
        sb2.append(this.f6323f);
        sb2.append(", params=");
        sb2.append(this.f6324g);
        sb2.append(", refText=");
        sb2.append(this.f6325h);
        sb2.append(", error=");
        sb2.append(this.f6326i);
        sb2.append(", errId=");
        sb2.append(this.f6327j);
        sb2.append(", dtLastResponse=");
        return ep.a.k(sb2, this.f6328k, scqhIrGXy.nwJGgAqZNsBXb);
    }
}
