package oo;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import ay.l0;
import bh.a1;
import bh.n0;
import bp.g1;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingo.lingoskill.speak.ui.SpeakTryActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingodeer.R;
import hj.a5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rz.o0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f45702c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f45700a = i11;
        this.f45702c = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f45700a) {
            case 0:
                return new r(this.f45702c, dVar, 0);
            default:
                return new r(this.f45702c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f45700a) {
            case 0:
                break;
        }
        return ((r) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f45700a;
        qy.b0 b0Var = qy.b0.f48488a;
        final int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f45701b;
                final t tVar = this.f45702c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vz.i iVar = tVar.u().f55340g;
                    this.f45701b = 1;
                    obj = x0.u(iVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Context contextRequireContext = tVar.requireContext();
                ta.a aVar2 = tVar.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                FrameLayout frameLayout = (FrameLayout) ((a5) aVar2).f32352d.f32799h;
                int i14 = tVar.Q;
                List list = tVar.P;
                vy.d dVar = null;
                if (list == null) {
                    kotlin.jvm.internal.m.n("mSentences");
                    throw null;
                }
                String[] strArrL = jh.h.l(i14, list.size());
                kotlin.jvm.internal.m.c(strArrL);
                List list2 = tVar.P;
                if (list2 == null) {
                    kotlin.jvm.internal.m.n("mSentences");
                    throw null;
                }
                int i15 = tVar.Q;
                kotlin.jvm.internal.m.c(contextRequireContext);
                tVar.O = new g(contextRequireContext, frameLayout, strArrL, list2, i15, zBooleanValue, tVar);
                ArrayList arrayList = new ArrayList();
                List list3 = tVar.P;
                if (list3 == null) {
                    kotlin.jvm.internal.m.n("mSentences");
                    throw null;
                }
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(tVar.z((PodSentence) it.next(), tVar.Q));
                }
                g gVar = tVar.O;
                if (gVar == null) {
                    kotlin.jvm.internal.m.n("mVideoHelper");
                    throw null;
                }
                ta.a aVar3 = tVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                gVar.f45664i = ((a5) aVar3).f32353e;
                g gVar2 = tVar.O;
                if (gVar2 == null) {
                    kotlin.jvm.internal.m.n("mVideoHelper");
                    throw null;
                }
                gVar2.b(arrayList);
                Context contextRequireContext2 = tVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                lc.d dVar2 = new lc.d(contextRequireContext2);
                final int i16 = 0;
                hz.b.t(dVar2, new Integer(R.layout.dialog_wait), null, false, 62);
                dVar2.a();
                tVar.S = dVar2;
                if (tVar.r().isUnloginUser()) {
                    ta.a aVar4 = tVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((a5) aVar4).f32350b.setText(tVar.getString(R.string.publish));
                } else {
                    no.s sVar = new no.s(tVar.Q);
                    String uid = tVar.r().uid;
                    kotlin.jvm.internal.m.e(uid, "uid");
                    Object l0Var = new l0(new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(14, sVar, uid), 1);
                    th.j.a((l0Var instanceof wx.a ? ((wx.a) l0Var).a() : new ay.w(l0Var, 3)).k(ky.e.f38937b).g(px.b.a()).h(new o20.i(tVar, 3), f.f45650d), tVar.f36401t);
                }
                ta.a aVar5 = tVar.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                bq.z.b(((a5) aVar5).f32350b, new fz.c() { // from class: oo.o
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        l.m mVar;
                        lc.d dVar3;
                        int i17 = i16;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        final t tVar2 = tVar;
                        View it2 = (View) obj2;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it2, "it");
                                if (tVar2.r().isUnloginUser()) {
                                    int i18 = LoginActivity.Q;
                                    Context contextRequireContext3 = tVar2.requireContext();
                                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                                    tVar2.startActivity(g1.p(contextRequireContext3, 7));
                                } else if (!TextUtils.isEmpty(tVar2.r().regin) && ((kotlin.jvm.internal.m.a(tVar2.r().regin, "EU") && tVar2.r().age < 16) || (kotlin.jvm.internal.m.a(tVar2.r().regin, "USA") && tVar2.r().age < 13))) {
                                    String string = tVar2.getString(R.string.sorry_your_parent_has_restricted_the_use_of_this_feature);
                                    kotlin.jvm.internal.m.e(string, "getString(...)");
                                    ff.h.C(string);
                                } else {
                                    lc.d dVar4 = tVar2.S;
                                    if (dVar4 != null && !dVar4.isShowing() && (mVar = tVar2.f36398d) != null && !mVar.isFinishing() && (dVar3 = tVar2.S) != null) {
                                        dVar3.show();
                                    }
                                    final int i19 = 2;
                                    tVar2.t().c("jxz_main_story_speak_publish", new fz.a() { // from class: oo.p
                                        @Override // fz.a
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    Bundle bundle = new Bundle();
                                                    b7.e0.v(tVar2.Q, bundle, "U", "unit");
                                                    return bundle;
                                                case 1:
                                                    Bundle bundle2 = new Bundle();
                                                    b7.e0.v(tVar2.Q, bundle2, "U", "unit");
                                                    bundle2.putString("source", "story_read");
                                                    return bundle2;
                                                default:
                                                    Bundle bundle3 = new Bundle();
                                                    b7.e0.v(tVar2.Q, bundle3, "U", "unit");
                                                    return bundle3;
                                            }
                                        }
                                    });
                                    th.j.a(new ay.x(new com.google.common.cache.a(8, tVar2.A(), defpackage.e.m(tVar2.r().tempDir, tVar2.B()))).k(ky.e.f38937b).g(px.b.a()).h(new lp.j(tVar2, 6), f.f45651e), tVar2.f36401t);
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it2, "it");
                                l.m mVar2 = tVar2.f36398d;
                                if (mVar2 != null) {
                                    mVar2.finish();
                                }
                                final int i21 = 0;
                                tVar2.t().c("jxz_main_story_speak_redorecording", new fz.a() { // from class: oo.p
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i21) {
                                            case 0:
                                                Bundle bundle = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle, "U", "unit");
                                                return bundle;
                                            case 1:
                                                Bundle bundle2 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle2, "U", "unit");
                                                bundle2.putString("source", "story_read");
                                                return bundle2;
                                            default:
                                                Bundle bundle3 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle3, "U", "unit");
                                                return bundle3;
                                        }
                                    }
                                });
                                int i22 = SpeakTryActivity.R;
                                l.m mVar3 = tVar2.f36398d;
                                kotlin.jvm.internal.m.c(mVar3);
                                tVar2.startActivity(ns.o.N(mVar3, tVar2.Q, tVar2.R));
                                final int i23 = 1;
                                tVar2.t().c("jxz_main_click_story_speak", new fz.a() { // from class: oo.p
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i23) {
                                            case 0:
                                                Bundle bundle = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle, "U", "unit");
                                                return bundle;
                                            case 1:
                                                Bundle bundle2 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle2, "U", "unit");
                                                bundle2.putString("source", "story_read");
                                                return bundle2;
                                            default:
                                                Bundle bundle3 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle3, "U", "unit");
                                                return bundle3;
                                        }
                                    }
                                });
                                break;
                        }
                        return b0Var2;
                    }
                });
                ta.a aVar6 = tVar.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                bq.z.b(((a5) aVar6).f32351c, new fz.c() { // from class: oo.o
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        l.m mVar;
                        lc.d dVar3;
                        int i17 = i12;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        final t tVar2 = tVar;
                        View it2 = (View) obj2;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it2, "it");
                                if (tVar2.r().isUnloginUser()) {
                                    int i18 = LoginActivity.Q;
                                    Context contextRequireContext3 = tVar2.requireContext();
                                    kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                                    tVar2.startActivity(g1.p(contextRequireContext3, 7));
                                } else if (!TextUtils.isEmpty(tVar2.r().regin) && ((kotlin.jvm.internal.m.a(tVar2.r().regin, "EU") && tVar2.r().age < 16) || (kotlin.jvm.internal.m.a(tVar2.r().regin, "USA") && tVar2.r().age < 13))) {
                                    String string = tVar2.getString(R.string.sorry_your_parent_has_restricted_the_use_of_this_feature);
                                    kotlin.jvm.internal.m.e(string, "getString(...)");
                                    ff.h.C(string);
                                } else {
                                    lc.d dVar4 = tVar2.S;
                                    if (dVar4 != null && !dVar4.isShowing() && (mVar = tVar2.f36398d) != null && !mVar.isFinishing() && (dVar3 = tVar2.S) != null) {
                                        dVar3.show();
                                    }
                                    final int i19 = 2;
                                    tVar2.t().c("jxz_main_story_speak_publish", new fz.a() { // from class: oo.p
                                        @Override // fz.a
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    Bundle bundle = new Bundle();
                                                    b7.e0.v(tVar2.Q, bundle, "U", "unit");
                                                    return bundle;
                                                case 1:
                                                    Bundle bundle2 = new Bundle();
                                                    b7.e0.v(tVar2.Q, bundle2, "U", "unit");
                                                    bundle2.putString("source", "story_read");
                                                    return bundle2;
                                                default:
                                                    Bundle bundle3 = new Bundle();
                                                    b7.e0.v(tVar2.Q, bundle3, "U", "unit");
                                                    return bundle3;
                                            }
                                        }
                                    });
                                    th.j.a(new ay.x(new com.google.common.cache.a(8, tVar2.A(), defpackage.e.m(tVar2.r().tempDir, tVar2.B()))).k(ky.e.f38937b).g(px.b.a()).h(new lp.j(tVar2, 6), f.f45651e), tVar2.f36401t);
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it2, "it");
                                l.m mVar2 = tVar2.f36398d;
                                if (mVar2 != null) {
                                    mVar2.finish();
                                }
                                final int i21 = 0;
                                tVar2.t().c("jxz_main_story_speak_redorecording", new fz.a() { // from class: oo.p
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i21) {
                                            case 0:
                                                Bundle bundle = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle, "U", "unit");
                                                return bundle;
                                            case 1:
                                                Bundle bundle2 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle2, "U", "unit");
                                                bundle2.putString("source", "story_read");
                                                return bundle2;
                                            default:
                                                Bundle bundle3 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle3, "U", "unit");
                                                return bundle3;
                                        }
                                    }
                                });
                                int i22 = SpeakTryActivity.R;
                                l.m mVar3 = tVar2.f36398d;
                                kotlin.jvm.internal.m.c(mVar3);
                                tVar2.startActivity(ns.o.N(mVar3, tVar2.Q, tVar2.R));
                                final int i23 = 1;
                                tVar2.t().c("jxz_main_click_story_speak", new fz.a() { // from class: oo.p
                                    @Override // fz.a
                                    public final Object invoke() {
                                        switch (i23) {
                                            case 0:
                                                Bundle bundle = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle, "U", "unit");
                                                return bundle;
                                            case 1:
                                                Bundle bundle2 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle2, "U", "unit");
                                                bundle2.putString("source", "story_read");
                                                return bundle2;
                                            default:
                                                Bundle bundle3 = new Bundle();
                                                b7.e0.v(tVar2.Q, bundle3, "U", "unit");
                                                return bundle3;
                                        }
                                    }
                                });
                                break;
                        }
                        return b0Var2;
                    }
                });
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(tVar), null, null, new r(tVar, dVar, i12), 3);
                return b0Var;
            default:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f45701b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                t tVar2 = this.f45702c;
                vt.k0 k0Var = (vt.k0) tVar2.V.getValue();
                long j11 = tVar2.R;
                this.f45701b = 1;
                a1 a1Var = (a1) k0Var;
                a1Var.getClass();
                yz.f fVar = o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new n0(8, j11, a1Var, null), this);
                if (objM != aVar7) {
                    objM = b0Var;
                }
                return objM == aVar7 ? aVar7 : b0Var;
        }
    }
}
