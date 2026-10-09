package fp;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.o1;
import bp.a0;
import bt.i5;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.h2;
import et.p;
import g2.r0;
import gp.d0;
import gp.f0;
import gp.g0;
import gp.h0;
import gp.j0;
import gp.n0;
import h1.k7;
import h1.o0;
import h1.r4;
import h1.r9;
import h1.s1;
import h1.v1;
import h1.vb;
import h1.wb;
import h1.x8;
import h1.zb;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.u;
import j0.v;
import j0.z1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import oz.q;
import oz.x;
import qp.o2;
import qy.b0;
import y2.i;
import y2.j;
import y2.k;
import z1.h;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f27351a = new t1.d(new dt.g(8), false, 570596182);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f27352b = new t1.d(new dt.f(12), false, -487205309);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f27353c = new t1.d(new dt.f(13), false, -417557435);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f27354d = new t1.d(new dt.g(9), false, 496524234);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(fz.a onNavigateBack, final n0 n0Var, n nVar, int i11) {
        fz.a aVar;
        m.f(onNavigateBack, "onNavigateBack");
        s sVar = (s) nVar;
        sVar.f0(1062343383);
        int i12 = (sVar.h(onNavigateBack) ? 4 : 2) | i11 | 16;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(n0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                n0Var = (n0) viewModelA;
            } else {
                sVar.W();
            }
            int i13 = i12 & (-113);
            sVar.q();
            b1 b1VarO = t.o(n0Var.f29461d, sVar);
            final Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            j0 j0Var = (j0) b1VarO.getValue();
            boolean zH = sVar.h(n0Var) | sVar.h(context);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                final int i14 = 0;
                objQ = new fz.e() { // from class: fp.b
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i15 = i14;
                        int iIntValue = ((Integer) obj).intValue();
                        int iIntValue2 = ((Integer) obj2).intValue();
                        switch (i15) {
                            case 0:
                                n0Var.b(new g0(context, iIntValue, iIntValue2));
                                break;
                            default:
                                n0Var.b(new h0(context, iIntValue, iIntValue2));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            fz.e eVar = (fz.e) objQ;
            boolean zH2 = sVar.h(n0Var) | sVar.h(context);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i15 = 1;
                objQ2 = new fz.e() { // from class: fp.b
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = i15;
                        int iIntValue = ((Integer) obj).intValue();
                        int iIntValue2 = ((Integer) obj2).intValue();
                        switch (i16) {
                            case 0:
                                n0Var.b(new g0(context, iIntValue, iIntValue2));
                                break;
                            default:
                                n0Var.b(new h0(context, iIntValue, iIntValue2));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            }
            fz.e eVar2 = (fz.e) objQ2;
            boolean zH3 = sVar.h(n0Var) | sVar.h(context);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i16 = 0;
                objQ3 = new fz.c() { // from class: fp.g
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i17 = i16;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i17) {
                            case 0:
                                n0Var.b(new d0(context, zBooleanValue));
                                break;
                            default:
                                n0Var.b(new f0(context, zBooleanValue));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ3);
            }
            fz.c cVar = (fz.c) objQ3;
            boolean zH4 = sVar.h(n0Var) | sVar.h(context);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                final int i17 = 1;
                objQ4 = new fz.c() { // from class: fp.g
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i18) {
                            case 0:
                                n0Var.b(new d0(context, zBooleanValue));
                                break;
                            default:
                                n0Var.b(new f0(context, zBooleanValue));
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ4);
            }
            fz.c cVar2 = (fz.c) objQ4;
            boolean zH5 = sVar.h(n0Var);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                objQ5 = new com.google.firebase.datastorage.a(n0Var, 23);
                sVar.o0(objQ5);
            }
            fz.c cVar3 = (fz.c) objQ5;
            boolean zH6 = sVar.h(n0Var);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                objQ6 = new cr.n(n0Var, 19);
                sVar.o0(objQ6);
            }
            aVar = onNavigateBack;
            b(j0Var, aVar, eVar, eVar2, cVar, cVar2, cVar3, (fz.a) objQ6, null, sVar, (i13 << 3) & 112);
        } else {
            aVar = onNavigateBack;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.z(aVar, i11, 27, n0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0266  */
    /* JADX WARN: Code duplicated, block: B:106:0x026e  */
    /* JADX WARN: Code duplicated, block: B:111:0x028c  */
    /* JADX WARN: Code duplicated, block: B:116:0x02af  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:130:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:137:0x030c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0367  */
    /* JADX WARN: Code duplicated, block: B:141:0x0369  */
    /* JADX WARN: Code duplicated, block: B:147:0x0376  */
    /* JADX WARN: Code duplicated, block: B:150:0x038c  */
    public static final void b(j0 uiState, fz.a onNavigateBack, fz.e onDailyTimeUpdate, fz.e onSmartTimeUpdate, fz.c onDailyReminderToggle, fz.c onSmartReminderToggle, fz.c onDailySkipToggle, fz.a onClearError, r rVar, n nVar, int i11) {
        int i12;
        j0 j0Var;
        s sVar;
        fz.c cVar;
        fz.c cVar2;
        fz.c cVar3;
        r rVar2;
        l1.g gVar;
        i iVar;
        Object obj;
        i iVar2;
        int i13;
        int iHashCode;
        boolean z11;
        Object objQ;
        l1.g gVar2;
        Object objQ2;
        b1 b1Var;
        b1 b1Var2;
        boolean z12;
        Object objQ3;
        boolean z13;
        Object objQ4;
        Object objQ5;
        boolean z14;
        boolean z15;
        m.f(uiState, "uiState");
        m.f(onNavigateBack, "onNavigateBack");
        m.f(onDailyTimeUpdate, "onDailyTimeUpdate");
        m.f(onSmartTimeUpdate, "onSmartTimeUpdate");
        m.f(onDailyReminderToggle, "onDailyReminderToggle");
        m.f(onSmartReminderToggle, "onSmartReminderToggle");
        m.f(onDailySkipToggle, "onDailySkipToggle");
        m.f(onClearError, "onClearError");
        s sVar2 = (s) nVar;
        sVar2.f0(-1851913691);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(uiState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onNavigateBack) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onDailyTimeUpdate) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onSmartTimeUpdate) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onDailyReminderToggle) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onSmartReminderToggle) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onDailySkipToggle) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onClearError) ? 8388608 : 4194304;
        }
        if (sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objQ6 = sVar2.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ6 == gVar3) {
                objQ6 = new x8();
                sVar2.o0(objQ6);
            }
            x8 x8Var = (x8) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar3) {
                objQ7 = t.B(Boolean.FALSE);
                sVar2.o0(objQ7);
            }
            b1 b1Var3 = (b1) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar3) {
                objQ8 = t.B("daily");
                sVar2.o0(objQ8);
            }
            b1 b1Var4 = (b1) objQ8;
            String str = uiState.f29405g;
            int i14 = i12;
            boolean z16 = ((29360128 & i12) == 8388608) | ((i12 & 14) == 4);
            Object objQ9 = sVar2.Q();
            if (z16 || objQ9 == gVar3) {
                gVar = gVar3;
                b0.f fVar = new b0.f(uiState, x8Var, onClearError, (vy.d) null, 18);
                sVar2.o0(fVar);
                objQ9 = fVar;
            } else {
                gVar = gVar3;
            }
            t.f((fz.e) objQ9, str, sVar2);
            boolean z17 = uiState.f29404f;
            o oVar = o.f58481a;
            if (z17) {
                sVar2.d0(-1504926946);
                z14 = true;
                tv.a.d(0, 1, sVar2, null);
                sVar2.p(false);
                b1Var2 = b1Var4;
                gVar2 = gVar;
                sVar = sVar2;
                obj = "daily";
                cVar = onDailyReminderToggle;
                cVar2 = onSmartReminderToggle;
                cVar3 = onDailySkipToggle;
                b1Var = b1Var3;
                j0Var = uiState;
                rVar2 = oVar;
                i13 = i14;
            } else {
                sVar2.d0(-1504809084);
                r rVarD = e2.d(oVar, 1.0f);
                j0.d dVar = j0.i.f35305c;
                h hVar = z1.c.O;
                u uVarA = j0.t.a(dVar, hVar, sVar2, 0);
                int iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                r rVarC = z1.a.c(sVar2, rVarD);
                k.J.getClass();
                i iVar3 = j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar3);
                } else {
                    sVar2.r0();
                }
                y2.h hVar2 = j.f56917f;
                t.J(hVar2, uVarA, sVar2);
                y2.h hVar3 = j.f56916e;
                t.J(hVar3, q1VarL, sVar2);
                y2.h hVar4 = j.f56918g;
                if (sVar2.S) {
                    iVar = iVar3;
                } else {
                    iVar = iVar3;
                    if (!m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    }
                    y2.h hVar5 = j.f56915d;
                    t.J(hVar5, rVarC, sVar2);
                    l1.g gVar4 = gVar;
                    sVar = sVar2;
                    rVar2 = oVar;
                    obj = "daily";
                    iVar2 = iVar;
                    i13 = i14;
                    iu.k.g(onNavigateBack, null, f27351a, null, null, null, null, null, sVar, ((i14 >> 3) & 14) | 384, 250);
                    j0.c.g(sVar, e2.g(e2.e(rVar2, 1.0f), 10));
                    r rVarD2 = e2.d(rVar2, 1.0f);
                    c3 c3Var = v1.f31180a;
                    long j11 = ((s1) sVar.j(c3Var)).f31033p;
                    r0 r0Var = g2.f0.f28556b;
                    r rVarY = d0.n.y(d0.n.h(rVarD2, j11, r0Var), d0.n.u(sVar), false, 14);
                    u uVarA2 = j0.t.a(dVar, hVar, sVar, 0);
                    iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    r rVarC2 = z1.a.c(sVar, rVarY);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar2);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar2, uVarA2, sVar);
                    t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    t.J(hVar5, rVarC2, sVar);
                    String strE0 = ub.a.e0(sVar, R.string.daily_learning_reminders);
                    j0Var = uiState;
                    boolean z18 = j0Var.f29399a;
                    String str2 = j0Var.f29400b;
                    if ((i13 & 57344) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objQ = sVar.Q();
                    gVar2 = gVar4;
                    if (!z11 || objQ == gVar2) {
                        cVar = onDailyReminderToggle;
                        objQ = new o1(cVar, 9);
                        sVar.o0(objQ);
                    } else {
                        cVar = onDailyReminderToggle;
                    }
                    fz.c cVar4 = (fz.c) objQ;
                    objQ2 = sVar.Q();
                    if (objQ2 == gVar2) {
                        b1Var = b1Var3;
                        b1Var2 = b1Var4;
                        objQ2 = new ch.h0(b1Var2, b1Var, 2);
                        sVar.o0(objQ2);
                    } else {
                        b1Var = b1Var3;
                        b1Var2 = b1Var4;
                    }
                    fz.a aVar = (fz.a) objQ2;
                    String strE1 = ub.a.e0(sVar, R.string.don_t_remind_me_if_i_have_already_completed_a_lesson);
                    boolean z19 = j0Var.f29401c;
                    if ((i13 & 3670016) == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ3 = sVar.Q();
                    if (!z12 || objQ3 == gVar2) {
                        cVar3 = onDailySkipToggle;
                        objQ3 = new o1(cVar3, 10);
                        sVar.o0(objQ3);
                    } else {
                        cVar3 = onDailySkipToggle;
                    }
                    c(R.drawable.ic_bnv_learn_active, strE0, z18, str2, cVar4, aVar, null, true, strE1, z19, (fz.c) objQ3, sVar, 12779520, 64);
                    j0.c.g(sVar, d0.n.h(e2.g(e2.e(j0.c.C(rVar2, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 6), ((s1) sVar.j(c3Var)).f31031n, r0Var));
                    String strE2 = ub.a.e0(sVar, R.string.smart_review_reminders);
                    boolean z20 = j0Var.f29402d;
                    String str3 = j0Var.f29403e;
                    if ((i13 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ4 = sVar.Q();
                    if (!z13 || objQ4 == gVar2) {
                        cVar2 = onSmartReminderToggle;
                        objQ4 = new o1(cVar2, 8);
                        sVar.o0(objQ4);
                    } else {
                        cVar2 = onSmartReminderToggle;
                    }
                    fz.c cVar5 = (fz.c) objQ4;
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar2) {
                        objQ5 = new ch.h0(b1Var2, b1Var, 1);
                        sVar.o0(objQ5);
                    }
                    c(R.drawable.ic_bnv_review_active, strE2, z20, str3, cVar5, (fz.a) objQ5, null, false, null, false, null, sVar, 196608, 1984);
                    z14 = true;
                    com.google.android.material.datepicker.d.B(sVar, true, true, false);
                }
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                y2.h hVar6 = j.f56915d;
                t.J(hVar6, rVarC, sVar2);
                l1.g gVar5 = gVar;
                sVar = sVar2;
                rVar2 = oVar;
                obj = "daily";
                iVar2 = iVar;
                i13 = i14;
                iu.k.g(onNavigateBack, null, f27351a, null, null, null, null, null, sVar, ((i14 >> 3) & 14) | 384, 250);
                j0.c.g(sVar, e2.g(e2.e(rVar2, 1.0f), 10));
                r rVarD3 = e2.d(rVar2, 1.0f);
                c3 c3Var2 = v1.f31180a;
                long j12 = ((s1) sVar.j(c3Var2)).f31033p;
                r0 r0Var2 = g2.f0.f28556b;
                r rVarY2 = d0.n.y(d0.n.h(rVarD3, j12, r0Var2), d0.n.u(sVar), false, 14);
                u uVarA3 = j0.t.a(dVar, hVar, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, rVarY2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, uVarA3, sVar);
                t.J(hVar3, q1VarL3, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar6, rVarC3, sVar);
                String strE3 = ub.a.e0(sVar, R.string.daily_learning_reminders);
                j0Var = uiState;
                boolean z110 = j0Var.f29399a;
                String str4 = j0Var.f29400b;
                if ((i13 & 57344) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                gVar2 = gVar5;
                if (z11) {
                    cVar = onDailyReminderToggle;
                    objQ = new o1(cVar, 9);
                    sVar.o0(objQ);
                } else {
                    cVar = onDailyReminderToggle;
                    objQ = new o1(cVar, 9);
                    sVar.o0(objQ);
                }
                fz.c cVar6 = (fz.c) objQ;
                objQ2 = sVar.Q();
                if (objQ2 == gVar2) {
                    b1Var = b1Var3;
                    b1Var2 = b1Var4;
                    objQ2 = new ch.h0(b1Var2, b1Var, 2);
                    sVar.o0(objQ2);
                } else {
                    b1Var = b1Var3;
                    b1Var2 = b1Var4;
                }
                fz.a aVar2 = (fz.a) objQ2;
                String strE4 = ub.a.e0(sVar, R.string.don_t_remind_me_if_i_have_already_completed_a_lesson);
                boolean z111 = j0Var.f29401c;
                if ((i13 & 3670016) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ3 = sVar.Q();
                if (z12) {
                    cVar3 = onDailySkipToggle;
                    objQ3 = new o1(cVar3, 10);
                    sVar.o0(objQ3);
                } else {
                    cVar3 = onDailySkipToggle;
                    objQ3 = new o1(cVar3, 10);
                    sVar.o0(objQ3);
                }
                c(R.drawable.ic_bnv_learn_active, strE3, z110, str4, cVar6, aVar2, null, true, strE4, z111, (fz.c) objQ3, sVar, 12779520, 64);
                j0.c.g(sVar, d0.n.h(e2.g(e2.e(j0.c.C(rVar2, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 6), ((s1) sVar.j(c3Var2)).f31031n, r0Var2));
                String strE5 = ub.a.e0(sVar, R.string.smart_review_reminders);
                boolean z21 = j0Var.f29402d;
                String str5 = j0Var.f29403e;
                if ((i13 & 458752) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ4 = sVar.Q();
                if (z13) {
                    cVar2 = onSmartReminderToggle;
                    objQ4 = new o1(cVar2, 8);
                    sVar.o0(objQ4);
                } else {
                    cVar2 = onSmartReminderToggle;
                    objQ4 = new o1(cVar2, 8);
                    sVar.o0(objQ4);
                }
                fz.c cVar7 = (fz.c) objQ4;
                objQ5 = sVar.Q();
                if (objQ5 == gVar2) {
                    objQ5 = new ch.h0(b1Var2, b1Var, 1);
                    sVar.o0(objQ5);
                }
                c(R.drawable.ic_bnv_review_active, strE5, z21, str5, cVar7, (fz.a) objQ5, null, false, null, false, null, sVar, 196608, 1984);
                z14 = true;
                com.google.android.material.datepicker.d.B(sVar, true, true, false);
            }
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(-1502196652);
                String str6 = m.a((String) b1Var2.getValue(), obj) ? j0Var.f29400b : j0Var.f29403e;
                int i15 = i13;
                boolean z22 = (i15 & 896) == 256 ? z14 : false;
                if ((i15 & 7168) != 2048) {
                    z14 = false;
                }
                boolean z23 = z14 | z22;
                Object objQ10 = sVar.Q();
                if (z23 || objQ10 == gVar2) {
                    bp.t tVar = new bp.t((Object) onDailyTimeUpdate, (Object) onSmartTimeUpdate, (Object) b1Var2, (Object) b1Var, 6);
                    sVar.o0(tVar);
                    objQ10 = tVar;
                }
                fz.e eVar = (fz.e) objQ10;
                Object objQ11 = sVar.Q();
                if (objQ11 == gVar2) {
                    objQ11 = new h2(4, b1Var);
                    sVar.o0(objQ11);
                }
                d(str6, eVar, (fz.a) objQ11, sVar, 384);
                z15 = false;
            } else {
                z15 = false;
                sVar.d0(-1509943459);
            }
            sVar.p(z15);
        } else {
            j0Var = uiState;
            sVar = sVar2;
            cVar = onDailyReminderToggle;
            cVar2 = onSmartReminderToggle;
            cVar3 = onDailySkipToggle;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i5(j0Var, onNavigateBack, onDailyTimeUpdate, onSmartTimeUpdate, cVar, cVar2, cVar3, onClearError, rVar2, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void c(final int i11, final String str, final boolean z11, final String str2, final fz.c cVar, final fz.a aVar, r rVar, boolean z12, String str3, boolean z13, fz.c cVar2, n nVar, final int i12, final int i13) {
        int i14;
        String str4;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        int i21;
        fz.c cVar3;
        char c11;
        boolean z15;
        final r rVar2;
        final boolean z16;
        final fz.c cVar4;
        final String str5;
        final boolean z17;
        x1 x1VarT;
        final boolean z18;
        final String str6;
        final boolean z19;
        final fz.c cVar5;
        Object objQ;
        s sVar = (s) nVar;
        sVar.f0(159130021);
        int i22 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.f(str2) ? 2048 : 1024) | (sVar.h(cVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        int i23 = 1572864 | i22;
        int i24 = i13 & 128;
        if (i24 == 0) {
            if ((i12 & 12582912) == 0) {
                i23 |= sVar.g(z12) ? 8388608 : 4194304;
            }
            i14 = i13 & 256;
            if (i14 != 0) {
                i16 = i23 | 100663296;
                str4 = str3;
            } else {
                str4 = str3;
                if (sVar.f(str4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i16 = i23 | i15;
            }
            i17 = i13 & 512;
            if (i17 != 0) {
                i19 = i16 | 805306368;
                z14 = z13;
            } else {
                z14 = z13;
                if (sVar.g(z14)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i19 = i16 | i18;
            }
            i21 = i13 & 1024;
            if (i21 != 0) {
                c11 = 6;
                cVar3 = cVar2;
            } else {
                cVar3 = cVar2;
                if (sVar.h(cVar3)) {
                    c11 = 4;
                } else {
                    c11 = 2;
                }
            }
            if ((i19 & 306783379) == 306783378 || (c11 & 3) != 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (sVar.T(i19 & 1, z15)) {
                if (i24 != 0) {
                    z18 = false;
                } else {
                    z18 = z12;
                }
                if (i14 != 0) {
                    str6 = BuildConfig.VERSION_NAME;
                } else {
                    str6 = str4;
                }
                if (i17 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i21 != 0) {
                    objQ = sVar.Q();
                    if (objQ == l1.m.f39353a) {
                        objQ = new br.b(27);
                        sVar.o0(objQ);
                    }
                    cVar5 = (fz.c) objQ;
                } else {
                    cVar5 = cVar3;
                }
                o oVar = o.f58481a;
                float f5 = 0;
                k7.d(e2.e(oVar, 1.0f), r0.f.d(f5), null, k7.q(62, f5), null, t1.e.d(-366091369, new fz.f() { // from class: fp.c
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        y2.h hVar;
                        boolean z20;
                        boolean z21;
                        v Card = (v) obj;
                        n nVar2 = (n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        m.f(Card, "$this$Card");
                        s sVar2 = (s) nVar2;
                        if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            o oVar2 = o.f58481a;
                            r rVarC = j0.c.C(oVar2, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                            int iHashCode = Long.hashCode(sVar2.T);
                            q1 q1VarL = sVar2.l();
                            r rVarC2 = z1.a.c(sVar2, rVarC);
                            k.J.getClass();
                            i iVar = j.f56913b;
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            y2.h hVar2 = j.f56917f;
                            t.J(hVar2, uVarA, sVar2);
                            y2.h hVar3 = j.f56916e;
                            t.J(hVar3, q1VarL, sVar2);
                            y2.h hVar4 = j.f56918g;
                            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                            }
                            y2.h hVar5 = j.f56915d;
                            t.J(hVar5, rVarC2, sVar2);
                            float f11 = 10;
                            r rVarC3 = j0.c.C(e2.i(e2.e(oVar2, 1.0f), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                            j0.e eVar = j0.i.f35309g;
                            z1.i iVar2 = z1.c.M;
                            a2 a2VarA = z1.a(eVar, iVar2, sVar2, 54);
                            int iHashCode2 = Long.hashCode(sVar2.T);
                            q1 q1VarL2 = sVar2.l();
                            r rVarC4 = z1.a.c(sVar2, rVarC3);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            t.J(hVar2, a2VarA, sVar2);
                            t.J(hVar3, q1VarL2, sVar2);
                            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                            }
                            t.J(hVar5, rVarC4, sVar2);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            i1 i1Var = new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar2, 48);
                            int iHashCode3 = Long.hashCode(sVar2.T);
                            q1 q1VarL3 = sVar2.l();
                            r rVarC5 = z1.a.c(sVar2, i1Var);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            t.J(hVar2, a2VarA2, sVar2);
                            t.J(hVar3, q1VarL3, sVar2);
                            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
                            }
                            t.J(hVar5, rVarC5, sVar2);
                            r4.b(se.k.y(i11, sVar2, 0), null, e2.n(oVar2, 24), g2.f0.e(4294940672L), sVar2, 3512, 0);
                            float f12 = 12;
                            j0.c.g(sVar2, e2.s(oVar2, f12));
                            xu.q1.k(0, 2, str, sVar2, null);
                            j0.c.g(sVar2, e2.s(oVar2, f12));
                            sVar2.p(true);
                            r9.a(z11, cVar, null, false, null, sVar2, 0, 124);
                            sVar2.p(true);
                            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 0, 7);
                            r rVarE = e2.e(oVar2, 1.0f);
                            fz.a aVar2 = aVar;
                            boolean zF = sVar2.f(aVar2);
                            Object objQ2 = sVar2.Q();
                            if (zF || objQ2 == l1.m.f39353a) {
                                objQ2 = new p(4, aVar2);
                                sVar2.o0(objQ2);
                            }
                            float f13 = 36;
                            r rVarC6 = j0.c.C(e2.i(j0.c.E(d0.n.o(rVarE, false, null, (fz.a) objQ2, 15), f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                            a2 a2VarA3 = z1.a(eVar, iVar2, sVar2, 54);
                            int iHashCode4 = Long.hashCode(sVar2.T);
                            q1 q1VarL4 = sVar2.l();
                            r rVarC7 = z1.a.c(sVar2, rVarC6);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            t.J(hVar2, a2VarA3, sVar2);
                            t.J(hVar3, q1VarL4, sVar2);
                            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                                hVar = hVar4;
                                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar);
                            } else {
                                hVar = hVar4;
                            }
                            t.J(hVar5, rVarC7, sVar2);
                            xu.q1.k(48, 0, ub.a.e0(sVar2, R.string.reminder_time), sVar2, d2.h.a(oVar2, 0.9f));
                            y2.h hVar6 = hVar;
                            k7.k(null, r0.f.d(4), null, null, null, t1.e.d(-157450724, new a0(str2, 4), sVar2), sVar2, 196608, 29);
                            s sVar3 = sVar2;
                            sVar3.p(true);
                            if (z18) {
                                sVar3.d0(-1236582125);
                                k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 0, 7);
                                r rVarC8 = j0.c.C(j0.c.E(e2.e(oVar2, 1.0f), f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), CropImageView.DEFAULT_ASPECT_RATIO, f11, 1);
                                a2 a2VarA4 = z1.a(eVar, iVar2, sVar3, 54);
                                int iHashCode5 = Long.hashCode(sVar3.T);
                                q1 q1VarL5 = sVar3.l();
                                r rVarC9 = z1.a.c(sVar3, rVarC8);
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3 = sVar3;
                                    sVar3.k(iVar);
                                } else {
                                    sVar3 = sVar3;
                                    sVar3.r0();
                                }
                                t.J(hVar2, a2VarA4, sVar3);
                                t.J(hVar3, q1VarL5, sVar3);
                                if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                                    defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar6);
                                }
                                t.J(hVar5, rVarC9, sVar3);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                xu.q1.i(0, 0, str6, sVar3, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                                j0.c.g(sVar3, e2.s(oVar2, 8));
                                r9.a(z19, cVar5, j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), false, null, sVar3, 384, 120);
                                z20 = true;
                                sVar3.p(true);
                                z21 = false;
                            } else {
                                z20 = true;
                                z21 = false;
                                sVar3.d0(-1248003083);
                            }
                            sVar3.p(z21);
                            sVar3.p(z20);
                        } else {
                            sVar2.W();
                        }
                        return b0.f48488a;
                    }
                }, sVar), sVar, 196608, 20);
                rVar2 = oVar;
                z16 = z18;
                str5 = str6;
                z17 = z19;
                cVar4 = cVar5;
            } else {
                sVar.W();
                rVar2 = rVar;
                z16 = z12;
                cVar4 = cVar3;
                str5 = str4;
                z17 = z14;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: fp.d
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a.c(i11, str, z11, str2, cVar, aVar, rVar2, z16, str5, z17, cVar4, (n) obj, t.M(i12 | 1), i13);
                        return b0.f48488a;
                    }
                };
            }
        }
        i23 = 14155776 | i22;
        i14 = i13 & 256;
        if (i14 != 0) {
            i16 = i23 | 100663296;
            str4 = str3;
        } else {
            str4 = str3;
            if (sVar.f(str4)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i16 = i23 | i15;
        }
        i17 = i13 & 512;
        if (i17 != 0) {
            i19 = i16 | 805306368;
            z14 = z13;
        } else {
            z14 = z13;
            if (sVar.g(z14)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i19 = i16 | i18;
        }
        i21 = i13 & 1024;
        if (i21 != 0) {
            c11 = 6;
            cVar3 = cVar2;
        } else {
            cVar3 = cVar2;
            if (sVar.h(cVar3)) {
                c11 = 4;
            } else {
                c11 = 2;
            }
        }
        if ((i19 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (sVar.T(i19 & 1, z15)) {
            if (i24 != 0) {
                z18 = false;
            } else {
                z18 = z12;
            }
            if (i14 != 0) {
                str6 = BuildConfig.VERSION_NAME;
            } else {
                str6 = str4;
            }
            if (i17 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i21 != 0) {
                objQ = sVar.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new br.b(27);
                    sVar.o0(objQ);
                }
                cVar5 = (fz.c) objQ;
            } else {
                cVar5 = cVar3;
            }
            o oVar2 = o.f58481a;
            float f11 = 0;
            k7.d(e2.e(oVar2, 1.0f), r0.f.d(f11), null, k7.q(62, f11), null, t1.e.d(-366091369, new fz.f() { // from class: fp.c
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    y2.h hVar;
                    boolean z20;
                    boolean z21;
                    v Card = (v) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    m.f(Card, "$this$Card");
                    s sVar2 = (s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        o oVar3 = o.f58481a;
                        r rVarC = j0.c.C(oVar3, 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                        int iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        r rVarC2 = z1.a.c(sVar2, rVarC);
                        k.J.getClass();
                        i iVar = j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        y2.h hVar2 = j.f56917f;
                        t.J(hVar2, uVarA, sVar2);
                        y2.h hVar3 = j.f56916e;
                        t.J(hVar3, q1VarL, sVar2);
                        y2.h hVar4 = j.f56918g;
                        if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                        }
                        y2.h hVar5 = j.f56915d;
                        t.J(hVar5, rVarC2, sVar2);
                        float f12 = 10;
                        r rVarC3 = j0.c.C(e2.i(e2.e(oVar3, 1.0f), 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
                        j0.e eVar = j0.i.f35309g;
                        z1.i iVar2 = z1.c.M;
                        a2 a2VarA = z1.a(eVar, iVar2, sVar2, 54);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        q1 q1VarL2 = sVar2.l();
                        r rVarC4 = z1.a.c(sVar2, rVarC3);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        t.J(hVar2, a2VarA, sVar2);
                        t.J(hVar3, q1VarL2, sVar2);
                        if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                        }
                        t.J(hVar5, rVarC4, sVar2);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        i1 i1Var = new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar2, 48);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        q1 q1VarL3 = sVar2.l();
                        r rVarC5 = z1.a.c(sVar2, i1Var);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        t.J(hVar2, a2VarA2, sVar2);
                        t.J(hVar3, q1VarL3, sVar2);
                        if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
                        }
                        t.J(hVar5, rVarC5, sVar2);
                        r4.b(se.k.y(i11, sVar2, 0), null, e2.n(oVar3, 24), g2.f0.e(4294940672L), sVar2, 3512, 0);
                        float f13 = 12;
                        j0.c.g(sVar2, e2.s(oVar3, f13));
                        xu.q1.k(0, 2, str, sVar2, null);
                        j0.c.g(sVar2, e2.s(oVar3, f13));
                        sVar2.p(true);
                        r9.a(z11, cVar, null, false, null, sVar2, 0, 124);
                        sVar2.p(true);
                        k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar2, 0, 7);
                        r rVarE = e2.e(oVar3, 1.0f);
                        fz.a aVar2 = aVar;
                        boolean zF = sVar2.f(aVar2);
                        Object objQ2 = sVar2.Q();
                        if (zF || objQ2 == l1.m.f39353a) {
                            objQ2 = new p(4, aVar2);
                            sVar2.o0(objQ2);
                        }
                        float f14 = 36;
                        r rVarC6 = j0.c.C(e2.i(j0.c.E(d0.n.o(rVarE, false, null, (fz.a) objQ2, 15), f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
                        a2 a2VarA3 = z1.a(eVar, iVar2, sVar2, 54);
                        int iHashCode4 = Long.hashCode(sVar2.T);
                        q1 q1VarL4 = sVar2.l();
                        r rVarC7 = z1.a.c(sVar2, rVarC6);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        t.J(hVar2, a2VarA3, sVar2);
                        t.J(hVar3, q1VarL4, sVar2);
                        if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                            hVar = hVar4;
                            defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar);
                        } else {
                            hVar = hVar4;
                        }
                        t.J(hVar5, rVarC7, sVar2);
                        xu.q1.k(48, 0, ub.a.e0(sVar2, R.string.reminder_time), sVar2, d2.h.a(oVar3, 0.9f));
                        y2.h hVar6 = hVar;
                        k7.k(null, r0.f.d(4), null, null, null, t1.e.d(-157450724, new a0(str2, 4), sVar2), sVar2, 196608, 29);
                        s sVar3 = sVar2;
                        sVar3.p(true);
                        if (z18) {
                            sVar3.d0(-1236582125);
                            k7.g(null, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar3, 0, 7);
                            r rVarC8 = j0.c.C(j0.c.E(e2.e(oVar3, 1.0f), f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), CropImageView.DEFAULT_ASPECT_RATIO, f12, 1);
                            a2 a2VarA4 = z1.a(eVar, iVar2, sVar3, 54);
                            int iHashCode5 = Long.hashCode(sVar3.T);
                            q1 q1VarL5 = sVar3.l();
                            r rVarC9 = z1.a.c(sVar3, rVarC8);
                            sVar3.h0();
                            if (sVar3.S) {
                                sVar3 = sVar3;
                                sVar3.k(iVar);
                            } else {
                                sVar3 = sVar3;
                                sVar3.r0();
                            }
                            t.J(hVar2, a2VarA4, sVar3);
                            t.J(hVar3, q1VarL5, sVar3);
                            if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode5))) {
                                defpackage.e.A(iHashCode5, sVar3, iHashCode5, hVar6);
                            }
                            t.J(hVar5, rVarC9, sVar3);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            xu.q1.i(0, 0, str6, sVar3, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                            j0.c.g(sVar3, e2.s(oVar3, 8));
                            r9.a(z19, cVar5, j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), false, null, sVar3, 384, 120);
                            z20 = true;
                            sVar3.p(true);
                            z21 = false;
                        } else {
                            z20 = true;
                            z21 = false;
                            sVar3.d0(-1248003083);
                        }
                        sVar3.p(z21);
                        sVar3.p(z20);
                    } else {
                        sVar2.W();
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, 196608, 20);
            rVar2 = oVar2;
            z16 = z18;
            str5 = str6;
            z17 = z19;
            cVar4 = cVar5;
        } else {
            sVar.W();
            rVar2 = rVar;
            z16 = z12;
            cVar4 = cVar3;
            str5 = str4;
            z17 = z14;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: fp.d
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.c(i11, str, z11, str2, cVar, aVar, rVar2, z16, str5, z17, cVar4, (n) obj, t.M(i12 | 1), i13);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void d(String str, fz.e eVar, fz.a aVar, n nVar, int i11) {
        Integer numT0;
        Integer numT1;
        s sVar = (s) nVar;
        sVar.f0(-1481049730);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(eVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            List listW0 = q.W0(str, new String[]{":"}, 0, 6);
            String str2 = (String) ry.m.t0(0, listW0);
            int iIntValue = (str2 == null || (numT1 = x.t0(str2)) == null) ? 19 : numT1.intValue();
            String str3 = (String) ry.m.t0(1, listW0);
            int iIntValue2 = (str3 == null || (numT0 = x.t0(str3)) == null) ? 40 : numT0.intValue();
            float f5 = wb.f31261a;
            Object[] objArr = new Object[0];
            o2 o2Var = new o2(6, h1.x1.f31284b0, o0.X);
            boolean zD = sVar.d(iIntValue) | sVar.d(iIntValue2);
            Object objQ = sVar.Q();
            if (zD || objQ == l1.m.f39353a) {
                objQ = new vb(iIntValue, iIntValue2);
                sVar.o0(objQ);
            }
            zb zbVar = (zb) w1.j.e(objArr, o2Var, (fz.a) objQ, sVar, 0, 4);
            k7.a(aVar, t1.e.d(357228486, new ch.z(26, eVar, zbVar), sVar), null, t1.e.d(426876360, new at.o(14, aVar), sVar), f27354d, t1.e.d(531348171, new ch.b0(zbVar, 7), sVar), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(str, eVar, aVar, i11, 0);
        }
    }
}
