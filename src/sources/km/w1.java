package km;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import hj.q5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f38305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(x1 x1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38303a = i11;
        this.f38305c = x1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38303a) {
            case 0:
                return new w1(this.f38305c, dVar, 0);
            case 1:
                return new w1(this.f38305c, dVar, 1);
            default:
                return new w1(this.f38305c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38303a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((w1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f38303a;
        qy.b0 b0Var = qy.b0.f48488a;
        x1 x1Var = this.f38305c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f38304b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var = (vt.k0) x1Var.Q.getValue();
                int i14 = ((fr.o0) x1Var.s()).f27733a.keyLanguage;
                int i15 = x1Var.P + 1;
                this.f38304b = 1;
                return ((bh.a1) k0Var).k(i14, i15, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f38304b;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    mm.a aVar3 = (mm.a) x1Var.N;
                    kotlin.jvm.internal.m.c(aVar3);
                    this.f38304b = 1;
                    if (aVar3.j(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar4 = x1Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                bq.z.b(((q5) aVar4).f33169d, new u1(x1Var, i12));
                return b0Var;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f38304b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = x1Var.u().f55339f;
                    this.f38304b = 1;
                    obj = uz.x0.u(m0Var, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue) {
                    return b0Var;
                }
                int[] iArr = bq.r.f4959a;
                Context contextRequireContext = x1Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "quit_alphabet_lesson");
                return b0Var;
        }
    }
}
