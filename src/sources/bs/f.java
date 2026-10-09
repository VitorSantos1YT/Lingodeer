package bs;

import b7.e0;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f5130e;

    public f(h toneType, int i11, int i12, int i13, List list) {
        m.f(toneType, "toneType");
        this.f5126a = toneType;
        this.f5127b = i11;
        this.f5128c = i12;
        this.f5129d = i13;
        this.f5130e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5126a == fVar.f5126a && this.f5127b == fVar.f5127b && this.f5128c == fVar.f5128c && this.f5129d == fVar.f5129d && this.f5130e.equals(fVar.f5130e);
    }

    public final int hashCode() {
        return this.f5130e.hashCode() + defpackage.e.b(this.f5129d, defpackage.e.b(this.f5128c, defpackage.e.b(this.f5127b, this.f5126a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ToneIntroductionData(toneType=");
        sb2.append(this.f5126a);
        sb2.append(", titleResId=");
        sb2.append(this.f5127b);
        sb2.append(", subtitleResId=");
        ep.a.v(this.f5128c, this.f5129d, ", descriptionResId=", ", examples=", sb2);
        return e0.n(sb2, this.f5130e, ")");
    }
}
