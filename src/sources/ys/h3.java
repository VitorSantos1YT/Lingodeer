package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58044a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f58046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f58047d;

    public /* synthetic */ h3(long j11, fz.a aVar, fz.a aVar2) {
        this.f58045b = j11;
        this.f58046c = aVar;
        this.f58047d = aVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58044a) {
            case 0:
                ((Integer) obj2).getClass();
                j3.c(this.f58045b, this.f58046c, this.f58047d, (l1.n) obj, l1.t.M(49));
                break;
            default:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zContains = ry.l.m0(new Integer[]{18, 19, 69}).contains(Integer.valueOf(((Number) sVar.j(ju.f.f37370d)).intValue()));
                    long j11 = this.f58045b;
                    if (zContains) {
                        sVar.d0(-1025380767);
                        Long lValueOf = Long.valueOf(j11);
                        fz.a aVar = this.f58046c;
                        boolean zF = sVar.f(aVar);
                        Object objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = new k2(7, aVar);
                            sVar.o0(objQ);
                        }
                        us.b.i(lValueOf, false, null, (fz.a) objQ, sVar, 48, 4);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1025225736);
                        j3.d(j11, j0.e2.d(z1.o.f58481a, 1.0f), null, this.f58047d, sVar, 384);
                        sVar.p(false);
                    }
                } else {
                    sVar.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ h3(long j11, fz.a aVar, fz.a aVar2, int i11) {
        this.f58045b = j11;
        this.f58046c = aVar;
        this.f58047d = aVar2;
    }
}
