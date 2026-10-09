package br;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetUpdateWorker;
import com.lingo.main.ui.MainComposeActivity;
import dv.u0;
import fr.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(MainComposeActivity mainComposeActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5105a = i11;
        this.f5106b = mainComposeActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5105a) {
            case 0:
                return new y(this.f5106b, dVar, 0);
            default:
                return new y(this.f5106b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5105a) {
            case 0:
                y yVar = (y) create((tt.a) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                yVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                y yVar2 = (y) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                yVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objL;
        int i11 = this.f5105a;
        MainComposeActivity mainComposeActivity = this.f5106b;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                mainComposeActivity.r().d(new ju.d(25));
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int i12 = MainComposeActivity.U;
                ar.e eVar = (ar.e) mainComposeActivity.P.getValue();
                MainComposeActivity mainComposeActivity2 = eVar.f2842a;
                vy.d dVar = null;
                try {
                    if (eVar.f2843b == null) {
                        Lifecycle lifecycle = mainComposeActivity2.getLifecycle();
                        MainComposeActivity mainComposeActivity3 = eVar.f2842a;
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        eVar.f2843b = new oi.c(lifecycle, mainComposeActivity3, cf.x.h(), mainComposeActivity2.n(), (u0) mainComposeActivity2.O.getValue(), new a00.c(eVar, 1));
                    } else {
                        com.android.billingclient.api.d dVar2 = eVar.f2844c;
                        if (dVar2 != null) {
                            eVar.a(dVar2);
                        }
                    }
                    oi.c cVar = eVar.f2843b;
                    if (cVar != null) {
                        ((mi.c) cVar.f44926b).g();
                        objL = b0Var;
                    } else {
                        objL = null;
                    }
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                Throwable thA = qy.o.a(objL);
                if (thA != null) {
                    thA.printStackTrace();
                }
                gp.w wVarR = mainComposeActivity.r();
                wVarR.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                o0 o0Var = (o0) wVarR.f29527d;
                if (jCurrentTimeMillis - o0Var.f27733a.lastUpdateRemoteConfigTime >= 3600000 || o0Var.z()) {
                    rz.e0.B(ViewModelKt.getViewModelScope(wVarR), null, null, new gp.n(wVarR, dVar, 3), 3);
                }
                mainComposeActivity.r().f();
                Context applicationContext = mainComposeActivity.getApplicationContext();
                kotlin.jvm.internal.m.c(applicationContext);
                if (!xq.a.d(applicationContext)) {
                    xq.a.b(applicationContext);
                } else {
                    gb.p pVarE = gb.p.E(applicationContext);
                    kotlin.jvm.internal.m.e(pVarE, "getInstance(context)");
                    pVarE.m("day_streak_widget_update", fb.n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
                }
                break;
        }
        return b0Var;
    }
}
