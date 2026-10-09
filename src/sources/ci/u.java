package ci;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import hj.q5;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f7156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f7154a = i11;
        this.f7156c = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f7154a) {
            case 0:
                return new u(this.f7156c, dVar, 0);
            default:
                return new u(this.f7156c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f7154a) {
            case 0:
                break;
        }
        return ((u) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f7154a;
        qy.b0 b0Var = qy.b0.f48488a;
        v vVar = this.f7156c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f7155b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    mm.a aVar2 = (mm.a) vVar.N;
                    kotlin.jvm.internal.m.c(aVar2);
                    this.f7155b = 1;
                    if (aVar2.j(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar3 = vVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                bq.z.b(((q5) aVar3).f33169d, new s(vVar, i12));
                return b0Var;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f7155b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = vVar.u().f55339f;
                    this.f7155b = 1;
                    obj = x0.u(m0Var, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue) {
                    return b0Var;
                }
                int[] iArr = bq.r.f4959a;
                Context contextRequireContext = vVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "quit_alphabet_lesson");
                return b0Var;
        }
    }
}
