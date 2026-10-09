package v10;

import a0.o0;
import a2.l;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c6.j;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.stkouyu.util.httputil.Consts;
import d0.i;
import f0.h1;
import f0.t0;
import g2.c0;
import h1.g6;
import hh.p0;
import j0.h;
import j0.t1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import jt.i0;
import k6.p;
import k6.q;
import km.n0;
import kotlin.NoWhenBranchMatchedException;
import l0.w;
import l1.b1;
import l1.b3;
import l1.d2;
import l1.g;
import l1.k1;
import l1.n;
import l1.s;
import l1.t;
import l1.v;
import l1.x1;
import l2.e;
import m6.u;
import n0.e1;
import n0.f0;
import n0.r0;
import ns.o;
import nz.m;
import pr.z;
import rz.b0;
import rz.e0;
import rz.z1;
import ue.f;
import uz.i1;
import uz.x0;
import w2.a0;
import w2.x;
import z1.r;
import z2.g1;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f53472a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f53473b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f53474c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f53475d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f53476e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f53477f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f53478g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f53479h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f53480i;

    public static boolean A() {
        if (Build.VERSION.SDK_INT >= 29) {
            return pa.a.c();
        }
        try {
            if (f53474c == null) {
                f53473b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f53474c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f53474c.invoke(null, Long.valueOf(f53473b))).booleanValue();
        } catch (Exception e8) {
            y(e8);
            return false;
        }
    }

    public static m B(fz.e eVar) {
        m mVar = new m();
        mVar.f44337d = f.o(eVar, mVar, mVar);
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9 A[LOOP:0: B:25:0x00a3->B:27:0x00a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:21:0x0089). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object C(java.util.List r17, bh.g r18, xy.c r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v10.c.C(java.util.List, bh.g, xy.c):java.lang.Object");
    }

    public static final x0.f D(fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        View view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
        boolean zF = sVar.f(view);
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (zF || objQ == gVar) {
            objQ = new x0.f(view, null, aVar);
            sVar.o0(objQ);
        }
        x0.f fVar = (x0.f) objQ;
        boolean zH = sVar.h(fVar);
        Object objQ2 = sVar.Q();
        if (zH || objQ2 == gVar) {
            objQ2 = new x0.a(fVar, 3);
            sVar.o0(objQ2);
        }
        t.c(fVar, (fz.c) objQ2, sVar);
        return fVar;
    }

    public static final void E(AchievementLanguage achievementLanguage, String str, ur.a eventTracker) {
        kotlin.jvm.internal.m.f(achievementLanguage, "<this>");
        kotlin.jvm.internal.m.f(eventTracker, "eventTracker");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F(TextView textView, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 27) {
            z6.c.q(textView, i11, i12);
        } else if (textView instanceof e5.b) {
            ((e5.b) textView).setAutoSizeTextTypeUniformWithConfiguration(5, i11, 1, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void G(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            z6.c.r(textView);
        } else if (textView instanceof e5.b) {
            ((e5.b) textView).setAutoSizeTextTypeWithDefaults(0);
        }
    }

    public static void H(TextView textView, int i11) {
        o.k(i11);
        if (Build.VERSION.SDK_INT >= 28) {
            l.C(textView, i11);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), i11 + i12, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void I(TextView textView, int i11) {
        o.k(i11);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i11 - i12);
        }
    }

    public static void J(TextView textView, int i11) {
        o.k(i11);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i11 != fontMetricsInt) {
            textView.setLineSpacing(i11 - fontMetricsInt, 1.0f);
        }
    }

    public static String L(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static ActionMode.Callback M(ActionMode.Callback callback) {
        return (!(callback instanceof e5.o) || Build.VERSION.SDK_INT < 26) ? callback : ((e5.o) callback).f24868a;
    }

    public static final f2.c N(x xVar) {
        f2.c cVarF = a0.f(xVar, true);
        long jD = xVar.D(cVarF.d());
        float f5 = cVarF.f26574c;
        float f11 = cVarF.f26575d;
        long jD2 = xVar.D((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        return new f2.c(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (jD2 >> 32)), Float.intBitsToFloat((int) (jD2 & 4294967295L)));
    }

    public static ActionMode.Callback O(ActionMode.Callback callback, TextView textView) {
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || i11 > 27 || (callback instanceof e5.o) || callback == null) ? callback : new e5.o(callback, textView);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0144  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x0199  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0266  */
    /* JADX WARN: Code duplicated, block: B:174:0x0278  */
    /* JADX WARN: Code duplicated, block: B:177:0x0297  */
    /* JADX WARN: Code duplicated, block: B:247:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:250:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:251:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:253:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:265:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:267:0x0412  */
    /* JADX WARN: Code duplicated, block: B:269:0x0460  */
    /* JADX WARN: Code duplicated, block: B:272:0x0472  */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x016d, please report this as an issue */
    public static final void a(final r rVar, w wVar, final t1 t1Var, final boolean z11, final t0 t0Var, final boolean z12, final i iVar, z1.d dVar, h hVar, z1.i iVar2, j0.f fVar, final fz.c cVar, n nVar, final int i11, final int i12, final int i13) {
        int i14;
        z1.d dVar2;
        int i15;
        boolean z13;
        w wVar2;
        s sVar;
        final h hVar2;
        final z1.i iVar3;
        final j0.f fVar2;
        x1 x1VarT;
        int i16;
        h hVar3;
        z1.i iVar4;
        j0.f fVar3;
        z1.i iVar5;
        int i17;
        b1 b1VarH;
        boolean z14;
        Object objQ;
        g gVar;
        mz.g gVar2;
        boolean z15;
        Object objQ2;
        Object objQ3;
        b0 b0Var;
        c0 c0Var;
        f0 f0Var;
        boolean zD;
        Object objQ4;
        int i18;
        mz.g gVar3;
        h hVar4;
        h1 h1Var;
        r rVarM;
        boolean zD2;
        Object objQ5;
        s sVar2 = (s) nVar;
        sVar2.f0(924924659);
        if ((i11 & 6) == 0) {
            i14 = (sVar2.f(rVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= sVar2.f(wVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= sVar2.f(t1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= sVar2.g(false) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar2.g(z11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i14 |= sVar2.f(t0Var) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= sVar2.g(z12) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= sVar2.f(iVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= 33554432;
        }
        int i19 = i13 & 512;
        if (i19 != 0) {
            i14 |= 805306368;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i11 & 805306368) == 0) {
                i14 |= sVar2.f(dVar2) ? 536870912 : 268435456;
            }
        }
        int i21 = i13 & 1024;
        if (i21 != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = i12 | (sVar2.f(hVar) ? 4 : 2);
        } else {
            i15 = i12;
        }
        int i22 = i13 & 2048;
        if (i22 != 0) {
            i15 |= 48;
        } else if ((i12 & 48) == 0) {
            i15 |= sVar2.f(iVar2) ? 32 : 16;
        }
        int i23 = i15;
        int i24 = i13 & 4096;
        if (i24 == 0) {
            if ((i12 & 384) == 0) {
                i23 |= sVar2.f(fVar) ? 256 : 128;
            }
            if ((i12 & 3072) == 0) {
                i23 |= sVar2.h(cVar) ? 2048 : 1024;
            }
            if ((i14 & 306783379) == 306783378 || (i23 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar2.T(i14 & 1, z13)) {
                sVar2.Y();
                if ((i11 & 1) != 0 || sVar2.C()) {
                    i16 = i14 & (-234881025);
                    if (i19 != 0) {
                        dVar2 = null;
                    }
                    if (i21 != 0) {
                        hVar3 = null;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i22 != 0) {
                        iVar4 = null;
                    } else {
                        iVar4 = iVar2;
                    }
                    if (i24 != 0) {
                        fVar3 = null;
                    } else {
                        fVar3 = fVar;
                    }
                    iVar5 = iVar4;
                } else {
                    sVar2.W();
                    i16 = i14 & (-234881025);
                    hVar3 = hVar;
                    i23 = i23;
                    dVar2 = dVar2;
                    iVar5 = iVar2;
                    fVar3 = fVar;
                }
                sVar2.q();
                i17 = i16 >> 3;
                int i25 = i17 & 14;
                int i26 = i25 | ((i23 >> 6) & 112);
                int i27 = i16;
                b1VarH = t.H(cVar, sVar2);
                int i28 = i23;
                z14 = (((i26 & 14) ^ 6) <= 4 && sVar2.f(wVar)) || (i26 & 6) == 4;
                objQ = sVar2.Q();
                gVar = l1.m.f39353a;
                if (z14 || objQ == gVar) {
                    l0.c cVar2 = new l0.c();
                    cVar2.f39101a = new l1.h1(Integer.MAX_VALUE);
                    cVar2.f39102b = new l1.h1(Integer.MAX_VALUE);
                    g gVar4 = g.f39301e;
                    objQ = new g6(0, 2, b3.class, t.t(new androidx.lifecycle.compose.a(t.t(new i0(17, b1VarH), gVar4), wVar, cVar2, 21), gVar4), "value", "getValue()Ljava/lang/Object;");
                    sVar2.o0(objQ);
                }
                gVar2 = (mz.g) objQ;
                int i29 = i27 >> 9;
                int i30 = i25 | (i29 & 112);
                z15 = ((((i30 & 112) ^ 48) <= 32 && sVar2.g(z11)) || (i30 & 48) == 32) | ((((i30 & 14) ^ 6) <= 4 && sVar2.f(wVar)) || (i30 & 6) == 4);
                objQ2 = sVar2.Q();
                if (z15 || objQ2 == gVar) {
                    objQ2 = new l0.d(wVar, z11, 0);
                    sVar2.o0(objQ2);
                }
                r0 r0Var = (r0) objQ2;
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = t.q(sVar2);
                    sVar2.o0(objQ3);
                }
                b0Var = (b0) objQ3;
                c0Var = (c0) sVar2.j(g1.f58546g);
                f0Var = ((Boolean) sVar2.j(g1.f58560v)).booleanValue() ? null : e1.f42938a;
                int i31 = i28 << 18;
                int i32 = (i27 & 65520) | (i29 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | ((i28 << 27) & 1879048192);
                zD = ((((i32 & 112) ^ 48) <= 32 && sVar2.f(wVar)) || (i32 & 48) == 32) | ((((i32 & 896) ^ 384) <= 256 && sVar2.f(t1Var)) || (i32 & 384) == 256) | ((((i32 & 7168) ^ 3072) <= 2048 && sVar2.g(false)) || (i32 & 3072) == 2048) | ((((57344 & i32) ^ 24576) <= 16384 && sVar2.g(z11)) || (i32 & 24576) == 16384) | sVar2.d(0) | ((((i32 & 3670016) ^ 1572864) <= 1048576 && sVar2.f(dVar2)) || (i32 & 1572864) == 1048576) | ((((i32 & 29360128) ^ 12582912) <= 8388608 && sVar2.f(iVar5)) || (i32 & 12582912) == 8388608) | ((((i32 & 234881024) ^ 100663296) <= 67108864 && sVar2.f(fVar3)) || (i32 & 100663296) == 67108864) | ((((i32 & 1879048192) ^ 805306368) <= 536870912 && sVar2.f(hVar3)) || (i32 & 805306368) == 536870912) | sVar2.f(c0Var) | sVar2.f(f0Var);
                objQ4 = sVar2.Q();
                if (!zD || objQ4 == gVar) {
                    sVar = sVar2;
                    i18 = 4;
                    h hVar5 = hVar3;
                    objQ4 = new l0.m(wVar, z11, t1Var, gVar2, hVar5, fVar3, b0Var, c0Var, f0Var, dVar2, iVar5);
                    gVar3 = gVar2;
                    hVar4 = hVar5;
                    sVar.o0(objQ4);
                } else {
                    gVar3 = gVar2;
                    hVar4 = hVar3;
                    sVar = sVar2;
                    i18 = 4;
                }
                n0.c0 c0Var2 = (n0.c0) objQ4;
                if (z11) {
                    h1Var = h1.Vertical;
                } else {
                    h1Var = h1.Horizontal;
                }
                if (z12) {
                    sVar.d0(-2077085864);
                    zD2 = ((((i17 & 14) ^ 6) <= i18 && sVar.f(wVar)) || (i17 & 6) == i18) | sVar.d(0);
                    objQ5 = sVar.Q();
                    if (zD2 || objQ5 == gVar) {
                        objQ5 = new l0.e(wVar);
                        sVar.o0(objQ5);
                    }
                    rVarM = n0.l.m((l0.e) objQ5, wVar.f39215o, h1Var);
                    sVar.p(false);
                } else {
                    sVar.d0(-2076657041);
                    sVar.p(false);
                    rVarM = z1.o.f58481a;
                }
                wVar2 = wVar;
                n0.l.a(gVar3, d0.n.w(n0.l.n(rVar.i(wVar.f39213l).i(wVar.m), gVar3, r0Var, h1Var, z12).i(rVarM).i(wVar.f39214n.f43017i), wVar, h1Var, z12, t0Var, wVar.f39208g, false, iVar, null), wVar2.f39216p, c0Var2, sVar, 0);
                hVar2 = hVar4;
                iVar3 = iVar5;
                fVar2 = fVar3;
            } else {
                wVar2 = wVar;
                sVar = sVar2;
                sVar.W();
                hVar2 = hVar;
                iVar3 = iVar2;
                fVar2 = fVar;
                dVar2 = dVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final w wVar3 = wVar2;
                final z1.d dVar3 = dVar2;
                x1VarT.f39502d = new fz.e() { // from class: l0.k
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i11 | 1);
                        int iM2 = l1.t.M(i12);
                        v10.c.a(rVar, wVar3, t1Var, z11, t0Var, z12, iVar, dVar3, hVar2, iVar3, fVar2, cVar, (l1.n) obj, iM, iM2, i13);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i23 |= 384;
        if ((i12 & 3072) == 0) {
            i23 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        if ((i14 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (sVar2.T(i14 & 1, z13)) {
            sVar2.Y();
            if ((i11 & 1) != 0) {
                i16 = i14 & (-234881025);
                if (i19 != 0) {
                    dVar2 = null;
                }
                if (i21 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (i22 != 0) {
                    iVar4 = null;
                } else {
                    iVar4 = iVar2;
                }
                if (i24 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar;
                }
                iVar5 = iVar4;
            } else {
                i16 = i14 & (-234881025);
                if (i19 != 0) {
                    dVar2 = null;
                }
                if (i21 != 0) {
                    hVar3 = null;
                } else {
                    hVar3 = hVar;
                }
                if (i22 != 0) {
                    iVar4 = null;
                } else {
                    iVar4 = iVar2;
                }
                if (i24 != 0) {
                    fVar3 = null;
                } else {
                    fVar3 = fVar;
                }
                iVar5 = iVar4;
            }
            sVar2.q();
            i17 = i16 >> 3;
            int i210 = i17 & 14;
            int i211 = i210 | ((i23 >> 6) & 112);
            int i212 = i16;
            b1VarH = t.H(cVar, sVar2);
            int i213 = i23;
            if (((i211 & 14) ^ 6) <= 4) {
            }
            objQ = sVar2.Q();
            gVar = l1.m.f39353a;
            if (z14) {
                l0.c cVar3 = new l0.c();
                cVar3.f39101a = new l1.h1(Integer.MAX_VALUE);
                cVar3.f39102b = new l1.h1(Integer.MAX_VALUE);
                g gVar5 = g.f39301e;
                objQ = new g6(0, 2, b3.class, t.t(new androidx.lifecycle.compose.a(t.t(new i0(17, b1VarH), gVar5), wVar, cVar3, 21), gVar5), "value", "getValue()Ljava/lang/Object;");
                sVar2.o0(objQ);
            } else {
                l0.c cVar4 = new l0.c();
                cVar4.f39101a = new l1.h1(Integer.MAX_VALUE);
                cVar4.f39102b = new l1.h1(Integer.MAX_VALUE);
                g gVar6 = g.f39301e;
                objQ = new g6(0, 2, b3.class, t.t(new androidx.lifecycle.compose.a(t.t(new i0(17, b1VarH), gVar6), wVar, cVar4, 21), gVar6), "value", "getValue()Ljava/lang/Object;");
                sVar2.o0(objQ);
            }
            gVar2 = (mz.g) objQ;
            int i214 = i212 >> 9;
            int i33 = i210 | (i214 & 112);
            z15 = ((((i33 & 112) ^ 48) <= 32 && sVar2.g(z11)) || (i33 & 48) == 32) | ((((i33 & 14) ^ 6) <= 4 && sVar2.f(wVar)) || (i33 & 6) == 4);
            objQ2 = sVar2.Q();
            if (z15) {
                objQ2 = new l0.d(wVar, z11, 0);
                sVar2.o0(objQ2);
            } else {
                objQ2 = new l0.d(wVar, z11, 0);
                sVar2.o0(objQ2);
            }
            r0 r0Var2 = (r0) objQ2;
            objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = t.q(sVar2);
                sVar2.o0(objQ3);
            }
            b0Var = (b0) objQ3;
            c0Var = (c0) sVar2.j(g1.f58546g);
            f0Var = ((Boolean) sVar2.j(g1.f58560v)).booleanValue() ? null : e1.f42938a;
            int i34 = i213 << 18;
            int i35 = (i212 & 65520) | (i214 & 3670016) | (i34 & 29360128) | (i34 & 234881024) | ((i213 << 27) & 1879048192);
            zD = ((((i35 & 112) ^ 48) <= 32 && sVar2.f(wVar)) || (i35 & 48) == 32) | ((((i35 & 896) ^ 384) <= 256 && sVar2.f(t1Var)) || (i35 & 384) == 256) | ((((i35 & 7168) ^ 3072) <= 2048 && sVar2.g(false)) || (i35 & 3072) == 2048) | ((((57344 & i35) ^ 24576) <= 16384 && sVar2.g(z11)) || (i35 & 24576) == 16384) | sVar2.d(0) | ((((i35 & 3670016) ^ 1572864) <= 1048576 && sVar2.f(dVar2)) || (i35 & 1572864) == 1048576) | ((((i35 & 29360128) ^ 12582912) <= 8388608 && sVar2.f(iVar5)) || (i35 & 12582912) == 8388608) | ((((i35 & 234881024) ^ 100663296) <= 67108864 && sVar2.f(fVar3)) || (i35 & 100663296) == 67108864) | ((((i35 & 1879048192) ^ 805306368) <= 536870912 && sVar2.f(hVar3)) || (i35 & 805306368) == 536870912) | sVar2.f(c0Var) | sVar2.f(f0Var);
            objQ4 = sVar2.Q();
            if (zD) {
                sVar = sVar2;
                i18 = 4;
                h hVar6 = hVar3;
                objQ4 = new l0.m(wVar, z11, t1Var, gVar2, hVar6, fVar3, b0Var, c0Var, f0Var, dVar2, iVar5);
                gVar3 = gVar2;
                hVar4 = hVar6;
                sVar.o0(objQ4);
            } else {
                sVar = sVar2;
                i18 = 4;
                h hVar7 = hVar3;
                objQ4 = new l0.m(wVar, z11, t1Var, gVar2, hVar7, fVar3, b0Var, c0Var, f0Var, dVar2, iVar5);
                gVar3 = gVar2;
                hVar4 = hVar7;
                sVar.o0(objQ4);
            }
            n0.c0 c0Var3 = (n0.c0) objQ4;
            if (z11) {
                h1Var = h1.Vertical;
            } else {
                h1Var = h1.Horizontal;
            }
            if (z12) {
                sVar.d0(-2077085864);
                zD2 = ((((i17 & 14) ^ 6) <= i18 && sVar.f(wVar)) || (i17 & 6) == i18) | sVar.d(0);
                objQ5 = sVar.Q();
                if (zD2) {
                    objQ5 = new l0.e(wVar);
                    sVar.o0(objQ5);
                } else {
                    objQ5 = new l0.e(wVar);
                    sVar.o0(objQ5);
                }
                rVarM = n0.l.m((l0.e) objQ5, wVar.f39215o, h1Var);
                sVar.p(false);
            } else {
                sVar.d0(-2076657041);
                sVar.p(false);
                rVarM = z1.o.f58481a;
            }
            wVar2 = wVar;
            n0.l.a(gVar3, d0.n.w(n0.l.n(rVar.i(wVar.f39213l).i(wVar.m), gVar3, r0Var2, h1Var, z12).i(rVarM).i(wVar.f39214n.f43017i), wVar, h1Var, z12, t0Var, wVar.f39208g, false, iVar, null), wVar2.f39216p, c0Var3, sVar, 0);
            hVar2 = hVar4;
            iVar3 = iVar5;
            fVar2 = fVar3;
        } else {
            wVar2 = wVar;
            sVar = sVar2;
            sVar.W();
            hVar2 = hVar;
            iVar3 = iVar2;
            fVar2 = fVar;
            dVar2 = dVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final w wVar4 = wVar2;
            final z1.d dVar4 = dVar2;
            x1VarT.f39502d = new fz.e() { // from class: l0.k
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    int iM2 = l1.t.M(i12);
                    v10.c.a(rVar, wVar4, t1Var, z11, t0Var, z12, iVar, dVar4, hVar2, iVar3, fVar2, cVar, (l1.n) obj, iM, iM2, i13);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void b(r rVar, t1.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(2064964257);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            c(rVar, dVar, sVar, ((i12 << 3) & 896) | (i12 & 14) | 48);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x0.g(rVar, dVar, i11, 0);
        }
    }

    public static final void c(r rVar, t1.d dVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(771959668);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(null) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                k1 k1Var = new k1(null, g.f39300d);
                sVar.o0(k1Var);
                objQ = k1Var;
            }
            b1 b1Var = (b1) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new z(20, b1Var);
                sVar.o0(objQ2);
            }
            t.a(z0.f.f58419b.a(D((fz.a) objQ2, sVar, 0)), t1.e.d(-291176396, new tg.a(rVar, b1Var, dVar), sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x0.g(rVar, dVar, i11, 1);
        }
    }

    public static final void d(c6.l lVar, int i11, int i12, t1.d dVar, n nVar, int i13) {
        c6.l lVar2;
        s sVar = (s) nVar;
        sVar.f0(-1618370649);
        if (((i13 | 6 | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128)) & 1171) == 1170 && sVar.F()) {
            sVar.W();
            lVar2 = lVar;
        } else {
            p pVar = p.f37946a;
            sVar.e0(578571862);
            sVar.e0(-548224868);
            if (!(sVar.f39434a instanceof c6.b)) {
                t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(pVar);
            } else {
                sVar.r0();
            }
            k6.e eVar = k6.e.f37923t;
            j jVar = j.f6631a;
            t.J(eVar, jVar, sVar);
            t.J(k6.e.H, new k6.b(i12), sVar);
            t.J(k6.e.K, new k6.a(i11), sVar);
            dVar.invoke(k6.r.f37952a, sVar, 54);
            sVar.p(true);
            sVar.p(false);
            sVar.p(false);
            lVar2 = jVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(lVar2, i11, i12, dVar, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [l1.v] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [e6.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [l1.d2] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [rz.g1] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v6, types: [m6.f] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static final Object e(m6.w wVar, Context context, e6.l lVar, u uVar, m6.p pVar, xy.c cVar) throws Throwable {
        m6.r rVar;
        ?? r9;
        m6.f fVar;
        d2 d2Var;
        e6.l lVar2;
        z1 z1Var;
        Context context2;
        u uVar2;
        m6.w wVar2;
        d2 d2Var2;
        rz.g1 g1Var;
        m6.f fVar2;
        v vVar;
        l1.z zVar;
        l1.z zVar2;
        d2 d2Var3;
        int i11;
        ?? r11 = context;
        ?? r12 = lVar;
        if (cVar instanceof m6.r) {
            rVar = (m6.r) cVar;
            i11 = rVar.L;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                int i12 = i11 - Integer.MIN_VALUE;
                rVar.L = i12;
                r9 = i12;
            } else {
                rVar = new m6.r(cVar);
                r9 = i11;
            }
        } else {
            rVar = new m6.r(cVar);
            r9 = i11;
        }
        m6.r rVar2 = rVar;
        Object obj = rVar2.K;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        ?? r13 = rVar2.L;
        int i13 = 2;
        vy.d dVar = null;
        try {
            if (r13 != 0) {
                try {
                    if (r13 == 1) {
                        l1.z zVar3 = rVar2.H;
                        d2 d2Var4 = rVar2.f40924t;
                        z1 z1Var2 = rVar2.f40923f;
                        m6.f fVar3 = rVar2.f40922e;
                        u uVar3 = (u) rVar2.f40921d;
                        e6.l lVar3 = (e6.l) rVar2.f40920c;
                        Context context3 = (Context) rVar2.f40919b;
                        m6.w wVar3 = (m6.w) rVar2.f40918a;
                        com.bumptech.glide.e.F(obj);
                        fVar = fVar3;
                        d2Var = d2Var4;
                        lVar2 = lVar3;
                        z1Var = z1Var2;
                        context2 = context3;
                        uVar2 = uVar3;
                        wVar2 = wVar3;
                        zVar = zVar3;
                    } else {
                        if (r13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v vVar2 = (v) rVar2.f40921d;
                        d2Var2 = (d2) rVar2.f40920c;
                        g1Var = (rz.g1) rVar2.f40919b;
                        fVar2 = (m6.f) rVar2.f40918a;
                        com.bumptech.glide.e.F(obj);
                        vVar = vVar2;
                    }
                    vVar.dispose();
                    fVar2.a();
                    g1Var.cancel(null);
                    d2Var2.x();
                    return qy.b0.f48488a;
                } catch (Throwable th2) {
                    th = th2;
                    r13.dispose();
                    r9.a();
                    r11.cancel(null);
                    r12.x();
                    throw th;
                }
            }
            com.bumptech.glide.e.F(obj);
            fVar = new m6.f(wVar);
            z1 z1VarB = e0.B(wVar, null, null, new n0(i13, dVar, 3, false), 3);
            b0 b0Var = wVar.f40932a;
            r12.getClass();
            e6.k1 k1Var = new e6.k1(50);
            i1 i1VarC = x0.c(Boolean.FALSE);
            m6.q qVar = new m6.q(wVar, r12, r11);
            pVar.getClass();
            rz.h1 h1VarD = e0.d();
            rz.g1 g1Var2 = (rz.g1) b0Var.getCoroutineContext().get(rz.z.f50978b);
            if (g1Var2 != null) {
                g1Var2.invokeOnCompletion(new o0(h1VarD, 22));
            }
            d2 d2Var5 = new d2(b0Var.getCoroutineContext().plus(h1VarD).plus(qVar));
            l1.z zVar4 = new l1.z(d2Var5, new c6.b(k1Var));
            try {
                b0.g gVar = new b0.g(zVar4, (Object) r12, (Object) r11, d2Var5, wVar, (vy.d) null, 5);
                zVar2 = zVar4;
                d2Var3 = d2Var5;
                try {
                    e0.B(wVar, fVar, null, gVar, 2);
                    lVar2 = lVar;
                    try {
                        context2 = context;
                        wVar2 = wVar;
                        e0.B(wVar2, null, null, new f0.i0(d2Var3, lVar2, i1VarC, context, k1Var, wVar, uVar, null, 1), 3);
                        ju.e eVar = new ju.e(2, dVar);
                        rVar2.f40918a = wVar2;
                        rVar2.f40919b = context2;
                        rVar2.f40920c = lVar2;
                        uVar2 = uVar;
                        rVar2.f40921d = uVar2;
                        rVar2.f40922e = fVar;
                        z1Var = z1VarB;
                        try {
                            rVar2.f40923f = z1Var;
                            rVar2.f40924t = d2Var3;
                            rVar2.H = zVar2;
                            rVar2.L = 1;
                            if (x0.t(i1VarC, eVar, rVar2) != aVar) {
                                d2Var = d2Var3;
                                zVar = zVar2;
                            }
                            return aVar;
                        } catch (Throwable th3) {
                            th = th3;
                            r12 = d2Var3;
                            r11 = z1Var;
                            r13 = zVar2;
                            r9 = fVar;
                            r13.dispose();
                            r9.a();
                            r11.cancel(null);
                            r12.x();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z1Var = z1VarB;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z1Var = z1VarB;
                    r12 = d2Var3;
                    r11 = z1Var;
                    r13 = zVar2;
                    r9 = fVar;
                    r13.dispose();
                    r9.a();
                    r11.cancel(null);
                    r12.x();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                zVar2 = zVar4;
                d2Var3 = d2Var5;
            }
            a0.j jVar = new a0.j(wVar2, uVar2, fVar, 12);
            rVar2.f40918a = fVar;
            rVar2.f40919b = z1Var;
            rVar2.f40920c = d2Var;
            rVar2.f40921d = zVar;
            rVar2.f40922e = null;
            rVar2.f40923f = null;
            rVar2.f40924t = null;
            rVar2.H = null;
            rVar2.L = 2;
            if (lVar2.d(context2, jVar, rVar2) != aVar) {
                d2Var2 = d2Var;
                g1Var = z1Var;
                fVar2 = fVar;
                vVar = zVar;
                vVar.dispose();
                fVar2.a();
                g1Var.cancel(null);
                d2Var2.x();
                return qy.b0.f48488a;
            }
            return aVar;
        } catch (Throwable th7) {
            th = th7;
            r12 = d2Var;
            r11 = z1Var;
            r13 = zVar;
            r9 = fVar;
            r13.dispose();
            r9.a();
            r11.cancel(null);
            r12.x();
            throw th;
        }
    }

    public static String f(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(Base64.decode(str2, 0)));
        } catch (Exception e8) {
            e8.printStackTrace();
            return str2;
        }
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = s0.f58893a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = z4.r0.f58888d;
        z4.r0 r0Var = (z4.r0) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (r0Var == null) {
            r0Var = new z4.r0();
            r0Var.f58889a = null;
            r0Var.f58890b = null;
            r0Var.f58891c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, r0Var);
        }
        WeakReference weakReference2 = r0Var.f58891c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        r0Var.f58891c = new WeakReference(keyEvent);
        if (r0Var.f58890b == null) {
            r0Var.f58890b = new SparseArray();
        }
        SparseArray sparseArray = r0Var.f58890b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw p0.e(size, arrayList);
    }

    public static boolean h(z4.l lVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (lVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return lVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f53477f) {
                            try {
                                f53478g = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f53477f = true;
                        }
                        Method method = f53478g;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (s0.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f53479h) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f53480i = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f53479h = true;
                }
                Field field = f53480i;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (s0.d(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && s0.d(view, keyEvent)) || lVar.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static Typeface i(lc.d dVar, Integer num) {
        Context context = dVar.O;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num.intValue()});
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            Typeface typefaceA = null;
            if (resourceId == 0) {
                typedArrayObtainStyledAttributes.recycle();
                return null;
            }
            try {
                typefaceA = q4.j.a(context, resourceId);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            return typefaceA;
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    public static c j(int i11, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i11 = 2;
        }
        if (i11 == 0) {
            return new c4.i(dArr, dArr2);
        }
        if (i11 == 2) {
            double d5 = dArr[0];
            double[] dArr3 = dArr2[0];
            c4.c cVar = new c4.c();
            cVar.f6539j = d5;
            cVar.f6540k = dArr3;
            return cVar;
        }
        c4.h hVar = new c4.h();
        int length = dArr2[0].length;
        hVar.f6565l = new double[length];
        hVar.f6563j = dArr;
        hVar.f6564k = dArr2;
        if (length > 2) {
            double d11 = 0.0d;
            int i12 = 0;
            while (true) {
                double d12 = d11;
                if (i12 >= dArr.length) {
                    break;
                }
                double d13 = dArr2[i12][0];
                if (i12 > 0) {
                    Math.hypot(d13 - d11, d13 - d12);
                }
                i12++;
                d11 = d13;
            }
        }
        return hVar;
    }

    public static final int k(AchievementLanguage achievementLanguage) {
        kotlin.jvm.internal.m.f(achievementLanguage, "<this>");
        switch (rr.a.f49393a[achievementLanguage.getLanguage().ordinal()]) {
            case 1:
                return R.drawable.achievement_language_mal_active;
            case 2:
                return R.drawable.achievement_language_krup_active;
            case 3:
                return R.drawable.achievement_language_kr_active;
            case 4:
                return R.drawable.achievement_language_araup_active;
            case 5:
                return R.drawable.achievement_language_ara_active;
            case 6:
                return R.drawable.achievement_language_vt_active;
            case 7:
                return R.drawable.achievement_language_esocup_active;
            case 8:
                return R.drawable.achievement_language_esoc_active;
            case 9:
                return R.drawable.achievement_language_ptocup_active;
            case 10:
                return R.drawable.achievement_language_ptoc_active;
            case 11:
                return R.drawable.achievement_language_en_active;
            case 12:
                return R.drawable.achievement_language_thai_active;
            case 13:
                return R.drawable.achievement_language_pol_active;
            case 14:
                return R.drawable.achievement_language_frocup_active;
            case 15:
                return R.drawable.achievement_language_froc_active;
            case 16:
                return R.drawable.achievement_language_jpup_active;
            case 17:
                return R.drawable.achievement_language_jp_active;
            case 18:
                return R.drawable.achievement_language_frusup_active;
            case 19:
                return R.drawable.achievement_language_frus_active;
            case 20:
                return R.drawable.achievement_language_esusup_active;
            case 21:
                return R.drawable.achievement_language_esus_active;
            case 22:
                return R.drawable.achievement_language_itocup_active;
            case 23:
                return R.drawable.achievement_language_itoc_active;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return R.drawable.achievement_language_deocup_active;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return R.drawable.achievement_language_deoc_active;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return R.drawable.achievement_language_grk_active;
            case 27:
                return R.drawable.achievement_language_tur_active;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return R.drawable.achievement_language_idn_active;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return R.drawable.achievement_language_hindi_active;
            case 30:
                return R.drawable.achievement_language_ruocup_active;
            case 31:
                return R.drawable.achievement_language_ruoc_active;
            case Consts.SP /* 32 */:
                return R.drawable.achievement_language_ukr_active;
            case 33:
                return R.drawable.achievement_language_cnup_active;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return R.drawable.achievement_language_cn_active;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x000d, B:8:0x0013, B:15:0x0031, B:17:0x0037, B:24:0x0057, B:23:0x0054, B:14:0x002e, B:20:0x0050, B:11:0x002a), top: B:41:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0037, please report this as an issue */
    public static String l(Context context) {
        String str;
        if (se.m.a() == null) {
            synchronized (se.m.c()) {
                if (se.m.a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!qf.a.b(se.m.class)) {
                        try {
                            se.m.f51608f = string;
                        } catch (Throwable th2) {
                            qf.a.a(se.m.class, th2);
                        }
                        if (se.m.a() == null) {
                            str = "XZ" + UUID.randomUUID();
                            if (!qf.a.b(se.m.class)) {
                                se.m.f51608f = str;
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", se.m.a()).apply();
                        }
                    } else if (se.m.a() == null) {
                        str = "XZ" + UUID.randomUUID();
                        if (!qf.a.b(se.m.class)) {
                            try {
                                se.m.f51608f = str;
                            } catch (Throwable th3) {
                                qf.a.a(se.m.class, th3);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", se.m.a()).apply();
                    }
                }
            }
        }
        String strA = se.m.a();
        if (strA != null) {
            return strA;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String m(long j11) {
        return nv.p.m(j11, "cn-tone-f-", ".mp3");
    }

    public static final String n(long j11) {
        return defpackage.e.m(xt.b.a().c(), m(j11));
    }

    public static final String o(long j11) {
        return ep.a.e("https://res.lingodeer.com/mfsource/cn/main/alpha_f/", m(j11));
    }

    public static final List s(AchievementLanguage achievementLanguage) {
        kotlin.jvm.internal.m.f(achievementLanguage, "<this>");
        switch (rr.a.f49393a[achievementLanguage.getLanguage().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 18:
            case 19:
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return o.L(new g2.x(g2.x.c(g2.f0.e(4283397369L), 0.7f)), new g2.x(g2.f0.c(5207289)));
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
            case 27:
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return o.L(new g2.x(g2.x.c(g2.f0.e(4282822486L), 0.7f)), new g2.x(g2.f0.c(4632406)));
            case 6:
            case 7:
            case 8:
            case 12:
            case 14:
            case 15:
            case 20:
            case 21:
            case 22:
            case 23:
            case Service.METRICS_FIELD_NUMBER /* 24 */:
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
            case Consts.SP /* 32 */:
                return o.L(new g2.x(g2.x.c(g2.f0.e(4294935562L), 0.7f)), new g2.x(g2.f0.c(16745482)));
            case 13:
            case 16:
            case 17:
            case 30:
            case 31:
                return o.L(new g2.x(g2.x.c(g2.f0.e(4292946463L), 0.7f)), new g2.x(g2.f0.c(14756383)));
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
            case 33:
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return o.L(new g2.x(g2.x.c(g2.f0.e(4286213887L), 0.7f)), new g2.x(g2.f0.c(8023807)));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static x4.c v(AppCompatTextView appCompatTextView) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new x4.c(l.t(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i11 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z11 = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z11) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(l.j(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new x4.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void y(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean z() {
        try {
            return Class.forName("android.os.Looper").getDeclaredMethod("getMainLooper", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public abstract void K(Object obj, float f5);

    public abstract double p(double d5);

    public abstract void q(double d5, double[] dArr);

    public abstract void r(double d5, float[] fArr);

    public abstract double t(double d5);

    public abstract void u(double d5, double[] dArr);

    public abstract double[] w();

    public abstract float x(Object obj);
}
