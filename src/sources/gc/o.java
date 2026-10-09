package gc;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f29061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f29062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xb.e f29063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ec.a f29064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f29067g;

    public o(Drawable drawable, i iVar, xb.e eVar, ec.a aVar, String str, boolean z11, boolean z12) {
        this.f29061a = drawable;
        this.f29062b = iVar;
        this.f29063c = eVar;
        this.f29064d = aVar;
        this.f29065e = str;
        this.f29066f = z11;
        this.f29067g = z12;
    }

    @Override // gc.j
    public final Drawable a() {
        return this.f29061a;
    }

    @Override // gc.j
    public final i b() {
        return this.f29062b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f29061a, oVar.f29061a) && kotlin.jvm.internal.m.a(this.f29062b, oVar.f29062b) && this.f29063c == oVar.f29063c && kotlin.jvm.internal.m.a(this.f29064d, oVar.f29064d) && kotlin.jvm.internal.m.a(this.f29065e, oVar.f29065e) && this.f29066f == oVar.f29066f && this.f29067g == oVar.f29067g;
    }

    public final int hashCode() {
        int iHashCode = (this.f29063c.hashCode() + ((this.f29062b.hashCode() + (this.f29061a.hashCode() * 31)) * 31)) * 31;
        ec.a aVar = this.f29064d;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f29065e;
        return Boolean.hashCode(this.f29067g) + defpackage.e.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f29066f);
    }
}
