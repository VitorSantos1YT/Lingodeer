package x0;

import android.view.ActionMode;
import android.view.View;
import d0.o1;
import qy.b0;
import x1.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements z0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f55581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f55582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.a f55583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f55584d = new o1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f55585e = new u(new a(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f55586f = new a(this, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f55587g = new a(this, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMode f55588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.fragment.app.d f55589i;

    public f(View view, fz.c cVar, fz.a aVar) {
        this.f55581a = view;
        this.f55582b = cVar;
        this.f55583c = aVar;
    }

    @Override // z0.e
    public final Object a(z0.d dVar, xy.i iVar) {
        Object objB = o1.b(this.f55584d, new dv.b(7, this, dVar, null), iVar);
        return objB == wy.a.COROUTINE_SUSPENDED ? objB : b0.f48488a;
    }
}
