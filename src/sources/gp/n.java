package gp;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import fr.x4;
import fr.y3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f29457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(w wVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29455a = i11;
        this.f29457c = wVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29455a) {
            case 0:
                return new n(this.f29457c, dVar, 0);
            case 1:
                return new n(this.f29457c, dVar, 1);
            case 2:
                return new n(this.f29457c, dVar, 2);
            default:
                return new n(this.f29457c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29455a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((n) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29455a;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        w wVar = this.f29457c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29456b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                wt.o0 o0Var = wVar.L;
                this.f29456b = 1;
                o0Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new mr.d(o0Var, null), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            case 1:
                vt.n0 n0Var = wVar.f29527d;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29456b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                if (!ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage)) || ((fr.o0) n0Var).t() != -1) {
                    return b0Var;
                }
                int iE = (int) FirebaseRemoteConfig.d().e("jp_default_display");
                this.f29456b = 1;
                return ((fr.o0) n0Var).Z(iE, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29456b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f29456b = 1;
                    if (rz.e0.m(5000L, this) != aVar3) {
                    }
                    return aVar3;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                if (kotlin.jvm.internal.m.a(wVar.R, ks.f.b())) {
                    return b0Var;
                }
                wVar.R = ks.f.b();
                vt.h1 h1Var = wVar.f29524a;
                this.f29456b = 2;
                x4 x4Var = (x4) h1Var;
                x4Var.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM2 = rz.e0.M(yz.e.f58387a, new y3(x4Var, dVar, 0), this);
                if (objM2 != aVar3) {
                    objM2 = b0Var;
                }
                if (objM2 != aVar3) {
                    return b0Var;
                }
                return aVar3;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f29456b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    gq.d dVar2 = wVar.M;
                    this.f29456b = 1;
                    obj = dVar2.a(true, this);
                    if (obj != aVar4) {
                    }
                    return aVar4;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                b1.b bVar = new b1.b(wVar, 3);
                this.f29456b = 2;
                if (((uz.i) obj).collect(bVar, this) != aVar4) {
                    return b0Var;
                }
                return aVar4;
        }
    }
}
