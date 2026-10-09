package f0;

import androidx.compose.foundation.gestures.GestureCancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements v3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v3.c f26351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a00.e f26354d = new a00.e();

    public l1(v3.c cVar) {
        this.f26351a = cVar;
    }

    @Override // v3.c
    public final long I(int i11) {
        return this.f26351a.I(i11);
    }

    @Override // v3.c
    public final long K(float f5) {
        return this.f26351a.K(f5);
    }

    @Override // v3.c
    public final float Q(int i11) {
        return this.f26351a.Q(i11);
    }

    @Override // v3.c
    public final float T(float f5) {
        return this.f26351a.T(f5);
    }

    @Override // v3.c
    public final float Z() {
        return this.f26351a.Z();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xy.c cVar) {
        i1 i1Var;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i11 = i1Var.f26304c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i1Var.f26304c = i11 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, cVar);
            }
        } else {
            i1Var = new i1(this, cVar);
        }
        Object objF = i1Var.f26302a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = i1Var.f26304c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objF);
            i1Var.f26304c = 1;
            objF = f(i1Var);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objF);
        }
        if (((Boolean) objF).booleanValue()) {
            return qy.b0.f48488a;
        }
        throw new GestureCancellationException("The press gesture was canceled.");
    }

    public final void b() {
        this.f26353c = true;
        a00.e eVar = this.f26354d;
        if (eVar.f()) {
            eVar.a(null);
        }
    }

    public final void c() {
        this.f26352b = true;
        a00.e eVar = this.f26354d;
        if (eVar.f()) {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(xy.c cVar) {
        j1 j1Var;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i11 = j1Var.f26324c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j1Var.f26324c = i11 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object obj = j1Var.f26322a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = j1Var.f26324c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            j1Var.f26324c = 1;
            if (this.f26354d.b(j1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        this.f26352b = false;
        this.f26353c = false;
        return qy.b0.f48488a;
    }

    @Override // v3.c
    public final float e0(float f5) {
        return this.f26351a.e0(f5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) {
        k1 k1Var;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i11 = k1Var.f26340c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k1Var.f26340c = i11 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        Object obj = k1Var.f26338a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = k1Var.f26340c;
        a00.e eVar = this.f26354d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (!this.f26352b && !this.f26353c) {
                k1Var.f26340c = 1;
                if (eVar.b(k1Var) == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(this.f26352b);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        eVar.a(null);
        return Boolean.valueOf(this.f26352b);
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f26351a.getDensity();
    }

    @Override // v3.c
    public final int k0(long j11) {
        return this.f26351a.k0(j11);
    }

    @Override // v3.c
    public final long n(float f5) {
        return this.f26351a.n(f5);
    }

    @Override // v3.c
    public final int n0(float f5) {
        return this.f26351a.n0(f5);
    }

    @Override // v3.c
    public final long o(long j11) {
        return this.f26351a.o(j11);
    }

    @Override // v3.c
    public final long v0(long j11) {
        return this.f26351a.v0(j11);
    }

    @Override // v3.c
    public final float w(long j11) {
        return this.f26351a.w(j11);
    }

    @Override // v3.c
    public final float y0(long j11) {
        return this.f26351a.y0(j11);
    }
}
