package g0;

import b0.i1;
import b0.n;
import b0.x;
import com.yalantis.ucrop.view.CropImageView;
import f0.n1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f28354a = 400;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(n1 n1Var, float f5, n nVar, x xVar, fz.c cVar, xy.c cVar2) {
        i iVar;
        float f11;
        v vVar;
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i11 = iVar.f28347e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f28347e = i11 - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar2);
            }
        } else {
            iVar = new i(cVar2);
        }
        Object obj = iVar.f28346d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = iVar.f28347e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            v vVar2 = new v();
            boolean z11 = ((Number) nVar.b()).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO;
            h hVar = new h(f5, vVar2, n1Var, cVar, 0);
            iVar.f28344b = nVar;
            iVar.f28345c = vVar2;
            iVar.f28343a = f5;
            iVar.f28347e = 1;
            if (b0.e.f(nVar, xVar, !z11, hVar, iVar) == aVar) {
                return aVar;
            }
            f11 = f5;
            vVar = vVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f11 = iVar.f28343a;
            vVar = iVar.f28345c;
            nVar = iVar.f28344b;
            com.bumptech.glide.e.F(obj);
        }
        return new a(new Float(f11 - vVar.f38358a), nVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object b(n1 n1Var, float f5, float f11, n nVar, i1 i1Var, fz.c cVar, xy.c cVar2) {
        j jVar;
        float fFloatValue;
        n nVar2;
        v vVar;
        float f12 = f5;
        if (cVar2 instanceof j) {
            jVar = (j) cVar2;
            int i11 = jVar.f28353f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f28353f = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(cVar2);
            }
        } else {
            jVar = new j(cVar2);
        }
        j jVar2 = jVar;
        Object obj = jVar2.f28352e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = jVar2.f28353f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            v vVar2 = new v();
            fFloatValue = ((Number) nVar.b()).floatValue();
            Float f13 = new Float(f12);
            boolean z11 = ((Number) nVar.b()).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO;
            h hVar = new h(f11, vVar2, n1Var, cVar, 1);
            jVar2.f28350c = nVar;
            jVar2.f28351d = vVar2;
            jVar2.f28348a = f12;
            jVar2.f28349b = fFloatValue;
            jVar2.f28353f = 1;
            if (b0.e.h(nVar, f13, i1Var, !z11, hVar, jVar2) == aVar) {
                return aVar;
            }
            nVar2 = nVar;
            vVar = vVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f14 = jVar2.f28349b;
            float f15 = jVar2.f28348a;
            vVar = jVar2.f28351d;
            nVar2 = jVar2.f28350c;
            com.bumptech.glide.e.F(obj);
            fFloatValue = f14;
            f12 = f15;
        }
        return new a(new Float(f12 - vVar.f38358a), b0.e.l(nVar2, CropImageView.DEFAULT_ASPECT_RATIO, d(((Number) nVar2.b()).floatValue(), fFloatValue), 29));
    }

    public static final void c(b0.l lVar, n1 n1Var, fz.c cVar, float f5) {
        float fA;
        try {
            fA = n1Var.a(f5);
        } catch (CancellationException unused) {
            lVar.a();
            fA = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        cVar.invoke(Float.valueOf(fA));
        if (Math.abs(f5 - fA) > 0.5f) {
            lVar.a();
        }
    }

    public static final float d(float f5, float f11) {
        if (f11 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        return (f11 <= CropImageView.DEFAULT_ASPECT_RATIO ? f5 >= f11 : f5 <= f11) ? f5 : f11;
    }
}
