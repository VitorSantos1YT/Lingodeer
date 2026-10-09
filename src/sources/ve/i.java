package ve;

import a0.c0;
import a0.c2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RemoteViews;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.drawerlayout.widget.ktFt.FpIL;
import b0.i1;
import b0.t2;
import bh.s;
import bt.l3;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import d0.s1;
import d1.v0;
import d1.z0;
import e6.q;
import f0.h1;
import fb.g0;
import g2.f0;
import hh.p0;
import j0.t1;
import j0.v1;
import j3.t0;
import j3.u0;
import j3.z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import l1.n;
import l1.x1;
import mt.l0;
import o0.p;
import o0.t;
import ob.u;
import qy.b0;
import rz.e0;
import rz.o0;
import s0.a1;
import s0.o1;
import s0.s0;
import se.v;
import w2.x;
import z1.o;
import z1.r;
import z2.g1;
import z4.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l2.e f54005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f54006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54007c;

    public i(String str, int i11) {
    }

    public static void B(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final boolean C(p6.g gVar) {
        boolean z11 = true;
        if (gVar instanceof p6.c) {
            return true;
        }
        if (!(m.a(gVar, p6.d.f46314a) ? true : m.a(gVar, p6.e.f46315a) ? true : m.a(gVar, p6.f.f46316a)) && gVar != null) {
            z11 = false;
        }
        if (z11) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object D(long j11, xy.c cVar) {
        yz.f fVar = o0.f50940a;
        return e0.M(yz.e.f58387a, new s(j11, null, 2), cVar);
    }

    public static final boolean E(z0 z0Var, boolean z11) {
        x xVarC;
        s0 s0Var = z0Var.f23040d;
        if (s0Var == null || (xVarC = s0Var.c()) == null) {
            return false;
        }
        f2.c cVarN = v10.c.N(xVarC);
        long jK = z0Var.k(z11);
        float f5 = cVarN.f26572a;
        float f11 = cVarN.f26574c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
        if (f5 > fIntBitsToFloat || fIntBitsToFloat > f11) {
            return false;
        }
        float f12 = cVarN.f26573b;
        float f13 = cVarN.f26575d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & 4294967295L));
        return f12 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f13;
    }

    public static void G(j4.b bVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + bVar.f35839b;
        try {
            int i11 = g4.a.f28738a[bVar.f35840c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z11 = true;
            switch (i11) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iM = (m((int) (fArr[3] * 255.0f)) << 24) | (m((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iM);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((m((int) (fArr[3] * 255.0f)) << 24) | (m((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + bVar.f35839b);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z11 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z11));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            g0.t(view);
        } catch (NoSuchMethodException unused2) {
            g0.t(view);
        } catch (InvocationTargetException unused3) {
            g0.t(view);
        }
    }

    public static final void H(String titleString, l.m context, View viewParent) {
        m.f(titleString, "titleString");
        m.f(context, "context");
        m.f(viewParent, "viewParent");
        View viewFindViewById = viewParent.findViewById(R.id.toolbar);
        m.e(viewFindViewById, "findViewById(...)");
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setTitle(titleString);
        context.setSupportActionBar(toolbar);
        l.a supportActionBar = context.getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(context, 1));
    }

    public static void I(int i11, ji.b bVar) {
        String string = bVar.getResources().getString(i11);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) bVar.findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        bVar.setSupportActionBar(toolbar);
        l.a supportActionBar = bVar.getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(bVar, 0));
    }

    public static void J(EditText editText) {
        editText.requestFocus();
        ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0111  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:89:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:96:0x0208  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void d(final t tVar, r rVar, t1 t1Var, o0.f fVar, float f5, z1.i iVar, g0.g gVar, boolean z11, r2.a aVar, g0.l lVar, d0.i iVar2, final t1.d dVar, n nVar, final int i11, final int i12) {
        int i13;
        r rVar2;
        int i14;
        t1 t1Var2;
        int i15;
        int i16;
        int i17;
        boolean z12;
        int i18;
        int i19;
        boolean z13;
        final o0.f fVar2;
        final float f11;
        final g0.g gVar2;
        final r2.a aVar2;
        final d0.i iVar3;
        final r rVar3;
        final t1 t1Var3;
        final boolean z14;
        final z1.i iVar4;
        final g0.l lVar2;
        x1 x1VarT;
        r rVar4;
        t1 v1Var;
        p pVar;
        b0.x xVarA;
        i1 i1VarQ;
        v3.m mVar;
        boolean zF;
        Object objQ;
        int i21;
        h1 h1Var;
        boolean z15;
        Object objQ2;
        g0.l lVar3;
        g0.g gVar3;
        r rVar5;
        boolean z16;
        z1.i iVar5;
        o0.f fVar3;
        t1 t1Var4;
        float f12;
        d0.i iVar6;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1860873769);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 384) == 0) {
                    t1Var2 = t1Var;
                    if (sVar.f(t1Var2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = 1797120 | i13;
                if ((12582912 & i11) == 0) {
                    i16 = 5991424 | i13;
                }
                i17 = i12 & 256;
                if (i17 != 0) {
                    if ((100663296 & i11) == 0) {
                        z12 = z11;
                        if (sVar.g(z12)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                        i16 |= i18;
                    }
                    i19 = i16 | 805306368;
                    if ((306783379 & i19) == 306783378) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (sVar.T(i19 & 1, z13)) {
                        sVar.Y();
                        if ((i11 & 1) != 0 || sVar.C()) {
                            if (i22 != 0) {
                                rVar4 = o.f58481a;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i14 != 0) {
                                float f13 = 0;
                                v1Var = new v1(f13, f13, f13, f13);
                            } else {
                                v1Var = t1Var2;
                            }
                            float f14 = 0;
                            z1.i iVar7 = z1.c.M;
                            int i23 = (i19 & 14) | 196608;
                            pVar = new p();
                            xVarA = c2.a(sVar);
                            Object obj = t2.f3682a;
                            i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
                            mVar = (v3.m) sVar.j(g1.f58552n);
                            zF = sVar.f(cVar) | ((((i23 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i23 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                            objQ = sVar.Q();
                            l1.g gVar4 = l1.m.f39353a;
                            if (zF || objQ == gVar4) {
                                u uVar = new u(tVar, new at.p(25, tVar, mVar), pVar);
                                float f15 = g0.k.f28354a;
                                g0.g gVar5 = new g0.g(uVar, xVarA, i1VarQ);
                                sVar.o0(gVar5);
                                objQ = gVar5;
                            }
                            g0.g gVar6 = (g0.g) objQ;
                            i21 = i19 & (-29360129);
                            if (i17 != 0) {
                                z12 = true;
                            }
                            h1Var = h1.Horizontal;
                            int i24 = (i19 & 14) | 432;
                            z15 = (((i24 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i24 & 6) == 4;
                            objQ2 = sVar.Q();
                            if (z15 || objQ2 == gVar4) {
                                objQ2 = new o0.a(tVar, h1Var);
                                sVar.o0(objQ2);
                            }
                            o0.a aVar3 = (o0.a) objQ2;
                            d0.i iVarA = s1.a(sVar);
                            o0.f fVar4 = o0.f.f44373a;
                            lVar3 = g0.l.f28355a;
                            gVar3 = gVar6;
                            rVar5 = rVar4;
                            z16 = z12;
                            iVar5 = iVar7;
                            fVar3 = fVar4;
                            aVar2 = aVar3;
                            t1Var4 = v1Var;
                            f12 = f14;
                            iVar6 = iVarA;
                        } else {
                            sVar.W();
                            i21 = i19 & (-29360129);
                            f12 = f5;
                            gVar3 = gVar;
                            aVar2 = aVar;
                            lVar3 = lVar;
                            rVar5 = rVar2;
                            t1Var4 = t1Var2;
                            z16 = z12;
                            fVar3 = fVar;
                            iVar5 = iVar;
                            iVar6 = iVar2;
                        }
                        sVar.q();
                        int i25 = i21 >> 6;
                        int i26 = i21 << 12;
                        vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i25 & 3670016) | (i26 & 234881024) | (i26 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i25 & 57344));
                        float f16 = f12;
                        gVar2 = gVar3;
                        fVar2 = fVar3;
                        z14 = z16;
                        f11 = f16;
                        g0.l lVar4 = lVar3;
                        iVar3 = iVar6;
                        iVar4 = iVar5;
                        lVar2 = lVar4;
                        t1Var3 = t1Var4;
                        rVar3 = rVar5;
                    } else {
                        sVar.W();
                        fVar2 = fVar;
                        f11 = f5;
                        gVar2 = gVar;
                        aVar2 = aVar;
                        iVar3 = iVar2;
                        rVar3 = rVar2;
                        t1Var3 = t1Var2;
                        z14 = z12;
                        iVar4 = iVar;
                        lVar2 = lVar;
                    }
                    x1VarT = sVar.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: o0.j
                            @Override // fz.e
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int iM = l1.t.M(i11 | 1);
                                ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj2, iM, i12);
                                return b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 100663296;
                z12 = z11;
                i19 = i16 | 805306368;
                if ((306783379 & i19) == 306783378) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (sVar.T(i19 & 1, z13)) {
                    sVar.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            float f17 = 0;
                            v1Var = new v1(f17, f17, f17, f17);
                        } else {
                            v1Var = t1Var2;
                        }
                        float f18 = 0;
                        z1.i iVar8 = z1.c.M;
                        int i27 = (i19 & 14) | 196608;
                        pVar = new p();
                        xVarA = c2.a(sVar);
                        Object obj2 = t2.f3682a;
                        i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                        v3.c cVar2 = (v3.c) sVar.j(g1.f58547h);
                        mVar = (v3.m) sVar.j(g1.f58552n);
                        zF = sVar.f(cVar2) | ((((i27 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i27 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                        objQ = sVar.Q();
                        l1.g gVar7 = l1.m.f39353a;
                        if (zF) {
                            u uVar2 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f19 = g0.k.f28354a;
                            g0.g gVar8 = new g0.g(uVar2, xVarA, i1VarQ);
                            sVar.o0(gVar8);
                            objQ = gVar8;
                        } else {
                            u uVar3 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f110 = g0.k.f28354a;
                            g0.g gVar9 = new g0.g(uVar3, xVarA, i1VarQ);
                            sVar.o0(gVar9);
                            objQ = gVar9;
                        }
                        g0.g gVar10 = (g0.g) objQ;
                        i21 = i19 & (-29360129);
                        if (i17 != 0) {
                            z12 = true;
                        }
                        h1Var = h1.Horizontal;
                        int i28 = (i19 & 14) | 432;
                        if (((i28 & 14) ^ 6) <= 4) {
                        }
                        objQ2 = sVar.Q();
                        if (z15) {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        }
                        o0.a aVar4 = (o0.a) objQ2;
                        d0.i iVarA2 = s1.a(sVar);
                        o0.f fVar5 = o0.f.f44373a;
                        lVar3 = g0.l.f28355a;
                        gVar3 = gVar10;
                        rVar5 = rVar4;
                        z16 = z12;
                        iVar5 = iVar8;
                        fVar3 = fVar5;
                        aVar2 = aVar4;
                        t1Var4 = v1Var;
                        f12 = f18;
                        iVar6 = iVarA2;
                    } else {
                        if (i22 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            float f111 = 0;
                            v1Var = new v1(f111, f111, f111, f111);
                        } else {
                            v1Var = t1Var2;
                        }
                        float f112 = 0;
                        z1.i iVar9 = z1.c.M;
                        int i29 = (i19 & 14) | 196608;
                        pVar = new p();
                        xVarA = c2.a(sVar);
                        Object obj3 = t2.f3682a;
                        i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                        v3.c cVar3 = (v3.c) sVar.j(g1.f58547h);
                        mVar = (v3.m) sVar.j(g1.f58552n);
                        zF = sVar.f(cVar3) | ((((i29 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i29 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                        objQ = sVar.Q();
                        l1.g gVar11 = l1.m.f39353a;
                        if (zF) {
                            u uVar4 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f113 = g0.k.f28354a;
                            g0.g gVar12 = new g0.g(uVar4, xVarA, i1VarQ);
                            sVar.o0(gVar12);
                            objQ = gVar12;
                        } else {
                            u uVar5 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f114 = g0.k.f28354a;
                            g0.g gVar13 = new g0.g(uVar5, xVarA, i1VarQ);
                            sVar.o0(gVar13);
                            objQ = gVar13;
                        }
                        g0.g gVar14 = (g0.g) objQ;
                        i21 = i19 & (-29360129);
                        if (i17 != 0) {
                            z12 = true;
                        }
                        h1Var = h1.Horizontal;
                        int i210 = (i19 & 14) | 432;
                        if (((i210 & 14) ^ 6) <= 4) {
                        }
                        objQ2 = sVar.Q();
                        if (z15) {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        }
                        o0.a aVar5 = (o0.a) objQ2;
                        d0.i iVarA3 = s1.a(sVar);
                        o0.f fVar6 = o0.f.f44373a;
                        lVar3 = g0.l.f28355a;
                        gVar3 = gVar14;
                        rVar5 = rVar4;
                        z16 = z12;
                        iVar5 = iVar9;
                        fVar3 = fVar6;
                        aVar2 = aVar5;
                        t1Var4 = v1Var;
                        f12 = f112;
                        iVar6 = iVarA3;
                    }
                    sVar.q();
                    int i211 = i21 >> 6;
                    int i212 = i21 << 12;
                    vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i211 & 3670016) | (i212 & 234881024) | (i212 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i211 & 57344));
                    float f115 = f12;
                    gVar2 = gVar3;
                    fVar2 = fVar3;
                    z14 = z16;
                    f11 = f115;
                    g0.l lVar5 = lVar3;
                    iVar3 = iVar6;
                    iVar4 = iVar5;
                    lVar2 = lVar5;
                    t1Var3 = t1Var4;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    fVar2 = fVar;
                    f11 = f5;
                    gVar2 = gVar;
                    aVar2 = aVar;
                    iVar3 = iVar2;
                    rVar3 = rVar2;
                    t1Var3 = t1Var2;
                    z14 = z12;
                    iVar4 = iVar;
                    lVar2 = lVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: o0.j
                        @Override // fz.e
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            int iM = l1.t.M(i11 | 1);
                            ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj4, iM, i12);
                            return b0.f48488a;
                        }
                    };
                }
            }
            i13 |= 384;
            t1Var2 = t1Var;
            i16 = 1797120 | i13;
            if ((12582912 & i11) == 0) {
                i16 = 5991424 | i13;
            }
            i17 = i12 & 256;
            if (i17 != 0) {
                if ((100663296 & i11) == 0) {
                    z12 = z11;
                    if (sVar.g(z12)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 805306368;
                if ((306783379 & i19) == 306783378) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (sVar.T(i19 & 1, z13)) {
                    sVar.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            float f116 = 0;
                            v1Var = new v1(f116, f116, f116, f116);
                        } else {
                            v1Var = t1Var2;
                        }
                        float f117 = 0;
                        z1.i iVar10 = z1.c.M;
                        int i213 = (i19 & 14) | 196608;
                        pVar = new p();
                        xVarA = c2.a(sVar);
                        Object obj4 = t2.f3682a;
                        i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                        v3.c cVar4 = (v3.c) sVar.j(g1.f58547h);
                        mVar = (v3.m) sVar.j(g1.f58552n);
                        zF = sVar.f(cVar4) | ((((i213 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i213 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                        objQ = sVar.Q();
                        l1.g gVar15 = l1.m.f39353a;
                        if (zF) {
                            u uVar6 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f118 = g0.k.f28354a;
                            g0.g gVar16 = new g0.g(uVar6, xVarA, i1VarQ);
                            sVar.o0(gVar16);
                            objQ = gVar16;
                        } else {
                            u uVar7 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f119 = g0.k.f28354a;
                            g0.g gVar17 = new g0.g(uVar7, xVarA, i1VarQ);
                            sVar.o0(gVar17);
                            objQ = gVar17;
                        }
                        g0.g gVar18 = (g0.g) objQ;
                        i21 = i19 & (-29360129);
                        if (i17 != 0) {
                            z12 = true;
                        }
                        h1Var = h1.Horizontal;
                        int i214 = (i19 & 14) | 432;
                        if (((i214 & 14) ^ 6) <= 4) {
                        }
                        objQ2 = sVar.Q();
                        if (z15) {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        }
                        o0.a aVar6 = (o0.a) objQ2;
                        d0.i iVarA4 = s1.a(sVar);
                        o0.f fVar7 = o0.f.f44373a;
                        lVar3 = g0.l.f28355a;
                        gVar3 = gVar18;
                        rVar5 = rVar4;
                        z16 = z12;
                        iVar5 = iVar10;
                        fVar3 = fVar7;
                        aVar2 = aVar6;
                        t1Var4 = v1Var;
                        f12 = f117;
                        iVar6 = iVarA4;
                    } else {
                        if (i22 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            float f1110 = 0;
                            v1Var = new v1(f1110, f1110, f1110, f1110);
                        } else {
                            v1Var = t1Var2;
                        }
                        float f1111 = 0;
                        z1.i iVar11 = z1.c.M;
                        int i215 = (i19 & 14) | 196608;
                        pVar = new p();
                        xVarA = c2.a(sVar);
                        Object obj5 = t2.f3682a;
                        i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                        v3.c cVar5 = (v3.c) sVar.j(g1.f58547h);
                        mVar = (v3.m) sVar.j(g1.f58552n);
                        zF = sVar.f(cVar5) | ((((i215 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i215 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                        objQ = sVar.Q();
                        l1.g gVar19 = l1.m.f39353a;
                        if (zF) {
                            u uVar8 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f1112 = g0.k.f28354a;
                            g0.g gVar110 = new g0.g(uVar8, xVarA, i1VarQ);
                            sVar.o0(gVar110);
                            objQ = gVar110;
                        } else {
                            u uVar9 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f1113 = g0.k.f28354a;
                            g0.g gVar111 = new g0.g(uVar9, xVarA, i1VarQ);
                            sVar.o0(gVar111);
                            objQ = gVar111;
                        }
                        g0.g gVar112 = (g0.g) objQ;
                        i21 = i19 & (-29360129);
                        if (i17 != 0) {
                            z12 = true;
                        }
                        h1Var = h1.Horizontal;
                        int i216 = (i19 & 14) | 432;
                        if (((i216 & 14) ^ 6) <= 4) {
                        }
                        objQ2 = sVar.Q();
                        if (z15) {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        }
                        o0.a aVar7 = (o0.a) objQ2;
                        d0.i iVarA5 = s1.a(sVar);
                        o0.f fVar8 = o0.f.f44373a;
                        lVar3 = g0.l.f28355a;
                        gVar3 = gVar112;
                        rVar5 = rVar4;
                        z16 = z12;
                        iVar5 = iVar11;
                        fVar3 = fVar8;
                        aVar2 = aVar7;
                        t1Var4 = v1Var;
                        f12 = f1111;
                        iVar6 = iVarA5;
                    }
                    sVar.q();
                    int i217 = i21 >> 6;
                    int i218 = i21 << 12;
                    vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i217 & 3670016) | (i218 & 234881024) | (i218 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i217 & 57344));
                    float f1114 = f12;
                    gVar2 = gVar3;
                    fVar2 = fVar3;
                    z14 = z16;
                    f11 = f1114;
                    g0.l lVar6 = lVar3;
                    iVar3 = iVar6;
                    iVar4 = iVar5;
                    lVar2 = lVar6;
                    t1Var3 = t1Var4;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    fVar2 = fVar;
                    f11 = f5;
                    gVar2 = gVar;
                    aVar2 = aVar;
                    iVar3 = iVar2;
                    rVar3 = rVar2;
                    t1Var3 = t1Var2;
                    z14 = z12;
                    iVar4 = iVar;
                    lVar2 = lVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: o0.j
                        @Override // fz.e
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iM = l1.t.M(i11 | 1);
                            ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj6, iM, i12);
                            return b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 100663296;
            z12 = z11;
            i19 = i16 | 805306368;
            if ((306783379 & i19) == 306783378) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (sVar.T(i19 & 1, z13)) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        float f1115 = 0;
                        v1Var = new v1(f1115, f1115, f1115, f1115);
                    } else {
                        v1Var = t1Var2;
                    }
                    float f1116 = 0;
                    z1.i iVar12 = z1.c.M;
                    int i219 = (i19 & 14) | 196608;
                    pVar = new p();
                    xVarA = c2.a(sVar);
                    Object obj6 = t2.f3682a;
                    i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    v3.c cVar6 = (v3.c) sVar.j(g1.f58547h);
                    mVar = (v3.m) sVar.j(g1.f58552n);
                    zF = sVar.f(cVar6) | ((((i219 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i219 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                    objQ = sVar.Q();
                    l1.g gVar113 = l1.m.f39353a;
                    if (zF) {
                        u uVar10 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1117 = g0.k.f28354a;
                        g0.g gVar114 = new g0.g(uVar10, xVarA, i1VarQ);
                        sVar.o0(gVar114);
                        objQ = gVar114;
                    } else {
                        u uVar11 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1118 = g0.k.f28354a;
                        g0.g gVar115 = new g0.g(uVar11, xVarA, i1VarQ);
                        sVar.o0(gVar115);
                        objQ = gVar115;
                    }
                    g0.g gVar116 = (g0.g) objQ;
                    i21 = i19 & (-29360129);
                    if (i17 != 0) {
                        z12 = true;
                    }
                    h1Var = h1.Horizontal;
                    int i2110 = (i19 & 14) | 432;
                    if (((i2110 & 14) ^ 6) <= 4) {
                    }
                    objQ2 = sVar.Q();
                    if (z15) {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    }
                    o0.a aVar8 = (o0.a) objQ2;
                    d0.i iVarA6 = s1.a(sVar);
                    o0.f fVar9 = o0.f.f44373a;
                    lVar3 = g0.l.f28355a;
                    gVar3 = gVar116;
                    rVar5 = rVar4;
                    z16 = z12;
                    iVar5 = iVar12;
                    fVar3 = fVar9;
                    aVar2 = aVar8;
                    t1Var4 = v1Var;
                    f12 = f1116;
                    iVar6 = iVarA6;
                } else {
                    if (i22 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        float f1119 = 0;
                        v1Var = new v1(f1119, f1119, f1119, f1119);
                    } else {
                        v1Var = t1Var2;
                    }
                    float f11110 = 0;
                    z1.i iVar13 = z1.c.M;
                    int i2111 = (i19 & 14) | 196608;
                    pVar = new p();
                    xVarA = c2.a(sVar);
                    Object obj7 = t2.f3682a;
                    i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    v3.c cVar7 = (v3.c) sVar.j(g1.f58547h);
                    mVar = (v3.m) sVar.j(g1.f58552n);
                    zF = sVar.f(cVar7) | ((((i2111 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i2111 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                    objQ = sVar.Q();
                    l1.g gVar117 = l1.m.f39353a;
                    if (zF) {
                        u uVar12 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f11111 = g0.k.f28354a;
                        g0.g gVar118 = new g0.g(uVar12, xVarA, i1VarQ);
                        sVar.o0(gVar118);
                        objQ = gVar118;
                    } else {
                        u uVar13 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f11112 = g0.k.f28354a;
                        g0.g gVar119 = new g0.g(uVar13, xVarA, i1VarQ);
                        sVar.o0(gVar119);
                        objQ = gVar119;
                    }
                    g0.g gVar1110 = (g0.g) objQ;
                    i21 = i19 & (-29360129);
                    if (i17 != 0) {
                        z12 = true;
                    }
                    h1Var = h1.Horizontal;
                    int i2112 = (i19 & 14) | 432;
                    if (((i2112 & 14) ^ 6) <= 4) {
                    }
                    objQ2 = sVar.Q();
                    if (z15) {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    }
                    o0.a aVar9 = (o0.a) objQ2;
                    d0.i iVarA7 = s1.a(sVar);
                    o0.f fVar10 = o0.f.f44373a;
                    lVar3 = g0.l.f28355a;
                    gVar3 = gVar1110;
                    rVar5 = rVar4;
                    z16 = z12;
                    iVar5 = iVar13;
                    fVar3 = fVar10;
                    aVar2 = aVar9;
                    t1Var4 = v1Var;
                    f12 = f11110;
                    iVar6 = iVarA7;
                }
                sVar.q();
                int i2113 = i21 >> 6;
                int i2114 = i21 << 12;
                vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i2113 & 3670016) | (i2114 & 234881024) | (i2114 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i2113 & 57344));
                float f11113 = f12;
                gVar2 = gVar3;
                fVar2 = fVar3;
                z14 = z16;
                f11 = f11113;
                g0.l lVar7 = lVar3;
                iVar3 = iVar6;
                iVar4 = iVar5;
                lVar2 = lVar7;
                t1Var3 = t1Var4;
                rVar3 = rVar5;
            } else {
                sVar.W();
                fVar2 = fVar;
                f11 = f5;
                gVar2 = gVar;
                aVar2 = aVar;
                iVar3 = iVar2;
                rVar3 = rVar2;
                t1Var3 = t1Var2;
                z14 = z12;
                iVar4 = iVar;
                lVar2 = lVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: o0.j
                    @Override // fz.e
                    public final Object invoke(Object obj8, Object obj9) {
                        ((Integer) obj9).getClass();
                        int iM = l1.t.M(i11 | 1);
                        ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj8, iM, i12);
                        return b0.f48488a;
                    }
                };
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 384) == 0) {
                t1Var2 = t1Var;
                if (sVar.f(t1Var2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = 1797120 | i13;
            if ((12582912 & i11) == 0) {
                i16 = 5991424 | i13;
            }
            i17 = i12 & 256;
            if (i17 != 0) {
                if ((100663296 & i11) == 0) {
                    z12 = z11;
                    if (sVar.g(z12)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i16 |= i18;
                }
                i19 = i16 | 805306368;
                if ((306783379 & i19) == 306783378) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (sVar.T(i19 & 1, z13)) {
                    sVar.Y();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            float f11114 = 0;
                            v1Var = new v1(f11114, f11114, f11114, f11114);
                        } else {
                            v1Var = t1Var2;
                        }
                        float f11115 = 0;
                        z1.i iVar14 = z1.c.M;
                        int i2115 = (i19 & 14) | 196608;
                        pVar = new p();
                        xVarA = c2.a(sVar);
                        Object obj8 = t2.f3682a;
                        i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                        v3.c cVar8 = (v3.c) sVar.j(g1.f58547h);
                        mVar = (v3.m) sVar.j(g1.f58552n);
                        zF = sVar.f(cVar8) | ((((i2115 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i2115 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                        objQ = sVar.Q();
                        l1.g gVar1111 = l1.m.f39353a;
                        if (zF) {
                            u uVar14 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f11116 = g0.k.f28354a;
                            g0.g gVar1112 = new g0.g(uVar14, xVarA, i1VarQ);
                            sVar.o0(gVar1112);
                            objQ = gVar1112;
                        } else {
                            u uVar15 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f11117 = g0.k.f28354a;
                            g0.g gVar1113 = new g0.g(uVar15, xVarA, i1VarQ);
                            sVar.o0(gVar1113);
                            objQ = gVar1113;
                        }
                        g0.g gVar1114 = (g0.g) objQ;
                        i21 = i19 & (-29360129);
                        if (i17 != 0) {
                            z12 = true;
                        }
                        h1Var = h1.Horizontal;
                        int i2116 = (i19 & 14) | 432;
                        if (((i2116 & 14) ^ 6) <= 4) {
                        }
                        objQ2 = sVar.Q();
                        if (z15) {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        }
                        o0.a aVar10 = (o0.a) objQ2;
                        d0.i iVarA8 = s1.a(sVar);
                        o0.f fVar11 = o0.f.f44373a;
                        lVar3 = g0.l.f28355a;
                        gVar3 = gVar1114;
                        rVar5 = rVar4;
                        z16 = z12;
                        iVar5 = iVar14;
                        fVar3 = fVar11;
                        aVar2 = aVar10;
                        t1Var4 = v1Var;
                        f12 = f11115;
                        iVar6 = iVarA8;
                    } else {
                        if (i22 != 0) {
                            rVar4 = o.f58481a;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i14 != 0) {
                            float f11118 = 0;
                            v1Var = new v1(f11118, f11118, f11118, f11118);
                        } else {
                            v1Var = t1Var2;
                        }
                        float f11119 = 0;
                        z1.i iVar15 = z1.c.M;
                        int i2117 = (i19 & 14) | 196608;
                        pVar = new p();
                        xVarA = c2.a(sVar);
                        Object obj9 = t2.f3682a;
                        i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                        v3.c cVar9 = (v3.c) sVar.j(g1.f58547h);
                        mVar = (v3.m) sVar.j(g1.f58552n);
                        zF = sVar.f(cVar9) | ((((i2117 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i2117 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                        objQ = sVar.Q();
                        l1.g gVar1115 = l1.m.f39353a;
                        if (zF) {
                            u uVar16 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f111110 = g0.k.f28354a;
                            g0.g gVar1116 = new g0.g(uVar16, xVarA, i1VarQ);
                            sVar.o0(gVar1116);
                            objQ = gVar1116;
                        } else {
                            u uVar17 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                            float f111111 = g0.k.f28354a;
                            g0.g gVar1117 = new g0.g(uVar17, xVarA, i1VarQ);
                            sVar.o0(gVar1117);
                            objQ = gVar1117;
                        }
                        g0.g gVar1118 = (g0.g) objQ;
                        i21 = i19 & (-29360129);
                        if (i17 != 0) {
                            z12 = true;
                        }
                        h1Var = h1.Horizontal;
                        int i2118 = (i19 & 14) | 432;
                        if (((i2118 & 14) ^ 6) <= 4) {
                        }
                        objQ2 = sVar.Q();
                        if (z15) {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new o0.a(tVar, h1Var);
                            sVar.o0(objQ2);
                        }
                        o0.a aVar11 = (o0.a) objQ2;
                        d0.i iVarA9 = s1.a(sVar);
                        o0.f fVar12 = o0.f.f44373a;
                        lVar3 = g0.l.f28355a;
                        gVar3 = gVar1118;
                        rVar5 = rVar4;
                        z16 = z12;
                        iVar5 = iVar15;
                        fVar3 = fVar12;
                        aVar2 = aVar11;
                        t1Var4 = v1Var;
                        f12 = f11119;
                        iVar6 = iVarA9;
                    }
                    sVar.q();
                    int i2119 = i21 >> 6;
                    int i21110 = i21 << 12;
                    vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i2119 & 3670016) | (i21110 & 234881024) | (i21110 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i2119 & 57344));
                    float f111112 = f12;
                    gVar2 = gVar3;
                    fVar2 = fVar3;
                    z14 = z16;
                    f11 = f111112;
                    g0.l lVar8 = lVar3;
                    iVar3 = iVar6;
                    iVar4 = iVar5;
                    lVar2 = lVar8;
                    t1Var3 = t1Var4;
                    rVar3 = rVar5;
                } else {
                    sVar.W();
                    fVar2 = fVar;
                    f11 = f5;
                    gVar2 = gVar;
                    aVar2 = aVar;
                    iVar3 = iVar2;
                    rVar3 = rVar2;
                    t1Var3 = t1Var2;
                    z14 = z12;
                    iVar4 = iVar;
                    lVar2 = lVar;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: o0.j
                        @Override // fz.e
                        public final Object invoke(Object obj10, Object obj11) {
                            ((Integer) obj11).getClass();
                            int iM = l1.t.M(i11 | 1);
                            ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj10, iM, i12);
                            return b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 100663296;
            z12 = z11;
            i19 = i16 | 805306368;
            if ((306783379 & i19) == 306783378) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (sVar.T(i19 & 1, z13)) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        float f111113 = 0;
                        v1Var = new v1(f111113, f111113, f111113, f111113);
                    } else {
                        v1Var = t1Var2;
                    }
                    float f111114 = 0;
                    z1.i iVar16 = z1.c.M;
                    int i21111 = (i19 & 14) | 196608;
                    pVar = new p();
                    xVarA = c2.a(sVar);
                    Object obj10 = t2.f3682a;
                    i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    v3.c cVar10 = (v3.c) sVar.j(g1.f58547h);
                    mVar = (v3.m) sVar.j(g1.f58552n);
                    zF = sVar.f(cVar10) | ((((i21111 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i21111 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                    objQ = sVar.Q();
                    l1.g gVar1119 = l1.m.f39353a;
                    if (zF) {
                        u uVar18 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f111115 = g0.k.f28354a;
                        g0.g gVar11110 = new g0.g(uVar18, xVarA, i1VarQ);
                        sVar.o0(gVar11110);
                        objQ = gVar11110;
                    } else {
                        u uVar19 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f111116 = g0.k.f28354a;
                        g0.g gVar11111 = new g0.g(uVar19, xVarA, i1VarQ);
                        sVar.o0(gVar11111);
                        objQ = gVar11111;
                    }
                    g0.g gVar11112 = (g0.g) objQ;
                    i21 = i19 & (-29360129);
                    if (i17 != 0) {
                        z12 = true;
                    }
                    h1Var = h1.Horizontal;
                    int i21112 = (i19 & 14) | 432;
                    if (((i21112 & 14) ^ 6) <= 4) {
                    }
                    objQ2 = sVar.Q();
                    if (z15) {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    }
                    o0.a aVar12 = (o0.a) objQ2;
                    d0.i iVarA10 = s1.a(sVar);
                    o0.f fVar13 = o0.f.f44373a;
                    lVar3 = g0.l.f28355a;
                    gVar3 = gVar11112;
                    rVar5 = rVar4;
                    z16 = z12;
                    iVar5 = iVar16;
                    fVar3 = fVar13;
                    aVar2 = aVar12;
                    t1Var4 = v1Var;
                    f12 = f111114;
                    iVar6 = iVarA10;
                } else {
                    if (i22 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        float f111117 = 0;
                        v1Var = new v1(f111117, f111117, f111117, f111117);
                    } else {
                        v1Var = t1Var2;
                    }
                    float f111118 = 0;
                    z1.i iVar17 = z1.c.M;
                    int i21113 = (i19 & 14) | 196608;
                    pVar = new p();
                    xVarA = c2.a(sVar);
                    Object obj11 = t2.f3682a;
                    i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    v3.c cVar11 = (v3.c) sVar.j(g1.f58547h);
                    mVar = (v3.m) sVar.j(g1.f58552n);
                    zF = sVar.f(cVar11) | ((((i21113 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i21113 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                    objQ = sVar.Q();
                    l1.g gVar11113 = l1.m.f39353a;
                    if (zF) {
                        u uVar110 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f111119 = g0.k.f28354a;
                        g0.g gVar11114 = new g0.g(uVar110, xVarA, i1VarQ);
                        sVar.o0(gVar11114);
                        objQ = gVar11114;
                    } else {
                        u uVar111 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1111110 = g0.k.f28354a;
                        g0.g gVar11115 = new g0.g(uVar111, xVarA, i1VarQ);
                        sVar.o0(gVar11115);
                        objQ = gVar11115;
                    }
                    g0.g gVar11116 = (g0.g) objQ;
                    i21 = i19 & (-29360129);
                    if (i17 != 0) {
                        z12 = true;
                    }
                    h1Var = h1.Horizontal;
                    int i21114 = (i19 & 14) | 432;
                    if (((i21114 & 14) ^ 6) <= 4) {
                    }
                    objQ2 = sVar.Q();
                    if (z15) {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    }
                    o0.a aVar13 = (o0.a) objQ2;
                    d0.i iVarA11 = s1.a(sVar);
                    o0.f fVar14 = o0.f.f44373a;
                    lVar3 = g0.l.f28355a;
                    gVar3 = gVar11116;
                    rVar5 = rVar4;
                    z16 = z12;
                    iVar5 = iVar17;
                    fVar3 = fVar14;
                    aVar2 = aVar13;
                    t1Var4 = v1Var;
                    f12 = f111118;
                    iVar6 = iVarA11;
                }
                sVar.q();
                int i21115 = i21 >> 6;
                int i21116 = i21 << 12;
                vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i21115 & 3670016) | (i21116 & 234881024) | (i21116 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i21115 & 57344));
                float f1111111 = f12;
                gVar2 = gVar3;
                fVar2 = fVar3;
                z14 = z16;
                f11 = f1111111;
                g0.l lVar9 = lVar3;
                iVar3 = iVar6;
                iVar4 = iVar5;
                lVar2 = lVar9;
                t1Var3 = t1Var4;
                rVar3 = rVar5;
            } else {
                sVar.W();
                fVar2 = fVar;
                f11 = f5;
                gVar2 = gVar;
                aVar2 = aVar;
                iVar3 = iVar2;
                rVar3 = rVar2;
                t1Var3 = t1Var2;
                z14 = z12;
                iVar4 = iVar;
                lVar2 = lVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: o0.j
                    @Override // fz.e
                    public final Object invoke(Object obj12, Object obj13) {
                        ((Integer) obj13).getClass();
                        int iM = l1.t.M(i11 | 1);
                        ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj12, iM, i12);
                        return b0.f48488a;
                    }
                };
            }
        }
        i13 |= 384;
        t1Var2 = t1Var;
        i16 = 1797120 | i13;
        if ((12582912 & i11) == 0) {
            i16 = 5991424 | i13;
        }
        i17 = i12 & 256;
        if (i17 != 0) {
            if ((100663296 & i11) == 0) {
                z12 = z11;
                if (sVar.g(z12)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i16 |= i18;
            }
            i19 = i16 | 805306368;
            if ((306783379 & i19) == 306783378) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (sVar.T(i19 & 1, z13)) {
                sVar.Y();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        float f1111112 = 0;
                        v1Var = new v1(f1111112, f1111112, f1111112, f1111112);
                    } else {
                        v1Var = t1Var2;
                    }
                    float f1111113 = 0;
                    z1.i iVar18 = z1.c.M;
                    int i21117 = (i19 & 14) | 196608;
                    pVar = new p();
                    xVarA = c2.a(sVar);
                    Object obj12 = t2.f3682a;
                    i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    v3.c cVar12 = (v3.c) sVar.j(g1.f58547h);
                    mVar = (v3.m) sVar.j(g1.f58552n);
                    zF = sVar.f(cVar12) | ((((i21117 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i21117 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                    objQ = sVar.Q();
                    l1.g gVar11117 = l1.m.f39353a;
                    if (zF) {
                        u uVar112 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1111114 = g0.k.f28354a;
                        g0.g gVar11118 = new g0.g(uVar112, xVarA, i1VarQ);
                        sVar.o0(gVar11118);
                        objQ = gVar11118;
                    } else {
                        u uVar113 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1111115 = g0.k.f28354a;
                        g0.g gVar11119 = new g0.g(uVar113, xVarA, i1VarQ);
                        sVar.o0(gVar11119);
                        objQ = gVar11119;
                    }
                    g0.g gVar111110 = (g0.g) objQ;
                    i21 = i19 & (-29360129);
                    if (i17 != 0) {
                        z12 = true;
                    }
                    h1Var = h1.Horizontal;
                    int i21118 = (i19 & 14) | 432;
                    if (((i21118 & 14) ^ 6) <= 4) {
                    }
                    objQ2 = sVar.Q();
                    if (z15) {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    }
                    o0.a aVar14 = (o0.a) objQ2;
                    d0.i iVarA12 = s1.a(sVar);
                    o0.f fVar15 = o0.f.f44373a;
                    lVar3 = g0.l.f28355a;
                    gVar3 = gVar111110;
                    rVar5 = rVar4;
                    z16 = z12;
                    iVar5 = iVar18;
                    fVar3 = fVar15;
                    aVar2 = aVar14;
                    t1Var4 = v1Var;
                    f12 = f1111113;
                    iVar6 = iVarA12;
                } else {
                    if (i22 != 0) {
                        rVar4 = o.f58481a;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i14 != 0) {
                        float f1111116 = 0;
                        v1Var = new v1(f1111116, f1111116, f1111116, f1111116);
                    } else {
                        v1Var = t1Var2;
                    }
                    float f1111117 = 0;
                    z1.i iVar19 = z1.c.M;
                    int i21119 = (i19 & 14) | 196608;
                    pVar = new p();
                    xVarA = c2.a(sVar);
                    Object obj13 = t2.f3682a;
                    i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                    v3.c cVar13 = (v3.c) sVar.j(g1.f58547h);
                    mVar = (v3.m) sVar.j(g1.f58552n);
                    zF = sVar.f(cVar13) | ((((i21119 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i21119 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                    objQ = sVar.Q();
                    l1.g gVar111111 = l1.m.f39353a;
                    if (zF) {
                        u uVar114 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1111118 = g0.k.f28354a;
                        g0.g gVar111112 = new g0.g(uVar114, xVarA, i1VarQ);
                        sVar.o0(gVar111112);
                        objQ = gVar111112;
                    } else {
                        u uVar115 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                        float f1111119 = g0.k.f28354a;
                        g0.g gVar111113 = new g0.g(uVar115, xVarA, i1VarQ);
                        sVar.o0(gVar111113);
                        objQ = gVar111113;
                    }
                    g0.g gVar111114 = (g0.g) objQ;
                    i21 = i19 & (-29360129);
                    if (i17 != 0) {
                        z12 = true;
                    }
                    h1Var = h1.Horizontal;
                    int i211110 = (i19 & 14) | 432;
                    if (((i211110 & 14) ^ 6) <= 4) {
                    }
                    objQ2 = sVar.Q();
                    if (z15) {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    } else {
                        objQ2 = new o0.a(tVar, h1Var);
                        sVar.o0(objQ2);
                    }
                    o0.a aVar15 = (o0.a) objQ2;
                    d0.i iVarA13 = s1.a(sVar);
                    o0.f fVar16 = o0.f.f44373a;
                    lVar3 = g0.l.f28355a;
                    gVar3 = gVar111114;
                    rVar5 = rVar4;
                    z16 = z12;
                    iVar5 = iVar19;
                    fVar3 = fVar16;
                    aVar2 = aVar15;
                    t1Var4 = v1Var;
                    f12 = f1111117;
                    iVar6 = iVarA13;
                }
                sVar.q();
                int i211111 = i21 >> 6;
                int i211112 = i21 << 12;
                vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i211111 & 3670016) | (i211112 & 234881024) | (i211112 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i211111 & 57344));
                float f11111110 = f12;
                gVar2 = gVar3;
                fVar2 = fVar3;
                z14 = z16;
                f11 = f11111110;
                g0.l lVar10 = lVar3;
                iVar3 = iVar6;
                iVar4 = iVar5;
                lVar2 = lVar10;
                t1Var3 = t1Var4;
                rVar3 = rVar5;
            } else {
                sVar.W();
                fVar2 = fVar;
                f11 = f5;
                gVar2 = gVar;
                aVar2 = aVar;
                iVar3 = iVar2;
                rVar3 = rVar2;
                t1Var3 = t1Var2;
                z14 = z12;
                iVar4 = iVar;
                lVar2 = lVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: o0.j
                    @Override // fz.e
                    public final Object invoke(Object obj14, Object obj15) {
                        ((Integer) obj15).getClass();
                        int iM = l1.t.M(i11 | 1);
                        ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj14, iM, i12);
                        return b0.f48488a;
                    }
                };
            }
        }
        i16 |= 100663296;
        z12 = z11;
        i19 = i16 | 805306368;
        if ((306783379 & i19) == 306783378) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (sVar.T(i19 & 1, z13)) {
            sVar.Y();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    rVar4 = o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    float f11111111 = 0;
                    v1Var = new v1(f11111111, f11111111, f11111111, f11111111);
                } else {
                    v1Var = t1Var2;
                }
                float f11111112 = 0;
                z1.i iVar110 = z1.c.M;
                int i211113 = (i19 & 14) | 196608;
                pVar = new p();
                xVarA = c2.a(sVar);
                Object obj14 = t2.f3682a;
                i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                v3.c cVar14 = (v3.c) sVar.j(g1.f58547h);
                mVar = (v3.m) sVar.j(g1.f58552n);
                zF = sVar.f(cVar14) | ((((i211113 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i211113 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                objQ = sVar.Q();
                l1.g gVar111115 = l1.m.f39353a;
                if (zF) {
                    u uVar116 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                    float f11111113 = g0.k.f28354a;
                    g0.g gVar111116 = new g0.g(uVar116, xVarA, i1VarQ);
                    sVar.o0(gVar111116);
                    objQ = gVar111116;
                } else {
                    u uVar117 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                    float f11111114 = g0.k.f28354a;
                    g0.g gVar111117 = new g0.g(uVar117, xVarA, i1VarQ);
                    sVar.o0(gVar111117);
                    objQ = gVar111117;
                }
                g0.g gVar111118 = (g0.g) objQ;
                i21 = i19 & (-29360129);
                if (i17 != 0) {
                    z12 = true;
                }
                h1Var = h1.Horizontal;
                int i211114 = (i19 & 14) | 432;
                if (((i211114 & 14) ^ 6) <= 4) {
                }
                objQ2 = sVar.Q();
                if (z15) {
                    objQ2 = new o0.a(tVar, h1Var);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new o0.a(tVar, h1Var);
                    sVar.o0(objQ2);
                }
                o0.a aVar16 = (o0.a) objQ2;
                d0.i iVarA14 = s1.a(sVar);
                o0.f fVar17 = o0.f.f44373a;
                lVar3 = g0.l.f28355a;
                gVar3 = gVar111118;
                rVar5 = rVar4;
                z16 = z12;
                iVar5 = iVar110;
                fVar3 = fVar17;
                aVar2 = aVar16;
                t1Var4 = v1Var;
                f12 = f11111112;
                iVar6 = iVarA14;
            } else {
                if (i22 != 0) {
                    rVar4 = o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                if (i14 != 0) {
                    float f11111115 = 0;
                    v1Var = new v1(f11111115, f11111115, f11111115, f11111115);
                } else {
                    v1Var = t1Var2;
                }
                float f11111116 = 0;
                z1.i iVar111 = z1.c.M;
                int i211115 = (i19 & 14) | 196608;
                pVar = new p();
                xVarA = c2.a(sVar);
                Object obj15 = t2.f3682a;
                i1VarQ = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, Float.valueOf(1), 1);
                v3.c cVar15 = (v3.c) sVar.j(g1.f58547h);
                mVar = (v3.m) sVar.j(g1.f58552n);
                zF = sVar.f(cVar15) | ((((i211115 & 14) ^ 6) <= 4 && sVar.f(tVar)) || (i211115 & 6) == 4) | sVar.f(xVarA) | sVar.f(i1VarQ) | sVar.f(pVar) | sVar.d(mVar.ordinal());
                objQ = sVar.Q();
                l1.g gVar111119 = l1.m.f39353a;
                if (zF) {
                    u uVar118 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                    float f11111117 = g0.k.f28354a;
                    g0.g gVar1111110 = new g0.g(uVar118, xVarA, i1VarQ);
                    sVar.o0(gVar1111110);
                    objQ = gVar1111110;
                } else {
                    u uVar119 = new u(tVar, new at.p(25, tVar, mVar), pVar);
                    float f11111118 = g0.k.f28354a;
                    g0.g gVar1111111 = new g0.g(uVar119, xVarA, i1VarQ);
                    sVar.o0(gVar1111111);
                    objQ = gVar1111111;
                }
                g0.g gVar1111112 = (g0.g) objQ;
                i21 = i19 & (-29360129);
                if (i17 != 0) {
                    z12 = true;
                }
                h1Var = h1.Horizontal;
                int i211116 = (i19 & 14) | 432;
                if (((i211116 & 14) ^ 6) <= 4) {
                }
                objQ2 = sVar.Q();
                if (z15) {
                    objQ2 = new o0.a(tVar, h1Var);
                    sVar.o0(objQ2);
                } else {
                    objQ2 = new o0.a(tVar, h1Var);
                    sVar.o0(objQ2);
                }
                o0.a aVar17 = (o0.a) objQ2;
                d0.i iVarA15 = s1.a(sVar);
                o0.f fVar18 = o0.f.f44373a;
                lVar3 = g0.l.f28355a;
                gVar3 = gVar1111112;
                rVar5 = rVar4;
                z16 = z12;
                iVar5 = iVar111;
                fVar3 = fVar18;
                aVar2 = aVar17;
                t1Var4 = v1Var;
                f12 = f11111116;
                iVar6 = iVarA15;
            }
            sVar.q();
            int i211117 = i21 >> 6;
            int i211118 = i21 << 12;
            vc.a.b(rVar5, tVar, t1Var4, h1.Horizontal, gVar3, z16, iVar6, f12, fVar3, aVar2, iVar5, lVar3, dVar, sVar, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i211117 & 3670016) | (i211118 & 234881024) | (i211118 & 1879048192), 1769472 | ((i21 >> 9) & 14) | 3456 | (i211117 & 57344));
            float f11111119 = f12;
            gVar2 = gVar3;
            fVar2 = fVar3;
            z14 = z16;
            f11 = f11111119;
            g0.l lVar11 = lVar3;
            iVar3 = iVar6;
            iVar4 = iVar5;
            lVar2 = lVar11;
            t1Var3 = t1Var4;
            rVar3 = rVar5;
        } else {
            sVar.W();
            fVar2 = fVar;
            f11 = f5;
            gVar2 = gVar;
            aVar2 = aVar;
            iVar3 = iVar2;
            rVar3 = rVar2;
            t1Var3 = t1Var2;
            z14 = z12;
            iVar4 = iVar;
            lVar2 = lVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: o0.j
                @Override // fz.e
                public final Object invoke(Object obj16, Object obj17) {
                    ((Integer) obj17).getClass();
                    int iM = l1.t.M(i11 | 1);
                    ve.i.d(tVar, rVar3, t1Var3, fVar2, f11, iVar4, gVar2, z14, aVar2, lVar2, iVar3, dVar, (l1.n) obj16, iM, i12);
                    return b0.f48488a;
                }
            };
        }
    }

    public static final void e(c6.l lVar, n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1380468206);
        if ((((sVar.f(lVar) ? 4 : 2) | i11) & 3) == 2 && sVar.F()) {
            sVar.W();
        } else {
            k6.s sVar2 = k6.s.f37953a;
            sVar.e0(-1115894518);
            sVar.e0(1886828752);
            if (!(sVar.f39434a instanceof c6.b)) {
                l1.t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(new c0(sVar2));
            } else {
                sVar.r0();
            }
            l1.t.J(k6.e.L, lVar, sVar);
            sVar.p(true);
            sVar.p(false);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a0.h(lVar, i11, 5);
        }
    }

    public static final void f(boolean z11, u3.j jVar, z0 z0Var, n nVar, int i11) {
        int i12;
        o1 o1VarD;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1344558920);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(z0Var) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            int i13 = i12 & 14;
            boolean zF = (i13 == 4) | sVar.f(z0Var);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new v0(z0Var, z11);
                sVar.o0(objQ);
            }
            a1 a1Var = (a1) objQ;
            boolean zH = (i13 == 4) | sVar.h(z0Var);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new d1.a1(z0Var, z11);
                sVar.o0(objQ2);
            }
            d1.l lVar = (d1.l) objQ2;
            boolean zG = j3.x0.g(z0Var.m().f44705b);
            int i14 = (int) (z11 ? z0Var.m().f44705b >> 32 : z0Var.m().f44705b & 4294967295L);
            s0 s0Var = z0Var.f23040d;
            float fE = CropImageView.DEFAULT_ASPECT_RATIO;
            if (s0Var != null && (o1VarD = s0Var.d()) != null) {
                u0 u0Var = o1VarD.f51124a;
                if (i14 >= 0) {
                    t0 t0Var = u0Var.f35797a;
                    j3.x xVar = u0Var.f35798b;
                    if (t0Var.f35784a.f35700b.length() != 0) {
                        int iMin = Math.min(xVar.d(i14), Math.min(xVar.f35814b - 1, xVar.f35818f - 1));
                        if (i14 <= xVar.c(iMin, false)) {
                            xVar.m(iMin);
                            ArrayList arrayList = xVar.f35820h;
                            z zVar = (z) arrayList.get(j3.t.f(iMin, arrayList));
                            j3.b bVar = zVar.f35830a;
                            int i15 = iMin - zVar.f35833d;
                            k3.r rVar = bVar.f35664d;
                            fE = rVar.e(i15) - rVar.g(i15);
                        }
                    }
                }
            }
            float f5 = fE;
            boolean zH2 = sVar.h(a1Var);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                objQ3 = new a1.d(a1Var, 5);
                sVar.o0(objQ3);
            }
            qx.p.d(lVar, z11, jVar, zG, 0L, f5, s2.g0.a(o.f58481a, a1Var, (PointerInputEventHandler) objQ3), sVar, (i12 << 3) & 1008);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l3(z11, jVar, z0Var, i11);
        }
    }

    public static final Bitmap g(Image image) {
        Image.Plane[] planes = image.getPlanes();
        m.c(planes);
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i11 = 0; i11 < height; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = f0.E(f0.d(i12 & 255, (i12 >> 8) & 255, (i12 >> 16) & 255, (i12 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static void h(se.u typeOfParameter, String key, String value, Bundle bundle, se.t tVar) {
        m.f(typeOfParameter, "typeOfParameter");
        m.f(key, "key");
        m.f(value, "value");
        int i11 = se.s.f51613a[z(typeOfParameter, key).ordinal()];
        if (i11 == 1) {
            bundle.putCharSequence(key, value);
            return;
        }
        if (i11 == 2) {
            tVar.a(typeOfParameter, key, value);
        } else {
            if (i11 != 3) {
                return;
            }
            tVar.a(typeOfParameter, key, value);
            bundle.putCharSequence(key, value);
        }
    }

    public static qy.l i(se.u typeOfParameter, String str, String str2, Bundle bundle, se.t tVar) {
        m.f(typeOfParameter, "typeOfParameter");
        int i11 = se.s.f51613a[z(typeOfParameter, str).ordinal()];
        if (i11 == 1) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putCharSequence(str, str2);
        } else if (i11 == 2) {
            if (tVar == null) {
                tVar = new se.t();
            }
            tVar.a(typeOfParameter, str, str2);
        } else if (i11 == 3) {
            if (tVar == null) {
                tVar = new se.t();
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            tVar.a(typeOfParameter, str, str2);
            bundle.putCharSequence(str, str2);
        }
        return new qy.l(bundle, tVar);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:108:0x0223  */
    /* JADX WARN: Code duplicated, block: B:110:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0231  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:117:0x0255  */
    /* JADX WARN: Code duplicated, block: B:119:0x0258  */
    /* JADX WARN: Code duplicated, block: B:121:0x025b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0260  */
    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:128:0x026d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0159  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0164  */
    /* JADX WARN: Code duplicated, block: B:84:0x0169 A[Catch: all -> 0x017d, TryCatch #0 {all -> 0x017d, blocks: (B:82:0x0165, B:84:0x0169, B:85:0x0173), top: B:137:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0173 A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #0 {all -> 0x017d, blocks: (B:82:0x0165, B:84:0x0169, B:85:0x0173), top: B:137:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0197  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e3  */
    public static final void j(e6.x1 x1Var, RemoteViews remoteViews, c6.l lVar, e6.u0 u0Var) {
        int i11;
        y yVar;
        Context context;
        d6.b bVar;
        p6.g gVar;
        k6.o oVar;
        l6.b bVar2;
        int i12;
        Object obj;
        Object obj2;
        List list;
        float fH;
        float fH2;
        boolean z11;
        float f5;
        d6.a aVar;
        Integer num;
        int iIntValue;
        Context context2 = x1Var.f25078a;
        y yVar2 = new y();
        y yVar3 = new y();
        y yVar4 = new y();
        y yVar5 = new y();
        y yVar6 = new y();
        yVar6.f38361a = c6.p.Visible;
        y yVar7 = new y();
        y yVar8 = new y();
        y yVar9 = new y();
        y yVar10 = new y();
        lVar.a(b0.f48488a, new e6.r(yVar7, yVar2, yVar3, context2, remoteViews, u0Var, yVar4, yVar6, yVar5, x1Var, yVar9, yVar8, yVar10));
        k6.t tVar = (k6.t) yVar2.f38361a;
        k6.m mVar = (k6.m) yVar3.f38361a;
        Object obj3 = e6.a1.f24877a;
        int i13 = u0Var.f25053b;
        int i14 = u0Var.f25052a;
        int i15 = 0;
        if (i13 != -1) {
            if (Build.VERSION.SDK_INT >= 31) {
                throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
            }
            p6.g gVar2 = tVar != null ? tVar.f37954a : null;
            p6.g gVar3 = mVar != null ? mVar.f37937a : null;
            if (C(gVar2) || C(gVar3)) {
                boolean z12 = (gVar2 instanceof p6.e) || (gVar2 instanceof p6.d);
                boolean z13 = (gVar3 instanceof p6.e) || (gVar3 instanceof p6.d);
                if (z12 && z13) {
                    i11 = R.layout.size_match_match;
                } else if (z12) {
                    i11 = R.layout.size_match_wrap;
                } else {
                    i11 = z13 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap;
                }
                yVar = yVar6;
                int iQ = com.bumptech.glide.g.q(remoteViews, x1Var, R.id.sizeViewStub, i11, null);
                boolean z14 = gVar2 instanceof p6.c;
                p6.f fVar = p6.f.f46316a;
                context = context2;
                p6.e eVar = p6.e.f46315a;
                p6.d dVar = p6.d.f46314a;
                if (z14) {
                    remoteViews.setInt(iQ, "setWidth", (int) TypedValue.applyDimension(1, ((p6.c) gVar2).f46313a, context.getResources().getDisplayMetrics()));
                } else {
                    if (!((m.a(gVar2, dVar) ? true : m.a(gVar2, eVar) ? true : m.a(gVar2, fVar)) || gVar2 == null)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (gVar3 instanceof p6.c) {
                    remoteViews.setInt(iQ, "setHeight", (int) TypedValue.applyDimension(1, ((p6.c) gVar3).f46313a, context.getResources().getDisplayMetrics()));
                } else {
                    if (!((m.a(gVar3, dVar) ? true : m.a(gVar3, eVar) ? true : m.a(gVar3, fVar)) || gVar3 == null)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            bVar = (d6.b) yVar7.f38361a;
            if (bVar != null) {
                aVar = bVar.f23202a;
                num = x1Var.m;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i14;
                }
                try {
                    if (x1Var.f25083f) {
                        remoteViews.setOnClickFillInIntent(iIntValue, f6.h.b(aVar, x1Var, iIntValue, f6.d.f26621b));
                    } else {
                        remoteViews.setOnClickPendingIntent(iIntValue, f6.h.c(aVar, x1Var, iIntValue, f6.d.f26622c));
                    }
                } catch (Throwable unused) {
                    Objects.toString(aVar);
                }
            }
            gVar = (p6.g) yVar5.f38361a;
            if (gVar != null && Build.VERSION.SDK_INT >= 31) {
                e6.p.f25009a.a(remoteViews, i14, gVar);
            }
            oVar = (k6.o) yVar4.f38361a;
            if (oVar != null) {
                Resources resources = context.getResources();
                k6.n nVar = oVar.f37940a;
                float fH3 = ue.f.h(nVar.f37939b, resources) + nVar.f37938a;
                k6.n nVar2 = oVar.f37941b;
                fH = ue.f.h(nVar2.f37939b, resources) + nVar2.f37938a;
                k6.n nVar3 = oVar.f37942c;
                float fH4 = ue.f.h(nVar3.f37939b, resources) + nVar3.f37938a;
                k6.n nVar4 = oVar.f37943d;
                float fH5 = ue.f.h(nVar4.f37939b, resources) + nVar4.f37938a;
                k6.n nVar5 = oVar.f37944e;
                fH2 = ue.f.h(nVar5.f37939b, resources) + nVar5.f37938a;
                k6.n nVar6 = oVar.f37945f;
                float fH6 = ue.f.h(nVar6.f37939b, resources) + nVar6.f37938a;
                z11 = x1Var.f25080c;
                if (z11) {
                    f5 = fH2;
                } else {
                    f5 = fH;
                }
                float f11 = fH3 + f5;
                if (!z11) {
                    fH = fH2;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                remoteViews.setViewPadding(u0Var.f25052a, (int) TypedValue.applyDimension(1, f11, displayMetrics), (int) TypedValue.applyDimension(1, fH4, displayMetrics), (int) TypedValue.applyDimension(1, fH5 + fH, displayMetrics), (int) TypedValue.applyDimension(1, fH6, displayMetrics));
            }
            if (yVar9.f38361a == null) {
                throw new ClassCastException();
            }
            bVar2 = (l6.b) yVar10.f38361a;
            if (bVar2 != null) {
                obj = bVar2.f39771a.f39770a.get(l6.c.f39772a);
                if (obj == null) {
                    obj2 = null;
                } else {
                    obj2 = obj;
                }
                list = (List) obj2;
                if (list != null) {
                    remoteViews.setContentDescription(i14, ry.m.y0(list, null, null, null, null, 63));
                }
            }
            i12 = q.f25018a[((c6.p) yVar.f38361a).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    i15 = 4;
                } else {
                    if (i12 == 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15 = 8;
                }
            }
            remoteViews.setViewVisibility(i14, i15);
        }
        if (tVar != null) {
            l(remoteViews, tVar, i14);
        }
        if (mVar != null) {
            k(remoteViews, mVar, i14);
        }
        context = context2;
        yVar = yVar6;
        yVar8 = yVar8;
        yVar10 = yVar10;
        bVar = (d6.b) yVar7.f38361a;
        if (bVar != null) {
            aVar = bVar.f23202a;
            num = x1Var.m;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i14;
            }
            if (x1Var.f25083f) {
                remoteViews.setOnClickFillInIntent(iIntValue, f6.h.b(aVar, x1Var, iIntValue, f6.d.f26621b));
            } else {
                remoteViews.setOnClickPendingIntent(iIntValue, f6.h.c(aVar, x1Var, iIntValue, f6.d.f26622c));
            }
        }
        gVar = (p6.g) yVar5.f38361a;
        if (gVar != null) {
            e6.p.f25009a.a(remoteViews, i14, gVar);
        }
        oVar = (k6.o) yVar4.f38361a;
        if (oVar != null) {
            Resources resources2 = context.getResources();
            k6.n nVar7 = oVar.f37940a;
            float fH7 = ue.f.h(nVar7.f37939b, resources2) + nVar7.f37938a;
            k6.n nVar8 = oVar.f37941b;
            fH = ue.f.h(nVar8.f37939b, resources2) + nVar8.f37938a;
            k6.n nVar9 = oVar.f37942c;
            float fH8 = ue.f.h(nVar9.f37939b, resources2) + nVar9.f37938a;
            k6.n nVar10 = oVar.f37943d;
            float fH9 = ue.f.h(nVar10.f37939b, resources2) + nVar10.f37938a;
            k6.n nVar11 = oVar.f37944e;
            fH2 = ue.f.h(nVar11.f37939b, resources2) + nVar11.f37938a;
            k6.n nVar12 = oVar.f37945f;
            float fH10 = ue.f.h(nVar12.f37939b, resources2) + nVar12.f37938a;
            z11 = x1Var.f25080c;
            if (z11) {
                f5 = fH2;
            } else {
                f5 = fH;
            }
            float f12 = fH7 + f5;
            if (!z11) {
                fH = fH2;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(u0Var.f25052a, (int) TypedValue.applyDimension(1, f12, displayMetrics2), (int) TypedValue.applyDimension(1, fH8, displayMetrics2), (int) TypedValue.applyDimension(1, fH9 + fH, displayMetrics2), (int) TypedValue.applyDimension(1, fH10, displayMetrics2));
        }
        if (yVar9.f38361a == null) {
            throw new ClassCastException();
        }
        bVar2 = (l6.b) yVar10.f38361a;
        if (bVar2 != null) {
            obj = bVar2.f39771a.f39770a.get(l6.c.f39772a);
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            list = (List) obj2;
            if (list != null) {
                remoteViews.setContentDescription(i14, ry.m.y0(list, null, null, null, null, 63));
            }
        }
        i12 = q.f25018a[((c6.p) yVar.f38361a).ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                i15 = 4;
            } else {
                if (i12 == 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i15 = 8;
            }
        }
        remoteViews.setViewVisibility(i14, i15);
    }

    public static final void k(RemoteViews remoteViews, k6.m mVar, int i11) {
        p6.g gVar = mVar.f37937a;
        int i12 = Build.VERSION.SDK_INT;
        p6.d dVar = p6.d.f46314a;
        p6.f fVar = p6.f.f46316a;
        if (i12 >= 31) {
            if (i12 >= 33 || !ns.o.L(fVar, dVar).contains(gVar)) {
                e6.p.f25009a.b(remoteViews, i11, gVar);
                return;
            }
            return;
        }
        List listL = ns.o.L(fVar, p6.e.f46315a, dVar);
        Object obj = e6.a1.f24877a;
        if (listL.contains(gVar)) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + gVar + " requires a complex layout before API 31");
    }

    public static final void l(RemoteViews remoteViews, k6.t tVar, int i11) {
        p6.g gVar = tVar.f37954a;
        int i12 = Build.VERSION.SDK_INT;
        p6.d dVar = p6.d.f46314a;
        p6.f fVar = p6.f.f46316a;
        if (i12 >= 31) {
            if (i12 >= 33 || !ns.o.L(fVar, dVar).contains(gVar)) {
                e6.p.f25009a.c(remoteViews, i11, gVar);
                return;
            }
            return;
        }
        List listL = ns.o.L(fVar, p6.e.f46315a, dVar);
        Object obj = e6.a1.f24877a;
        if (listL.contains(gVar)) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + gVar + " requires a complex layout before API 31");
    }

    public static int m(int i11) {
        int i12 = (i11 & (~(i11 >> 31))) - 255;
        return (i12 & (i12 >> 31)) + 255;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0127  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145  */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:75:0x019f  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
    
        if (kotlin.jvm.internal.m.a(r12, r1) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList o(android.view.View r9, java.util.List r10, int r11, int r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.i.o(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList p(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static final int r(AchievementLevel achievementLevel) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    return R.drawable.achievement_day_streak_type_active;
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                return R.drawable.achievement_knowledge_point_type_active;
            }
        } else if (id2.equals("xp")) {
            return R.drawable.achievement_xp_type_active;
        }
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLevel.getId()));
    }

    public static final long s(AchievementLevel achievementLevel) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    return f0.e(4294482980L);
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                return f0.e(4281571838L);
            }
        } else if (id2.equals("xp")) {
            return f0.e(4294932600L);
        }
        return f0.e(4294482980L);
    }

    public static final List t(AchievementLevel achievementLevel) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    return ns.o.L(new g2.x(f0.e(4294956385L)), new g2.x(f0.c(16766305)));
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                return ns.o.L(new g2.x(f0.e(4283677439L)), new g2.x(f0.c(5487359)));
            }
        } else if (id2.equals("xp")) {
            return ns.o.L(new g2.x(f0.e(4293897656L)), new g2.x(f0.c(15707576)));
        }
        return ns.o.L(new g2.x(f0.e(4283677439L)), new g2.x(f0.c(21434)));
    }

    public static final List u(AchievementLevel achievementLevel) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    return ns.o.L(new g2.x(f0.e(4294821984L)), new g2.x(f0.e(4293803582L)));
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                return ns.o.L(new g2.x(f0.e(4279556092L)), new g2.x(f0.e(4279644104L)));
            }
        } else if (id2.equals("xp")) {
            return ns.o.L(new g2.x(f0.e(4293634104L)), new g2.x(f0.e(4293426478L)));
        }
        return ns.o.L(new g2.x(f0.e(4287556851L)), new g2.x(f0.e(4280722940L)));
    }

    public static final String v(AchievementLevel achievementLevel, n nVar) {
        l1.s sVar;
        int i11;
        int i12;
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode == 3832) {
            if (id2.equals("xp")) {
                sVar = (l1.s) nVar;
                i11 = R.string.xp_expert;
                i12 = -1570410418;
                return ep.a.m(sVar, i12, i11, sVar, false);
            }
            l1.s sVar2 = (l1.s) nVar;
            sVar2.d0(-1570386903);
            sVar2.p(false);
            throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLevel.getId()));
        }
        if (iHashCode == 159337103) {
            if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                sVar = (l1.s) nVar;
                i11 = R.string.top_student;
                i12 = -1570404976;
                return ep.a.m(sVar, i12, i11, sVar, false);
            }
            l1.s sVar3 = (l1.s) nVar;
            sVar3.d0(-1570386903);
            sVar3.p(false);
            throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLevel.getId()));
        }
        if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
            sVar = (l1.s) nVar;
            i11 = R.string.streak_superhero;
            i12 = -1570388779;
            return ep.a.m(sVar, i12, i11, sVar, false);
        }
        l1.s sVar4 = (l1.s) nVar;
        sVar4.d0(-1570386903);
        sVar4.p(false);
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLevel.getId()));
    }

    public static final String w(AchievementLevel achievementLevel, n nVar) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    l1.s sVar = (l1.s) nVar;
                    sVar.d0(16777546);
                    String strQ0 = oz.x.q0(ub.a.e0(sVar, R.string.nice_going_you_reached_a_s_day_streak_and_won_the_d_badge), "%d", v(achievementLevel, sVar));
                    sVar.p(false);
                    return strQ0;
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                l1.s sVar2 = (l1.s) nVar;
                sVar2.d0(16745940);
                String strQ1 = oz.x.q0(ub.a.e0(sVar2, R.string.cool_you_mastered_s_knowledge_points_and_won_the_badge), "%d", v(achievementLevel, sVar2));
                sVar2.p(false);
                return strQ1;
            }
        } else if (id2.equals("xp")) {
            l1.s sVar3 = (l1.s) nVar;
            sVar3.d0(16733748);
            String strQ2 = oz.x.q0(ub.a.e0(sVar3, R.string.congratulations_you_got_s_xp_and_won_the_badge), "%d", v(achievementLevel, sVar3));
            sVar3.p(false);
            return strQ2;
        }
        l1.s sVar4 = (l1.s) nVar;
        sVar4.d0(16793261);
        sVar4.p(false);
        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLevel.getId()));
    }

    public static final int x(AchievementLevel achievementLevel, int i11) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    switch (i11) {
                        case 0:
                        case 1:
                            return 3;
                        case 2:
                            return 7;
                        case 3:
                            return 14;
                        case 4:
                            return 30;
                        case 5:
                            return 50;
                        case 6:
                            return 75;
                        case 7:
                            return AchievementLevelType.DAY_STREAK_LV_7;
                        case 8:
                            return AchievementLevelType.DAY_STREAK_LV_8;
                        case 9:
                            return 250;
                        case 10:
                            return AchievementLevelType.DAY_STREAK_LV_10;
                        default:
                            throw new IllegalArgumentException(nv.p.j(i11, "wrong level: "));
                    }
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                switch (i11) {
                    case 0:
                    case 1:
                        return 20;
                    case 2:
                        return 50;
                    case 3:
                        return 100;
                    case 4:
                        return AchievementLevelType.KNOWLEDGE_POINT_LV_4;
                    case 5:
                        return 250;
                    case 6:
                        return 500;
                    case 7:
                        return AchievementLevelType.KNOWLEDGE_POINT_LV_7;
                    case 8:
                        return 1000;
                    case 9:
                        return AchievementLevelType.KNOWLEDGE_POINT_LV_9;
                    case 10:
                        return 2000;
                    default:
                        throw new IllegalArgumentException(nv.p.j(i11, "wrong level: "));
                }
            }
        } else if (id2.equals("xp")) {
            switch (i11) {
                case 0:
                case 1:
                    return 100;
                case 2:
                    return 250;
                case 3:
                    return 500;
                case 4:
                    return 1000;
                case 5:
                    return 2000;
                case 6:
                    return AchievementLevelType.XP_LV_6;
                case 7:
                    return AchievementLevelType.XP_LV_7;
                case 8:
                    return AchievementLevelType.XP_LV_8;
                case 9:
                    return AchievementLevelType.XP_LV_9;
                case 10:
                    return 30000;
                default:
                    throw new IllegalArgumentException(nv.p.j(i11, "wrong level: "));
            }
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public static Object y(se.u typeOfParameter, String key, Bundle bundle, se.t tVar) {
        Object obj;
        Map map;
        m.f(typeOfParameter, "typeOfParameter");
        m.f(key, "key");
        if (tVar != null) {
            LinkedHashMap linkedHashMap = tVar.f51615a;
            if (linkedHashMap.containsKey(typeOfParameter) && (map = (Map) linkedHashMap.get(typeOfParameter)) != null) {
                obj = map.get(key);
            } else {
                obj = null;
            }
        } else {
            obj = null;
        }
        return obj == null ? bundle != null ? bundle.getCharSequence(key) : null : obj;
    }

    public static v z(se.u typeOfParameter, String parameter) {
        m.f(typeOfParameter, "typeOfParameter");
        m.f(parameter, "parameter");
        Map map = se.t.f51614b;
        qy.l lVar = (qy.l) map.get(typeOfParameter);
        Set set = lVar != null ? (Set) lVar.f48495a : null;
        qy.l lVar2 = (qy.l) map.get(typeOfParameter);
        Set set2 = lVar2 != null ? (Set) lVar2.f48496b : null;
        if (set == null || !set.contains(parameter)) {
            return (set2 == null || !set2.contains(parameter)) ? v.CustomData : v.CustomAndOperationalData;
        }
        return v.OperationalData;
    }

    @Override // z4.x0
    public void a() {
    }

    @Override // z4.x0
    public void c() {
    }

    public abstract boolean n(x2.h hVar);

    public abstract Object q(x2.h hVar);

    public static final String A(AchievementLevel achievementLevel) {
        m.f(achievementLevel, "<this>");
        String id2 = achievementLevel.getId();
        int iHashCode = id2.hashCode();
        if (iHashCode != 3832) {
            if (iHashCode != 159337103) {
                if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                    return AchievementLevelType.DAY_STREAK;
                }
            } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                return "top_student";
            }
        } else if (id2.equals("xp")) {
            return "xp_expert";
        }
        return FpIL.oqKhQmmJoKp;
    }

    public static final void F(AchievementLevel achievementLevel, String str, String str2, ur.a eventTracker) {
        m.f(achievementLevel, gkbGsXmgaxRjJ.AoHQnLemncwf);
        m.f(eventTracker, "eventTracker");
        eventTracker.c("ep_badge_share", new l0(achievementLevel, str, str2, 21));
    }
}
