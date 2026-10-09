package bs;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5125e;

    public e(String str, int i11, String str2, int i12, String audioPath) {
        m.f(audioPath, "audioPath");
        this.f5121a = str;
        this.f5122b = i11;
        this.f5123c = str2;
        this.f5124d = i12;
        this.f5125e = audioPath;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5121a.equals(eVar.f5121a) && this.f5122b == eVar.f5122b && this.f5123c.equals(eVar.f5123c) && this.f5124d == eVar.f5124d && m.a(this.f5125e, eVar.f5125e);
    }

    public final int hashCode() {
        return this.f5125e.hashCode() + defpackage.e.b(this.f5124d, defpackage.e.d(defpackage.e.b(this.f5122b, this.f5121a.hashCode() * 31, 31), 31, this.f5123c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = defpackage.e.q(this.f5122b, "ToneExample(pinyin=", this.f5121a, ", subTitleResId=", ", yunMu=");
        sbQ.append(this.f5123c);
        sbQ.append(", tone=");
        sbQ.append(this.f5124d);
        sbQ.append(", audioPath=");
        return ep.a.k(sbQ, this.f5125e, ")");
    }
}
