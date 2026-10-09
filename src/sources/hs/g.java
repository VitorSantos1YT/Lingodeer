package hs;

import java.util.List;
import js.j;
import ry.m;
import rz.e0;
import rz.o0;
import vt.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f33721a;

    public g(g0 g0Var) {
        this.f33721a = g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j11, xy.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.f33710c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f33710c = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objM = dVar.f33708a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar.f33710c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            dVar.f33710c = 1;
            yz.f fVar = o0.f50940a;
            objM = e0.M(yz.e.f58387a, new c(this, j11, null, 0), dVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        return m.s0((List) objM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j11, xy.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f33713c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f33713c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objM = eVar.f33711a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f33713c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            eVar.f33713c = 1;
            yz.f fVar = o0.f50940a;
            objM = e0.M(yz.e.f58387a, new c(this, j11, null, 1), eVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        return m.s0((List) objM);
    }

    public final Object c(long j11, xy.c cVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new c(this, j11, null, 2), cVar);
    }

    public final Object d(String str, j jVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new gu.b(13, str, this, (vy.d) null), jVar);
    }
}
