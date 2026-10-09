package com.lingo.course.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e1;
import androidx.lifecycle.LifecycleOwnerKt;
import bh.a1;
import bh.x0;
import bj.a;
import bp.g2;
import bp.i2;
import bq.u;
import bt.z6;
import ch.d0;
import ch.e0;
import ch.h0;
import ch.i0;
import ch.m0;
import ch.z;
import com.bumptech.glide.e;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.base.LoginPromptActivity;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.StoryLessonType;
import fr.o0;
import i.c;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import qy.b0;
import qy.j;
import qy.q;
import rt.pb;
import rt.qb;
import rt.sf;
import rt.uf;
import vt.k0;
import xg.d;
import ys.e3;
import ys.h;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CourseTestIndexActivity extends d {
    public static final /* synthetic */ int N = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f21619t = com.bumptech.glide.d.u(j.SYNCHRONIZED, new a(this, 5));
    public final q H = com.bumptech.glide.d.v(new e0(this, 1));
    public final q K = com.bumptech.glide.d.v(new e0(this, 2));
    public final q L = com.bumptech.glide.d.v(new e0(this, 3));
    public final c M = registerForActivityResult(new e1(4), new app.rive.runtime.kotlin.core.a(this, 16));

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qy.h] */
    public static final Object p(CourseTestIndexActivity courseTestIndexActivity, long j11, int i11, xy.c cVar) {
        m0 m0Var;
        long j12;
        int i12;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i13 = m0Var.f7072e;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                m0Var.f7072e = i13 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(courseTestIndexActivity, cVar);
            }
        } else {
            m0Var = new m0(courseTestIndexActivity, cVar);
        }
        Object obj = m0Var.f7070c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = m0Var.f7072e;
        b0 b0Var = b0.f48488a;
        if (i14 != 0) {
            if (i14 == 1) {
                i12 = m0Var.f7069b;
                j12 = m0Var.f7068a;
                e.F(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.F(obj);
            }
        }
        e.F(obj);
        k0 k0Var = (k0) courseTestIndexActivity.f21619t.getValue();
        int i15 = ((o0) courseTestIndexActivity.l()).f27733a.keyLanguage;
        m0Var.f7068a = j11;
        m0Var.f7069b = i11;
        m0Var.f7072e = 1;
        a1 a1Var = (a1) k0Var;
        a1Var.getClass();
        f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new x0(i15, i11, j11, a1Var, null), m0Var);
        if (objM != aVar) {
            objM = b0Var;
        }
        if (objM != aVar) {
            j12 = j11;
            i12 = i11;
        }
        vt.c cVarK = courseTestIndexActivity.k();
        m0Var.f7068a = j12;
        m0Var.f7069b = i12;
        m0Var.f7072e = 2;
        ((vt.d) cVarK).c(m0Var);
        return b0Var == aVar ? aVar : b0Var;
    }

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        Object aVar;
        final b1 b1Var;
        final b1 b1Var2;
        s sVar = (s) nVar;
        sVar.f0(-1984469451);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            Object objQ = sVar.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var3 = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = t.B(Boolean.FALSE);
                sVar.o0(objQ3);
            }
            b1 b1Var4 = (b1) objQ3;
            Object objQ4 = sVar.Q();
            q qVar = this.K;
            if (objQ4 == gVar) {
                objQ4 = t.B(Long.valueOf(((Number) qVar.getValue()).longValue()));
                sVar.o0(objQ4);
            }
            b1 b1Var5 = (b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = t.B(null);
                sVar.o0(objQ5);
            }
            b1 b1Var6 = (b1) objQ5;
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar.d0(896037801);
                Object objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = new h0(b1Var3, b1Var6, 0);
                    sVar.o0(objQ6);
                }
                fz.a aVar2 = (fz.a) objQ6;
                boolean zH = sVar.h(b0Var) | sVar.h(this);
                Object objQ7 = sVar.Q();
                if (zH || objQ7 == gVar) {
                    objQ7 = new d0(b0Var, this, b1Var6, b1Var3);
                    sVar.o0(objQ7);
                }
                fz.a aVar3 = (fz.a) objQ7;
                boolean zH2 = sVar.h(this);
                Object objQ8 = sVar.Q();
                if (zH2 || objQ8 == gVar) {
                    objQ8 = new androidx.lifecycle.compose.a(this, b1Var6, b1Var3, 8);
                    sVar.o0(objQ8);
                }
                ch.a.b(aVar2, aVar3, (fz.a) objQ8, sVar, 6);
            } else {
                sVar.d0(891168941);
            }
            sVar.p(false);
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar.d0(898423933);
                sVar.a0(-109565491, Long.valueOf(((Number) b1Var5.getValue()).longValue()));
                long jLongValue = ((Number) b1Var5.getValue()).longValue();
                Object objQ9 = sVar.Q();
                if (objQ9 == gVar) {
                    objQ9 = new z6(23, b1Var4);
                    sVar.o0(objQ9);
                }
                e3.a(jLongValue, (fz.a) objQ9, null, sVar, 48);
                sVar.p(false);
            } else {
                sVar.d0(891168941);
            }
            sVar.p(false);
            Object objQ10 = sVar.Q();
            if (objQ10 == gVar) {
                objQ10 = t.B(Boolean.FALSE);
                sVar.o0(objQ10);
            }
            b1 b1Var7 = (b1) objQ10;
            Object objQ11 = sVar.Q();
            if (objQ11 == gVar) {
                objQ11 = t.B(Boolean.FALSE);
                sVar.o0(objQ11);
            }
            b1 b1Var8 = (b1) objQ11;
            Object objQ12 = sVar.Q();
            if (objQ12 == gVar) {
                objQ12 = new u(16);
                sVar.o0(objQ12);
            }
            fz.a aVar4 = (fz.a) objQ12;
            boolean zH3 = sVar.h(this);
            Object objQ13 = sVar.Q();
            if (zH3 || objQ13 == gVar) {
                objQ13 = new e0(this, 0);
                sVar.o0(objQ13);
            }
            fz.a aVar5 = (fz.a) objQ13;
            boolean zH4 = sVar.h(this) | sVar.h(b0Var);
            Object objQ14 = sVar.Q();
            if (zH4 || objQ14 == gVar) {
                objQ14 = new d0(this, b0Var, b1Var6, b1Var3);
                sVar.o0(objQ14);
            }
            ch.a.a(b1Var7, b1Var8, null, aVar4, aVar5, (fz.a) objQ14, sVar, 3126);
            long jLongValue2 = ((Number) qVar.getValue()).longValue();
            int iIntValue = ((Number) this.L.getValue()).intValue();
            boolean zH5 = sVar.h(this) | sVar.h(b0Var);
            Object objQ15 = sVar.Q();
            if (zH5 || objQ15 == gVar) {
                b1Var = b1Var6;
                b1Var2 = b1Var7;
                aVar = new b1.a(this, b0Var, b1Var, b1Var3, b1Var2, 6);
                sVar.o0(aVar);
            } else {
                b1Var = b1Var6;
                b1Var2 = b1Var7;
                aVar = objQ15;
            }
            fz.c cVar = (fz.c) aVar;
            boolean zH6 = sVar.h(this);
            Object objQ16 = sVar.Q();
            if (zH6 || objQ16 == gVar) {
                final int i13 = 0;
                objQ16 = new fz.c(this) { // from class: ch.f0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseTestIndexActivity f7033b;

                    {
                        this.f7033b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i14;
                        int i15;
                        int i16 = i13;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        b1 b1Var9 = b1Var2;
                        b1 b1Var10 = b1Var;
                        switch (i16) {
                            case 0:
                                sf it = (sf) obj;
                                int i17 = CourseTestIndexActivity.N;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (!it.f50394e) {
                                    b1Var10.setValue(new pb(it));
                                    b1Var9.setValue(Boolean.TRUE);
                                } else {
                                    CourseTestIndexActivity courseTestIndexActivity = this.f7033b;
                                    if (((fr.o0) courseTestIndexActivity.l()).f27733a.isUnloginUser() && (i14 = it.f50390a) >= 3 && !xt.b.f56281c) {
                                        i.c cVar2 = courseTestIndexActivity.M;
                                        Intent intent = new Intent(courseTestIndexActivity, (Class<?>) LoginPromptActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_INT, i14);
                                        cVar2.a(intent);
                                    } else {
                                        courseTestIndexActivity.r(it);
                                    }
                                }
                                break;
                            default:
                                uf tipLesson = (uf) obj;
                                int i18 = CourseTestIndexActivity.N;
                                kotlin.jvm.internal.m.f(tipLesson, "tipLesson");
                                if (!tipLesson.f50516c) {
                                    b1Var10.setValue(new qb(tipLesson));
                                    b1Var9.setValue(Boolean.TRUE);
                                } else {
                                    CourseTestIndexActivity courseTestIndexActivity2 = this.f7033b;
                                    if (((fr.o0) courseTestIndexActivity2.l()).f27733a.isUnloginUser() && (i15 = tipLesson.f50514a) >= 3 && !xt.b.f56281c) {
                                        i.c cVar3 = courseTestIndexActivity2.M;
                                        Intent intent2 = new Intent(courseTestIndexActivity2, (Class<?>) LoginPromptActivity.class);
                                        intent2.putExtra(INTENTS.EXTRA_INT, i15);
                                        cVar3.a(intent2);
                                    } else {
                                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestIndexActivity2), null, null, new bh.j0((Object) courseTestIndexActivity2, (Object) tipLesson, false, (vy.d) null, 3), 3);
                                    }
                                }
                                break;
                        }
                        return b0Var2;
                    }
                };
                sVar.o0(objQ16);
            }
            fz.c cVar2 = (fz.c) objQ16;
            boolean zH7 = sVar.h(this);
            Object objQ17 = sVar.Q();
            if (zH7 || objQ17 == gVar) {
                final int i14 = 1;
                objQ17 = new fz.c(this) { // from class: ch.f0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ CourseTestIndexActivity f7033b;

                    {
                        this.f7033b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i15;
                        int i16;
                        int i17 = i14;
                        qy.b0 b0Var2 = qy.b0.f48488a;
                        b1 b1Var9 = b1Var2;
                        b1 b1Var10 = b1Var;
                        switch (i17) {
                            case 0:
                                sf it = (sf) obj;
                                int i18 = CourseTestIndexActivity.N;
                                kotlin.jvm.internal.m.f(it, "it");
                                if (!it.f50394e) {
                                    b1Var10.setValue(new pb(it));
                                    b1Var9.setValue(Boolean.TRUE);
                                } else {
                                    CourseTestIndexActivity courseTestIndexActivity = this.f7033b;
                                    if (((fr.o0) courseTestIndexActivity.l()).f27733a.isUnloginUser() && (i15 = it.f50390a) >= 3 && !xt.b.f56281c) {
                                        i.c cVar3 = courseTestIndexActivity.M;
                                        Intent intent = new Intent(courseTestIndexActivity, (Class<?>) LoginPromptActivity.class);
                                        intent.putExtra(INTENTS.EXTRA_INT, i15);
                                        cVar3.a(intent);
                                    } else {
                                        courseTestIndexActivity.r(it);
                                    }
                                }
                                break;
                            default:
                                uf tipLesson = (uf) obj;
                                int i19 = CourseTestIndexActivity.N;
                                kotlin.jvm.internal.m.f(tipLesson, "tipLesson");
                                if (!tipLesson.f50516c) {
                                    b1Var10.setValue(new qb(tipLesson));
                                    b1Var9.setValue(Boolean.TRUE);
                                } else {
                                    CourseTestIndexActivity courseTestIndexActivity2 = this.f7033b;
                                    if (((fr.o0) courseTestIndexActivity2.l()).f27733a.isUnloginUser() && (i16 = tipLesson.f50514a) >= 3 && !xt.b.f56281c) {
                                        i.c cVar4 = courseTestIndexActivity2.M;
                                        Intent intent2 = new Intent(courseTestIndexActivity2, (Class<?>) LoginPromptActivity.class);
                                        intent2.putExtra(INTENTS.EXTRA_INT, i16);
                                        cVar4.a(intent2);
                                    } else {
                                        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(courseTestIndexActivity2), null, null, new bh.j0((Object) courseTestIndexActivity2, (Object) tipLesson, false, (vy.d) null, 3), 3);
                                    }
                                }
                                break;
                        }
                        return b0Var2;
                    }
                };
                sVar.o0(objQ17);
            }
            fz.c cVar3 = (fz.c) objQ17;
            Object objQ18 = sVar.Q();
            if (objQ18 == gVar) {
                objQ18 = new i2(b1Var5, b1Var4, 8);
                sVar.o0(objQ18);
            }
            fz.c cVar4 = (fz.c) objQ18;
            boolean zH8 = sVar.h(this);
            Object objQ19 = sVar.Q();
            if (zH8 || objQ19 == gVar) {
                objQ19 = new a00.c(this, 21);
                sVar.o0(objQ19);
            }
            fz.c cVar5 = (fz.c) objQ19;
            boolean zH9 = sVar.h(this);
            Object objQ20 = sVar.Q();
            if (zH9 || objQ20 == gVar) {
                objQ20 = new e0(this, 4);
                sVar.o0(objQ20);
            }
            fz.a aVar6 = (fz.a) objQ20;
            boolean zH10 = sVar.h(this);
            Object objQ21 = sVar.Q();
            if (zH10 || objQ21 == gVar) {
                objQ21 = new e0(this, 5);
                sVar.o0(objQ21);
            }
            h.a(jLongValue2, iIntValue, cVar, cVar2, cVar3, cVar4, cVar5, aVar6, (fz.a) objQ21, null, sVar, 196608);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new z(this, i11, 2, bundle);
        }
    }

    public final void q(CourseLesson courseLesson, CourseLessonPracticeType courseLessonPracticeType) {
        vy.d dVar = null;
        switch (i0.f7049a[courseLessonPracticeType.ordinal()]) {
            case 1:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 2), 3);
                return;
            case 2:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 3), 3);
                return;
            case 3:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 4), 3);
                return;
            case 4:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 5), 3);
                return;
            case 5:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 6), 3);
                return;
            case 6:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 7), 3);
                return;
            case 7:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 8), 3);
                return;
            case 8:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 9), 3);
                return;
            case 9:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 10), 3);
                return;
            case 10:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 0), 3);
                return;
            case 11:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g2(2, 3, dVar), 3);
                return;
            case 12:
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ch.k0(this, courseLesson, dVar, 1), 3);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void r(sf sfVar) {
        if (sfVar.f50393d != StoryLessonType.TypeStoryLeaderBoard || !((o0) l()).f27733a.isUnloginUser()) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b1.c(20, this, sfVar, (vy.d) null), 3);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
        intent.putExtra(INTENTS.EXTRA_INT, 2);
        startActivity(intent);
    }
}
