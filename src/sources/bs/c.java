package bs;

import b7.e0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5117f;

    public c(long j11, String str, String str2, String str3, int i11, String audioPath) {
        m.f(audioPath, "audioPath");
        this.f5112a = j11;
        this.f5113b = str;
        this.f5114c = str2;
        this.f5115d = str3;
        this.f5116e = i11;
        this.f5117f = audioPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5112a == cVar.f5112a && this.f5113b.equals(cVar.f5113b) && this.f5114c.equals(cVar.f5114c) && this.f5115d.equals(cVar.f5115d) && this.f5116e == cVar.f5116e && m.a(this.f5117f, cVar.f5117f);
    }

    public final int hashCode() {
        return this.f5117f.hashCode() + defpackage.e.b(this.f5116e, defpackage.e.d(defpackage.e.d(defpackage.e.d(Long.hashCode(this.f5112a) * 31, 31, this.f5113b), 31, this.f5114c), 31, this.f5115d), 31);
    }

    public final String toString() {
        StringBuilder sbP = e0.p(this.f5112a, "ToneChangeExample(id=", ", original=", this.f5113b);
        com.google.android.material.datepicker.d.w(sbP, ", changed=", this.f5114c, ", characters=", this.f5115d);
        sbP.append(", translationResId=");
        sbP.append(this.f5116e);
        sbP.append(", audioPath=");
        sbP.append(this.f5117f);
        sbP.append(")");
        return sbP.toString();
    }
}
