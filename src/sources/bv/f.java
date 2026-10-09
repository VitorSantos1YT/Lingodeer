package bv;

import g00.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class f {
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f6293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f6294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f6295c;

    public /* synthetic */ f(int i11, c cVar, l lVar, w wVar) {
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, d.f6291a.getDescriptor());
            throw null;
        }
        this.f6293a = cVar;
        this.f6294b = lVar;
        this.f6295c = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f6293a, fVar.f6293a) && kotlin.jvm.internal.m.a(this.f6294b, fVar.f6294b) && kotlin.jvm.internal.m.a(this.f6295c, fVar.f6295c);
    }

    public final int hashCode() {
        return this.f6295c.hashCode() + ((this.f6294b.hashCode() + (this.f6293a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AssessmentParams(app=" + this.f6293a + ", audio=" + this.f6294b + ", request=" + this.f6295c + ")";
    }
}
