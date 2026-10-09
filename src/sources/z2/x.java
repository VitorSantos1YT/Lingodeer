package z2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends z4.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final y.w f58704q0 = y.l.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public long H;
    public List K;
    public final Handler L;
    public final l5.a M;
    public int N;
    public int O;
    public a5.g P;
    public a5.g Q;
    public boolean R;
    public final y.x S;
    public final y.x T;
    public final y.u0 U;
    public final y.u0 V;
    public int W;
    public Integer X;
    public final y.f Y;
    public final tz.h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f58705a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public t f58706b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public y.x f58707c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f58708d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final y.y f58709d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final y.v f58711e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final y.v f58713f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f58714g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f58715h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final m4 f58716i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final y.x f58717j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public h2 f58718k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f58719l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final y.v f58720m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final lf.i0 f58721n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ArrayList f58722o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final w f58723p0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f58724t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f58710e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f58712f = new w(this, 0);

    public x(AndroidComposeView androidComposeView) {
        this.f58708d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f58724t = (AccessibilityManager) systemService;
        this.H = 100L;
        this.L = new Handler(Looper.getMainLooper());
        int i11 = 1;
        this.M = new l5.a(this, i11);
        this.N = Integer.MIN_VALUE;
        this.O = Integer.MIN_VALUE;
        this.S = new y.x();
        this.T = new y.x();
        this.U = new y.u0(0);
        this.V = new y.u0(0);
        this.W = -1;
        this.Y = new y.f(0);
        this.Z = qx.p.b(1, 6, null);
        this.f58705a0 = true;
        y.x xVar = y.n.f56742a;
        kotlin.jvm.internal.m.d(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f58707c0 = xVar;
        this.f58709d0 = new y.y();
        this.f58711e0 = new y.v();
        this.f58713f0 = new y.v();
        this.f58714g0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f58715h0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f58716i0 = new m4(2);
        this.f58717j0 = new y.x();
        g3.t tVarA = androidComposeView.getSemanticsOwner().a();
        kotlin.jvm.internal.m.d(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f58718k0 = new h2(tVarA, xVar);
        int i12 = y.j.f56719a;
        this.f58720m0 = new y.v();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.f58721n0 = new lf.i0(this, 25);
        this.f58722o0 = new ArrayList();
        this.f58723p0 = new w(this, i11);
    }

    public static /* synthetic */ void E(x xVar, int i11, int i12, Integer num, int i13) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        xVar.D(i11, i12, num, null);
    }

    public static Rect L(g2.f0 f0Var, float f5, float f11) {
        if (!(f0Var instanceof g2.m0) && !(f0Var instanceof g2.n0)) {
            return null;
        }
        f2.c cVarP = f0Var.p();
        return new Rect((int) (cVarP.f26572a + f5), (int) (cVarP.f26573b + f11), (int) (cVarP.f26574c + f5), (int) (cVarP.f26575d + f11));
    }

    public static float[] N(g2.f0 f0Var) {
        if (!(f0Var instanceof g2.n0)) {
            return null;
        }
        f2.d dVar = ((g2.n0) f0Var).f28587f;
        long j11 = dVar.f26583h;
        long j12 = dVar.f26582g;
        long j13 = dVar.f26581f;
        long j14 = dVar.f26580e;
        return new float[]{Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L))};
    }

    public static Region O(g2.f0 f0Var, float f5, float f11) {
        if (!(f0Var instanceof g2.l0)) {
            return null;
        }
        g2.l0 l0Var = (g2.l0) f0Var;
        f2.c cVarH = l0Var.p().h(f5, f11);
        Region region = new Region(new Rect((int) (cVarH.f26572a + CropImageView.DEFAULT_ASPECT_RATIO), (int) (cVarH.f26573b + CropImageView.DEFAULT_ASPECT_RATIO), (int) (cVarH.f26574c + CropImageView.DEFAULT_ASPECT_RATIO), (int) (cVarH.f26575d + CropImageView.DEFAULT_ASPECT_RATIO)));
        Region region2 = new Region();
        g2.p0 p0Var = l0Var.f28581f;
        if (!(p0Var instanceof g2.k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((g2.k) p0Var).f28575a;
        path.offset(f5, f11);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i11 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i11 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i11);
                kotlin.jvm.internal.m.d(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String t(g3.t tVar) {
        j3.h hVar;
        if (tVar != null) {
            g3.o oVar = tVar.f28699d;
            y.i0 i0Var = oVar.f28691a;
            g3.a0 a0Var = g3.x.f28710a;
            if (i0Var.c(a0Var)) {
                return x3.a.a((List) oVar.e(a0Var), ",", null, 62);
            }
            g3.a0 a0Var2 = g3.x.F;
            if (i0Var.c(a0Var2)) {
                Object objG = i0Var.g(a0Var2);
                if (objG == null) {
                    objG = null;
                }
                j3.h hVar2 = (j3.h) objG;
                if (hVar2 != null) {
                    return hVar2.f35700b;
                }
            } else {
                Object objG2 = i0Var.g(g3.x.B);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (hVar = (j3.h) ry.m.s0(list)) != null) {
                    return hVar.f35700b;
                }
            }
        }
        return null;
    }

    public static final boolean x(g3.l lVar, float f5) {
        fz.a aVar = lVar.f28657a;
        if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO || ((Number) aVar.invoke()).floatValue() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return f5 > CropImageView.DEFAULT_ASPECT_RATIO && ((Number) aVar.invoke()).floatValue() < ((Number) lVar.f28658b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(g3.l lVar) {
        fz.a aVar = lVar.f28657a;
        if (((Number) aVar.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        ((Number) lVar.f28658b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(g3.l lVar) {
        fz.a aVar = lVar.f28657a;
        if (((Number) aVar.invoke()).floatValue() < ((Number) lVar.f28658b.invoke()).floatValue()) {
            return true;
        }
        ((Number) aVar.invoke()).floatValue();
        return false;
    }

    public final int A(int i11) {
        if (i11 == this.f58708d.getSemanticsOwner().a().f28702g) {
            return -1;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void B(g3.t tVar, h2 h2Var) {
        int[] iArr = y.o.f56744a;
        y.y yVar = new y.y();
        List listJ = g3.t.j(4, tVar);
        y2.i0 i0Var = tVar.f28698c;
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            g3.t tVar2 = (g3.t) listJ.get(i11);
            y.m mVarS = s();
            int i12 = tVar2.f28702g;
            if (mVarS.a(i12)) {
                if (!h2Var.f58584b.b(i12)) {
                    w(i0Var);
                    return;
                }
                yVar.a(i12);
            }
        }
        y.y yVar2 = h2Var.f58584b;
        int[] iArr2 = yVar2.f56786b;
        long[] jArr = yVar2.f56785a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j11 = jArr[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j11) < 128 && !yVar.b(iArr2[(i13 << 3) + i15])) {
                            w(i0Var);
                            return;
                        }
                        j11 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        List listJ2 = g3.t.j(4, tVar);
        int size2 = listJ2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            g3.t tVar3 = (g3.t) listJ2.get(i16);
            h2 h2Var2 = (h2) this.f58717j0.b(tVar3.f28702g);
            if (h2Var2 != null && s().a(tVar3.f28702g)) {
                B(tVar3, h2Var2);
            }
        }
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.R = true;
        }
        try {
            return ((Boolean) this.f58712f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.R = false;
        }
    }

    public final boolean D(int i11, int i12, Integer num, List list) {
        if (i11 == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i11, i12);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(x3.a.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i11, int i12, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i11), 32);
        accessibilityEventO.setContentChangeTypes(i12);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i11) {
        t tVar = this.f58706b0;
        if (tVar != null) {
            g3.t tVar2 = tVar.f58666a;
            if (i11 != tVar2.f28702g) {
                return;
            }
            if (SystemClock.uptimeMillis() - tVar.f58671f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(tVar2.f28702g), OSSConstants.DEFAULT_STREAM_BUFFER_SIZE);
                accessibilityEventO.setFromIndex(tVar.f58669d);
                accessibilityEventO.setToIndex(tVar.f58670e);
                accessibilityEventO.setAction(tVar.f58667b);
                accessibilityEventO.setMovementGranularity(tVar.f58668c);
                accessibilityEventO.getText().add(t(tVar2));
                C(accessibilityEventO);
            }
        }
        this.f58706b0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:215:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:239:0x0515  */
    /* JADX WARN: Code duplicated, block: B:283:0x063a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    public final void H(y.m mVar) {
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num;
        int i11;
        int i12;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i13;
        int i14;
        Integer num2;
        g3.o oVar;
        g3.t tVar;
        boolean z11;
        int i15;
        boolean z12;
        boolean z13;
        y.i0 i0Var;
        y2.i0 i0Var2;
        int i16;
        g3.o oVar2;
        long j11;
        int i17;
        Integer num3;
        y.i0 i0Var3;
        int i18;
        g2 g2Var;
        boolean z14;
        g3.a0 a0Var;
        g2 g2Var2;
        boolean z15;
        qy.e eVar;
        int i19;
        String str;
        int i21;
        int i22;
        int i23;
        Integer num4;
        AccessibilityEvent accessibilityEventP;
        String str2;
        y.m mVar2 = mVar;
        ArrayList arrayList3 = this.f58722o0;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int[] iArr3 = mVar2.f56737b;
        long[] jArr3 = mVar2.f56736a;
        int i24 = 2;
        int length = jArr3.length - 2;
        int i25 = 0;
        Integer num5 = 0;
        if (length < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            long j12 = jArr3[i26];
            int i27 = i24;
            int i28 = length;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i29 = 8;
                int i30 = 8 - ((~(i26 - i28)) >>> 31);
                long j13 = j12;
                int i31 = i25;
                while (i31 < i30) {
                    if ((j13 & 255) < 128) {
                        int i32 = iArr3[(i26 << 3) + i31];
                        h2 h2Var = (h2) this.f58717j0.b(i32);
                        if (h2Var == null) {
                            i12 = i31;
                            arrayList2 = arrayList4;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i13 = i30;
                            i14 = i26;
                            num2 = num5;
                        } else {
                            g3.o oVar3 = h2Var.f58583a;
                            y.i0 i0Var4 = oVar3.f28691a;
                            g3.u uVar = (g3.u) mVar2.b(i32);
                            int i33 = i29;
                            g3.t tVar2 = uVar != null ? uVar.f28703a : null;
                            if (tVar2 == null) {
                                throw defpackage.e.t("no value for specified key");
                            }
                            y2.i0 i0Var5 = tVar2.f28698c;
                            g3.o oVar4 = tVar2.f28699d;
                            iArr2 = iArr3;
                            int i34 = tVar2.f28702g;
                            jArr2 = jArr3;
                            y.i0 i0Var6 = oVar4.f28691a;
                            i14 = i26;
                            Object[] objArr = i0Var6.f56714b;
                            Object[] objArr2 = i0Var6.f56715c;
                            long[] jArr4 = i0Var6.f56713a;
                            i12 = i31;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                y2.i0 i0Var7 = i0Var5;
                                i13 = i30;
                                int i35 = 0;
                                z12 = false;
                                while (true) {
                                    long j14 = jArr4[i35];
                                    tVar = tVar2;
                                    int i36 = i35;
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i37 = 8 - ((~(i36 - length2)) >>> 31);
                                        int i38 = 0;
                                        while (i38 < i37) {
                                            if ((j14 & 255) < 128) {
                                                int i39 = (i36 << 3) + i38;
                                                Object obj = objArr[i39];
                                                int i40 = length2;
                                                Object obj2 = objArr2[i39];
                                                oVar2 = oVar3;
                                                g3.a0 a0Var2 = (g3.a0) obj;
                                                j11 = j14;
                                                g3.a0 a0Var3 = g3.x.f28729u;
                                                if (kotlin.jvm.internal.m.a(a0Var2, a0Var3) || kotlin.jvm.internal.m.a(a0Var2, g3.x.f28730v)) {
                                                    int size = arrayList4.size();
                                                    int i41 = 0;
                                                    while (true) {
                                                        if (i41 >= size) {
                                                            g2Var = null;
                                                            break;
                                                        }
                                                        int i42 = size;
                                                        if (((g2) arrayList4.get(i41)).f58562a == i32) {
                                                            g2Var = (g2) arrayList4.get(i41);
                                                            break;
                                                        } else {
                                                            i41++;
                                                            size = i42;
                                                        }
                                                    }
                                                    if (g2Var != null) {
                                                        z14 = false;
                                                    } else {
                                                        g2Var = new g2(i32, arrayList3);
                                                        z14 = true;
                                                    }
                                                    arrayList3.add(g2Var);
                                                } else {
                                                    z14 = false;
                                                }
                                                if (z14) {
                                                    a0Var = g3.x.f28713d;
                                                    if (kotlin.jvm.internal.m.a(a0Var2, a0Var)) {
                                                        kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        str2 = (String) obj2;
                                                        if (i0Var4.c(a0Var)) {
                                                            F(i32, i33, str2);
                                                        }
                                                        i32 = i32;
                                                        arrayList4 = arrayList4;
                                                        i37 = i37;
                                                        i17 = 8;
                                                        num3 = num5;
                                                        i0Var3 = i0Var4;
                                                        i18 = i40;
                                                    } else if (!kotlin.jvm.internal.m.a(a0Var2, g3.x.f28711b) || kotlin.jvm.internal.m.a(a0Var2, g3.x.J)) {
                                                        i32 = i32;
                                                        arrayList4 = arrayList4;
                                                        i37 = i37;
                                                        i0Var7 = i0Var7;
                                                        num3 = num5;
                                                        i0Var3 = i0Var4;
                                                        i18 = i40;
                                                        i17 = 8;
                                                        E(this, A(i32), 2048, 64, 8);
                                                        E(this, A(i32), 2048, num3, 8);
                                                    } else if (kotlin.jvm.internal.m.a(a0Var2, g3.x.f28712c)) {
                                                        i17 = 8;
                                                        E(this, A(i32), 2048, 64, 8);
                                                        E(this, A(i32), 2048, num5, 8);
                                                        num3 = num5;
                                                        i0Var3 = i0Var4;
                                                        i18 = i40;
                                                    } else {
                                                        g3.a0 a0Var4 = g3.x.I;
                                                        arrayList4 = arrayList4;
                                                        if (kotlin.jvm.internal.m.a(a0Var2, a0Var4)) {
                                                            Object objG = i0Var6.g(g3.x.f28733y);
                                                            if (objG == null) {
                                                                objG = null;
                                                            }
                                                            g3.k kVar = (g3.k) objG;
                                                            if (kVar != null && kVar.f28656a == 4) {
                                                                Object objG2 = i0Var6.g(a0Var4);
                                                                if (objG2 == null) {
                                                                    objG2 = null;
                                                                }
                                                                if (kotlin.jvm.internal.m.a(objG2, Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventO = o(A(i32), 4);
                                                                    g3.t tVar3 = tVar;
                                                                    i0Var7 = i0Var7;
                                                                    g3.t tVar4 = new g3.t(tVar3.f28696a, true, i0Var7, oVar4);
                                                                    Object objG3 = tVar4.k().f28691a.g(g3.x.f28710a);
                                                                    if (objG3 == null) {
                                                                        objG3 = null;
                                                                    }
                                                                    List list = (List) objG3;
                                                                    tVar = tVar3;
                                                                    String strA = list != null ? x3.a.a(list, ",", null, 62) : null;
                                                                    Object objG4 = tVar4.k().f28691a.g(g3.x.B);
                                                                    if (objG4 == null) {
                                                                        objG4 = null;
                                                                    }
                                                                    List list2 = (List) objG4;
                                                                    String strA2 = list2 != null ? x3.a.a(list2, ",", null, 62) : null;
                                                                    if (strA != null) {
                                                                        accessibilityEventO.setContentDescription(strA);
                                                                    }
                                                                    if (strA2 != null) {
                                                                        accessibilityEventO.getText().add(strA2);
                                                                    }
                                                                    C(accessibilityEventO);
                                                                } else {
                                                                    i0Var7 = i0Var7;
                                                                    E(this, A(i32), 2048, num5, 8);
                                                                }
                                                            } else {
                                                                i0Var7 = i0Var7;
                                                                E(this, A(i32), 2048, 64, 8);
                                                                E(this, A(i32), 2048, num5, 8);
                                                            }
                                                            num3 = num5;
                                                            i32 = i32;
                                                            i0Var3 = i0Var4;
                                                            i18 = i40;
                                                            i17 = 8;
                                                        } else {
                                                            i37 = i37;
                                                            i0Var7 = i0Var7;
                                                            if (kotlin.jvm.internal.m.a(a0Var2, g3.x.f28710a)) {
                                                                int iA = A(i32);
                                                                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                D(iA, 2048, 4, (List) obj2);
                                                                num3 = num5;
                                                                i32 = i32;
                                                                i0Var3 = i0Var4;
                                                            } else {
                                                                g3.a0 a0Var5 = g3.x.F;
                                                                boolean zA = kotlin.jvm.internal.m.a(a0Var2, a0Var5);
                                                                String str3 = BuildConfig.VERSION_NAME;
                                                                if (!zA) {
                                                                    Integer num6 = num5;
                                                                    i32 = i32;
                                                                    i0Var3 = i0Var4;
                                                                    g3.a0 a0Var6 = g3.x.G;
                                                                    if (kotlin.jvm.internal.m.a(a0Var2, a0Var6)) {
                                                                        Object objG5 = i0Var6.g(a0Var5);
                                                                        if (objG5 == null) {
                                                                            objG5 = null;
                                                                        }
                                                                        j3.h hVar = (j3.h) objG5;
                                                                        if (hVar != null && (str = hVar.f35700b) != null) {
                                                                            str3 = str;
                                                                        }
                                                                        long j15 = ((j3.x0) oVar4.e(a0Var6)).f35823a;
                                                                        num3 = num6;
                                                                        C(p(A(i32), Integer.valueOf((int) (j15 >> 32)), Integer.valueOf((int) (j15 & 4294967295L)), Integer.valueOf(str3.length()), P(str3)));
                                                                        G(i34);
                                                                    } else {
                                                                        i18 = i40;
                                                                        num3 = num6;
                                                                        if (kotlin.jvm.internal.m.a(a0Var2, a0Var3) || kotlin.jvm.internal.m.a(a0Var2, g3.x.f28730v)) {
                                                                            w(i0Var7);
                                                                            int size2 = arrayList3.size();
                                                                            int i43 = 0;
                                                                            while (true) {
                                                                                if (i43 >= size2) {
                                                                                    g2Var2 = null;
                                                                                    break;
                                                                                } else {
                                                                                    if (((g2) arrayList3.get(i43)).f58562a == i32) {
                                                                                        g2Var2 = (g2) arrayList3.get(i43);
                                                                                        break;
                                                                                    }
                                                                                    i43++;
                                                                                }
                                                                            }
                                                                            kotlin.jvm.internal.m.c(g2Var2);
                                                                            Object objG6 = i0Var6.g(a0Var3);
                                                                            if (objG6 == null) {
                                                                                objG6 = null;
                                                                            }
                                                                            g2Var2.f58566e = (g3.l) objG6;
                                                                            Object objG7 = i0Var6.g(g3.x.f28730v);
                                                                            if (objG7 == null) {
                                                                                objG7 = null;
                                                                            }
                                                                            g2Var2.f58567f = (g3.l) objG7;
                                                                            if (g2Var2.f58563b.contains(g2Var2)) {
                                                                                this.f58708d.getSnapshotObserver().f57019a.d(g2Var2, this.f58723p0, new d2.c(18, g2Var2, this));
                                                                            }
                                                                        } else if (kotlin.jvm.internal.m.a(a0Var2, g3.x.f28720k)) {
                                                                            kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                            if (((Boolean) obj2).booleanValue()) {
                                                                                i19 = 8;
                                                                                C(o(A(i34), 8));
                                                                            } else {
                                                                                i19 = 8;
                                                                            }
                                                                            E(this, A(i34), 2048, num3, i19);
                                                                            i17 = i19;
                                                                        } else {
                                                                            g3.a0 a0Var7 = g3.n.f28688x;
                                                                            if (kotlin.jvm.internal.m.a(a0Var2, a0Var7)) {
                                                                                List list3 = (List) oVar4.e(a0Var7);
                                                                                Object objG8 = i0Var3.g(a0Var7);
                                                                                if (objG8 == null) {
                                                                                    objG8 = null;
                                                                                }
                                                                                List list4 = (List) objG8;
                                                                                if (list4 != null) {
                                                                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                    int size3 = list3.size();
                                                                                    int i44 = 0;
                                                                                    while (i44 < size3) {
                                                                                        linkedHashSet.add(((g3.f) list3.get(i44)).f28646a);
                                                                                        i44++;
                                                                                        list3 = list3;
                                                                                    }
                                                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                    int size4 = list4.size();
                                                                                    int i45 = 0;
                                                                                    while (i45 < size4) {
                                                                                        linkedHashSet2.add(((g3.f) list4.get(i45)).f28646a);
                                                                                        i45++;
                                                                                        list4 = list4;
                                                                                    }
                                                                                    if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                        z12 = false;
                                                                                    }
                                                                                } else if (!list3.isEmpty()) {
                                                                                }
                                                                                z12 = true;
                                                                            } else {
                                                                                if (obj2 instanceof g3.a) {
                                                                                    g3.a aVar = (g3.a) obj2;
                                                                                    Object objG9 = i0Var3.g(a0Var2);
                                                                                    if (objG9 == null) {
                                                                                        objG9 = null;
                                                                                    }
                                                                                    if (aVar != objG9) {
                                                                                        if (objG9 instanceof g3.a) {
                                                                                            String str4 = aVar.f28634a;
                                                                                            g3.a aVar2 = (g3.a) objG9;
                                                                                            qy.e eVar2 = aVar2.f28635b;
                                                                                            z15 = kotlin.jvm.internal.m.a(str4, aVar2.f28634a) && ((eVar = aVar.f28635b) != null || eVar2 == null) && (eVar == null || eVar2 != null);
                                                                                        }
                                                                                    }
                                                                                    if (z15) {
                                                                                        z12 = false;
                                                                                    }
                                                                                }
                                                                                z12 = true;
                                                                            }
                                                                        }
                                                                        i17 = 8;
                                                                    }
                                                                } else if (i0Var6.c(g3.n.f28676k)) {
                                                                    Object objG10 = i0Var4.g(a0Var5);
                                                                    if (objG10 == null) {
                                                                        objG10 = null;
                                                                    }
                                                                    j3.h hVar2 = (j3.h) objG10;
                                                                    if (hVar2 == null) {
                                                                        hVar2 = BuildConfig.VERSION_NAME;
                                                                    }
                                                                    Object objG11 = i0Var6.g(a0Var5);
                                                                    if (objG11 == null) {
                                                                        objG11 = null;
                                                                    }
                                                                    CharSequence charSequence = (j3.h) objG11;
                                                                    if (charSequence == null) {
                                                                        charSequence = BuildConfig.VERSION_NAME;
                                                                    }
                                                                    CharSequence charSequenceP = P(charSequence);
                                                                    int length3 = hVar2.length();
                                                                    int length4 = charSequence.length();
                                                                    int i46 = length3 > length4 ? length4 : length3;
                                                                    Integer num7 = num5;
                                                                    int i47 = 0;
                                                                    while (true) {
                                                                        i21 = length3;
                                                                        if (i47 >= i46) {
                                                                            i22 = length4;
                                                                            break;
                                                                        }
                                                                        i22 = length4;
                                                                        if (hVar2.charAt(i47) != charSequence.charAt(i47)) {
                                                                            break;
                                                                        }
                                                                        i47++;
                                                                        length3 = i21;
                                                                        length4 = i22;
                                                                    }
                                                                    int i48 = 0;
                                                                    while (true) {
                                                                        if (i48 >= i46 - i47) {
                                                                            i23 = i48;
                                                                            break;
                                                                        }
                                                                        i23 = i48;
                                                                        if (hVar2.charAt((i21 - 1) - i48) != charSequence.charAt((i22 - 1) - i23)) {
                                                                            break;
                                                                        } else {
                                                                            i48 = i23 + 1;
                                                                        }
                                                                    }
                                                                    int i49 = (i21 - i23) - i47;
                                                                    int i50 = (i22 - i23) - i47;
                                                                    g3.a0 a0Var8 = g3.x.K;
                                                                    boolean zC = i0Var4.c(a0Var8);
                                                                    boolean zC2 = i0Var6.c(a0Var8);
                                                                    boolean zC3 = i0Var4.c(g3.x.F);
                                                                    boolean z16 = zC3 && !zC && zC2;
                                                                    boolean z17 = zC3 && zC && !zC2;
                                                                    if (z16 || z17) {
                                                                        i32 = i32;
                                                                        num4 = num7;
                                                                        accessibilityEventP = p(A(i32), num4, num7, Integer.valueOf(i22), charSequenceP);
                                                                    } else {
                                                                        accessibilityEventP = o(A(i32), 16);
                                                                        accessibilityEventP.setFromIndex(i47);
                                                                        accessibilityEventP.setRemovedCount(i49);
                                                                        accessibilityEventP.setAddedCount(i50);
                                                                        accessibilityEventP.setBeforeText(hVar2);
                                                                        accessibilityEventP.getText().add(charSequenceP);
                                                                        i32 = i32;
                                                                        num4 = num7;
                                                                    }
                                                                    accessibilityEventP.setClassName("android.widget.EditText");
                                                                    C(accessibilityEventP);
                                                                    if (z16 || z17) {
                                                                        long j16 = ((j3.x0) oVar4.e(g3.x.G)).f35823a;
                                                                        accessibilityEventP.setFromIndex((int) (j16 >> 32));
                                                                        accessibilityEventP.setToIndex((int) (j16 & 4294967295L));
                                                                        C(accessibilityEventP);
                                                                    }
                                                                    i18 = i40;
                                                                    num3 = num4;
                                                                    i0Var3 = i0Var4;
                                                                    i17 = 8;
                                                                } else {
                                                                    Integer num8 = num5;
                                                                    i32 = i32;
                                                                    i17 = 8;
                                                                    E(this, A(i32), 2048, Integer.valueOf(i27), 8);
                                                                    i18 = i40;
                                                                    num3 = num8;
                                                                    i0Var3 = i0Var4;
                                                                }
                                                            }
                                                            i18 = i40;
                                                            i17 = 8;
                                                        }
                                                    }
                                                } else {
                                                    Object objG12 = i0Var4.g(a0Var2);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (kotlin.jvm.internal.m.a(obj2, objG12)) {
                                                        i17 = i33;
                                                    } else {
                                                        a0Var = g3.x.f28713d;
                                                        if (kotlin.jvm.internal.m.a(a0Var2, a0Var)) {
                                                            kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.String");
                                                            str2 = (String) obj2;
                                                            if (i0Var4.c(a0Var)) {
                                                                F(i32, i33, str2);
                                                            }
                                                            i32 = i32;
                                                            arrayList4 = arrayList4;
                                                            i37 = i37;
                                                            i17 = 8;
                                                            num3 = num5;
                                                            i0Var3 = i0Var4;
                                                            i18 = i40;
                                                        } else if (kotlin.jvm.internal.m.a(a0Var2, g3.x.f28711b)) {
                                                            i32 = i32;
                                                            arrayList4 = arrayList4;
                                                            i37 = i37;
                                                            i0Var7 = i0Var7;
                                                            num3 = num5;
                                                            i0Var3 = i0Var4;
                                                            i18 = i40;
                                                            i17 = 8;
                                                            E(this, A(i32), 2048, 64, 8);
                                                            E(this, A(i32), 2048, num3, 8);
                                                        } else {
                                                            i32 = i32;
                                                            arrayList4 = arrayList4;
                                                            i37 = i37;
                                                            i0Var7 = i0Var7;
                                                            num3 = num5;
                                                            i0Var3 = i0Var4;
                                                            i18 = i40;
                                                            i17 = 8;
                                                            E(this, A(i32), 2048, 64, 8);
                                                            E(this, A(i32), 2048, num3, 8);
                                                        }
                                                    }
                                                    num3 = num5;
                                                    i0Var3 = i0Var4;
                                                    i18 = i40;
                                                }
                                            } else {
                                                oVar2 = oVar3;
                                                arrayList4 = arrayList4;
                                                j11 = j14;
                                                i37 = i37;
                                                i38 = i38;
                                                i17 = i33;
                                                i0Var7 = i0Var7;
                                                num3 = num5;
                                                i32 = i32;
                                                i0Var3 = i0Var4;
                                                i18 = length2;
                                            }
                                            i33 = i17;
                                            i0Var4 = i0Var3;
                                            i0Var7 = i0Var7;
                                            i37 = i37;
                                            i38++;
                                            length2 = i18;
                                            num5 = num3;
                                            arrayList4 = arrayList4;
                                            i32 = i32;
                                            j14 = j11 >> i17;
                                            oVar3 = oVar2;
                                        }
                                        i15 = i32;
                                        oVar = oVar3;
                                        arrayList2 = arrayList4;
                                        i0Var2 = i0Var7;
                                        z11 = true;
                                        num2 = num5;
                                        i16 = length2;
                                        int i51 = i37;
                                        i0Var = i0Var4;
                                        if (i51 != i33) {
                                            break;
                                        }
                                    } else {
                                        i15 = i32;
                                        oVar = oVar3;
                                        i0Var = i0Var4;
                                        arrayList2 = arrayList4;
                                        i0Var2 = i0Var7;
                                        z11 = true;
                                        num2 = num5;
                                        i16 = length2;
                                    }
                                    if (i36 == i16) {
                                        break;
                                    }
                                    i32 = i15;
                                    i0Var4 = i0Var;
                                    i0Var7 = i0Var2;
                                    tVar2 = tVar;
                                    oVar3 = oVar;
                                    i33 = 8;
                                    i35 = i36 + 1;
                                    length2 = i16;
                                    num5 = num2;
                                    arrayList4 = arrayList2;
                                }
                            } else {
                                oVar = oVar3;
                                arrayList2 = arrayList4;
                                i13 = i30;
                                tVar = tVar2;
                                z11 = true;
                                num2 = num5;
                                i15 = i32;
                                z12 = false;
                            }
                            if (!z12) {
                                Iterator it = oVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z13 = false;
                                        break;
                                    } else {
                                        if (!tVar.k().f28691a.c((g3.a0) ((Map.Entry) it.next()).getKey())) {
                                            z13 = z11;
                                            break;
                                        }
                                    }
                                }
                                z12 = z13;
                            }
                            if (z12) {
                                i29 = 8;
                                E(this, A(i15), 2048, num2, 8);
                            } else {
                                i29 = 8;
                            }
                        }
                    } else {
                        i12 = i31;
                        arrayList2 = arrayList4;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i13 = i30;
                        i14 = i26;
                        num2 = num5;
                    }
                    j13 >>= i29;
                    i31 = i12 + 1;
                    mVar2 = mVar;
                    num5 = num2;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i26 = i14;
                    i30 = i13;
                    arrayList4 = arrayList2;
                }
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                int i52 = i26;
                num = num5;
                if (i30 != i29) {
                    return;
                } else {
                    i11 = i52;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr3;
                jArr = jArr3;
                num = num5;
                i11 = i26;
            }
            if (i11 == i28) {
                return;
            }
            i26 = i11 + 1;
            mVar2 = mVar;
            length = i28;
            num5 = num;
            i24 = i27;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList4 = arrayList;
            i25 = 0;
        }
    }

    public final void I(y2.i0 i0Var, y.y yVar) {
        g3.o oVarY;
        if (i0Var.I() && !this.f58708d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(i0Var)) {
            y2.i0 i0Var2 = null;
            if (!i0Var.f56892i0.g(8)) {
                i0Var = i0Var.w();
                while (true) {
                    if (i0Var == null) {
                        i0Var = null;
                        break;
                    } else if (i0Var.f56892i0.g(8)) {
                        break;
                    } else {
                        i0Var = i0Var.w();
                    }
                }
            }
            if (i0Var == null || (oVarY = i0Var.y()) == null) {
                return;
            }
            if (!oVarY.f28693c) {
                for (y2.i0 i0VarW = i0Var.w(); i0VarW != null; i0VarW = i0VarW.w()) {
                    g3.o oVarY2 = i0VarW.y();
                    if (oVarY2 != null && oVarY2.f28693c) {
                        i0Var2 = i0VarW;
                        break;
                    }
                }
                if (i0Var2 != null) {
                    i0Var = i0Var2;
                }
            }
            int i11 = i0Var.f56880b;
            if (yVar.a(i11)) {
                E(this, A(i11), 2048, 1, 8);
            }
        }
    }

    public final void J(y2.i0 i0Var) {
        if (i0Var.I() && !this.f58708d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(i0Var)) {
            int i11 = i0Var.f56880b;
            g3.l lVar = (g3.l) this.S.b(i11);
            g3.l lVar2 = (g3.l) this.T.b(i11);
            if (lVar == null && lVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i11, 4096);
            if (lVar != null) {
                accessibilityEventO.setScrollX((int) ((Number) lVar.f28657a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollX((int) ((Number) lVar.f28658b.invoke()).floatValue());
            }
            if (lVar2 != null) {
                accessibilityEventO.setScrollY((int) ((Number) lVar2.f28657a.invoke()).floatValue());
                accessibilityEventO.setMaxScrollY((int) ((Number) lVar2.f28658b.invoke()).floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(g3.t tVar, int i11, int i12, boolean z11) {
        String strT;
        g3.o oVar = tVar.f28699d;
        int i13 = tVar.f28702g;
        g3.a0 a0Var = g3.n.f28675j;
        if (oVar.f28691a.c(a0Var) && g0.j(tVar)) {
            fz.f fVar = (fz.f) ((g3.a) tVar.f28699d.e(a0Var)).f28635b;
            if (fVar != null) {
                return ((Boolean) fVar.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
            }
        } else if ((i11 != i12 || i12 != this.W) && (strT = t(tVar)) != null) {
            if (i11 < 0 || i11 != i12 || i12 > strT.length()) {
                i11 = -1;
            }
            this.W = i11;
            boolean z12 = strT.length() > 0;
            C(p(A(i13), z12 ? Integer.valueOf(this.W) : null, z12 ? Integer.valueOf(this.W) : null, z12 ? Integer.valueOf(strT.length()) : null, strT));
            G(i13);
            return true;
        }
        return false;
    }

    public final Rect M(float f5, float f11, float f12, float f13) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        AndroidComposeView androidComposeView = this.f58708d;
        long jR = androidComposeView.r(jFloatToRawIntBits);
        long jR2 = androidComposeView.r((((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
        int i11 = (int) (jR >> 32);
        int i12 = (int) (jR2 >> 32);
        int i13 = (int) (jR & 4294967295L);
        int i14 = (int) (jR2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.floor(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void Q() {
        long j11;
        long j12;
        long j13;
        char c11;
        long[] jArr;
        long[] jArr2;
        long j14;
        int i11;
        int iNumberOfTrailingZeros;
        char c12;
        h2 h2Var;
        y.y yVar = new y.y();
        y.y yVar2 = this.f58709d0;
        int[] iArr = yVar2.f56786b;
        long[] jArr3 = yVar2.f56785a;
        int length = jArr3.length - 2;
        y.x xVar = this.f58717j0;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            j11 = 128;
            j12 = 255;
            while (true) {
                long j15 = jArr3[i13];
                char c13 = 7;
                j13 = -9187201950435737472L;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j15 & 255) < 128) {
                            int i16 = iArr[(i13 << 3) + i15];
                            c12 = c13;
                            g3.u uVar = (g3.u) s().b(i16);
                            Object obj = null;
                            g3.t tVar = uVar != null ? uVar.f28703a : null;
                            if (tVar != null) {
                                if (!tVar.f28699d.f28691a.c(g3.x.f28713d)) {
                                    yVar.a(i16);
                                    h2Var = (h2) xVar.b(i16);
                                    if (h2Var != null) {
                                        Object objG = h2Var.f58583a.f28691a.g(g3.x.f28713d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    F(i16, 32, obj);
                                }
                            } else {
                                yVar.a(i16);
                                h2Var = (h2) xVar.b(i16);
                                if (h2Var != null) {
                                    Object objG2 = h2Var.f58583a.f28691a.g(g3.x.f28713d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                F(i16, 32, obj);
                            }
                        } else {
                            c12 = c13;
                        }
                        j15 >>= 8;
                        i15++;
                        c13 = c12;
                    }
                    c11 = c13;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    c11 = 7;
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        } else {
            j11 = 128;
            j12 = 255;
            j13 = -9187201950435737472L;
            c11 = 7;
        }
        int[] iArr2 = yVar.f56786b;
        long[] jArr4 = yVar.f56785a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j16 = jArr4[i17];
                if ((((~j16) << c11) & j16 & j13) != j13) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j16 & j12) < j11) {
                            int i21 = iArr2[(i17 << 3) + i19];
                            int iHashCode = Integer.hashCode(i21) * (-862048943);
                            int i22 = iHashCode ^ (iHashCode << 16);
                            int i23 = i22 & 127;
                            int i24 = yVar2.f56787c;
                            int i25 = (i22 >>> 7) & i24;
                            i11 = i12;
                            int i26 = 0;
                            while (true) {
                                long[] jArr5 = yVar2.f56785a;
                                int i27 = i25 >> 3;
                                jArr2 = jArr4;
                                int i28 = (i25 & 7) << 3;
                                j14 = j16;
                                long j17 = (jArr5[i27] >>> i28) | ((jArr5[i27 + 1] << (64 - i28)) & ((-i28) >> 63));
                                int i29 = i24;
                                long j18 = (((long) i23) * 72340172838076673L) ^ j17;
                                long j19 = (j18 - 72340172838076673L) & (~j18) & j13;
                                while (j19 != 0) {
                                    iNumberOfTrailingZeros = (i25 + (Long.numberOfTrailingZeros(j19) >> 3)) & i29;
                                    int i30 = i29;
                                    if (yVar2.f56786b[iNumberOfTrailingZeros] == i21) {
                                        break;
                                    }
                                    j19 &= j19 - 1;
                                    i29 = i30;
                                }
                                int i31 = i29;
                                if ((j17 & ((~j17) << 6) & j13) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i26 += 8;
                                i25 = (i25 + i26) & i31;
                                jArr4 = jArr2;
                                i24 = i31;
                                j16 = j14;
                            }
                            int i32 = iNumberOfTrailingZeros;
                            if (i32 >= 0) {
                                yVar2.f(i32);
                            }
                        } else {
                            jArr2 = jArr4;
                            j14 = j16;
                            i11 = i12;
                        }
                        j16 = j14 >> i11;
                        i19++;
                        i12 = i11;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i18 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                jArr4 = jArr;
                i12 = 8;
            }
        }
        xVar.c();
        y.m mVarS = s();
        int[] iArr3 = mVarS.f56737b;
        Object[] objArr = mVarS.f56738c;
        long[] jArr6 = mVarS.f56736a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i33 = 0;
            while (true) {
                long j21 = jArr6[i33];
                if ((((~j21) << c11) & j21 & j13) != j13) {
                    int i34 = 8 - ((~(i33 - length3)) >>> 31);
                    for (int i35 = 0; i35 < i34; i35++) {
                        if ((j21 & j12) < j11) {
                            int i36 = (i33 << 3) + i35;
                            int i37 = iArr3[i36];
                            g3.t tVar2 = ((g3.u) objArr[i36]).f28703a;
                            g3.o oVar = tVar2.f28699d;
                            g3.a0 a0Var = g3.x.f28713d;
                            if (oVar.f28691a.c(a0Var) && yVar2.a(i37)) {
                                F(i37, 16, (String) tVar2.f28699d.e(a0Var));
                            }
                            xVar.h(i37, new h2(tVar2, s()));
                        }
                        j21 >>= 8;
                    }
                    if (i34 != 8) {
                        break;
                    }
                }
                if (i33 == length3) {
                    break;
                } else {
                    i33++;
                }
            }
        }
        this.f58718k0 = new h2(this.f58708d.getSemanticsOwner().a(), s());
    }

    @Override // z4.b
    public final a5.j b(View view) {
        return this.M;
    }

    public final void j(int i11, a5.g gVar, String str, Bundle bundle) {
        g3.t tVar;
        j3.u0 u0VarW;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
        g3.u uVar = (g3.u) s().b(i11);
        if (uVar == null || (tVar = uVar.f28703a) == null) {
            return;
        }
        y2.i0 i0Var = tVar.f28698c;
        g3.o oVar = tVar.f28699d;
        y.i0 i0Var2 = oVar.f28691a;
        String strT = t(tVar);
        if (kotlin.jvm.internal.m.a(str, this.f58714g0)) {
            int iD = this.f58711e0.d(i11);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, this.f58715h0)) {
            int iD2 = this.f58713f0.d(i11);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = i0Var2.c(g3.n.f28666a);
        AndroidComposeView androidComposeView = this.f58708d;
        boolean z11 = false;
        if (zC && bundle != null && kotlin.jvm.internal.m.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i13 <= 0 || i12 < 0) {
                return;
            }
            if (i12 < (strT != null ? strT.length() : Integer.MAX_VALUE) && (u0VarW = g0.w(oVar)) != null) {
                ArrayList arrayList = new ArrayList();
                int i14 = 0;
                while (i14 < i13) {
                    int i15 = i12 + i14;
                    if (i15 >= u0VarW.f35797a.f35784a.f35700b.length()) {
                        arrayList.add(z11);
                        androidComposeView = androidComposeView;
                    } else {
                        f2.c cVarB = u0VarW.b(i15);
                        y2.k1 k1VarD = tVar.d();
                        long jP = 0;
                        if (k1VarD != null) {
                            if (!k1VarD.c1().P) {
                                k1VarD = null;
                            }
                            if (k1VarD != null) {
                                jP = k1VarD.P(0L);
                            }
                        }
                        f2.c cVarI = cVarB.i(jP);
                        f2.c cVarG = tVar.g();
                        f2.c cVarE = cVarI.g(cVarG) ? cVarI.e(cVarG) : null;
                        if (cVarE != null) {
                            long jR = androidComposeView.r((((long) Float.floatToRawIntBits(cVarE.f26573b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarE.f26572a)) << 32));
                            long jR2 = androidComposeView.r((((long) Float.floatToRawIntBits(cVarE.f26574c)) << 32) | (((long) Float.floatToRawIntBits(cVarE.f26575d)) & 4294967295L));
                            int i16 = (int) (jR >> 32);
                            int i17 = (int) (jR2 >> 32);
                            float fMin = Math.min(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17));
                            int i18 = (int) (jR & 4294967295L);
                            int i19 = (int) (jR2 & 4294967295L);
                            rectF = new RectF(fMin, Math.min(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)), Math.max(Float.intBitsToFloat(i16), Float.intBitsToFloat(i17)), Math.max(Float.intBitsToFloat(i18), Float.intBitsToFloat(i19)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i14++;
                    androidComposeView = androidComposeView;
                    z11 = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        g3.a0 a0Var = g3.x.f28734z;
        if (i0Var2.c(a0Var) && bundle != null && kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = i0Var2.g(a0Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, tVar.f28702g);
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = i0Var2.g(g3.x.P);
            g2.w0 w0Var = (g2.w0) (objG2 == null ? null : objG2);
            if (w0Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                f2.c cVarU = u(tVar, rect, w0Var);
                float f5 = cVarU.f26573b;
                float f11 = cVarU.f26572a;
                g2.f0 f0VarA = w0Var.a(cVarU.c(), i0Var.f56883c0, androidComposeView.getDensity());
                if (f0VarA instanceof g2.m0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(f0VarA, f11, f5));
                    return;
                } else if (f0VarA instanceof g2.n0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", L(f0VarA, f11, f5));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", N(f0VarA));
                    return;
                } else {
                    if (!(f0VarA instanceof g2.l0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", O(f0VarA, f11, f5));
                    return;
                }
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = i0Var2.g(g3.x.P);
            g2.w0 w0Var2 = (g2.w0) (objG3 == null ? null : objG3);
            if (w0Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                f2.c cVarU2 = u(tVar, rect2, w0Var2);
                Rect rectL = L(w0Var2.a(cVarU2.c(), i0Var.f56883c0, androidComposeView.getDensity()), cVarU2.f26572a, cVarU2.f26573b);
                if (rectL != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectL);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = i0Var2.g(g3.x.P);
            g2.w0 w0Var3 = (g2.w0) (objG4 == null ? null : objG4);
            if (w0Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrN = N(w0Var3.a(u(tVar, rect3, w0Var3).c(), i0Var.f56883c0, androidComposeView.getDensity()));
                if (fArrN != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrN);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.m.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = i0Var2.g(g3.x.P);
            g2.w0 w0Var4 = (g2.w0) (objG5 == null ? null : objG5);
            if (w0Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                f2.c cVarU3 = u(tVar, rect4, w0Var4);
                Region regionO = O(w0Var4.a(cVarU3.c(), i0Var.f56883c0, androidComposeView.getDensity()), cVarU3.f26572a, cVarU3.f26573b);
                if (regionO != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionO);
                }
            }
        }
    }

    public final Rect k(g3.u uVar) {
        v3.k kVar = uVar.f28704b;
        return M(kVar.f53494a, kVar.f53495b, kVar.f53496c, kVar.f53497d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0080 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0037, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005d, B:28:0x006f, B:30:0x0077, B:32:0x0080, B:34:0x0086, B:35:0x0095, B:37:0x009d, B:20:0x0047, B:23:0x004e), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[Catch: all -> 0x00d5, TryCatch #0 {all -> 0x00d5, blocks: (B:39:0x00b8, B:41:0x00bc, B:43:0x00cb, B:47:0x00d8), top: B:55:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        if (rz.e0.m(r5, r2) == r3) goto L49;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f2 -> B:50:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(xy.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.x.l(xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean m(int i11, long j11, boolean z11) {
        g3.a0 a0Var;
        int i12;
        if (!kotlin.jvm.internal.m.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        y.m mVarS = s();
        if (f2.b.c(j11, 9205357640488583168L) || (((9223372034707292159L & j11) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z11) {
            a0Var = g3.x.f28730v;
        } else {
            if (z11) {
                throw new NoWhenBranchMatchedException();
            }
            a0Var = g3.x.f28729u;
        }
        Object[] objArr = mVarS.f56738c;
        long[] jArr = mVarS.f56736a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            long j12 = jArr[i13];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j12) < 128) {
                        g3.u uVar = (g3.u) objArr[(i13 << 3) + i16];
                        v3.k kVar = uVar.f28704b;
                        float f5 = kVar.f53494a;
                        i12 = i14;
                        float f11 = kVar.f53495b;
                        float f12 = kVar.f53496c;
                        float f13 = kVar.f53497d;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
                        if ((fIntBitsToFloat2 < f13) & (fIntBitsToFloat >= f5) & (fIntBitsToFloat < f12) & (fIntBitsToFloat2 >= f11)) {
                            Object objG = uVar.f28703a.f28699d.f28691a.g(a0Var);
                            if (objG == null) {
                                objG = null;
                            }
                            g3.l lVar = (g3.l) objG;
                            if (lVar != null) {
                                fz.a aVar = lVar.f28657a;
                                if (i11 < 0) {
                                    if (((Number) aVar.invoke()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                                        z12 = true;
                                    }
                                } else if (((Number) aVar.invoke()).floatValue() < ((Number) lVar.f28658b.invoke()).floatValue()) {
                                    z12 = true;
                                }
                            }
                        }
                    } else {
                        i12 = i14;
                    }
                    j12 >>= i12;
                    i16++;
                    i14 = i12;
                }
                if (i15 != i14) {
                    return z12;
                }
            }
            if (i13 == length) {
                return z12;
            }
            i13++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f58708d.getSemanticsOwner().a(), this.f58718k0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final AccessibilityEvent o(int i11, int i12) {
        g3.u uVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i12);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f58708d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i11);
        if (v() && (uVar = (g3.u) s().b(i11)) != null) {
            g3.t tVar = uVar.f28703a;
            accessibilityEventObtain.setPassword(tVar.f28699d.f28691a.c(g3.x.K));
            Object objG = tVar.f28699d.f28691a.g(g3.x.f28722n);
            if (objG == null) {
                objG = null;
            }
            boolean zA = kotlin.jvm.internal.m.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                a5.b.m(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z11) {
        this.K = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z11) {
        this.K = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f58724t;
        if (accessibilityManager.isEnabled()) {
            this.K = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.L.removeCallbacks(this.f58721n0);
        AccessibilityManager accessibilityManager = this.f58724t;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i11, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i11, OSSConstants.DEFAULT_BUFFER_SIZE);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(g3.t tVar) {
        g3.o oVar = tVar.f28699d;
        g3.o oVar2 = tVar.f28699d;
        g3.a0 a0Var = g3.x.f28710a;
        if (!oVar.f28691a.c(g3.x.f28710a)) {
            g3.a0 a0Var2 = g3.x.G;
            if (oVar2.f28691a.c(a0Var2)) {
                return (int) (((j3.x0) oVar2.e(a0Var2)).f35823a & 4294967295L);
            }
        }
        return this.W;
    }

    public final int r(g3.t tVar) {
        g3.o oVar = tVar.f28699d;
        g3.o oVar2 = tVar.f28699d;
        g3.a0 a0Var = g3.x.f28710a;
        if (!oVar.f28691a.c(g3.x.f28710a)) {
            g3.a0 a0Var2 = g3.x.G;
            if (oVar2.f28691a.c(a0Var2)) {
                return (int) (((j3.x0) oVar2.e(a0Var2)).f35823a >> 32);
            }
        }
        return this.W;
    }

    public final y.m s() {
        if (this.f58705a0) {
            this.f58705a0 = false;
            AndroidComposeView androidComposeView = this.f58708d;
            this.f58707c0 = g3.w.b(androidComposeView.getSemanticsOwner(), n.f58627c);
            if (v()) {
                y.x xVar = this.f58707c0;
                Resources resources = androidComposeView.getContext().getResources();
                y.v vVar = this.f58711e0;
                vVar.a();
                y.v vVar2 = this.f58713f0;
                vVar2.a();
                g3.u uVar = (g3.u) xVar.b(-1);
                g3.t tVar = uVar != null ? uVar.f28703a : null;
                kotlin.jvm.internal.m.c(tVar);
                ArrayList arrayListB = g3.c0.b(tVar, new y.p0(xVar, 8), new y.p0(resources, 9), ns.o.K(tVar));
                int iA = ns.o.A(arrayListB);
                int i11 = 1;
                if (1 <= iA) {
                    while (true) {
                        int i12 = ((g3.t) arrayListB.get(i11 - 1)).f28702g;
                        int i13 = ((g3.t) arrayListB.get(i11)).f28702g;
                        vVar.f(i12, i13);
                        vVar2.f(i13, i12);
                        if (i11 == iA) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return this.f58707c0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    public final f2.c u(g3.t tVar, Rect rect, g2.w0 w0Var) {
        v vVar = new v(w0Var);
        y2.i0 i0Var = tVar.f28698c;
        z1.q qVar = (z1.q) i0Var.f56892i0.f50089g;
        y2.m mVar = null;
        if ((qVar.f58485d & 8) != 0) {
            loop0: while (qVar != null) {
                if ((qVar.f58484c & 8) == 0) {
                    if ((qVar.f58485d & 8) != 0) {
                        break;
                        break;
                    }
                    qVar = qVar.f58487f;
                } else {
                    z1.q qVarF = qVar;
                    n1.e eVar = null;
                    while (qVarF != null) {
                        if (qVarF instanceof y2.b2) {
                            ((y2.b2) qVarF).i0(vVar);
                            if (vVar.f58683a) {
                                mVar = qVarF;
                                break loop0;
                            }
                        } else if ((qVarF.f58484c & 8) != 0 && (qVarF instanceof y2.n)) {
                            int i11 = 0;
                            for (z1.q qVar2 = ((y2.n) qVarF).R; qVar2 != null; qVar2 = qVar2.f58487f) {
                                if ((qVar2.f58484c & 8) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        qVarF = qVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new n1.e(new z1.q[16]);
                                        }
                                        if (qVarF != null) {
                                            eVar.c(qVarF);
                                            qVarF = null;
                                        }
                                        eVar.c(qVar2);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        qVarF = y2.f.f(eVar);
                    }
                    if ((qVar.f58485d & 8) != 0) {
                        break;
                    }
                    qVar = qVar.f58487f;
                }
            }
        }
        y2.m mVar2 = (y2.b2) mVar;
        if (mVar2 == null || !((z1.q) mVar2).f58482a.P) {
            return w2.a0.f((y2.k1) i0Var.f56892i0.f50087e, false);
        }
        y2.k1 k1VarW = y2.f.w(mVar2);
        f2.c cVarE = w2.a0.h(k1VarW).E(k1VarW, true);
        Rect rectM = M(cVarE.f26572a, cVarE.f26573b, cVarE.f26574c, cVarE.f26575d);
        float f5 = rectM.left - rect.left;
        float f11 = rectM.top - rect.top;
        return new f2.c(f5, f11, rectM.width() + f5, rectM.height() + f11);
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.f58724t;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.K;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.K = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(y2.i0 i0Var) {
        if (this.Y.add(i0Var)) {
            this.Z.i(qy.b0.f48488a);
        }
    }
}
