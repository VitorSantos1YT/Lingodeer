package kw;

import bt.a3;
import com.yalantis.ucrop.view.CropImageView;
import f0.x1;
import gb.r;
import v3.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f38862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f38863b;

    public g(a3 a3Var, x1 x1Var) {
        this.f38862a = a3Var;
        this.f38863b = x1Var;
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        if (i11 != 1 || f2.b.f(j11) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0L;
        }
        return com.bumptech.glide.d.c(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) this.f38862a.invoke(Float.valueOf(f2.b.f(j11)))).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r2.a
    public final Object W(long j11, vy.d dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.f38861c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f38861c = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, (xy.c) dVar);
            }
        } else {
            fVar = new f(this, (xy.c) dVar);
        }
        Object objInvoke = fVar.f38859a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = fVar.f38861c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objInvoke);
            Float f5 = new Float(q.c(j11));
            fVar.f38861c = 1;
            objInvoke = this.f38863b.invoke(f5, fVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objInvoke);
        }
        return new q(r.b(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) objInvoke).floatValue()));
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        if (i11 != 1 || f2.b.f(j12) <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return 0L;
        }
        return com.bumptech.glide.d.c(CropImageView.DEFAULT_ASPECT_RATIO, ((Number) this.f38862a.invoke(Float.valueOf(f2.b.f(j12)))).floatValue());
    }
}
