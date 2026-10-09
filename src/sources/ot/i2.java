package ot;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingodeer.data.model.SRSStatus;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SRSStatus f45856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45857d;

    public i2(String id2, long j11, SRSStatus suggestedStatus, boolean z11) {
        kotlin.jvm.internal.m.f(id2, "id");
        kotlin.jvm.internal.m.f(suggestedStatus, "suggestedStatus");
        this.f45854a = id2;
        this.f45855b = j11;
        this.f45856c = suggestedStatus;
        this.f45857d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return kotlin.jvm.internal.m.a(this.f45854a, i2Var.f45854a) && this.f45855b == i2Var.f45855b && kotlin.jvm.internal.m.a(this.f45856c, i2Var.f45856c) && this.f45857d == i2Var.f45857d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f45857d) + ((this.f45856c.hashCode() + defpackage.e.f(this.f45855b, this.f45854a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = com.google.android.material.datepicker.d.m(this.f45855b, "Suggestion(id=", this.f45854a, ", originalNextReviewTime=");
        sbM.append(", suggestedStatus=");
        sbM.append(this.f45856c);
        sbM.append(ypOOxsaJG.RlNlNes);
        sbM.append(this.f45857d);
        sbM.append(")");
        return sbM.toString();
    }
}
