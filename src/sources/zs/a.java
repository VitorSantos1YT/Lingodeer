package zs;

import b7.e0;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f59335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f59336e = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f59337f = BuildConfig.VERSION_NAME;

    public a(int i11, int i12, long j11, boolean z11) {
        this.f59332a = i11;
        this.f59333b = j11;
        this.f59334c = i12;
        this.f59335d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f59332a == aVar.f59332a && this.f59333b == aVar.f59333b && this.f59334c == aVar.f59334c && this.f59335d == aVar.f59335d && this.f59336e.equals(aVar.f59336e) && this.f59337f.equals(aVar.f59337f);
    }

    public final int hashCode() {
        return this.f59337f.hashCode() + defpackage.e.b(0, defpackage.e.b(0, defpackage.e.d(defpackage.e.e(defpackage.e.b(this.f59334c, defpackage.e.f(this.f59333b, Integer.hashCode(this.f59332a) * 31, 31), 31), 31, this.f59335d), 31, this.f59336e), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = e0.o(this.f59332a, "BugReportData(elemType=", ", elemId=", this.f59333b);
        sbO.append(", modelType=");
        sbO.append(this.f59334c);
        sbO.append(", result=");
        sbO.append(this.f59335d);
        com.google.android.material.datepicker.d.w(sbO, ", userInput=", this.f59336e, ", unitSortIndex=0, lessonSortIndex=0, practiceMode=", this.f59337f);
        sbO.append(")");
        return sbO.toString();
    }
}
