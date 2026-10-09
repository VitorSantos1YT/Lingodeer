package oo;

import android.content.Context;
import android.content.Intent;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.speak.ui.SpeakTestActivity;
import com.lingo.lingoskill.speak.ui.SpeakTryActivity;
import com.lingodeer.data.model.INTENTS;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f45646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f45644a = i11;
        this.f45646c = hVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f45644a) {
            case 0:
                return new e(this.f45646c, dVar, 0);
            default:
                return new e(this.f45646c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f45644a) {
            case 0:
                break;
        }
        return ((e) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f45644a;
        qy.b0 b0Var = qy.b0.f48488a;
        h hVar = this.f45646c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f45645b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vz.i iVar = hVar.u().f55340g;
                    this.f45645b = 1;
                    obj = x0.u(iVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (!((Boolean) obj).booleanValue() && hVar.T != 1) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage != 3 || hVar.T != hVar.r().enFreesUnitSortIndex) {
                        Context contextRequireContext = hVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                        fb.g0.w(contextRequireContext, hVar, "pay_story_speak");
                        return b0Var;
                    }
                }
                int i13 = SpeakTryActivity.R;
                l.m mVar = hVar.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                hVar.startActivity(ns.o.N(mVar, hVar.T, hVar.U));
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f45645b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vz.i iVar2 = hVar.u().f55340g;
                    this.f45645b = 1;
                    obj = x0.u(iVar2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (!((Boolean) obj).booleanValue() && hVar.T != 1) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage != 3 || hVar.T != hVar.r().enFreesUnitSortIndex) {
                        Context contextRequireContext2 = hVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        fb.g0.w(contextRequireContext2, hVar, "pay_story_read");
                        return b0Var;
                    }
                }
                int i15 = SpeakTestActivity.R;
                l.m mVar2 = hVar.f36398d;
                kotlin.jvm.internal.m.c(mVar2);
                int i16 = hVar.T;
                long j11 = hVar.U;
                Intent intent = new Intent(mVar2, (Class<?>) SpeakTestActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, i16);
                intent.putExtra(INTENTS.EXTRA_LONG, j11);
                hVar.startActivity(intent);
                return b0Var;
        }
    }
}
