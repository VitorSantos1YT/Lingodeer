package j3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f35784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f35785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f35786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v3.c f35790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v3.m f35791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n3.h f35792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f35793j;

    public t0(h hVar, y0 y0Var, List list, int i11, boolean z11, int i12, v3.c cVar, v3.m mVar, n3.h hVar2, long j11) {
        this.f35784a = hVar;
        this.f35785b = y0Var;
        this.f35786c = list;
        this.f35787d = i11;
        this.f35788e = z11;
        this.f35789f = i12;
        this.f35790g = cVar;
        this.f35791h = mVar;
        this.f35792i = hVar2;
        this.f35793j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.a(this.f35784a, t0Var.f35784a) && kotlin.jvm.internal.m.a(this.f35785b, t0Var.f35785b) && kotlin.jvm.internal.m.a(this.f35786c, t0Var.f35786c) && this.f35787d == t0Var.f35787d && this.f35788e == t0Var.f35788e && this.f35789f == t0Var.f35789f && kotlin.jvm.internal.m.a(this.f35790g, t0Var.f35790g) && this.f35791h == t0Var.f35791h && kotlin.jvm.internal.m.a(this.f35792i, t0Var.f35792i) && v3.a.b(this.f35793j, t0Var.f35793j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f35793j) + ((this.f35792i.hashCode() + ((this.f35791h.hashCode() + ((this.f35790g.hashCode() + defpackage.e.b(this.f35789f, defpackage.e.e((hh.p0.b((this.f35785b.hashCode() + (this.f35784a.hashCode() * 31)) * 31, 31, this.f35786c) + this.f35787d) * 31, 31, this.f35788e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f35784a) + ", style=" + this.f35785b + ", placeholders=" + this.f35786c + ", maxLines=" + this.f35787d + ", softWrap=" + this.f35788e + ", overflow=" + ((Object) ub.a.f0(this.f35789f)) + ", density=" + this.f35790g + ", layoutDirection=" + this.f35791h + ", fontFamilyResolver=" + this.f35792i + ", constraints=" + ((Object) v3.a.k(this.f35793j)) + ')';
    }
}
