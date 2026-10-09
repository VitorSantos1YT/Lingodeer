package com.lingo.course.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.a1;
import b1.c;
import com.lingo.course.ui.CourseTestOutActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.a;
import fz.e;
import java.util.List;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import ry.r;
import xg.d;
import ys.p2;
import ys.q2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseTestOutActivity extends d {
    public static final /* synthetic */ int L = 0;
    public List H = r.f50854a;
    public String K = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f21620t;

    @Override // xg.d
    public final void j(final Bundle bundle, n nVar, final int i11) {
        x1 x1VarT;
        e eVar;
        s sVar = (s) nVar;
        sVar.f0(1437084149);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            boolean zH = sVar.h(this);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new c(21, this, b1Var, (vy.d) null);
                sVar.o0(objQ2);
            }
            t.f((e) objQ2, b0.f48488a, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                q2 q2Var = new q2(this.f21620t, -1L, CoursePracticeType.valueOf(this.K), BuildConfig.VERSION_NAME, this.H);
                boolean zH2 = sVar.h(this);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    final int i13 = 0;
                    objQ3 = new a(this) { // from class: ch.r0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CourseTestOutActivity f7096b;

                        {
                            this.f7096b = this;
                        }

                        @Override // fz.a
                        public final Object invoke() {
                            int i14 = i13;
                            qy.b0 b0Var = qy.b0.f48488a;
                            CourseTestOutActivity courseTestOutActivity = this.f7096b;
                            switch (i14) {
                                case 0:
                                    int i15 = CourseTestOutActivity.L;
                                    courseTestOutActivity.finish();
                                    break;
                                default:
                                    int i16 = CourseTestOutActivity.L;
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestOutActivity), null, null, new a1(courseTestOutActivity, null, 16), 3);
                                    courseTestOutActivity.finish();
                                    break;
                            }
                            return b0Var;
                        }
                    };
                    sVar.o0(objQ3);
                }
                a aVar = (a) objQ3;
                boolean zH3 = sVar.h(this);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    final int i14 = 1;
                    objQ4 = new a(this) { // from class: ch.r0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CourseTestOutActivity f7096b;

                        {
                            this.f7096b = this;
                        }

                        @Override // fz.a
                        public final Object invoke() {
                            int i15 = i14;
                            qy.b0 b0Var = qy.b0.f48488a;
                            CourseTestOutActivity courseTestOutActivity = this.f7096b;
                            switch (i15) {
                                case 0:
                                    int i16 = CourseTestOutActivity.L;
                                    courseTestOutActivity.finish();
                                    break;
                                default:
                                    int i17 = CourseTestOutActivity.L;
                                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestOutActivity), null, null, new a1(courseTestOutActivity, null, 16), 3);
                                    courseTestOutActivity.finish();
                                    break;
                            }
                            return b0Var;
                        }
                    };
                    sVar.o0(objQ4);
                }
                a aVar2 = (a) objQ4;
                boolean zH4 = sVar.h(this);
                Object objQ5 = sVar.Q();
                if (zH4 || objQ5 == gVar) {
                    final int i15 = 0;
                    objQ5 = new fz.c(this) { // from class: ch.s0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CourseTestOutActivity f7100b;

                        {
                            this.f7100b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            int i16 = i15;
                            qy.b0 b0Var = qy.b0.f48488a;
                            CourseTestOutActivity courseTestOutActivity = this.f7100b;
                            switch (i16) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    int i17 = CourseTestOutActivity.L;
                                    Intent intent = new Intent(courseTestOutActivity, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                    courseTestOutActivity.startActivity(intent);
                                    break;
                                default:
                                    String source = (String) obj;
                                    int i18 = CourseTestOutActivity.L;
                                    kotlin.jvm.internal.m.f(source, "source");
                                    int[] iArr = bq.r.f4959a;
                                    bq.m.C(courseTestOutActivity, source);
                                    break;
                            }
                            return b0Var;
                        }
                    };
                    sVar.o0(objQ5);
                }
                fz.c cVar = (fz.c) objQ5;
                boolean zH5 = sVar.h(this);
                Object objQ6 = sVar.Q();
                if (zH5 || objQ6 == gVar) {
                    final int i16 = 1;
                    objQ6 = new fz.c(this) { // from class: ch.s0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CourseTestOutActivity f7100b;

                        {
                            this.f7100b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            int i17 = i16;
                            qy.b0 b0Var = qy.b0.f48488a;
                            CourseTestOutActivity courseTestOutActivity = this.f7100b;
                            switch (i17) {
                                case 0:
                                    int iIntValue = ((Integer) obj).intValue();
                                    int i18 = CourseTestOutActivity.L;
                                    Intent intent = new Intent(courseTestOutActivity, (Class<?>) LoginActivity.class);
                                    intent.putExtra(INTENTS.EXTRA_INT, iIntValue);
                                    courseTestOutActivity.startActivity(intent);
                                    break;
                                default:
                                    String source = (String) obj;
                                    int i19 = CourseTestOutActivity.L;
                                    kotlin.jvm.internal.m.f(source, "source");
                                    int[] iArr = bq.r.f4959a;
                                    bq.m.C(courseTestOutActivity, source);
                                    break;
                            }
                            return b0Var;
                        }
                    };
                    sVar.o0(objQ6);
                }
                p2.c(q2Var, null, null, aVar, null, null, aVar2, cVar, (fz.c) objQ6, sVar, 8, 54);
            } else {
                x1VarT = sVar.t();
                if (x1VarT == null) {
                    return;
                }
                final int i17 = 0;
                eVar = new e(this, bundle, i11, i17) { // from class: ch.q0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f7090a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseTestOutActivity f7091b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Bundle f7092c;

                    {
                        this.f7090a = i17;
                        this.f7091b = this;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i18 = this.f7090a;
                        qy.b0 b0Var = qy.b0.f48488a;
                        Bundle bundle2 = this.f7092c;
                        CourseTestOutActivity courseTestOutActivity = this.f7091b;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        int i19 = CourseTestOutActivity.L;
                        switch (i18) {
                            case 0:
                                courseTestOutActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                            default:
                                courseTestOutActivity.j(bundle2, nVar2, l1.t.M(1));
                                break;
                        }
                        return b0Var;
                    }
                };
            }
            x1VarT.f39502d = eVar;
        }
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i18 = 1;
            eVar = new e(this, bundle, i11, i18) { // from class: ch.q0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f7090a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CourseTestOutActivity f7091b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Bundle f7092c;

                {
                    this.f7090a = i18;
                    this.f7091b = this;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i19 = this.f7090a;
                    qy.b0 b0Var = qy.b0.f48488a;
                    Bundle bundle2 = this.f7092c;
                    CourseTestOutActivity courseTestOutActivity = this.f7091b;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    int i110 = CourseTestOutActivity.L;
                    switch (i19) {
                        case 0:
                            courseTestOutActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                        default:
                            courseTestOutActivity.j(bundle2, nVar2, l1.t.M(1));
                            break;
                    }
                    return b0Var;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }
}
