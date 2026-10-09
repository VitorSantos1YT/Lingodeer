package kv;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f38759c;

    public j(String text, boolean z11, i color) {
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(color, "color");
        this.f38757a = text;
        this.f38758b = z11;
        this.f38759c = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f38757a, jVar.f38757a) && this.f38758b == jVar.f38758b && this.f38759c == jVar.f38759c;
    }

    public final int hashCode() {
        return this.f38759c.hashCode() + defpackage.e.e(this.f38757a.hashCode() * 31, 31, this.f38758b);
    }

    public final String toString() {
        return "IntroTextRun(text=" + this.f38757a + gkbGsXmgaxRjJ.dKEijIkQJKIY + this.f38758b + ", color=" + this.f38759c + ")";
    }

    public /* synthetic */ j(String str, boolean z11, i iVar, int i11) {
        this(str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? i.Default : iVar);
    }
}
