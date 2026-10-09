package vh;

import android.content.Context;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetUpdateWorker;
import fb.n;
import fz.e;
import gb.p;
import kotlin.jvm.internal.m;
import qy.b0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LingoSkillApplication f54055b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LingoSkillApplication lingoSkillApplication, d dVar, int i11) {
        super(2, dVar);
        this.f54054a = i11;
        this.f54055b = lingoSkillApplication;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        switch (this.f54054a) {
            case 0:
                return new a(this.f54055b, dVar, 0);
            default:
                return new a(this.f54055b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        tt.a aVar = (tt.a) obj;
        d dVar = (d) obj2;
        switch (this.f54054a) {
            case 0:
                a aVar2 = (a) create(aVar, dVar);
                b0 b0Var = b0.f48488a;
                aVar2.invokeSuspend(b0Var);
                return b0Var;
            default:
                a aVar3 = (a) create(aVar, dVar);
                b0 b0Var2 = b0.f48488a;
                aVar3.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f54054a;
        b0 b0Var = b0.f48488a;
        LingoSkillApplication lingoSkillApplication = this.f54055b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Context applicationContext = lingoSkillApplication.getApplicationContext();
                m.c(applicationContext);
                if (!xq.a.d(applicationContext)) {
                    xq.a.b(applicationContext);
                } else {
                    p pVarE = p.E(applicationContext);
                    m.e(pVarE, "getInstance(context)");
                    pVarE.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Context applicationContext2 = lingoSkillApplication.getApplicationContext();
                m.c(applicationContext2);
                if (!xq.a.d(applicationContext2)) {
                    xq.a.b(applicationContext2);
                } else {
                    p pVarE2 = p.E(applicationContext2);
                    m.e(pVarE2, "getInstance(context)");
                    pVarE2.m("day_streak_widget_update", n.REPLACE, new ob.m(DayStreakWidgetUpdateWorker.class).G());
                }
                break;
        }
        return b0Var;
    }
}
