package o0;

import com.yalantis.ucrop.view.CropImageView;
import f0.e2;
import f0.t0;
import iv.d0;
import l1.g1;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0.g f44463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f44464b;

    public y(g0.g gVar, t tVar) {
        this.f44463a = gVar;
        this.f44464b = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // f0.t0
    public final Object a(e2 e2Var, float f5, vy.d dVar) {
        x xVar;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i11 = xVar.f44462c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f44462c = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, (xy.c) dVar);
            }
        } else {
            xVar = new x(this, (xy.c) dVar);
        }
        Object objD = xVar.f44460a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = xVar.f44462c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            kp.j jVar = new kp.j(24, this, e2Var);
            xVar.f44462c = 1;
            objD = this.f44463a.d(e2Var, f5, jVar, xVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objD);
        }
        float fFloatValue = ((Number) objD).floatValue();
        t tVar = this.f44464b;
        com.android.billingclient.api.h hVar = tVar.f44435d;
        com.android.billingclient.api.h hVar2 = tVar.f44435d;
        if (((g1) hVar.f7511d).l() != CropImageView.DEFAULT_ASPECT_RATIO && Math.abs(((g1) hVar2.f7511d).l()) < 0.001d) {
            int iK = tVar.k();
            if (tVar.f44442k.b()) {
                e0.B(((n) tVar.f44446p.getValue()).f44417s, null, null, new d0(5, tVar, null), 3);
            }
            tVar.u(CropImageView.DEFAULT_ASPECT_RATIO, iK, false);
        } else {
            new Float(((g1) hVar2.f7511d).l());
        }
        return new Float(fFloatValue);
    }
}
