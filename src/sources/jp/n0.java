package jp;

import android.content.Context;
import android.widget.ImageView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.object.Unit;
import com.lingodeer.R;
import hj.x3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f36514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(p0 p0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f36512a = i11;
        this.f36514c = p0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36512a) {
            case 0:
                return new n0(this.f36514c, dVar, 0);
            case 1:
                return new n0(this.f36514c, dVar, 1);
            default:
                return new n0(this.f36514c, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f36512a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f36512a;
        p0 p0Var = this.f36514c;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f36513b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    av.p pVar = new av.p(p0Var, null, 23);
                    this.f36513b = 1;
                    obj = rz.e0.M(eVar, pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Unit unit = (Unit) obj;
                if (unit == null) {
                    return b0Var;
                }
                String description = unit.getDescription();
                if (description == null || description.length() == 0) {
                    ta.a aVar2 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((ImageView) ((x3) aVar2).f33575h.f32798g).setVisibility(8);
                    return b0Var;
                }
                ta.a aVar3 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((ImageView) ((x3) aVar3).f33575h.f32798g).setVisibility(0);
                if (p0Var.r().hasClickedTips) {
                    ta.a aVar4 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((ImageView) ((x3) aVar4).f33575h.f32798g).setImageResource(R.drawable.ic_theme_btn_ls);
                } else {
                    ta.a aVar5 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((ImageView) ((x3) aVar5).f33575h.f32798g).setImageResource(R.drawable.ic_theme_btn_ls_accent);
                }
                ta.a aVar6 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                bq.z.b((ImageView) ((x3) aVar6).f33575h.f32798g, new j9.h(i12, p0Var, unit));
                return b0Var;
            case 1:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f36513b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = p0Var.u().f55339f;
                    this.f36513b = 1;
                    obj = uz.x0.u(m0Var, this);
                    if (obj == aVar7) {
                        return aVar7;
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
                Context contextRequireContext = p0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "quit_lesson");
                return b0Var;
            default:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f36513b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    mp.a aVar9 = (mp.a) p0Var.N;
                    kotlin.jvm.internal.m.c(aVar9);
                    this.f36513b = 1;
                    aVar9.q();
                    if (b0Var == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ta.a aVar10 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((x3) aVar10).f33571d.setVisibility(4);
                return b0Var;
        }
    }
}
