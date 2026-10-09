package zz;

import rz.q0;
import wz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.f f59647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.f f59648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f59649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xy.i f59650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fz.f f59651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f59652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59653h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f59654i;

    public f(h hVar, Object obj, fz.f fVar, fz.f fVar2, com.android.billingclient.api.a aVar, xy.i iVar, fz.f fVar3) {
        this.f59654i = hVar;
        this.f59646a = obj;
        this.f59647b = fVar;
        this.f59648c = fVar2;
        this.f59649d = aVar;
        this.f59650e = iVar;
        this.f59651f = fVar3;
    }

    public final void a() {
        Object obj = this.f59652g;
        if (obj instanceof r) {
            ((r) obj).h(this.f59653h, this.f59654i.f59660a);
            return;
        }
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        if (q0Var != null) {
            q0Var.dispose();
        }
    }
}
