package d0;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.c f22733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.t1 f22735d;

    public j(Context context, v3.c cVar, long j11, j0.t1 t1Var) {
        this.f22732a = context;
        this.f22733b = cVar;
        this.f22734c = j11;
        this.f22735d = t1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.f22732a, jVar.f22732a) && kotlin.jvm.internal.m.a(this.f22733b, jVar.f22733b) && g2.x.d(this.f22734c, jVar.f22734c) && kotlin.jvm.internal.m.a(this.f22735d, jVar.f22735d);
    }

    public final int hashCode() {
        int iHashCode = (this.f22733b.hashCode() + (this.f22732a.hashCode() * 31)) * 31;
        int i11 = g2.x.f28623j;
        return this.f22735d.hashCode() + defpackage.e.f(this.f22734c, iHashCode, 31);
    }
}
