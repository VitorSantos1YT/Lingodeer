package defpackage;

import bw.ORXQ.ADSb;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28283d;

    public g(String str, String str2, String str3, String str4) {
        this.f28280a = str;
        this.f28281b = str2;
        this.f28282c = str3;
        this.f28283d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return m.a(this.f28280a, gVar.f28280a) && m.a(this.f28281b, gVar.f28281b) && m.a(this.f28282c, gVar.f28282c) && m.a(this.f28283d, gVar.f28283d);
    }

    public final int hashCode() {
        return this.f28283d.hashCode() + e.d(e.d(this.f28280a.hashCode() * 31, 31, this.f28281b), 31, this.f28282c);
    }

    public final String toString() {
        return e.p(e.s("LocaleText(title=", this.f28280a, ", subtitle=", this.f28281b, ", confirmText="), this.f28282c, ADSb.prAphhExQajFjRd, this.f28283d, ")");
    }
}
