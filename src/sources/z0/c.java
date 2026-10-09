package z0;

import d0.o1;
import l1.k1;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.d f58415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f58416b = new o1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f58417c = t.B(null);

    public c(t1.d dVar) {
        this.f58415a = dVar;
    }

    @Override // z0.e
    public final Object a(d dVar, i iVar) {
        Object objB = o1.b(this.f58416b, new dv.b(8, this, new b(dVar), null), iVar);
        return objB == wy.a.COROUTINE_SUSPENDED ? objB : b0.f48488a;
    }

    public final void b(final fz.a aVar, n nVar, final int i11) {
        final fz.a aVar2;
        s sVar = (s) nVar;
        sVar.f0(723898654);
        int i12 = (sVar.f(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            b bVar = (b) this.f58417c.getValue();
            if (bVar == null) {
                x1 x1VarT = sVar.t();
                if (x1VarT != null) {
                    final int i13 = 0;
                    x1VarT.f39502d = new fz.e(this, aVar, i11, i13) { // from class: z0.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f58410a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f58411b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ fz.a f58412c;

                        {
                            this.f58410a = i13;
                            this.f58411b = this;
                        }

                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f58410a;
                            n nVar2 = (n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    this.f58411b.b(this.f58412c, nVar2, t.M(7));
                                    break;
                                default:
                                    this.f58411b.b(this.f58412c, nVar2, t.M(7));
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            this.f58415a.i(bVar, bVar.f58413a, aVar2, sVar, 384);
        } else {
            aVar2 = aVar;
            sVar.W();
        }
        x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            final int i14 = 1;
            x1VarT2.f39502d = new fz.e(this, aVar2, i11, i14) { // from class: z0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f58410a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f58411b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.a f58412c;

                {
                    this.f58410a = i14;
                    this.f58411b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f58410a;
                    n nVar2 = (n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            this.f58411b.b(this.f58412c, nVar2, t.M(7));
                            break;
                        default:
                            this.f58411b.b(this.f58412c, nVar2, t.M(7));
                            break;
                    }
                    return b0.f48488a;
                }
            };
        }
    }
}
