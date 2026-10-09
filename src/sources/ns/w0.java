package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class w0 {
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f44035f;

    public /* synthetic */ w0(int i11, String str, String str2, String str3, String str4, String str5, boolean z11) {
        if ((i11 & 1) == 0) {
            this.f44030a = BuildConfig.VERSION_NAME;
        } else {
            this.f44030a = str;
        }
        if ((i11 & 2) == 0) {
            this.f44031b = null;
        } else {
            this.f44031b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f44032c = BuildConfig.VERSION_NAME;
        } else {
            this.f44032c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f44033d = null;
        } else {
            this.f44033d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f44034e = BuildConfig.VERSION_NAME;
        } else {
            this.f44034e = str5;
        }
        if ((i11 & 32) == 0) {
            this.f44035f = false;
        } else {
            this.f44035f = z11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.m.a(this.f44030a, w0Var.f44030a) && kotlin.jvm.internal.m.a(this.f44031b, w0Var.f44031b) && kotlin.jvm.internal.m.a(this.f44032c, w0Var.f44032c) && kotlin.jvm.internal.m.a(this.f44033d, w0Var.f44033d) && kotlin.jvm.internal.m.a(this.f44034e, w0Var.f44034e) && this.f44035f == w0Var.f44035f;
    }

    public final int hashCode() {
        int iHashCode = this.f44030a.hashCode() * 31;
        String str = this.f44031b;
        int iD = defpackage.e.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f44032c);
        String str2 = this.f44033d;
        return Boolean.hashCode(this.f44035f) + defpackage.e.d((iD + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f44034e);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("CourseMistakeExplainToken(word=", this.f44030a, ", traditionalWord=", this.f44031b, ", meaning=");
        com.google.android.material.datepicker.d.w(sbS, this.f44032c, ", reading=", this.f44033d, ", romaji=");
        sbS.append(this.f44034e);
        sbS.append(", isHighlight=");
        sbS.append(this.f44035f);
        sbS.append(")");
        return sbS.toString();
    }
}
