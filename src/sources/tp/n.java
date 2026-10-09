package tp;

import a0.w1;
import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.object.ReviewNew;
import rt.m9;
import rz.o0;
import uz.r0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f52481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f52479a = i11;
        this.f52481c = oVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52479a) {
            case 0:
                return new n(this.f52481c, dVar, 0);
            case 1:
                return new n(this.f52481c, dVar, 1);
            default:
                return new n(this.f52481c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52479a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f52479a;
        qy.b0 b0Var = qy.b0.f48488a;
        o oVar = this.f52481c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f52480b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                r0 r0Var = ((vp.d) oVar.f52485d0.getValue()).f54085c;
                nu.b bVar = new nu.b(oVar, null, 15);
                this.f52480b = 1;
                return x0.i(r0Var, bVar, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f52480b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vp.d dVar = (vp.d) oVar.f52485d0.getValue();
                    Long unit = ((ReviewNew) oVar.O.get(oVar.P)).getUnit();
                    kotlin.jvm.internal.m.e(unit, "getUnit(...)");
                    long jLongValue = unit.longValue();
                    this.f52480b = 1;
                    dVar.getClass();
                    yz.f fVar = o0.f50940a;
                    obj = rz.e0.M(yz.e.f58387a, new w1(dVar, jLongValue, (vy.d) null, 11), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar3 = oVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.v) aVar3).f33445u.setText((String) obj);
                ta.a aVar4 = oVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.v) aVar4).f33445u.setVisibility(0);
                return b0Var;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f52480b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = oVar.u().f55339f;
                    this.f52480b = 1;
                    obj = x0.u(m0Var, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l.m mVar = oVar.f36398d;
                if (mVar != null) {
                    mVar.finish();
                }
                oVar.t().c("jxz_review_flashcard_quit", new m9(26));
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue) {
                    return b0Var;
                }
                int[] iArr = bq.r.f4959a;
                Context contextRequireContext = oVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "quit_lesson");
                return b0Var;
        }
    }
}
