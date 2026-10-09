package no;

import a0.d0;
import qy.b0;
import uz.l0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements uz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.i f43870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43872d;

    public /* synthetic */ g(uz.i iVar, Object obj, Object obj2, int i11) {
        this.f43869a = i11;
        this.f43870b = iVar;
        this.f43871c = obj;
        this.f43872d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [fz.f, xy.i] */
    @Override // uz.i
    public final Object collect(uz.j jVar, vy.d dVar) throws Throwable {
        int i11 = this.f43869a;
        b0 b0Var = b0.f48488a;
        Object obj = this.f43872d;
        Object obj2 = this.f43871c;
        uz.i iVar = this.f43870b;
        switch (i11) {
            case 0:
                Object objCollect = ((uz.c) iVar).collect(new d0(jVar, (s) obj2, (String) obj, 6), dVar);
                return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : b0Var;
            case 1:
                Object objCollect2 = ((gp.r) iVar).collect(new d0(jVar, (ot.e) obj2, (ht.r) obj, 7), dVar);
                return objCollect2 == wy.a.COROUTINE_SUSPENDED ? objCollect2 : b0Var;
            case 2:
                Object objCollect3 = ((gp.r) iVar).collect(new d0(jVar, (wt.m) obj2, (n0) obj, 8), dVar);
                return objCollect3 == wy.a.COROUTINE_SUSPENDED ? objCollect3 : b0Var;
            case 3:
                Object objA = vz.b.a(uz.n0.f53370a, new l0((fz.f) obj, (vy.d) null), jVar, dVar, new uz.i[]{iVar, (uz.i) obj2});
                return objA == wy.a.COROUTINE_SUSPENDED ? objA : b0Var;
            default:
                Object objCollect4 = iVar.collect(new d0(jVar, (w9.s) obj2, (fz.c) obj, 12), dVar);
                return objCollect4 == wy.a.COROUTINE_SUSPENDED ? objCollect4 : b0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(uz.i iVar, uz.i iVar2, fz.f fVar) {
        this.f43869a = 3;
        this.f43870b = iVar;
        this.f43871c = iVar2;
        this.f43872d = (xy.i) fVar;
    }
}
