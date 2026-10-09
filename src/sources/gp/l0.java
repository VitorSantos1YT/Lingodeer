package gp;

import android.content.Context;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f29429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f29431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(n0 n0Var, boolean z11, Context context, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29427a = i11;
        this.f29429c = n0Var;
        this.f29430d = z11;
        this.f29431e = context;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29427a) {
            case 0:
                return new l0(this.f29429c, this.f29430d, this.f29431e, dVar, 0);
            default:
                return new l0(this.f29429c, this.f29430d, this.f29431e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29427a) {
            case 0:
                break;
        }
        return ((l0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f29427a;
        n0 n0Var = this.f29429c;
        boolean z11 = this.f29430d;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29428b;
                try {
                    if (i12 == 0) {
                        com.bumptech.glide.e.F(obj);
                        vt.n0 n0Var2 = n0Var.f29458a;
                        this.f29428b = 1;
                        fr.o0 o0Var = (fr.o0) n0Var2;
                        o0Var.getClass();
                        yz.f fVar = rz.o0.f50940a;
                        Object objM = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var, z11, null, 3), this);
                        if (objM != aVar) {
                            objM = b0Var;
                        }
                        if (objM == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    if (z11) {
                        n0Var.getClass();
                        er.c.h();
                        n0.a(n0Var, "daily_reminder_on", "enabled");
                    } else {
                        n0Var.getClass();
                        er.c cVar = er.c.f25748a;
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        er.c.a(er.e.DAILY_LEARN, lingoSkillApplication);
                        n0.a(n0Var, "daily_reminder_off", "disabled");
                    }
                    uz.i1 i1Var = n0Var.f29460c;
                    j0 j0VarA = j0.a((j0) i1Var.getValue(), this.f29430d, null, false, false, null, null, 62);
                    i1Var.getClass();
                    i1Var.l(null, j0VarA);
                    return b0Var;
                } catch (Exception e8) {
                    uz.i1 i1Var2 = n0Var.f29460c;
                    j0 j0VarA2 = j0.a((j0) i1Var2.getValue(), false, null, false, false, null, ep.a.e("更新日常学习提醒设置失败: ", e8.getMessage()), 63);
                    i1Var2.getClass();
                    i1Var2.l(null, j0VarA2);
                    return b0Var;
                }
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f29428b;
                try {
                    if (i13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        vt.n0 n0Var3 = n0Var.f29458a;
                        this.f29428b = 1;
                        fr.o0 o0Var2 = (fr.o0) n0Var3;
                        o0Var2.getClass();
                        yz.f fVar2 = rz.o0.f50940a;
                        Object objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var2, z11, null, 24), this);
                        if (objM2 != aVar2) {
                            objM2 = b0Var;
                        }
                        if (objM2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    if (z11) {
                        n0Var.getClass();
                        er.c cVar2 = er.c.f25748a;
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication2);
                        cVar2.j(lingoSkillApplication2);
                        n0.a(n0Var, "smart_reminder_on", "enabled");
                    } else {
                        n0Var.getClass();
                        er.c cVar3 = er.c.f25748a;
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication3);
                        er.c.a(er.e.SRS_REVIEW, lingoSkillApplication3);
                        n0.a(n0Var, "smart_reminder_off", "disabled");
                    }
                    uz.i1 i1Var3 = n0Var.f29460c;
                    j0 j0VarA3 = j0.a((j0) i1Var3.getValue(), false, null, false, this.f29430d, null, null, 55);
                    i1Var3.getClass();
                    i1Var3.l(null, j0VarA3);
                    return b0Var;
                } catch (Exception e10) {
                    uz.i1 i1Var4 = n0Var.f29460c;
                    j0 j0VarA4 = j0.a((j0) i1Var4.getValue(), false, null, false, false, null, ep.a.e("更新智能复习提醒设置失败: ", e10.getMessage()), 63);
                    i1Var4.getClass();
                    i1Var4.l(null, j0VarA4);
                    return b0Var;
                }
        }
    }
}
