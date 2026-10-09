package d0;

import f0.t2;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements f0.c2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o2 f22658i = new o2(6, new bp.h1(27), new y1(1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.h1 f22659a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22663e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.g0 f22665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.g0 f22666h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.h1 f22660b = new l1.h1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.i f22661c = new h0.i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.h1 f22662d = new l1.h1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f0.n f22664f = new f0.n(new com.google.firebase.datastorage.a(this, 12));

    public d2(int i11) {
        this.f22659a = new l1.h1(i11);
        final int i12 = 0;
        this.f22665g = l1.t.s(new fz.a(this) { // from class: d0.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f22652b;

            {
                this.f22652b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        d2 d2Var = this.f22652b;
                        return Boolean.valueOf(d2Var.f22659a.l() < d2Var.f22662d.l());
                    default:
                        return Boolean.valueOf(this.f22652b.f22659a.l() > 0);
                }
            }
        });
        final int i13 = 1;
        this.f22666h = l1.t.s(new fz.a(this) { // from class: d0.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d2 f22652b;

            {
                this.f22652b = this;
            }

            @Override // fz.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        d2 d2Var = this.f22652b;
                        return Boolean.valueOf(d2Var.f22659a.l() < d2Var.f22662d.l());
                    default:
                        return Boolean.valueOf(this.f22652b.f22659a.l() > 0);
                }
            }
        });
    }

    public static Object f(d2 d2Var, int i11, xy.i iVar) {
        Object objA = t2.a(d2Var, i11 - d2Var.f22659a.l(), new b0.i1(null, 7), iVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    @Override // f0.c2
    public final Object a(l1 l1Var, fz.e eVar, xy.c cVar) {
        Object objA = this.f22664f.a(l1Var, eVar, cVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    @Override // f0.c2
    public final boolean b() {
        return this.f22664f.b();
    }

    @Override // f0.c2
    public final boolean c() {
        return ((Boolean) this.f22666h.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final boolean d() {
        return ((Boolean) this.f22665g.getValue()).booleanValue();
    }

    @Override // f0.c2
    public final float e(float f5) {
        return this.f22664f.e(f5);
    }
}
