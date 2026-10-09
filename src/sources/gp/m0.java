package gp;

import android.content.Context;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f29453f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f29454t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i11, int i12, n0 n0Var, Context context, vy.d dVar, int i13) {
        super(2, dVar);
        this.f29448a = i13;
        this.f29451d = i11;
        this.f29452e = i12;
        this.f29453f = n0Var;
        this.f29454t = context;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29448a) {
            case 0:
                return new m0(this.f29451d, this.f29452e, this.f29453f, this.f29454t, dVar, 0);
            default:
                return new m0(this.f29451d, this.f29452e, this.f29453f, this.f29454t, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29448a) {
            case 0:
                break;
        }
        return ((m0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i11 = this.f29448a;
        int i12 = this.f29452e;
        int i13 = this.f29451d;
        n0 n0Var = this.f29453f;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f29450c;
                try {
                    if (i14 == 0) {
                        com.bumptech.glide.e.F(obj);
                        String str3 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{new Integer(i13), new Integer(i12)}, 2));
                        vt.n0 n0Var2 = n0Var.f29458a;
                        this.f29449b = str3;
                        this.f29450c = 1;
                        fr.o0 o0Var = (fr.o0) n0Var2;
                        o0Var.getClass();
                        yz.f fVar = rz.o0.f50940a;
                        Object objM = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var, str3, null, 7), this);
                        if (objM != aVar) {
                            objM = b0Var;
                        }
                        if (objM == aVar) {
                            return aVar;
                        }
                        str = str3;
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str4 = this.f29449b;
                        com.bumptech.glide.e.F(obj);
                        str = str4;
                    }
                    if (((fr.o0) n0Var.f29458a).f27733a.learningRemind) {
                        er.c.h();
                    }
                    uz.i1 i1Var = n0Var.f29460c;
                    j0 j0VarA = j0.a((j0) i1Var.getValue(), false, str, false, false, null, null, 61);
                    i1Var.getClass();
                    i1Var.l(null, j0VarA);
                    n0.a(n0Var, "daily_time_update", str);
                    return b0Var;
                } catch (Exception e8) {
                    uz.i1 i1Var2 = n0Var.f29460c;
                    j0 j0VarA2 = j0.a((j0) i1Var2.getValue(), false, null, false, false, null, ep.a.e("更新日常学习提醒时间失败: ", e8.getMessage()), 63);
                    i1Var2.getClass();
                    i1Var2.l(null, j0VarA2);
                    return b0Var;
                }
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f29450c;
                try {
                    if (i15 == 0) {
                        com.bumptech.glide.e.F(obj);
                        String str5 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{new Integer(i13), new Integer(i12)}, 2));
                        vt.n0 n0Var3 = n0Var.f29458a;
                        this.f29449b = str5;
                        this.f29450c = 1;
                        fr.o0 o0Var2 = (fr.o0) n0Var3;
                        o0Var2.getClass();
                        yz.f fVar2 = rz.o0.f50940a;
                        Object objM2 = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var2, str5, null, 25), this);
                        if (objM2 != aVar2) {
                            objM2 = b0Var;
                        }
                        if (objM2 == aVar2) {
                            return aVar2;
                        }
                        str2 = str5;
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str6 = this.f29449b;
                        com.bumptech.glide.e.F(obj);
                        str2 = str6;
                    }
                    if (((fr.o0) n0Var.f29458a).f27733a.smartReviewReminderEnabled) {
                        er.c cVar = er.c.f25748a;
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        cVar.j(lingoSkillApplication);
                    }
                    uz.i1 i1Var3 = n0Var.f29460c;
                    j0 j0VarA3 = j0.a((j0) i1Var3.getValue(), false, null, false, false, str2, null, 47);
                    i1Var3.getClass();
                    i1Var3.l(null, j0VarA3);
                    n0.a(n0Var, "smart_time_update", str2);
                    return b0Var;
                } catch (Exception e10) {
                    uz.i1 i1Var4 = n0Var.f29460c;
                    j0 j0VarA4 = j0.a((j0) i1Var4.getValue(), false, null, false, false, null, ep.a.e("更新智能复习提醒时间失败: ", e10.getMessage()), 63);
                    i1Var4.getClass();
                    i1Var4.l(null, j0VarA4);
                    return b0Var;
                }
        }
    }
}
