package zs;

import android.graphics.Bitmap;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f59346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f59347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f59349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f59350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f59352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f59353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f59354j;

    public /* synthetic */ c(a aVar, int i11) {
        this((i11 & 1) == 0, null, false, BuildConfig.VERSION_NAME, false, true, false, null, false, (i11 & 512) != 0 ? null : aVar);
    }

    public static c a(c cVar, Bitmap bitmap, boolean z11, String description, boolean z12, boolean z13, boolean z14, String str, boolean z15, a aVar, int i11) {
        boolean z16 = (i11 & 1) != 0 ? cVar.f59345a : true;
        if ((i11 & 2) != 0) {
            bitmap = cVar.f59346b;
        }
        if ((i11 & 4) != 0) {
            z11 = cVar.f59347c;
        }
        if ((i11 & 8) != 0) {
            description = cVar.f59348d;
        }
        if ((i11 & 16) != 0) {
            z12 = cVar.f59349e;
        }
        if ((i11 & 32) != 0) {
            z13 = cVar.f59350f;
        }
        if ((i11 & 64) != 0) {
            z14 = cVar.f59351g;
        }
        if ((i11 & 128) != 0) {
            str = cVar.f59352h;
        }
        if ((i11 & 256) != 0) {
            z15 = cVar.f59353i;
        }
        if ((i11 & 512) != 0) {
            aVar = cVar.f59354j;
        }
        a aVar2 = aVar;
        cVar.getClass();
        m.f(description, "description");
        boolean z17 = z15;
        String str2 = str;
        boolean z18 = z14;
        boolean z19 = z13;
        boolean z20 = z12;
        String str3 = description;
        return new c(z16, bitmap, z11, str3, z20, z19, z18, str2, z17, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59345a == cVar.f59345a && m.a(this.f59346b, cVar.f59346b) && this.f59347c == cVar.f59347c && m.a(this.f59348d, cVar.f59348d) && this.f59349e == cVar.f59349e && this.f59350f == cVar.f59350f && this.f59351g == cVar.f59351g && m.a(this.f59352h, cVar.f59352h) && this.f59353i == cVar.f59353i && m.a(this.f59354j, cVar.f59354j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f59345a) * 31;
        Bitmap bitmap = this.f59346b;
        int iE = defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.d(defpackage.e.e((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.f59347c), 31, this.f59348d), 31, this.f59349e), 31, this.f59350f), 31, this.f59351g);
        String str = this.f59352h;
        int iE2 = defpackage.e.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.f59353i);
        a aVar = this.f59354j;
        return iE2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public c(boolean z11, Bitmap bitmap, boolean z12, String str, boolean z13, boolean z14, boolean z15, String str2, boolean z16, a aVar) {
        this.f59345a = z11;
        this.f59346b = bitmap;
        this.f59347c = z12;
        this.f59348d = str;
        this.f59349e = z13;
        this.f59350f = z14;
        this.f59351g = z15;
        this.f59352h = str2;
        this.f59353i = z16;
        this.f59354j = aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BugReportUiState(isDialogShowing=");
        sb2.append(this.f59345a);
        sb2.append(", screenshot=");
        sb2.append(this.f59346b);
        sb2.append(", isFullScreenImageShowing=");
        sb2.append(this.f59347c);
        sb2.append(", description=");
        sb2.append(this.f59348d);
        sb2.append(", acceptAnswerChecked=");
        ep.a.B(", otherIssueChecked=", ", isSending=", sb2, this.f59349e, this.f59350f);
        sb2.append(this.f59351g);
        sb2.append(", errorMessage=");
        sb2.append(this.f59352h);
        sb2.append(gkbGsXmgaxRjJ.TqJursHjZSRKWkc);
        sb2.append(this.f59353i);
        sb2.append(", bugReportData=");
        sb2.append(this.f59354j);
        sb2.append(")");
        return sb2.toString();
    }
}
