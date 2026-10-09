package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a9.i f30079a;

    public c4(a9.i iVar) {
        this.f30079a = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // r2.a
    public final Object D(long j11, long j12, vy.d dVar) {
        b4 b4Var;
        c4 c4Var;
        long j13;
        long j14;
        if (dVar instanceof b4) {
            b4Var = (b4) dVar;
            int i11 = b4Var.f30032e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b4Var.f30032e = i11 - Integer.MIN_VALUE;
            } else {
                b4Var = new b4(this, (xy.c) dVar);
            }
        } else {
            b4Var = new b4(this, (xy.c) dVar);
        }
        b4 b4Var2 = b4Var;
        Object objD = b4Var2.f30030c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = b4Var2.f30032e;
        if (i12 != 0) {
            if (i12 == 1) {
                j13 = b4Var2.f30029b;
                c4Var = b4Var2.f30028a;
                com.bumptech.glide.e.F(objD);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = b4Var2.f30029b;
                com.bumptech.glide.e.F(objD);
            }
            return new v3.q(v3.q.e(j14, ((v3.q) objD).f53504a));
        }
        com.bumptech.glide.e.F(objD);
        b4Var2.f30028a = this;
        b4Var2.f30029b = j12;
        b4Var2.f30032e = 1;
        objD = super.D(j11, j12, b4Var2);
        if (objD != aVar) {
            c4Var = this;
            j13 = j12;
        }
        return aVar;
        long j15 = ((v3.q) objD).f53504a;
        cc ccVar = (cc) c4Var.f30079a.f517a;
        float fC = v3.q.c(j13);
        a9.i iVar = c4Var.f30079a;
        b0.x xVar = (b0.x) iVar.f519c;
        b0.i1 i1Var = (b0.i1) iVar.f518b;
        b4Var2.f30028a = null;
        b4Var2.f30029b = j15;
        b4Var2.f30032e = 2;
        objD = e0.e(ccVar, fC, xVar, i1Var, b4Var2);
        if (objD != aVar) {
            j14 = j15;
            return new v3.q(v3.q.e(j14, ((v3.q) objD).f53504a));
        }
        return aVar;
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        a9.i iVar = this.f30079a;
        cc ccVar = (cc) iVar.f517a;
        if (!((Boolean) ((fz.a) iVar.f520d).invoke()).booleanValue()) {
            return 0L;
        }
        float fL = ccVar.f30112c.l();
        ccVar.b(f2.b.f(j11) + ccVar.f30112c.l());
        if (fL == ccVar.f30112c.l()) {
            return 0L;
        }
        return f2.b.a(CropImageView.DEFAULT_ASPECT_RATIO, 2, j11);
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        a9.i iVar = this.f30079a;
        cc ccVar = (cc) iVar.f517a;
        if (!((Boolean) ((fz.a) iVar.f520d).invoke()).booleanValue()) {
            return 0L;
        }
        ccVar.f30111b.m(f2.b.f(j11) + ccVar.f30111b.l());
        if ((ccVar.f30112c.l() == CropImageView.DEFAULT_ASPECT_RATIO || ccVar.f30112c.l() == ccVar.f30110a.l()) && f2.b.f(j11) == CropImageView.DEFAULT_ASPECT_RATIO && f2.b.f(j12) > CropImageView.DEFAULT_ASPECT_RATIO) {
            ccVar.f30111b.m(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        ccVar.b(f2.b.f(j11) + ccVar.f30112c.l());
        return 0L;
    }
}
