package g0;

import b0.i1;
import b0.n;
import b0.o;
import b0.x;
import bt.b5;
import com.yalantis.ucrop.view.CropImageView;
import f0.e2;
import f0.n1;
import f0.q1;
import f0.t0;
import f0.t2;
import f0.u1;
import kotlin.jvm.internal.m;
import ob.u;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f28334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f28335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1 f28336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f28337d = u1.f26446c;

    public g(u uVar, x xVar, i1 i1Var) {
        this.f28334a = uVar;
        this.f28335b = xVar;
        this.f28336c = i1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b(g gVar, n1 n1Var, float f5, float f11, d dVar, xy.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i11 = fVar.f28333c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f28333c = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(gVar, cVar);
            }
        } else {
            fVar = new f(gVar, cVar);
        }
        f fVar2 = fVar;
        Object objD = fVar2.f28331a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar2.f28333c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            if (Math.abs(f5) == CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f11) == CropImageView.DEFAULT_ASPECT_RATIO) {
                return b0.e.b(f5, f11, 28);
            }
            fVar2.f28333c = 1;
            x xVar = gVar.f28335b;
            objD = (Math.abs(((o) new ob.i(xVar.f3731a).m(new o(CropImageView.DEFAULT_ASPECT_RATIO), new o(f11))).f3626a) >= Math.abs(f5) ? new hd.b(xVar, 13) : new hd.d(gVar.f28336c, 13)).d(n1Var, new Float(f5), new Float(f11), dVar, fVar2);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objD);
        }
        return ((a) objD).f28320b;
    }

    @Override // f0.t0
    public Object a(e2 e2Var, float f5, vy.d dVar) {
        return d(e2Var, f5, t2.f26435a, (xy.c) dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(n1 n1Var, float f5, fz.c cVar, xy.c cVar2) {
        c cVar3;
        fz.c cVar4;
        if (cVar2 instanceof c) {
            cVar3 = (c) cVar2;
            int i11 = cVar3.f28324d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar3.f28324d = i11 - Integer.MIN_VALUE;
            } else {
                cVar3 = new c(this, cVar2);
            }
        } else {
            cVar3 = new c(this, cVar2);
        }
        Object objM = cVar3.f28322b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = cVar3.f28324d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            b5 b5Var = new b5(this, f5, cVar, n1Var, (vy.d) null);
            cVar3.f28321a = cVar;
            cVar3.f28324d = 1;
            objM = e0.M(this.f28337d, b5Var, cVar3);
            if (objM == aVar) {
                return aVar;
            }
            cVar4 = cVar;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar4 = cVar3.f28321a;
            com.bumptech.glide.e.F(objM);
        }
        a aVar2 = (a) objM;
        cVar4.invoke(new Float(CropImageView.DEFAULT_ASPECT_RATIO));
        return aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(n1 n1Var, float f5, fz.c cVar, xy.c cVar2) {
        e eVar;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i11 = eVar.f28330c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f28330c = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar2);
            }
        } else {
            eVar = new e(this, cVar2);
        }
        Object objC = eVar.f28328a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f28330c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objC);
            eVar.f28330c = 1;
            objC = c(n1Var, f5, cVar, eVar);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objC);
        }
        a aVar = (a) objC;
        float fFloatValue = aVar.f28319a.floatValue();
        n nVar = aVar.f28320b;
        float fFloatValue2 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fFloatValue != CropImageView.DEFAULT_ASPECT_RATIO) {
            fFloatValue2 = ((Number) nVar.b()).floatValue();
        }
        return new Float(fFloatValue2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f28336c.equals(this.f28336c) && m.a(gVar.f28335b, this.f28335b) && gVar.f28334a.equals(this.f28334a);
    }

    public final int hashCode() {
        return this.f28334a.hashCode() + ((this.f28335b.hashCode() + (this.f28336c.hashCode() * 31)) * 31);
    }
}
