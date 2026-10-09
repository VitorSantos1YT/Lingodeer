package kt;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bp.a0;
import bp.e0;
import bp.i2;
import bt.a8;
import bt.h5;
import bt.z7;
import ch.h0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.WordSentenceSourceKt;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.yalantis.ucrop.view.CropImageView;
import dt.d4;
import dt.j1;
import dt.j2;
import dt.y3;
import fr.j3;
import g2.f0;
import g2.x;
import h1.a6;
import h1.b6;
import h1.e8;
import h1.j0;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import iv.y;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.i1;
import j0.o2;
import j0.u;
import j0.v;
import j0.z1;
import j3.y0;
import java.util.List;
import java.util.WeakHashMap;
import jt.i0;
import jt.t0;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import nv.p;
import o3.w;
import oz.q;
import qy.b0;
import s0.r0;
import w2.q0;
import z1.o;
import z1.r;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final void a(int i11, final long j11, fz.a onClick, n nVar, r rVar, final boolean z11) {
        m.f(onClick, "onClick");
        s sVar = (s) nVar;
        sVar.f0(1891140980);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(onClick) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128) | 1024;
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                j11 = ((s1) sVar.j(v1.f31180a)).f31036s;
            } else {
                sVar.W();
            }
            int i13 = i12 & (-7169);
            sVar.q();
            int i14 = i13 >> 3;
            k7.h(onClick, rVar, false, null, t1.e.d(241923921, new fz.e() { // from class: kt.j
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    long j12;
                    n nVar2 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar2 = (s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z12 = z11;
                        k2.b bVarY = se.k.y(z12 ? R.drawable.notebook_edit : R.drawable.notebook_plus_outline, sVar2, 0);
                        r rVarN = e2.n(o.f58481a, 20);
                        if (z12) {
                            sVar2.d0(200764976);
                            j12 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                            sVar2.p(false);
                        } else {
                            sVar2.d0(200834509);
                            sVar2.p(false);
                            j12 = j11;
                        }
                        r4.b(bVarY, null, rVarN, j12, sVar2, 432, 0);
                    } else {
                        sVar2.W();
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, (i14 & 14) | 196608 | (i14 & 112), 28);
        } else {
            sVar.W();
        }
        long j12 = j11;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(z11, onClick, rVar, j12, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void b(String title, String message, String confirmText, fz.a onConfirm, fz.a onDismiss, boolean z11, n nVar, int i11, int i12) {
        boolean z12;
        boolean z13;
        s sVar;
        boolean z14;
        x1 x1VarT;
        boolean z15;
        m.f(title, "title");
        m.f(message, "message");
        m.f(confirmText, "confirmText");
        m.f(onConfirm, "onConfirm");
        m.f(onDismiss, "onDismiss");
        s sVar2 = (s) nVar;
        sVar2.f0(-346423257);
        int i13 = i11 | (sVar2.f(title) ? 4 : 2) | (sVar2.f(message) ? 32 : 16) | (sVar2.f(confirmText) ? 256 : 128) | (sVar2.h(onConfirm) ? 2048 : 1024);
        int i14 = i12 & 32;
        if (i14 == 0) {
            if ((i11 & 196608) == 0) {
                z12 = z11;
                i13 |= sVar2.g(z12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            }
            if ((74899 & i13) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar2.T(i13 & 1, z13)) {
                if (i14 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                sVar = sVar2;
                k7.a(onDismiss, t1.e.d(177533039, new y(onConfirm, confirmText, z15), sVar2), null, t1.e.d(197074161, new at.o(26, onDismiss), sVar2), t1.e.d(216615283, new e0(title, 17), sVar2), t1.e.d(226385844, new e0(message, 18), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
                z14 = z15;
            } else {
                sVar = sVar2;
                sVar.W();
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new j1(title, message, confirmText, onConfirm, onDismiss, z14, i11, i12);
            }
        }
        i13 |= 196608;
        z12 = z11;
        if ((74899 & i13) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar2.T(i13 & 1, z13)) {
            if (i14 != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            sVar = sVar2;
            k7.a(onDismiss, t1.e.d(177533039, new y(onConfirm, confirmText, z15), sVar2), null, t1.e.d(197074161, new at.o(26, onDismiss), sVar2), t1.e.d(216615283, new e0(title, 17), sVar2), t1.e.d(226385844, new e0(message, 18), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
            z14 = z15;
        } else {
            sVar = sVar2;
            sVar.W();
            z14 = z12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j1(title, message, confirmText, onConfirm, onDismiss, z14, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02d8  */
    public static final void c(final WordSentenceCharacterType contentType, final String initialNote, final fz.a onDismiss, final fz.c onSave, r rVar, int i11, fz.a aVar, n nVar, final int i12, final int i13) {
        fz.a aVar2;
        int i14;
        s sVar;
        final r rVar2;
        final int i15;
        final fz.a aVar3;
        int i16;
        l1.g gVar;
        boolean z11;
        boolean z12;
        fz.a aVar4;
        l1.g gVar2;
        l1.g gVar3;
        Object objQ;
        m.f(contentType, "contentType");
        m.f(initialNote, "initialNote");
        m.f(onDismiss, "onDismiss");
        m.f(onSave, "onSave");
        s sVar2 = (s) nVar;
        sVar2.f0(-1314638305);
        int i17 = (sVar2.h(contentType) ? 4 : 2) | i12;
        if ((i12 & 48) == 0) {
            i17 |= sVar2.f(initialNote) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i17 |= sVar2.h(onDismiss) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i17 |= sVar2.h(onSave) ? 2048 : 1024;
        }
        int i18 = 221184 | i17;
        int i19 = i13 & 64;
        if (i19 != 0) {
            i14 = i17 | 1794048;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i14 = i18 | (sVar2.h(aVar2) ? 1048576 : 524288);
        }
        if (sVar2.T(i14 & 1, (599187 & i14) != 599186)) {
            fz.a aVar5 = i19 != 0 ? null : aVar2;
            int i21 = i14 & 112;
            boolean zF = sVar2.f(contentType) | (i21 == 32);
            Object objQ2 = sVar2.Q();
            l1.g gVar4 = l1.m.f39353a;
            if (zF || objQ2 == gVar4) {
                objQ2 = t.B(q.g1(200, initialNote));
                sVar2.o0(objQ2);
            }
            final b1 b1Var = (b1) objQ2;
            boolean zF2 = sVar2.f(contentType) | (i21 == 32);
            Object objQ3 = sVar2.Q();
            if (zF2 || objQ3 == gVar4) {
                objQ3 = t.B(Boolean.valueOf(q.K0(initialNote)));
                sVar2.o0(objQ3);
            }
            final b1 b1Var2 = (b1) objQ3;
            boolean zF3 = sVar2.f(contentType) | (i21 == 32);
            Object objQ4 = sVar2.Q();
            if (zF3 || objQ4 == gVar4) {
                objQ4 = t.B(Boolean.valueOf(q.K0(initialNote)));
                sVar2.o0(objQ4);
            }
            final b1 b1Var3 = (b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar4) {
                objQ5 = t.B(Boolean.FALSE);
                sVar2.o0(objQ5);
            }
            final b1 b1Var4 = (b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar4) {
                objQ6 = t.B(Boolean.FALSE);
                sVar2.o0(objQ6);
            }
            final b1 b1Var5 = (b1) objQ6;
            final Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zF4 = sVar2.f(contentType) | (i21 == 32);
            Object objQ7 = sVar2.Q();
            if (zF4 || objQ7 == gVar4) {
                String strG1 = q.g1(200, q.i1(initialNote).toString());
                sVar2.o0(strG1);
                objQ7 = strG1;
            }
            final String str = (String) objQ7;
            final String string = q.i1((String) b1Var.getValue()).toString();
            boolean zA = m.a(string, str);
            final boolean z13 = !zA;
            final boolean z14 = !q.K0(str);
            boolean z15 = (q.K0(string) || zA) ? false : true;
            final b1 b1VarH = t.H(Boolean.valueOf(((Boolean) b1Var2.getValue()).booleanValue() && !zA), sVar2);
            boolean zF5 = sVar2.f(b1Var);
            Object objQ8 = sVar2.Q();
            if (zF5 || objQ8 == gVar4) {
                objQ8 = new z7(b1Var, null, 3);
                sVar2.o0(objQ8);
            }
            t.f((fz.e) objQ8, 200, sVar2);
            Object objQ9 = sVar2.Q();
            if (objQ9 == gVar4) {
                objQ9 = new i2(b1VarH, b1Var4, 9);
                sVar2.o0(objQ9);
            }
            e8 e8VarF = a6.f(54, 0, (fz.c) objQ9, sVar2);
            float f5 = 24;
            r0.e eVarF = r0.f.f(f5, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12);
            long j11 = ((s1) sVar2.j(v1.f31180a)).f31033p;
            b6 b6Var = new b6(false);
            int i22 = i14 & 896;
            boolean zF6 = sVar2.f(b1VarH) | (i22 == 256);
            Object objQ10 = sVar2.Q();
            if (zF6 || objQ10 == gVar4) {
                objQ10 = new d(0, onDismiss, b1VarH, b1Var4);
                sVar2.o0(objQ10);
            }
            int i23 = i14;
            final boolean z16 = z15;
            t1.d dVarD = t1.e.d(1709604668, new fz.f() { // from class: kt.e
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final b1 b1Var6;
                    Object h5Var;
                    v ModalBottomSheet = (v) obj;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                    s sVar3 = (s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b1 b1Var7 = b1Var4;
                        boolean zBooleanValue = ((Boolean) b1Var7.getValue()).booleanValue();
                        b1 b1Var8 = b1Var5;
                        boolean z17 = (zBooleanValue || ((Boolean) b1Var8.getValue()).booleanValue()) ? false : true;
                        b1 b1Var9 = b1VarH;
                        boolean zF7 = sVar3.f(b1Var9);
                        fz.a aVar6 = onDismiss;
                        boolean zF8 = zF7 | sVar3.f(aVar6);
                        Object objQ11 = sVar3.Q();
                        l1.g gVar5 = l1.m.f39353a;
                        if (zF8 || objQ11 == gVar5) {
                            objQ11 = new d(1, aVar6, b1Var9, b1Var7);
                            sVar3.o0(objQ11);
                        }
                        se.i.a(z17, (fz.a) objQ11, sVar3, 0, 0);
                        b1 b1Var10 = b1Var;
                        String str2 = (String) b1Var10.getValue();
                        final b1 b1Var11 = b1Var2;
                        boolean zBooleanValue2 = ((Boolean) b1Var11.getValue()).booleanValue();
                        b1 b1Var12 = b1Var3;
                        boolean zBooleanValue3 = ((Boolean) b1Var12.getValue()).booleanValue();
                        boolean zF9 = sVar3.f(aVar6);
                        Object objQ12 = sVar3.Q();
                        if (zF9 || objQ12 == gVar5) {
                            objQ12 = new jr.m(11, aVar6);
                            sVar3.o0(objQ12);
                        }
                        fz.a aVar7 = (fz.a) objQ12;
                        boolean zF10 = sVar3.f(b1Var9) | sVar3.f(aVar6);
                        Object objQ13 = sVar3.Q();
                        if (zF10 || objQ13 == gVar5) {
                            objQ13 = new d(2, aVar6, b1Var9, b1Var7);
                            sVar3.o0(objQ13);
                        }
                        fz.a aVar8 = (fz.a) objQ13;
                        boolean z18 = z16;
                        boolean zG = sVar3.g(z18);
                        fz.c cVar = onSave;
                        boolean zF11 = zG | sVar3.f(cVar);
                        String str3 = string;
                        boolean zF12 = zF11 | sVar3.f(str3);
                        Context context2 = context;
                        boolean zH = zF12 | sVar3.h(context2) | sVar3.f(aVar6);
                        Object objQ14 = sVar3.Q();
                        if (zH || objQ14 == gVar5) {
                            b1Var6 = b1Var12;
                            h5Var = new h5(z18, cVar, str3, context2, aVar6);
                            sVar3.o0(h5Var);
                        } else {
                            h5Var = objQ14;
                            b1Var6 = b1Var12;
                        }
                        fz.a aVar9 = (fz.a) h5Var;
                        Object objQ15 = sVar3.Q();
                        if (objQ15 == gVar5) {
                            objQ15 = new i0(11, b1Var8);
                            sVar3.o0(objQ15);
                        }
                        fz.a aVar10 = (fz.a) objQ15;
                        boolean zF13 = sVar3.f(b1Var6) | sVar3.f(b1Var11);
                        Object objQ16 = sVar3.Q();
                        if (zF13 || objQ16 == gVar5) {
                            objQ16 = new h0(b1Var6, b1Var11, 3);
                            sVar3.o0(objQ16);
                        }
                        fz.a aVar11 = (fz.a) objQ16;
                        boolean zF14 = sVar3.f(b1Var6);
                        final boolean z19 = z14;
                        boolean zG2 = zF14 | sVar3.g(z19);
                        final boolean z20 = z13;
                        boolean zG3 = zG2 | sVar3.g(z20) | sVar3.f(b1Var11);
                        Object objQ17 = sVar3.Q();
                        if (zG3 || objQ17 == gVar5) {
                            objQ17 = new fz.a() { // from class: kt.h
                                @Override // fz.a
                                public final Object invoke() {
                                    Boolean bool = Boolean.FALSE;
                                    b1Var6.setValue(bool);
                                    if (z19 && !z20) {
                                        b1Var11.setValue(bool);
                                    }
                                    return b0.f48488a;
                                }
                            };
                            sVar3.o0(objQ17);
                        }
                        fz.a aVar12 = (fz.a) objQ17;
                        boolean zF15 = sVar3.f(b1Var10) | sVar3.d(200);
                        Object objQ18 = sVar3.Q();
                        if (zF15 || objQ18 == gVar5) {
                            objQ18 = new bp.h0(27, b1Var10);
                            sVar3.o0(objQ18);
                        }
                        l.d(str2, str, zBooleanValue2, z18, zBooleanValue3, z19, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, (fz.c) objQ18, t1.e.d(900731867, new a00.b(contentType, 21), sVar3), null, sVar3, 0);
                    } else {
                        sVar3.W();
                    }
                    return b0.f48488a;
                }
            }, sVar2);
            o oVar = o.f58481a;
            a6.a((fz.a) objQ10, oVar, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, eVarF, j11, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, b6Var, dVarD, sVar2, 48, 432, 1992);
            sVar = sVar2;
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar.d0(1421075486);
                String strE0 = ub.a.e0(sVar, R.string.knowledge_note_discard_title);
                String strE1 = ub.a.e0(sVar, R.string.knowledge_note_discard_message);
                String strE2 = ub.a.e0(sVar, R.string.knowledge_note_discard_confirm);
                i16 = i22;
                boolean z17 = i16 == 256;
                Object objQ11 = sVar.Q();
                if (z17) {
                    gVar3 = gVar4;
                } else {
                    if (objQ11 == gVar3) {
                    }
                    gVar3 = gVar4;
                    fz.a aVar6 = (fz.a) objQ11;
                    objQ = sVar.Q();
                    if (objQ == gVar3) {
                        objQ = new i0(9, b1Var4);
                        sVar.o0(objQ);
                    }
                    gVar = gVar3;
                    b(strE0, strE1, strE2, aVar6, (fz.a) objQ, false, sVar, 24576, 32);
                    z11 = false;
                }
                gVar3 = gVar4;
                objQ11 = new fu.e(4, onDismiss, b1Var4);
                sVar.o0(objQ11);
                gVar3 = gVar4;
                fz.a aVar7 = (fz.a) objQ11;
                objQ = sVar.Q();
                if (objQ == gVar3) {
                    objQ = new i0(9, b1Var4);
                    sVar.o0(objQ);
                }
                gVar = gVar3;
                b(strE0, strE1, strE2, aVar7, (fz.a) objQ, false, sVar, 24576, 32);
                z11 = false;
            } else {
                i16 = i22;
                gVar = gVar4;
                z11 = false;
                sVar.d0(1412521315);
            }
            sVar.p(z11);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar.d0(1421586242);
                String strE3 = ub.a.e0(sVar, R.string.knowledge_note_delete_title);
                String strE4 = ub.a.e0(sVar, R.string.knowledge_note_delete_message);
                String strE5 = ub.a.e0(sVar, R.string.knowledge_note_delete_confirm);
                boolean zH = ((i23 & 7168) == 2048 ? true : z11) | ((3670016 & i23) == 1048576 ? true : z11) | sVar.h(context) | (i16 != 256 ? z11 : true);
                Object objQ12 = sVar.Q();
                if (zH || objQ12 == gVar) {
                    aVar4 = aVar5;
                    gVar2 = gVar;
                    bp.x1 x1Var = new bp.x1(b1Var5, aVar4, onSave, context, onDismiss);
                    sVar.o0(x1Var);
                    objQ12 = x1Var;
                } else {
                    gVar2 = gVar;
                    aVar4 = aVar5;
                }
                fz.a aVar8 = (fz.a) objQ12;
                Object objQ13 = sVar.Q();
                if (objQ13 == gVar2) {
                    objQ13 = new i0(10, b1Var5);
                    sVar.o0(objQ13);
                }
                fz.a aVar9 = (fz.a) objQ13;
                z12 = z11;
                b(strE3, strE4, strE5, aVar8, aVar9, true, sVar, 221184, 0);
            } else {
                z12 = z11;
                aVar4 = aVar5;
                sVar.d0(1412521315);
            }
            sVar.p(z12);
            aVar3 = aVar4;
            rVar2 = oVar;
            i15 = 200;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
            i15 = i11;
            aVar3 = aVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: kt.f
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.c(contentType, initialNote, onDismiss, onSave, rVar2, i15, aVar3, (n) obj, t.M(i12 | 1), i13);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void d(final String note, final String initialNote, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final fz.a onClose, final fz.a onCancel, final fz.a onSave, final fz.a onDeleteClick, final fz.a onEnterEditMode, final fz.a onEditorFocusCleared, final fz.c onNoteChange, t1.d dVar, r rVar, n nVar, final int i11) {
        final t1.d dVar2;
        s sVar;
        final r rVar2;
        s sVar2;
        y2.h hVar;
        float f5;
        o oVar;
        int i12;
        float f11;
        boolean z15;
        boolean z16;
        m.f(note, "note");
        m.f(initialNote, "initialNote");
        m.f(onClose, "onClose");
        m.f(onCancel, "onCancel");
        m.f(onSave, "onSave");
        m.f(onDeleteClick, "onDeleteClick");
        m.f(onEnterEditMode, "onEnterEditMode");
        m.f(onEditorFocusCleared, "onEditorFocusCleared");
        m.f(onNoteChange, "onNoteChange");
        s sVar3 = (s) nVar;
        sVar3.f0(1214474688);
        int i13 = i11 | (sVar3.f(note) ? 4 : 2) | (sVar3.f(initialNote) ? 32 : 16) | (sVar3.d(200) ? 256 : 128) | (sVar3.g(z11) ? 2048 : 1024) | (sVar3.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar3.g(z13) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar3.g(z14) ? 1048576 : 524288) | (sVar3.h(onClose) ? 8388608 : 4194304) | (sVar3.h(onCancel) ? 67108864 : 33554432) | (sVar3.h(onSave) ? 536870912 : 268435456);
        int i14 = 24582 | (sVar3.h(onEnterEditMode) ? 32 : 16) | (sVar3.h(onEditorFocusCleared) ? 256 : 128) | (sVar3.h(onNoteChange) ? 2048 : 1024) | 196608;
        if (sVar3.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 74899) == 74898) ? false : true)) {
            o oVar2 = o.f58481a;
            r rVarR = j0.c.r(j0.c.v(e2.e(oVar2, 1.0f)));
            j0.d dVar3 = j0.i.f35305c;
            z1.h hVar2 = z1.c.O;
            u uVarA = j0.t.a(dVar3, hVar2, sVar3, 0);
            int iHashCode = Long.hashCode(sVar3.T);
            q1 q1VarL = sVar3.l();
            r rVarC = z1.a.c(sVar3, rVarR);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            t.J(hVar3, uVarA, sVar3);
            y2.h hVar4 = y2.j.f56916e;
            t.J(hVar4, q1VarL, sVar3);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            t.J(hVar6, rVarC, sVar3);
            float f12 = 16;
            r rVarC2 = j0.c.C(e2.g(e2.e(oVar2, 1.0f), 44), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar3, 48);
            int iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL2 = sVar3.l();
            r rVarC3 = z1.a.c(sVar3, rVarC2);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            t.J(hVar3, a2VarA, sVar3);
            t.J(hVar4, q1VarL2, sVar3);
            if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar5);
            }
            t.J(hVar6, rVarC3, sVar3);
            c2 c2Var = c2.f35266a;
            r rVarA = c2Var.a(oVar2, 1.0f);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode3 = Long.hashCode(sVar3.T);
            q1 q1VarL3 = sVar3.l();
            r rVarC4 = z1.a.c(sVar3, rVarA);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            t.J(hVar3, q0VarD, sVar3);
            t.J(hVar4, q1VarL3, sVar3);
            if (sVar3.S || !m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar5);
            }
            t.J(hVar6, rVarC4, sVar3);
            if (z11) {
                sVar3.d0(-905652432);
                k7.m(onCancel, null, false, null, null, j0.c.d(8, CropImageView.DEFAULT_ASPECT_RATIO, 2), a.f38638a, sVar3, ((i13 >> 24) & 14) | 817889280, 382);
                sVar2 = sVar3;
                sVar2.p(false);
                hVar = hVar4;
                f5 = 1.0f;
                oVar = oVar2;
            } else {
                sVar2 = sVar3;
                sVar2.d0(-905184332);
                hVar = hVar4;
                f5 = 1.0f;
                oVar = oVar2;
                k7.h(onClose, e2.n(oVar2, 40), false, null, a.f38639b, sVar2, ((i13 >> 21) & 14) | 196656, 28);
                sVar2.p(false);
            }
            sVar2.p(true);
            String strE0 = ub.a.e0(sVar2, R.string.knowledge_note_editor_title);
            r rVarA2 = c2Var.a(oVar, f5);
            c3 c3Var = v1.f31180a;
            y2.h hVar7 = hVar;
            s sVar4 = sVar2;
            ua.b(strE0, rVarA2, ((s1) sVar2.j(c3Var)).f31034q, j3.A(18), null, n3.s.L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar4, 199680, 0, 130512);
            s sVar5 = sVar4;
            r rVarA3 = c2Var.a(oVar, 1.0f);
            q0 q0VarD2 = j0.o.d(z1.c.f58468f, false);
            int iHashCode4 = Long.hashCode(sVar5.T);
            q1 q1VarL4 = sVar5.l();
            r rVarC5 = z1.a.c(sVar5, rVarA3);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            t.J(hVar3, q0VarD2, sVar5);
            t.J(hVar7, q1VarL4, sVar5);
            if (sVar5.S || !m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar5);
            }
            t.J(hVar6, rVarC5, sVar5);
            if (z11) {
                sVar5.d0(-2020147959);
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                r rVarG = e2.g(e2.u(oVar, 64, CropImageView.DEFAULT_ASPECT_RATIO, 2), 34);
                r0.e eVarD = r0.f.d(100);
                j0.v1 v1Var = j0.f30447a;
                i12 = 14;
                k7.b(onSave, rVarG, z12, eVarD, j0.a(((s1) sVar5.j(c3Var)).f31017a, ((s1) sVar5.j(c3Var)).f31019b, sVar5, 12), null, null, j0.c.d(14, CropImageView.DEFAULT_ASPECT_RATIO, 2), a.f38640c, sVar5, ((i13 >> 27) & 14) | 818085936 | ((i13 >> 6) & 896), 320);
                sVar5 = sVar5;
                z15 = false;
                sVar5.p(false);
            } else {
                i12 = 14;
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (z14) {
                    sVar5.d0(-2019209093);
                    k7.m(onDeleteClick, null, false, null, null, j0.c.d(8, CropImageView.DEFAULT_ASPECT_RATIO, 2), a.f38641d, sVar5, 817889286, 382);
                    sVar5 = sVar5;
                    z15 = false;
                } else {
                    z15 = false;
                    sVar5.d0(-2032142293);
                }
                sVar5.p(z15);
            }
            sVar5.p(true);
            sVar5.p(true);
            r rVarE = j0.c.E(j0.c.C(d0.n.y(e2.e(oVar, 1.0f), d0.n.u(sVar5), z15, i12), f12, f11, 2), CropImageView.DEFAULT_ASPECT_RATIO, i12, CropImageView.DEFAULT_ASPECT_RATIO, 20, 5);
            u uVarA2 = j0.t.a(j0.i.g(18), hVar2, sVar5, 6);
            int iHashCode5 = Long.hashCode(sVar5.T);
            q1 q1VarL5 = sVar5.l();
            r rVarC6 = z1.a.c(sVar5, rVarE);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar);
            } else {
                sVar5.r0();
            }
            t.J(hVar3, uVarA2, sVar5);
            t.J(hVar7, q1VarL5, sVar5);
            if (sVar5.S || !m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar5);
            }
            t.J(hVar6, rVarC6, sVar5);
            dVar2 = dVar;
            f(dVar2, sVar5, 6);
            if (z11) {
                sVar5.d0(-183238882);
                int i15 = i13 >> 3;
                s sVar6 = sVar5;
                z16 = true;
                g(note, onNoteChange, null, z13, false, null, onEditorFocusCleared, sVar6, (i13 & 14) | (i15 & 112) | ((i14 >> 3) & 896) | (i15 & 57344) | (29360128 & (i14 << 15)), 104);
                sVar = sVar6;
                sVar.p(z15);
            } else {
                z16 = true;
                s sVar7 = sVar5;
                sVar7.d0(-182922992);
                Object objQ = sVar7.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new t0(18);
                    sVar7.o0(objQ);
                }
                fz.c cVar = (fz.c) objQ;
                int i16 = i13 >> 3;
                g(initialNote, cVar, null, false, true, onEnterEditMode, null, sVar7, (i16 & 112) | (i16 & 14) | 221568 | (3670016 & (i14 << 15)), 136);
                sVar = sVar7;
                sVar.p(z15);
            }
            sVar.p(z16);
            sVar.p(z16);
            rVar2 = oVar;
        } else {
            dVar2 = dVar;
            sVar = sVar3;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(note, initialNote, z11, z12, z13, z14, onClose, onCancel, onSave, onDeleteClick, onEnterEditMode, onEditorFocusCleared, onNoteChange, dVar2, rVar2, i11) { // from class: kt.g
                public final /* synthetic */ fz.a H;
                public final /* synthetic */ fz.a K;
                public final /* synthetic */ fz.a L;
                public final /* synthetic */ fz.a M;
                public final /* synthetic */ fz.a N;
                public final /* synthetic */ fz.c O;
                public final /* synthetic */ t1.d P;
                public final /* synthetic */ r Q;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f38666a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f38667b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f38668c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f38669d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f38670e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f38671f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.a f38672t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = t.M(1);
                    l.d(this.f38666a, this.f38667b, this.f38668c, this.f38669d, this.f38670e, this.f38671f, this.f38672t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, (n) obj, iM);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void e(WordSentenceCharacterType contentType, r rVar, boolean z11, n nVar, int i11) {
        s sVar;
        r rVar2;
        boolean z12;
        boolean z13;
        boolean z14;
        m.f(contentType, "contentType");
        s sVar2 = (s) nVar;
        sVar2.f0(-2071912879);
        int i12 = (sVar2.h(contentType) ? 4 : 2) | i11 | 432;
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            o oVar = o.f58481a;
            r rVarE = e2.e(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar2);
            t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar2);
            if (contentType instanceof WordSentenceCharacterType.CharacterType) {
                sVar2.d0(-1910719792);
                WordSentenceCharacterType.CharacterType characterType = (WordSentenceCharacterType.CharacterType) contentType;
                h(WordSentenceSourceKt.toWordItem(characterType.getCharacter()), characterType.getCharacter().getTranslation(), null, sVar2, 0);
                sVar2.p(false);
            } else {
                if (contentType instanceof WordSentenceCharacterType.WordType) {
                    sVar2.d0(-1910464569);
                    WordSentenceCharacterType.WordType wordType = (WordSentenceCharacterType.WordType) contentType;
                    h(wordType.getWord(), wordType.getWord().getTranslation(), null, sVar2, 0);
                    sVar2.p(false);
                } else {
                    if (!(contentType instanceof WordSentenceCharacterType.SentenceType)) {
                        throw p.x(sVar2, 354004684, false);
                    }
                    sVar2.d0(-1910203456);
                    WordSentenceCharacterType.SentenceType sentenceType = (WordSentenceCharacterType.SentenceType) contentType;
                    List<CourseWord> displayCourseWords = sentenceType.getSentence().getDisplayCourseWords();
                    y0 y0Var = (y0) sVar2.j(ua.f31167a);
                    long jA = j3.A(20);
                    n3.s sVar3 = n3.s.H;
                    c3 c3Var = v1.f31180a;
                    rVar2 = oVar;
                    d4.a(displayCourseWords, null, null, true, false, y0.a(y0Var, ((s1) sVar2.j(c3Var)).f31034q, jA, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), j0.i.f35303a, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar2, 1575936, 0, 0, 4194198);
                    sVar = sVar2;
                    if (q.K0(sentenceType.getSentence().getTranslation())) {
                        z13 = false;
                        sVar.d0(-1932168165);
                    } else {
                        sVar.d0(-1909639783);
                        j0.c.g(sVar, e2.g(rVar2, 6));
                        ua.b(sentenceType.getSentence().getTranslation(), null, ((s1) sVar.j(c3Var)).f31036s, j3.A(16), null, null, null, 0L, null, j3.A(22), 0, false, 0, 0, null, sVar, 3072, 6, 130034);
                        sVar = sVar;
                        z13 = false;
                    }
                    sVar.p(z13);
                    sVar.p(z13);
                    z14 = true;
                }
                sVar.p(z14);
                z12 = true;
            }
            sVar = sVar2;
            rVar2 = oVar;
            z14 = true;
            sVar.p(z14);
            z12 = true;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
            z12 = z11;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.b0(contentType, rVar2, z12, i11);
        }
    }

    public static final void f(t1.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-2125122266);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 12;
            r rVarB = j0.c.B(d0.n.h(e2.e(o.f58481a, 1.0f), ((s1) sVar.j(v1.f31180a)).f31035r, r0.f.d(f5)), 14, f5);
            int i13 = ((i12 << 9) & 7168) | 48;
            u uVarA = j0.t.a(j0.i.g(6), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            dVar.invoke(v.f35424a, sVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j2(dVar, i11, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01db  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:113:0x0202  */
    /* JADX WARN: Code duplicated, block: B:114:0x0204  */
    /* JADX WARN: Code duplicated, block: B:118:0x0212  */
    /* JADX WARN: Code duplicated, block: B:123:0x023f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0241  */
    /* JADX WARN: Code duplicated, block: B:127:0x0255  */
    /* JADX WARN: Code duplicated, block: B:128:0x0257  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:148:0x030c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0392  */
    /* JADX WARN: Code duplicated, block: B:153:0x0394  */
    /* JADX WARN: Code duplicated, block: B:156:0x039b  */
    /* JADX WARN: Code duplicated, block: B:157:0x039d  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:167:0x042c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0430  */
    /* JADX WARN: Code duplicated, block: B:171:0x043d  */
    /* JADX WARN: Code duplicated, block: B:173:0x044b  */
    /* JADX WARN: Code duplicated, block: B:175:0x0497  */
    /* JADX WARN: Code duplicated, block: B:178:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x0115  */
    /* JADX WARN: Code duplicated, block: B:88:0x0148  */
    /* JADX WARN: Code duplicated, block: B:89:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0151  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x0198  */
    public static final void g(String str, fz.c cVar, r rVar, boolean z11, boolean z12, fz.a aVar, fz.a aVar2, n nVar, int i11, int i12) {
        int i13;
        boolean z13;
        int i14;
        fz.a aVar3;
        int i15;
        int i16;
        int i17;
        fz.a aVar4;
        int i18;
        boolean z14;
        r rVar2;
        fz.a aVar5;
        fz.a aVar6;
        boolean z15;
        x1 x1VarT;
        boolean z16;
        l1.g gVar;
        fz.a aVar7;
        Object objQ;
        e2.v vVar;
        e2.l lVar;
        z2.i2 i2Var;
        boolean z17;
        Object objQ2;
        b1 b1Var;
        Object objQ3;
        b1 b1Var2;
        long jC;
        boolean z18;
        Object objQ4;
        boolean z19;
        boolean zF;
        Object j0Var;
        int i19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        Object objQ5;
        o oVar;
        boolean z24;
        r rVarO;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        fz.a aVar8;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ6;
        int iHashCode2;
        Object objQ7;
        Object objQ8;
        String note = str;
        fz.c onNoteChange = cVar;
        m.f(note, "note");
        m.f(onNoteChange, "onNoteChange");
        s sVar = (s) nVar;
        sVar.f0(-706938424);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(note) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.d(200) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(onNoteChange) ? 256 : 128;
        }
        int i21 = i13 | 3072;
        if ((i11 & 24576) == 0) {
            i21 |= sVar.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i22 = i12 & 32;
        if (i22 == 0) {
            if ((196608 & i11) == 0) {
                z13 = z12;
                i21 |= sVar.g(z13) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            }
            i14 = i12 & 64;
            if (i14 != 0) {
                i21 |= 1572864;
                aVar3 = aVar;
                i15 = 16;
            } else {
                aVar3 = aVar;
                i15 = 16;
                if ((i11 & 1572864) == 0) {
                    if (sVar.h(aVar3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i21 |= i16;
                }
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                i21 |= 12582912;
                aVar4 = aVar2;
            } else {
                aVar4 = aVar2;
                if ((i11 & 12582912) == 0) {
                    if (sVar.h(aVar4)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i21 |= i18;
                }
            }
            if ((i21 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar.T(i21 & 1, z14)) {
                if (i22 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                gVar = l1.m.f39353a;
                if (i14 != 0) {
                    objQ8 = sVar.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new ju.d(25);
                        sVar.o0(objQ8);
                    }
                    aVar3 = (fz.a) objQ8;
                }
                if (i17 != 0) {
                    objQ7 = sVar.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new ju.d(25);
                        sVar.o0(objQ7);
                    }
                    aVar7 = (fz.a) objQ7;
                } else {
                    aVar7 = aVar4;
                }
                float f5 = 10;
                r0.e eVarD = r0.f.d(f5);
                objQ = sVar.Q();
                if (objQ == gVar) {
                    objQ = new e2.v();
                    sVar.o0(objQ);
                }
                vVar = (e2.v) objQ;
                lVar = (e2.l) sVar.j(g1.f58548i);
                i2Var = (z2.i2) sVar.j(g1.f58554p);
                WeakHashMap weakHashMap = o2.f35353v;
                if (j0.b.e(sVar).f35356c.e().f48796d > 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    objQ2 = t.B(Boolean.FALSE);
                    sVar.o0(objQ2);
                }
                b1Var = (b1) objQ2;
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    int length = note.length();
                    objQ3 = t.B(new w(note, j3.t.b(length, length), 4));
                    sVar.o0(objQ3);
                }
                b1Var2 = (b1) objQ3;
                if (note.length() >= 200) {
                    sVar.d0(-762962035);
                    jC = ((s1) sVar.j(v1.f31180a)).f31040w;
                    sVar.p(false);
                } else if (note.length() >= ((int) (200 * 0.9f))) {
                    sVar.d0(-762959118);
                    jC = x.c(((s1) sVar.j(v1.f31180a)).f31040w, 0.8f);
                    sVar.p(false);
                } else {
                    sVar.d0(-762957416);
                    jC = ((s1) sVar.j(v1.f31180a)).f31036s;
                    sVar.p(false);
                }
                long j11 = jC;
                if ((i21 & 14) == 4) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ4 = sVar.Q();
                if (z18 || objQ4 == gVar) {
                    objQ4 = new k(note, b1Var2, null, 0);
                    sVar.o0(objQ4);
                }
                t.f((fz.e) objQ4, note, sVar);
                Boolean boolValueOf = Boolean.valueOf(z11);
                if ((i21 & 57344) == 16384) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zF = z19 | sVar.f(i2Var);
                Object objQ9 = sVar.Q();
                if (!zF || objQ9 == gVar) {
                    i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    j0Var = new bh.j0(z11, vVar, i2Var, (vy.d) null, 8);
                    sVar.o0(j0Var);
                } else {
                    j0Var = objQ9;
                    i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                }
                t.f((fz.e) j0Var, boolValueOf, sVar);
                Boolean boolValueOf2 = Boolean.valueOf(z17);
                Boolean boolValueOf3 = Boolean.valueOf(z16);
                if ((i21 & 458752) == i19) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                boolean zG = z20 | sVar.g(z17) | sVar.h(lVar);
                z21 = z17;
                if ((29360128 & i21) == 8388608) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z22 | zG;
                objQ5 = sVar.Q();
                if (z23 || objQ5 == gVar) {
                    objQ5 = new a8(z16, z21, lVar, aVar7, b1Var, (vy.d) null);
                    sVar.o0(objQ5);
                }
                t.g(boolValueOf2, boolValueOf3, (fz.e) objQ5, sVar);
                oVar = o.f58481a;
                c3 c3Var = v1.f31180a;
                r rVarH = d0.n.h(d0.n.j(e2.h(e2.e(oVar, 1.0f), 144, AchievementLevelType.DAY_STREAK_LV_8), 1, ((s1) sVar.j(c3Var)).A, eVarD), ((s1) sVar.j(c3Var)).f31033p, eVarD);
                if (z16) {
                    z24 = false;
                    rVarO = d0.n.o(oVar, false, null, aVar3, 15);
                } else {
                    z24 = false;
                    rVarO = oVar;
                }
                r rVarB = j0.c.B(rVarH.i(rVarO), f5, f5);
                z1.j jVar = z1.c.f58463a;
                q0 q0VarD = j0.o.d(jVar, z24);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(sVar, rVarB);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                y2.h hVar2 = y2.j.f56917f;
                t.J(hVar2, q0VarD, sVar);
                y2.h hVar3 = y2.j.f56916e;
                t.J(hVar3, q1VarL, sVar);
                hVar = y2.j.f56918g;
                fz.a aVar9 = aVar7;
                if (sVar.S) {
                    aVar8 = aVar3;
                } else {
                    aVar8 = aVar3;
                    if (!m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    t.J(hVar4, rVarC, sVar);
                    w wVar = (w) b1Var2.getValue();
                    r rVarJ = e2.d.j(j0.c.E(e2.h(e2.e(oVar, 1.0f), 122, 158), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 22, 7), vVar);
                    boolean z28 = !z16;
                    y0 y0VarA = y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(c3Var)).f31034q, j3.A(i15), null, null, null, 0L, null, null, 0, 0, j3.A(22), null, 16646140);
                    r0 r0Var = new r0(0, 1, 119);
                    if ((i21 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if ((i21 & 896) == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = z25 | z26;
                    objQ6 = sVar.Q();
                    if (!z27 || objQ6 == gVar) {
                        onNoteChange = cVar;
                        objQ6 = new y3(onNoteChange, b1Var2, 4);
                        sVar.o0(objQ6);
                    } else {
                        onNoteChange = cVar;
                    }
                    note = str;
                    boolean z29 = z16;
                    s0.l.b(wVar, (fz.c) objQ6, rVarJ, z28, z29, y0VarA, r0Var, null, false, 8, 0, null, null, null, null, t1.e.d(1692488805, new a0(note, 11), sVar), sVar, ((i21 >> 3) & 57344) | 806879232, 32128);
                    r rVarH2 = d0.n.h(j0.r.f35391a.a(oVar, z1.c.K), ((s1) sVar.j(c3Var)).f31033p, f0.f28556b);
                    q0 q0VarD2 = j0.o.d(jVar, false);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    r rVarC2 = z1.a.c(sVar, rVarH2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar2, q0VarD2, sVar);
                    t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    t.J(hVar4, rVarC2, sVar);
                    ua.b(w4.c.f(note.length(), "/200"), null, j11, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131058);
                    sVar = sVar;
                    sVar.p(true);
                    sVar.p(true);
                    aVar6 = aVar9;
                    rVar2 = oVar;
                    aVar5 = aVar8;
                    z15 = z29;
                }
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                y2.h hVar5 = y2.j.f56915d;
                t.J(hVar5, rVarC, sVar);
                w wVar2 = (w) b1Var2.getValue();
                r rVarJ2 = e2.d.j(j0.c.E(e2.h(e2.e(oVar, 1.0f), 122, 158), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 22, 7), vVar);
                boolean z210 = !z16;
                y0 y0VarA2 = y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(c3Var)).f31034q, j3.A(i15), null, null, null, 0L, null, null, 0, 0, j3.A(22), null, 16646140);
                r0 r0Var2 = new r0(0, 1, 119);
                if ((i21 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i21 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z25 | z26;
                objQ6 = sVar.Q();
                if (z27) {
                    onNoteChange = cVar;
                    objQ6 = new y3(onNoteChange, b1Var2, 4);
                    sVar.o0(objQ6);
                } else {
                    onNoteChange = cVar;
                    objQ6 = new y3(onNoteChange, b1Var2, 4);
                    sVar.o0(objQ6);
                }
                note = str;
                boolean z211 = z16;
                s0.l.b(wVar2, (fz.c) objQ6, rVarJ2, z210, z211, y0VarA2, r0Var2, null, false, 8, 0, null, null, null, null, t1.e.d(1692488805, new a0(note, 11), sVar), sVar, ((i21 >> 3) & 57344) | 806879232, 32128);
                r rVarH3 = d0.n.h(j0.r.f35391a.a(oVar, z1.c.K), ((s1) sVar.j(c3Var)).f31033p, f0.f28556b);
                q0 q0VarD3 = j0.o.d(jVar, false);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, rVarH3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, q0VarD3, sVar);
                t.J(hVar3, q1VarL3, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                t.J(hVar5, rVarC3, sVar);
                ua.b(w4.c.f(note.length(), "/200"), null, j11, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131058);
                sVar = sVar;
                sVar.p(true);
                sVar.p(true);
                aVar6 = aVar9;
                rVar2 = oVar;
                aVar5 = aVar8;
                z15 = z211;
            } else {
                sVar.W();
                rVar2 = rVar;
                aVar5 = aVar3;
                aVar6 = aVar4;
                z15 = z13;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new in.g(note, onNoteChange, rVar2, z11, z15, aVar5, aVar6, i11, i12);
            }
        }
        i21 |= 196608;
        z13 = z12;
        i14 = i12 & 64;
        if (i14 != 0) {
            i21 |= 1572864;
            aVar3 = aVar;
            i15 = 16;
        } else {
            aVar3 = aVar;
            i15 = 16;
            if ((i11 & 1572864) == 0) {
                if (sVar.h(aVar3)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i21 |= i16;
            }
        }
        i17 = i12 & 128;
        if (i17 != 0) {
            i21 |= 12582912;
            aVar4 = aVar2;
        } else {
            aVar4 = aVar2;
            if ((i11 & 12582912) == 0) {
                if (sVar.h(aVar4)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i21 |= i18;
            }
        }
        if ((i21 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (sVar.T(i21 & 1, z14)) {
            if (i22 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            gVar = l1.m.f39353a;
            if (i14 != 0) {
                objQ8 = sVar.Q();
                if (objQ8 == gVar) {
                    objQ8 = new ju.d(25);
                    sVar.o0(objQ8);
                }
                aVar3 = (fz.a) objQ8;
            }
            if (i17 != 0) {
                objQ7 = sVar.Q();
                if (objQ7 == gVar) {
                    objQ7 = new ju.d(25);
                    sVar.o0(objQ7);
                }
                aVar7 = (fz.a) objQ7;
            } else {
                aVar7 = aVar4;
            }
            float f11 = 10;
            r0.e eVarD2 = r0.f.d(f11);
            objQ = sVar.Q();
            if (objQ == gVar) {
                objQ = new e2.v();
                sVar.o0(objQ);
            }
            vVar = (e2.v) objQ;
            lVar = (e2.l) sVar.j(g1.f58548i);
            i2Var = (z2.i2) sVar.j(g1.f58554p);
            WeakHashMap weakHashMap2 = o2.f35353v;
            if (j0.b.e(sVar).f35356c.e().f48796d > 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1Var = (b1) objQ2;
            objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                int length2 = note.length();
                objQ3 = t.B(new w(note, j3.t.b(length2, length2), 4));
                sVar.o0(objQ3);
            }
            b1Var2 = (b1) objQ3;
            if (note.length() >= 200) {
                sVar.d0(-762962035);
                jC = ((s1) sVar.j(v1.f31180a)).f31040w;
                sVar.p(false);
            } else if (note.length() >= ((int) (200 * 0.9f))) {
                sVar.d0(-762959118);
                jC = x.c(((s1) sVar.j(v1.f31180a)).f31040w, 0.8f);
                sVar.p(false);
            } else {
                sVar.d0(-762957416);
                jC = ((s1) sVar.j(v1.f31180a)).f31036s;
                sVar.p(false);
            }
            long j12 = jC;
            if ((i21 & 14) == 4) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ4 = sVar.Q();
            if (z18) {
                objQ4 = new k(note, b1Var2, null, 0);
                sVar.o0(objQ4);
            } else {
                objQ4 = new k(note, b1Var2, null, 0);
                sVar.o0(objQ4);
            }
            t.f((fz.e) objQ4, note, sVar);
            Boolean boolValueOf4 = Boolean.valueOf(z11);
            if ((i21 & 57344) == 16384) {
                z19 = true;
            } else {
                z19 = false;
            }
            zF = z19 | sVar.f(i2Var);
            Object objQ10 = sVar.Q();
            if (zF) {
                i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                j0Var = new bh.j0(z11, vVar, i2Var, (vy.d) null, 8);
                sVar.o0(j0Var);
            } else {
                i19 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                j0Var = new bh.j0(z11, vVar, i2Var, (vy.d) null, 8);
                sVar.o0(j0Var);
            }
            t.f((fz.e) j0Var, boolValueOf4, sVar);
            Boolean boolValueOf5 = Boolean.valueOf(z17);
            Boolean boolValueOf6 = Boolean.valueOf(z16);
            if ((i21 & 458752) == i19) {
                z20 = true;
            } else {
                z20 = false;
            }
            boolean zG2 = z20 | sVar.g(z17) | sVar.h(lVar);
            z21 = z17;
            if ((29360128 & i21) == 8388608) {
                z22 = true;
            } else {
                z22 = false;
            }
            z23 = z22 | zG2;
            objQ5 = sVar.Q();
            if (z23) {
                objQ5 = new a8(z16, z21, lVar, aVar7, b1Var, (vy.d) null);
                sVar.o0(objQ5);
            } else {
                objQ5 = new a8(z16, z21, lVar, aVar7, b1Var, (vy.d) null);
                sVar.o0(objQ5);
            }
            t.g(boolValueOf5, boolValueOf6, (fz.e) objQ5, sVar);
            oVar = o.f58481a;
            c3 c3Var2 = v1.f31180a;
            r rVarH4 = d0.n.h(d0.n.j(e2.h(e2.e(oVar, 1.0f), 144, AchievementLevelType.DAY_STREAK_LV_8), 1, ((s1) sVar.j(c3Var2)).A, eVarD2), ((s1) sVar.j(c3Var2)).f31033p, eVarD2);
            if (z16) {
                z24 = false;
                rVarO = d0.n.o(oVar, false, null, aVar3, 15);
            } else {
                z24 = false;
                rVarO = oVar;
            }
            r rVarB2 = j0.c.B(rVarH4.i(rVarO), f11, f11);
            z1.j jVar2 = z1.c.f58463a;
            q0 q0VarD4 = j0.o.d(jVar2, z24);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarB2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar6 = y2.j.f56917f;
            t.J(hVar6, q0VarD4, sVar);
            y2.h hVar7 = y2.j.f56916e;
            t.J(hVar7, q1VarL4, sVar);
            hVar = y2.j.f56918g;
            fz.a aVar10 = aVar7;
            if (sVar.S) {
                aVar8 = aVar3;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                }
                y2.h hVar8 = y2.j.f56915d;
                t.J(hVar8, rVarC4, sVar);
                w wVar3 = (w) b1Var2.getValue();
                r rVarJ3 = e2.d.j(j0.c.E(e2.h(e2.e(oVar, 1.0f), 122, 158), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 22, 7), vVar);
                boolean z212 = !z16;
                y0 y0VarA3 = y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(c3Var2)).f31034q, j3.A(i15), null, null, null, 0L, null, null, 0, 0, j3.A(22), null, 16646140);
                r0 r0Var3 = new r0(0, 1, 119);
                if ((i21 & 112) == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if ((i21 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = z25 | z26;
                objQ6 = sVar.Q();
                if (z27) {
                    onNoteChange = cVar;
                    objQ6 = new y3(onNoteChange, b1Var2, 4);
                    sVar.o0(objQ6);
                } else {
                    onNoteChange = cVar;
                    objQ6 = new y3(onNoteChange, b1Var2, 4);
                    sVar.o0(objQ6);
                }
                note = str;
                boolean z213 = z16;
                s0.l.b(wVar3, (fz.c) objQ6, rVarJ3, z212, z213, y0VarA3, r0Var3, null, false, 8, 0, null, null, null, null, t1.e.d(1692488805, new a0(note, 11), sVar), sVar, ((i21 >> 3) & 57344) | 806879232, 32128);
                r rVarH5 = d0.n.h(j0.r.f35391a.a(oVar, z1.c.K), ((s1) sVar.j(c3Var2)).f31033p, f0.f28556b);
                q0 q0VarD5 = j0.o.d(jVar2, false);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, rVarH5);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar6, q0VarD5, sVar);
                t.J(hVar7, q1VarL5, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                t.J(hVar8, rVarC5, sVar);
                ua.b(w4.c.f(note.length(), "/200"), null, j12, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131058);
                sVar = sVar;
                sVar.p(true);
                sVar.p(true);
                aVar6 = aVar10;
                rVar2 = oVar;
                aVar5 = aVar8;
                z15 = z213;
            } else {
                aVar8 = aVar3;
            }
            defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            y2.h hVar9 = y2.j.f56915d;
            t.J(hVar9, rVarC4, sVar);
            w wVar4 = (w) b1Var2.getValue();
            r rVarJ4 = e2.d.j(j0.c.E(e2.h(e2.e(oVar, 1.0f), 122, 158), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 22, 7), vVar);
            boolean z214 = !z16;
            y0 y0VarA4 = y0.a((y0) sVar.j(ua.f31167a), ((s1) sVar.j(c3Var2)).f31034q, j3.A(i15), null, null, null, 0L, null, null, 0, 0, j3.A(22), null, 16646140);
            r0 r0Var4 = new r0(0, 1, 119);
            if ((i21 & 112) == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            if ((i21 & 896) == 256) {
                z26 = true;
            } else {
                z26 = false;
            }
            z27 = z25 | z26;
            objQ6 = sVar.Q();
            if (z27) {
                onNoteChange = cVar;
                objQ6 = new y3(onNoteChange, b1Var2, 4);
                sVar.o0(objQ6);
            } else {
                onNoteChange = cVar;
                objQ6 = new y3(onNoteChange, b1Var2, 4);
                sVar.o0(objQ6);
            }
            note = str;
            boolean z215 = z16;
            s0.l.b(wVar4, (fz.c) objQ6, rVarJ4, z214, z215, y0VarA4, r0Var4, null, false, 8, 0, null, null, null, null, t1.e.d(1692488805, new a0(note, 11), sVar), sVar, ((i21 >> 3) & 57344) | 806879232, 32128);
            r rVarH6 = d0.n.h(j0.r.f35391a.a(oVar, z1.c.K), ((s1) sVar.j(c3Var2)).f31033p, f0.f28556b);
            q0 q0VarD6 = j0.o.d(jVar2, false);
            iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL6 = sVar.l();
            r rVarC6 = z1.a.c(sVar, rVarH6);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar6, q0VarD6, sVar);
            t.J(hVar7, q1VarL6, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
            }
            t.J(hVar9, rVarC6, sVar);
            ua.b(w4.c.f(note.length(), "/200"), null, j12, j3.A(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 3072, 0, 131058);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
            aVar6 = aVar10;
            rVar2 = oVar;
            aVar5 = aVar8;
            z15 = z215;
        } else {
            sVar.W();
            rVar2 = rVar;
            aVar5 = aVar3;
            aVar6 = aVar4;
            z15 = z13;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new in.g(note, onNoteChange, rVar2, z11, z15, aVar5, aVar6, i11, i12);
        }
    }

    public static final void h(CourseWord courseWord, String str, r rVar, n nVar, int i11) {
        r rVar2;
        o oVar;
        boolean z11;
        s sVar = (s) nVar;
        sVar.f0(-2122473701);
        int i12 = i11 | (sVar.h(courseWord) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | 384;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            o oVar2 = o.f58481a;
            r rVarE = e2.e(oVar2, 1.0f);
            z1.i iVar = z1.c.M;
            j0.b bVar = j0.i.f35303a;
            a2 a2VarA = z1.a(bVar, iVar, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, a2VarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            ry.r rVar3 = ry.r.f50854a;
            List listK = ns.o.K(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, rVar3, rVar3, null, null, null, 0, -1, 60, null));
            y0 y0Var = (y0) sVar.j(ua.f31167a);
            long jA = j3.A(20);
            n3.s sVar2 = n3.s.H;
            c3 c3Var = v1.f31180a;
            y0 y0VarA = y0.a(y0Var, ((s1) sVar.j(c3Var)).f31034q, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            d4.a(listK, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, false, false, y0VarA, bVar, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar, 1575936, 0, 0, 4194196);
            sVar = sVar;
            if (q.K0(str)) {
                oVar = oVar2;
                z11 = false;
                sVar.d0(-1403045693);
            } else {
                sVar.d0(-1379385253);
                j0.c.g(sVar, e2.s(oVar2, 12));
                long j11 = ((s1) sVar.j(c3Var)).f31036s;
                long jA2 = j3.A(16);
                long jA3 = j3.A(22);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                oVar = oVar2;
                ua.b(str, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j11, jA2, null, null, null, 0L, new u3.k(6), jA3, 0, false, 0, 0, null, sVar, ((i12 >> 3) & 14) | 3072, 6, 129520);
                sVar = sVar;
                z11 = false;
            }
            sVar.p(z11);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e((Object) courseWord, str, (Object) rVar2, i11, 14);
        }
    }
}
