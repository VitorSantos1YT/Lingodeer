package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0.d f30536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0.h f30537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h0.h f30538g;

    public k4(float f5, float f11, float f12, float f13) {
        this.f30532a = f5;
        this.f30533b = f11;
        this.f30534c = f12;
        this.f30535d = f13;
        this.f30536e = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(h0.h hVar, xy.c cVar) throws Throwable {
        i4 i4Var;
        float f5;
        k4 k4Var;
        b0.d dVar = this.f30536e;
        if (cVar instanceof i4) {
            i4Var = (i4) cVar;
            int i11 = i4Var.f30410e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i4Var.f30410e = i11 - Integer.MIN_VALUE;
            } else {
                i4Var = new i4(this, cVar);
            }
        } else {
            i4Var = new i4(this, cVar);
        }
        Object obj = i4Var.f30408c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = i4Var.f30410e;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = i4Var.f30407b;
            k4Var = i4Var.f30406a;
            try {
                com.bumptech.glide.e.F(obj);
                k4Var.f30537f = hVar;
                return qy.b0.f48488a;
            } catch (Throwable th2) {
                th = th2;
                k4Var.f30537f = hVar;
                throw th;
            }
        }
        com.bumptech.glide.e.F(obj);
        if (hVar instanceof h0.k) {
            f5 = this.f30533b;
        } else if (hVar instanceof h0.f) {
            f5 = this.f30534c;
        } else {
            f5 = hVar instanceof h0.d ? this.f30535d : this.f30532a;
        }
        this.f30538g = hVar;
        try {
            if (!v3.f.b(((v3.f) dVar.f3474e.getValue()).f53489a, f5)) {
                h0.h hVar2 = this.f30537f;
                i4Var.f30406a = this;
                i4Var.f30407b = hVar;
                i4Var.f30410e = 1;
                if (i1.f0.a(dVar, f5, hVar2, hVar, i4Var) == aVar) {
                    return aVar;
                }
            }
            k4Var = this;
            k4Var.f30537f = hVar;
            return qy.b0.f48488a;
        } catch (Throwable th3) {
            th = th3;
            k4Var = this;
            k4Var.f30537f = hVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xy.c cVar) throws Throwable {
        j4 j4Var;
        float f5;
        k4 k4Var;
        if (cVar instanceof j4) {
            j4Var = (j4) cVar;
            int i11 = j4Var.f30475d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j4Var.f30475d = i11 - Integer.MIN_VALUE;
            } else {
                j4Var = new j4(this, cVar);
            }
        } else {
            j4Var = new j4(this, cVar);
        }
        Object obj = j4Var.f30473b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = j4Var.f30475d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            h0.h hVar = this.f30538g;
            if (hVar instanceof h0.k) {
                f5 = this.f30533b;
            } else if (hVar instanceof h0.f) {
                f5 = this.f30534c;
            } else {
                f5 = hVar instanceof h0.d ? this.f30535d : this.f30532a;
            }
            b0.d dVar = this.f30536e;
            if (!v3.f.b(((v3.f) dVar.f3474e.getValue()).f53489a, f5)) {
                try {
                    v3.f fVar = new v3.f(f5);
                    j4Var.f30472a = this;
                    j4Var.f30475d = 1;
                    if (dVar.e(fVar, j4Var) == aVar) {
                        return aVar;
                    }
                    k4Var = this;
                    k4Var.f30537f = k4Var.f30538g;
                } catch (Throwable th2) {
                    th = th2;
                    k4Var = this;
                    k4Var.f30537f = k4Var.f30538g;
                    throw th;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k4Var = j4Var.f30472a;
            try {
                com.bumptech.glide.e.F(obj);
                k4Var.f30537f = k4Var.f30538g;
            } catch (Throwable th3) {
                th = th3;
                k4Var.f30537f = k4Var.f30538g;
                throw th;
            }
        }
        return qy.b0.f48488a;
    }
}
