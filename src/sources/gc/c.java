package gc;

import android.graphics.Bitmap;
import rz.o0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f28982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f28983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f28984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f28985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.c f28986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hc.d f28987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f28988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f28989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f28990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f28991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f28992k;

    public c() {
        yz.f fVar = o0.f50940a;
        sz.c cVar = wz.m.f55536a.f51961d;
        yz.e eVar = yz.e.f58387a;
        hc.d dVar = hc.d.AUTOMATIC;
        Bitmap.Config config = kc.h.f38058b;
        b bVar = b.ENABLED;
        this.f28982a = cVar;
        this.f28983b = eVar;
        this.f28984c = eVar;
        this.f28985d = eVar;
        this.f28986e = jc.e.f36301a;
        this.f28987f = dVar;
        this.f28988g = config;
        this.f28989h = true;
        this.f28990i = bVar;
        this.f28991j = bVar;
        this.f28992k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f28982a, cVar.f28982a) && kotlin.jvm.internal.m.a(this.f28983b, cVar.f28983b) && kotlin.jvm.internal.m.a(this.f28984c, cVar.f28984c) && kotlin.jvm.internal.m.a(this.f28985d, cVar.f28985d) && kotlin.jvm.internal.m.a(this.f28986e, cVar.f28986e) && this.f28987f == cVar.f28987f && this.f28988g == cVar.f28988g && this.f28989h == cVar.f28989h && this.f28990i == cVar.f28990i && this.f28991j == cVar.f28991j && this.f28992k == cVar.f28992k;
    }

    public final int hashCode() {
        int iHashCode = (this.f28985d.hashCode() + ((this.f28984c.hashCode() + ((this.f28983b.hashCode() + (this.f28982a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f28986e.getClass();
        return this.f28992k.hashCode() + ((this.f28991j.hashCode() + ((this.f28990i.hashCode() + defpackage.e.e(defpackage.e.e((this.f28988g.hashCode() + ((this.f28987f.hashCode() + ((jc.c.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f28989h), 923521, false)) * 31)) * 31);
    }
}
