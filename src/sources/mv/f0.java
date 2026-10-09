package mv;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b0.i1;
import bh.a1;
import bh.n0;
import com.google.api.Service;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.widget.RoleWaveView;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import fr.f4;
import fr.o0;
import fr.x4;
import fr.y3;
import hj.n1;
import hj.n2;
import java.util.List;
import ot.u2;
import qp.d2;
import qp.f2;
import qp.k2;
import qp.p0;
import rt.dd;
import rt.m5;
import rt.mf;
import rt.qd;
import rt.t6;
import rt.v7;
import s0.t0;
import uz.w0;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f42205a = i11;
        this.f42207c = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f42205a) {
            case 0:
                return new f0((g0) this.f42207c, dVar, 0);
            case 1:
                return new f0((ob.e) this.f42207c, dVar, 1);
            case 2:
                return new f0((n3.c) this.f42207c, dVar, 2);
            case 3:
                return new f0((oo.y) this.f42207c, dVar, 3);
            case 4:
                return new f0((oo.d0) this.f42207c, dVar, 4);
            case 5:
                return new f0((oo.k0) this.f42207c, dVar, 5);
            case 6:
                return new f0((qh.e) this.f42207c, dVar, 6);
            case 7:
                return new f0((qh.q) this.f42207c, dVar, 7);
            case 8:
                return new f0((qh.c0) this.f42207c, dVar, 8);
            case 9:
                return new f0((qh.k0) this.f42207c, dVar, 9);
            case 10:
                return new f0((qp.w) this.f42207c, dVar, 10);
            case 11:
                return new f0((p0) this.f42207c, dVar, 11);
            case 12:
                return new f0((f2) this.f42207c, dVar, 12);
            case 13:
                return new f0((k2) this.f42207c, dVar, 13);
            case 14:
                return new f0((ConstraintTrackingWorker) this.f42207c, dVar, 14);
            case 15:
                return new f0((rm.d) this.f42207c, dVar, 15);
            case 16:
                return new f0((rm.g) this.f42207c, dVar, 16);
            case 17:
                return new f0((rp.e) this.f42207c, dVar, 17);
            case 18:
                return new f0((rt.j) this.f42207c, dVar, 18);
            case 19:
                return new f0((dd) this.f42207c, dVar, 19);
            case 20:
                return new f0((qd) this.f42207c, dVar, 20);
            case 21:
                return new f0((mf) this.f42207c, dVar, 21);
            case 22:
                return new f0((b1.m) this.f42207c, dVar, 22);
            case 23:
                return new f0((t0) this.f42207c, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new f0((s2.m0) this.f42207c, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new f0((s9.a) this.f42207c, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new f0((sm.c) this.f42207c, dVar, 26);
            case 27:
                return new f0((sq.v) this.f42207c, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new f0((sr.e) this.f42207c, dVar, 28);
            default:
                return new f0((sv.d) this.f42207c, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f42205a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                break;
            case 27:
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                break;
        }
        return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r1v175, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objU;
        Object objU2;
        Object objU3;
        Object objU4;
        Object objU5;
        Object objU6;
        Object objM;
        Object objM2;
        Object value;
        Object value2;
        Object objU7;
        int i11 = this.f42205a;
        int i12 = 27;
        int i13 = 6;
        re.q qVar = vx.b.f54316e;
        int i14 = 2;
        vy.d dVar = null;
        int i15 = 0;
        Object obj2 = qy.b0.f48488a;
        Object obj3 = this.f42207c;
        int i16 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f42206b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    o0 o0Var = (o0) ((g0) obj3).f42209a;
                    if (o0Var.f27733a.isFirstTimeEnterJPSyllable) {
                        this.f42206b = 1;
                        o0Var.getClass();
                        yz.f fVar = rz.o0.f50940a;
                        Object objM3 = rz.e0.M(yz.e.f58387a, new fr.g0(14, o0Var, dVar), this);
                        if (objM3 != aVar) {
                            objM3 = obj2;
                        }
                        if (objM3 == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return obj2;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f42206b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b0.n nVar = (b0.n) ((ob.e) obj3).f44805c;
                    Float f5 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                    i1 i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new Float(0.5f), 1);
                    this.f42206b = 1;
                    if (b0.e.i(nVar, f5, i1VarQ, true, null, this, 8) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return obj2;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f42206b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f42206b = 1;
                    return ((n3.c) obj3).b(this) == aVar3 ? aVar3 : obj2;
                }
                if (i19 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return obj2;
            case 3:
                oo.y yVar = (oo.y) obj3;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f42206b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                vt.k0 k0Var = (vt.k0) yVar.Q.getValue();
                long j11 = yVar.O;
                this.f42206b = 1;
                a1 a1Var = (a1) k0Var;
                a1Var.getClass();
                yz.f fVar2 = rz.o0.f50940a;
                Object objM4 = rz.e0.M(yz.e.f58387a, new n0(7, j11, a1Var, null), this);
                if (objM4 != aVar4) {
                    objM4 = obj2;
                }
                return objM4 == aVar4 ? aVar4 : obj2;
            case 4:
                oo.d0 d0Var = (oo.d0) obj3;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f42206b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = d0Var.u().f55339f;
                    this.f42206b = 1;
                    objU = x0.u(m0Var, this);
                    if (objU == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                }
                boolean zBooleanValue = ((Boolean) objU).booleanValue();
                d0Var.t().c("jxz_main_story_read_quit", new oo.a0(d0Var, 3));
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue) {
                    return obj2;
                }
                int[] iArr = bq.r.f4959a;
                Context contextRequireContext = d0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "quit_lesson");
                return obj2;
            case 5:
                oo.k0 k0Var2 = (oo.k0) obj3;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f42206b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(obj);
                    k0Var2.t().c("jxz_main_story_speak_quit", new oo.f0(k0Var2, 5));
                    wt.m0 m0Var2 = k0Var2.u().f55339f;
                    this.f42206b = 1;
                    objU2 = x0.u(m0Var2, this);
                    if (objU2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                }
                boolean zBooleanValue2 = ((Boolean) objU2).booleanValue();
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue2) {
                    return obj2;
                }
                int[] iArr2 = bq.r.f4959a;
                Context contextRequireContext2 = k0Var2.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                bq.m.C(contextRequireContext2, "quit_lesson");
                return obj2;
            case 6:
                qh.e eVar = (qh.e) obj3;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f42206b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var3 = eVar.u().f55339f;
                    this.f42206b = 1;
                    objU3 = x0.u(m0Var3, this);
                    if (objU3 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU3 = obj;
                }
                boolean zBooleanValue3 = ((Boolean) objU3).booleanValue();
                sh.b bVar = eVar.N;
                if (bVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                ay.x xVar = new ay.x(new gh.b(zBooleanValue3, i15));
                dy.j jVar = ky.e.f38937b;
                th.j.a(xVar.k(jVar).g(px.b.a()).f(new lp.j(bVar, 28)).k(jVar).g(px.b.a()).h(new n9.q(eVar, 9), qVar), eVar.f36401t);
                return obj2;
            case 7:
                qh.q qVar2 = (qh.q) obj3;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f42206b;
                if (i25 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var4 = qVar2.u().f55339f;
                    this.f42206b = 1;
                    objU4 = x0.u(m0Var4, this);
                    if (objU4 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU4 = obj;
                }
                th.j.a(new ay.x(new gh.b(((Boolean) objU4).booleanValue(), i15)).k(ky.e.f38937b).g(px.b.a()).h(new n9.q(qVar2, 10), qVar), qVar2.f36401t);
                return obj2;
            case 8:
                qh.c0 c0Var = (qh.c0) obj3;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f42206b;
                if (i26 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var5 = c0Var.u().f55339f;
                    this.f42206b = 1;
                    objU5 = x0.u(m0Var5, this);
                    if (objU5 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU5 = obj;
                }
                boolean zBooleanValue4 = ((Boolean) objU5).booleanValue();
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                ay.x xVar2 = new ay.x(new gh.b(zBooleanValue4, i15));
                dy.j jVar2 = ky.e.f38937b;
                th.j.a(xVar2.k(jVar2).g(px.b.a()).f(new m5(cVar, i16)).k(jVar2).g(px.b.a()).h(new o20.w(c0Var, 7), qVar), c0Var.f36401t);
                return obj2;
            case 9:
                qh.k0 k0Var3 = (qh.k0) obj3;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f42206b;
                if (i27 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var6 = k0Var3.u().f55339f;
                    this.f42206b = 1;
                    objU6 = x0.u(m0Var6, this);
                    if (objU6 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU6 = obj;
                }
                boolean zBooleanValue5 = ((Boolean) objU6).booleanValue();
                sh.d dVar2 = k0Var3.T;
                if (dVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                ay.x xVar3 = new ay.x(new gh.b(zBooleanValue5, i15));
                dy.j jVar3 = ky.e.f38937b;
                th.j.a(xVar3.k(jVar3).g(px.b.a()).f(new n9.q(dVar2, i12)).k(jVar3).g(px.b.a()).h(new qh.g0(k0Var3, i15), qVar), k0Var3.f36401t);
                return obj2;
            case 10:
                qp.w wVar = (qp.w) obj3;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f42206b;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                wVar.f48239r.set(true);
                ta.a aVar12 = wVar.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                ((n1) aVar12).f32966p.setVisibility(0);
                ta.a aVar13 = wVar.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                RoleWaveView roleWaveView = ((n1) aVar13).f32966p;
                roleWaveView.postDelayed(new b2.c(4, roleWaveView, new qp.u(wVar, i16)), 0L);
                ta.a aVar14 = wVar.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                ((n1) aVar14).f32963l.setVisibility(0);
                ta.a aVar15 = wVar.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                ((n1) aVar15).f32955d.setVisibility(8);
                ta.a aVar16 = wVar.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                ((n1) aVar16).f32953b.setVisibility(8);
                ta.a aVar17 = wVar.f47886f;
                kotlin.jvm.internal.m.c(aVar17);
                ((n1) aVar17).f32954c.setVisibility(8);
                po.a aVar18 = wVar.f48237p;
                if (aVar18 == null) {
                    return obj2;
                }
                String str = wVar.f48236o;
                this.f42206b = 1;
                return po.a.b(aVar18, str, this) == aVar11 ? aVar11 : obj2;
            case 11:
                p0 p0Var = (p0) obj3;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f42206b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                p0Var.f48110q.set(true);
                ta.a aVar20 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar20);
                ((n1) aVar20).f32966p.setVisibility(0);
                ta.a aVar21 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar21);
                RoleWaveView roleWaveView2 = ((n1) aVar21).f32966p;
                roleWaveView2.postDelayed(new b2.c(4, roleWaveView2, new qp.m0(p0Var, i14)), 0L);
                ta.a aVar22 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar22);
                ((n1) aVar22).f32963l.setVisibility(0);
                ta.a aVar23 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar23);
                ((n1) aVar23).f32955d.setVisibility(8);
                ta.a aVar24 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar24);
                ((n1) aVar24).f32953b.setVisibility(8);
                ta.a aVar25 = p0Var.f47886f;
                kotlin.jvm.internal.m.c(aVar25);
                ((n1) aVar25).f32954c.setVisibility(8);
                po.a aVar26 = p0Var.f48109p;
                if (aVar26 == null) {
                    return obj2;
                }
                String str2 = p0Var.f48108o;
                this.f42206b = 1;
                return po.a.b(aVar26, str2, this) == aVar19 ? aVar19 : obj2;
            case 12:
                f2 f2Var = (f2) obj3;
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f42206b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                f2Var.f47928q.set(true);
                ta.a aVar28 = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar28);
                ((n2) aVar28).m.setVisibility(0);
                ta.a aVar29 = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar29);
                RoleWaveView roleWaveView3 = ((n2) aVar29).m;
                roleWaveView3.postDelayed(new b2.c(4, roleWaveView3, new d2(f2Var, i16)), 0L);
                ta.a aVar30 = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar30);
                ((n2) aVar30).f32977k.setVisibility(0);
                ta.a aVar31 = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar31);
                ((n2) aVar31).f32970d.setVisibility(8);
                ta.a aVar32 = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar32);
                ((n2) aVar32).f32968b.setVisibility(8);
                ta.a aVar33 = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar33);
                ((n2) aVar33).f32969c.setVisibility(8);
                po.a aVar34 = f2Var.f47927p;
                if (aVar34 == null) {
                    return obj2;
                }
                String str3 = f2Var.f47926o;
                this.f42206b = 1;
                return po.a.b(aVar34, str3, this) == aVar27 ? aVar27 : obj2;
            case 13:
                Object obj4 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f42206b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                mp.a aVarA = ((jp.p0) ((k2) obj3).f47881a).A();
                this.f42206b = 1;
                aVarA.q();
                return obj2 == obj4 ? obj4 : obj2;
            case 14:
                wy.a aVar35 = wy.a.COROUTINE_SUSPENDED;
                int i32 = this.f42206b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f42206b = 1;
                Object objF = ConstraintTrackingWorker.f((ConstraintTrackingWorker) obj3, this);
                return objF == aVar35 ? aVar35 : objF;
            case 15:
                wy.a aVar36 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f42206b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                rm.d dVar3 = (rm.d) obj3;
                bh.f0 f0Var = new bh.f0(((a1) dVar3.f49293a).e(((o0) dVar3.f49294b).f27733a.keyLanguage, false), i15);
                this.f42206b = 1;
                Object objU8 = x0.u(f0Var, this);
                return objU8 == aVar36 ? aVar36 : objU8;
            case 16:
                rm.g gVar = (rm.g) obj3;
                uz.i1 i1Var = gVar.f49304c;
                CourseCharacterGroup courseCharacterGroup = gVar.f49302a;
                wy.a aVar37 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f42206b;
                try {
                    if (i34 == 0) {
                        com.bumptech.glide.e.F(obj);
                        List listW0 = oz.q.W0(courseCharacterGroup.getGroupList(), new String[]{";"}, 0, 6);
                        this.f42206b = 1;
                        yz.f fVar3 = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new hs.f(listW0, gVar, (vy.d) null), this);
                        if (objM == aVar37) {
                            return aVar37;
                        }
                    } else {
                        if (i34 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        objM = obj;
                    }
                    List list = (List) objM;
                    list.size();
                    zr.g gVar2 = new zr.g(courseCharacterGroup, list);
                    i1Var.getClass();
                    i1Var.l(null, gVar2);
                    return obj2;
                } catch (Exception unused) {
                    zr.g gVar3 = new zr.g(courseCharacterGroup, ry.r.f50854a);
                    i1Var.getClass();
                    i1Var.l(null, gVar3);
                    return obj2;
                }
            case 17:
                rp.e eVar2 = (rp.e) obj3;
                uz.i1 i1Var2 = eVar2.f49344b;
                wy.a aVar38 = wy.a.COROUTINE_SUSPENDED;
                int i35 = this.f42206b;
                if (i35 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f42206b = 1;
                    yz.f fVar4 = rz.o0.f50940a;
                    objM2 = rz.e0.M(yz.e.f58387a, new jp.t0(i14, 5, dVar), this);
                    if (objM2 == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objM2 = obj;
                }
                List list2 = (List) objM2;
                if (list2.isEmpty()) {
                    do {
                        value = i1Var2.getValue();
                    } while (!i1Var2.j(value, new rp.g(1.0f, true)));
                    return obj2;
                }
                do {
                    value2 = i1Var2.getValue();
                } while (!i1Var2.j(value2, new rp.g(CropImageView.DEFAULT_ASPECT_RATIO, false)));
                eVar2.f49343a.c(list2, new fj.a(i13, eVar2, list2), false);
                return obj2;
            case 18:
                wy.a aVar39 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f42206b;
                if (i36 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f42206b = 1;
                    return rt.j.b((rt.j) obj3, this) == aVar39 ? aVar39 : obj2;
                }
                if (i36 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return obj2;
            case 19:
                Object obj5 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f42206b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                vt.c cVar2 = ((dd) obj3).f50703b;
                this.f42206b = 1;
                ((vt.d) cVar2).n(this);
                return obj2 == obj5 ? obj5 : obj2;
            case 20:
                wy.a aVar40 = wy.a.COROUTINE_SUSPENDED;
                int i38 = this.f42206b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                qd qdVar = (qd) obj3;
                vt.k0 k0Var4 = qdVar.f50308a;
                long j12 = qdVar.f50312e;
                this.f42206b = 1;
                a1 a1Var2 = (a1) k0Var4;
                a1Var2.getClass();
                yz.f fVar5 = rz.o0.f50940a;
                Object objM5 = rz.e0.M(yz.e.f58387a, new n0(9, j12, a1Var2, null), this);
                if (objM5 != aVar40) {
                    objM5 = obj2;
                }
                return objM5 == aVar40 ? aVar40 : obj2;
            case 21:
                mf mfVar = (mf) obj3;
                wy.a aVar41 = wy.a.COROUTINE_SUSPENDED;
                int i39 = this.f42206b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                u2 u2Var = mfVar.f50100a;
                bh.t tVar = (bh.t) u2Var.f46014a.f55309a;
                gp.r rVar = new gp.r(new bh.a(tVar, dVar, i14));
                yz.f fVar6 = rz.o0.f50940a;
                yz.e eVar3 = yz.e.f58387a;
                n9.n1 n1Var = new n9.n1(x0.w(new bh.r(new bh.r(x0.w(rVar, eVar3), tVar, i15), u2Var, 19), eVar3), new f4(mfVar, dVar, 13));
                b1.b bVar2 = new b1.b(mfVar, 16);
                this.f42206b = 1;
                return n1Var.collect(bVar2, this) == aVar41 ? aVar41 : obj2;
            case 22:
                wy.a aVar42 = wy.a.COROUTINE_SUSPENDED;
                int i40 = this.f42206b;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                b1.m mVar = (b1.m) obj3;
                this.f42206b = 1;
                mVar.getClass();
                Object objL = rz.e0.l(new av.f0(mVar, dVar, i14), this);
                if (objL != aVar42) {
                    objL = obj2;
                }
                return objL == aVar42 ? aVar42 : obj2;
            case 23:
                Object obj6 = wy.a.COROUTINE_SUSPENDED;
                int i41 = this.f42206b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                t0 t0Var = (t0) obj3;
                this.f42206b = 1;
                t0Var.getClass();
                y.e0 e0Var = new y.e0();
                w0 w0Var = t0Var.f51194a.f29906a;
                t6 t6Var = new t6(i14, e0Var, t0Var);
                w0Var.getClass();
                Object objL2 = w0.l(w0Var, t6Var, this);
                if (objL2 != obj6) {
                    objL2 = obj2;
                }
                return objL2 == obj6 ? obj6 : obj2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                s2.m0 m0Var7 = (s2.m0) obj3;
                wy.a aVar43 = wy.a.COROUTINE_SUSPENDED;
                int i42 = this.f42206b;
                if (i42 != 0) {
                    if (i42 != 1 && i42 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                ?? r9 = m0Var7.T;
                if (r9 != 0) {
                    this.f42206b = 1;
                    if (r9.invoke(m0Var7, this) != aVar43) {
                        return obj2;
                    }
                } else {
                    PointerInputEventHandler pointerInputEventHandler = m0Var7.U;
                    this.f42206b = 2;
                    if (pointerInputEventHandler.invoke(m0Var7, this) != aVar43) {
                        return obj2;
                    }
                }
                return aVar43;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar44 = wy.a.COROUTINE_SUSPENDED;
                int i43 = this.f42206b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                ff.h hVar = ((s9.a) obj3).f51519a;
                this.f42206b = 1;
                Object objT = hVar.t(this);
                return objT == aVar44 ? aVar44 : objT;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                sm.c cVar3 = (sm.c) obj3;
                wy.a aVar45 = wy.a.COROUTINE_SUSPENDED;
                int i44 = this.f42206b;
                if (i44 != 0) {
                    if (i44 != 1 && i44 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((o0) cVar3.r()).f27733a.keyLanguage))) {
                    String jpSyllableWritingFinishedLessons = ((o0) cVar3.r()).f27733a.jpSyllableWritingFinishedLessons;
                    kotlin.jvm.internal.m.e(jpSyllableWritingFinishedLessons, "jpSyllableWritingFinishedLessons");
                    if (oz.q.W0(jpSyllableWritingFinishedLessons, new String[]{";"}, 0, 6).contains(String.valueOf(cVar3.t()))) {
                        return obj2;
                    }
                    vt.n0 n0VarR = cVar3.r();
                    String jpSyllableWritingFinishedLessons2 = ((o0) cVar3.r()).f27733a.jpSyllableWritingFinishedLessons;
                    kotlin.jvm.internal.m.e(jpSyllableWritingFinishedLessons2, "jpSyllableWritingFinishedLessons");
                    String strY0 = ry.m.y0(ry.m.G0(String.valueOf(cVar3.t()), oz.q.W0(jpSyllableWritingFinishedLessons2, new String[]{";"}, 0, 6)), ";", null, null, new v7(i12), 30);
                    this.f42206b = 1;
                    o0 o0Var2 = (o0) n0VarR;
                    o0Var2.getClass();
                    yz.f fVar7 = rz.o0.f50940a;
                    Object objM6 = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var2, strY0, dVar, 13), this);
                    if (objM6 != aVar45) {
                        objM6 = obj2;
                    }
                    if (objM6 != aVar45) {
                        return obj2;
                    }
                } else {
                    String krSyllableWritingFinishedLessons = ((o0) cVar3.r()).f27733a.krSyllableWritingFinishedLessons;
                    kotlin.jvm.internal.m.e(krSyllableWritingFinishedLessons, "krSyllableWritingFinishedLessons");
                    if (oz.q.W0(krSyllableWritingFinishedLessons, new String[]{";"}, 0, 6).contains(String.valueOf(cVar3.t()))) {
                        return obj2;
                    }
                    vt.n0 n0VarR2 = cVar3.r();
                    String krSyllableWritingFinishedLessons2 = ((o0) cVar3.r()).f27733a.krSyllableWritingFinishedLessons;
                    kotlin.jvm.internal.m.e(krSyllableWritingFinishedLessons2, "krSyllableWritingFinishedLessons");
                    String strY1 = ry.m.y0(ry.m.G0(String.valueOf(cVar3.t()), oz.q.W0(krSyllableWritingFinishedLessons2, new String[]{";"}, 0, 6)), ";", null, null, new v7(i12), 30);
                    this.f42206b = 2;
                    o0 o0Var3 = (o0) n0VarR2;
                    o0Var3.getClass();
                    yz.f fVar8 = rz.o0.f50940a;
                    Object objM7 = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var3, strY1, dVar, 15), this);
                    if (objM7 != aVar45) {
                        objM7 = obj2;
                    }
                    if (objM7 != aVar45) {
                        return obj2;
                    }
                }
                return aVar45;
            case 27:
                sq.v vVar = (sq.v) obj3;
                wy.a aVar46 = wy.a.COROUTINE_SUSPENDED;
                int i45 = this.f42206b;
                if (i45 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var8 = vVar.u().f55339f;
                    this.f42206b = 1;
                    objU7 = x0.u(m0Var8, this);
                    if (objU7 == aVar46) {
                        return aVar46;
                    }
                } else {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU7 = obj;
                }
                boolean zBooleanValue6 = ((Boolean) objU7).booleanValue();
                l.m mVar2 = vVar.f36398d;
                if (mVar2 != null) {
                    mVar2.setResult(INTENTS.RESULT_LESSON_QUIT);
                    l.m mVar3 = vVar.f36398d;
                    kotlin.jvm.internal.m.c(mVar3);
                    mVar3.finish();
                }
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue6) {
                    return obj2;
                }
                int[] iArr3 = bq.r.f4959a;
                Context contextRequireContext3 = vVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                bq.m.C(contextRequireContext3, "quit_alphabet_lesson");
                return obj2;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                wy.a aVar47 = wy.a.COROUTINE_SUSPENDED;
                int i46 = this.f42206b;
                if (i46 != 0) {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                h1 h1Var = ((sr.e) obj3).f51761c;
                this.f42206b = 1;
                x4 x4Var = (x4) h1Var;
                x4Var.getClass();
                yz.f fVar9 = rz.o0.f50940a;
                Object objM8 = rz.e0.M(yz.e.f58387a, new y3(x4Var, dVar, i16), this);
                if (objM8 != aVar47) {
                    objM8 = obj2;
                }
                return objM8 == aVar47 ? aVar47 : obj2;
            default:
                wy.a aVar48 = wy.a.COROUTINE_SUSPENDED;
                int i47 = this.f42206b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj2;
                }
                com.bumptech.glide.e.F(obj);
                sv.d dVar4 = (sv.d) obj3;
                fv.c cVar4 = dVar4.f51797b;
                nv.m mVar4 = new nv.m(dVar4, 22);
                this.f42206b = 1;
                return com.bumptech.glide.f.n(cVar4, mVar4, this) == aVar48 ? aVar48 : obj2;
        }
    }
}
