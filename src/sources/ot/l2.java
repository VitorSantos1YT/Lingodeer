package ot;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.m f45885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f45886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f45887c;

    public l2(i0 i0Var, vt.n0 n0Var, wt.m mVar) {
        this.f45885a = mVar;
        this.f45886b = i0Var;
        this.f45887c = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j11, List list, xy.c cVar) {
        j2 j2Var;
        if (cVar instanceof j2) {
            j2Var = (j2) cVar;
            int i11 = j2Var.f45864c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j2Var.f45864c = i11 - Integer.MIN_VALUE;
            } else {
                j2Var = new j2(this, cVar);
            }
        } else {
            j2Var = new j2(this, cVar);
        }
        Object objM = j2Var.f45862a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = j2Var.f45864c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            k2 k2Var = new k2(this, list, j11, null);
            j2Var.f45864c = 1;
            objM = rz.e0.M(eVar, k2Var, j2Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        return ((qy.o) objM).f48498a;
    }
}
