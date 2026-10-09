package h4;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d4.h f31791a = new d4.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d4.h f31792b = new d4.h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j4.p f31793c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j4.p f31794d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MotionLayout f31797g;

    public v(MotionLayout motionLayout) {
        this.f31797g = motionLayout;
    }

    public static void c(d4.h hVar, d4.h hVar2) {
        d4.g mVar;
        ArrayList arrayList = hVar.f23161u0;
        HashMap map = new HashMap();
        map.put(hVar, hVar2);
        hVar2.f23161u0.clear();
        hVar2.g(hVar, map);
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            d4.g gVar = (d4.g) obj;
            if (gVar instanceof d4.a) {
                mVar = new d4.a();
            } else if (gVar instanceof d4.l) {
                mVar = new d4.l();
            } else if (gVar instanceof d4.j) {
                mVar = new d4.j();
            } else if (gVar instanceof d4.o) {
                mVar = new d4.o();
            } else {
                mVar = gVar instanceof d4.m ? new d4.m() : new d4.g();
            }
            hVar2.f23161u0.add(mVar);
            d4.g gVar2 = mVar.V;
            if (gVar2 != null) {
                ((d4.h) gVar2).f23161u0.remove(mVar);
                mVar.D();
            }
            mVar.V = hVar2;
            map.put(gVar, mVar);
        }
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            d4.g gVar3 = (d4.g) obj2;
            ((d4.g) map.get(gVar3)).g(gVar3, map);
        }
    }

    public static d4.g d(d4.h hVar, View view) {
        if (hVar.f23131h0 == view) {
            return hVar;
        }
        ArrayList arrayList = hVar.f23161u0;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d4.g gVar = (d4.g) arrayList.get(i11);
            if (gVar.f23131h0 == view) {
                return gVar;
            }
        }
        return null;
    }

    public final void a() {
        HashMap map;
        int[] iArr;
        Interpolator interpolatorLoadInterpolator;
        MotionLayout motionLayout = this.f31797g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.f1278f0;
        map2.clear();
        SparseArray sparseArray = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = motionLayout.getChildAt(i11);
            q qVar = new q(childAt);
            int id2 = childAt.getId();
            iArr2[i11] = id2;
            sparseArray.put(id2, qVar);
            map2.put(childAt, qVar);
        }
        int i12 = 0;
        while (i12 < childCount) {
            View childAt2 = motionLayout.getChildAt(i12);
            q qVar2 = (q) map2.get(childAt2);
            if (qVar2 == null) {
                map = map2;
                iArr = iArr2;
            } else {
                Rect rect = qVar2.f31747a;
                a0 a0Var = qVar2.f31752f;
                if (this.f31793c != null) {
                    d4.g gVarD = d(this.f31791a, childAt2);
                    if (gVarD != null) {
                        Rect rectQ = MotionLayout.q(motionLayout, gVarD);
                        j4.p pVar = this.f31793c;
                        int width = motionLayout.getWidth();
                        int height = motionLayout.getHeight();
                        int i13 = pVar.f36013d;
                        if (i13 != 0) {
                            q.h(rectQ, rect, i13, width, height);
                        }
                        a0Var.f31553c = CropImageView.DEFAULT_ASPECT_RATIO;
                        a0Var.f31554d = CropImageView.DEFAULT_ASPECT_RATIO;
                        qVar2.g(a0Var);
                        map = map2;
                        iArr = iArr2;
                        a0Var.e(rectQ.left, rectQ.top, rectQ.width(), rectQ.height());
                        j4.k kVarH = pVar.h(qVar2.f31749c);
                        a0Var.a(kVarH);
                        j4.m mVar = kVarH.f35928d;
                        qVar2.f31758l = mVar.f35982g;
                        qVar2.f31754h.c(rectQ, pVar, i13, qVar2.f31749c);
                        qVar2.C = kVarH.f35930f.f36002i;
                        qVar2.E = mVar.f35985j;
                        qVar2.F = mVar.f35984i;
                        Context context = qVar2.f31748b.getContext();
                        int i14 = mVar.f35987l;
                        String str = mVar.f35986k;
                        int i15 = mVar.m;
                        if (i14 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i15);
                        } else if (i14 == -1) {
                            interpolatorLoadInterpolator = new p(c4.e.d(str), 0);
                        } else if (i14 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i14 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i14 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i14 != 4) {
                            interpolatorLoadInterpolator = i14 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        qVar2.G = interpolatorLoadInterpolator;
                    } else {
                        map = map2;
                        iArr = iArr2;
                        if (motionLayout.f1289p0 != 0) {
                            fb.g0.r();
                            fb.g0.t(childAt2);
                            childAt2.getClass();
                        }
                    }
                } else {
                    map = map2;
                    iArr = iArr2;
                }
                if (this.f31794d != null) {
                    d4.g gVarD2 = d(this.f31792b, childAt2);
                    if (gVarD2 != null) {
                        Rect rectQ2 = MotionLayout.q(motionLayout, gVarD2);
                        j4.p pVar2 = this.f31794d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        a0 a0Var2 = qVar2.f31753g;
                        int i16 = pVar2.f36013d;
                        if (i16 != 0) {
                            q.h(rectQ2, rect, i16, width2, height2);
                        } else {
                            rect = rectQ2;
                        }
                        a0Var2.f31553c = 1.0f;
                        a0Var2.f31554d = 1.0f;
                        qVar2.g(a0Var2);
                        a0Var2.e(rect.left, rect.top, rect.width(), rect.height());
                        a0Var2.a(pVar2.h(qVar2.f31749c));
                        qVar2.f31755i.c(rect, pVar2, i16, qVar2.f31749c);
                    } else if (motionLayout.f1289p0 != 0) {
                        fb.g0.r();
                        fb.g0.t(childAt2);
                        childAt2.getClass();
                    }
                }
            }
            i12++;
            map2 = map;
            iArr2 = iArr;
        }
        int[] iArr3 = iArr2;
        for (int i17 = 0; i17 < childCount; i17++) {
            q qVar3 = (q) sparseArray.get(iArr3[i17]);
            int i18 = qVar3.f31752f.M;
            if (i18 != -1) {
                q qVar4 = (q) sparseArray.get(i18);
                qVar3.f31752f.g(qVar4, qVar4.f31752f);
                qVar3.f31753g.g(qVar4, qVar4.f31753g);
            }
        }
    }

    public final void b(int i11, int i12) {
        MotionLayout motionLayout = this.f31797g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f1269a0 == motionLayout.getStartState()) {
            d4.h hVar = this.f31792b;
            j4.p pVar = this.f31794d;
            motionLayout.o(hVar, optimizationLevel, (pVar == null || pVar.f36013d == 0) ? i11 : i12, (pVar == null || pVar.f36013d == 0) ? i12 : i11);
            j4.p pVar2 = this.f31793c;
            if (pVar2 != null) {
                d4.h hVar2 = this.f31791a;
                int i13 = pVar2.f36013d;
                int i14 = i13 == 0 ? i11 : i12;
                if (i13 == 0) {
                    i11 = i12;
                }
                motionLayout.o(hVar2, optimizationLevel, i14, i11);
                return;
            }
            return;
        }
        j4.p pVar3 = this.f31793c;
        if (pVar3 != null) {
            d4.h hVar3 = this.f31791a;
            int i15 = pVar3.f36013d;
            motionLayout.o(hVar3, optimizationLevel, i15 == 0 ? i11 : i12, i15 == 0 ? i12 : i11);
        }
        d4.h hVar4 = this.f31792b;
        j4.p pVar4 = this.f31794d;
        int i16 = (pVar4 == null || pVar4.f36013d == 0) ? i11 : i12;
        if (pVar4 == null || pVar4.f36013d == 0) {
            i11 = i12;
        }
        motionLayout.o(hVar4, optimizationLevel, i16, i11);
    }

    public final void e(j4.p pVar, j4.p pVar2) {
        this.f31793c = pVar;
        this.f31794d = pVar2;
        this.f31791a = new d4.h();
        d4.h hVar = new d4.h();
        this.f31792b = hVar;
        d4.h hVar2 = this.f31791a;
        boolean z11 = MotionLayout.f1268h1;
        MotionLayout motionLayout = this.f31797g;
        d4.h hVar3 = motionLayout.f1363c;
        j4.f fVar = hVar3.f23165y0;
        hVar2.f23165y0 = fVar;
        hVar2.f23163w0.f24797h = fVar;
        j4.f fVar2 = hVar3.f23165y0;
        hVar.f23165y0 = fVar2;
        hVar.f23163w0.f24797h = fVar2;
        hVar2.f23161u0.clear();
        this.f31792b.f23161u0.clear();
        c(hVar3, this.f31791a);
        c(hVar3, this.f31792b);
        if (motionLayout.f1283j0 > 0.5d) {
            if (pVar != null) {
                g(this.f31791a, pVar);
            }
            g(this.f31792b, pVar2);
        } else {
            g(this.f31792b, pVar2);
            if (pVar != null) {
                g(this.f31791a, pVar);
            }
        }
        this.f31791a.f23166z0 = motionLayout.l();
        d4.h hVar4 = this.f31791a;
        hVar4.f23162v0.U(hVar4);
        this.f31792b.f23166z0 = motionLayout.l();
        d4.h hVar5 = this.f31792b;
        hVar5.f23162v0.U(hVar5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                d4.h hVar6 = this.f31791a;
                d4.f fVar3 = d4.f.WRAP_CONTENT;
                hVar6.N(fVar3);
                this.f31792b.N(fVar3);
            }
            if (layoutParams.height == -2) {
                d4.h hVar7 = this.f31791a;
                d4.f fVar4 = d4.f.WRAP_CONTENT;
                hVar7.O(fVar4);
                this.f31792b.O(fVar4);
            }
        }
    }

    public final void f() {
        MotionLayout motionLayout = this.f31797g;
        int i11 = motionLayout.f1273c0;
        int i12 = motionLayout.f1275d0;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        motionLayout.R0 = mode;
        motionLayout.S0 = mode2;
        b(i11, i12);
        int i13 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i11, i12);
            motionLayout.N0 = this.f31791a.r();
            motionLayout.O0 = this.f31791a.l();
            motionLayout.P0 = this.f31792b.r();
            int iL = this.f31792b.l();
            motionLayout.Q0 = iL;
            motionLayout.M0 = (motionLayout.N0 == motionLayout.P0 && motionLayout.O0 == iL) ? false : true;
        }
        int i14 = motionLayout.N0;
        int i15 = motionLayout.O0;
        int i16 = motionLayout.R0;
        if (i16 == Integer.MIN_VALUE || i16 == 0) {
            i14 = (int) ((motionLayout.T0 * (motionLayout.P0 - i14)) + i14);
        }
        int i17 = motionLayout.S0;
        if (i17 == Integer.MIN_VALUE || i17 == 0) {
            i15 = (int) ((motionLayout.T0 * (motionLayout.Q0 - i15)) + i15);
        }
        d4.h hVar = this.f31791a;
        motionLayout.n(i11, i12, i14, i15, hVar.I0 || this.f31792b.I0, hVar.J0 || this.f31792b.J0);
        HashMap map = motionLayout.f1278f0;
        int childCount = motionLayout.getChildCount();
        motionLayout.f1272b1.a();
        motionLayout.f1287n0 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = motionLayout.getChildAt(i18);
            sparseArray.put(childAt.getId(), (q) map.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        c0 c0Var = motionLayout.S.f31585c;
        int i19 = c0Var != null ? c0Var.f31579p : -1;
        if (i19 != -1) {
            for (int i21 = 0; i21 < childCount; i21++) {
                q qVar = (q) map.get(motionLayout.getChildAt(i21));
                if (qVar != null) {
                    qVar.B = i19;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i22 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            q qVar2 = (q) map.get(motionLayout.getChildAt(i23));
            int i24 = qVar2.f31752f.M;
            if (i24 != -1) {
                sparseBooleanArray.put(i24, true);
                iArr[i22] = qVar2.f31752f.M;
                i22++;
            }
        }
        if (motionLayout.F0 != null) {
            for (int i25 = 0; i25 < i22; i25++) {
                q qVar3 = (q) map.get(motionLayout.findViewById(iArr[i25]));
                if (qVar3 != null) {
                    motionLayout.S.f(qVar3);
                }
            }
            ArrayList arrayList = motionLayout.F0;
            int size = arrayList.size();
            int i26 = 0;
            while (i26 < size) {
                Object obj = arrayList.get(i26);
                i26++;
                ((MotionHelper) obj).r(motionLayout, map);
            }
            for (int i27 = 0; i27 < i22; i27++) {
                q qVar4 = (q) map.get(motionLayout.findViewById(iArr[i27]));
                if (qVar4 != null) {
                    qVar4.i(motionLayout.getNanoTime(), width, height);
                }
            }
        } else {
            for (int i28 = 0; i28 < i22; i28++) {
                q qVar5 = (q) map.get(motionLayout.findViewById(iArr[i28]));
                if (qVar5 != null) {
                    motionLayout.S.f(qVar5);
                    qVar5.i(motionLayout.getNanoTime(), width, height);
                }
            }
        }
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = motionLayout.getChildAt(i29);
            q qVar6 = (q) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && qVar6 != null) {
                motionLayout.S.f(qVar6);
                qVar6.i(motionLayout.getNanoTime(), width, height);
            }
        }
        c0 c0Var2 = motionLayout.S.f31585c;
        float f5 = c0Var2 != null ? c0Var2.f31573i : 0.0f;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            boolean z11 = ((double) f5) < 0.0d;
            float fAbs = Math.abs(f5);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i30 = 0; i30 < childCount; i30++) {
                q qVar7 = (q) map.get(motionLayout.getChildAt(i30));
                if (!Float.isNaN(qVar7.f31758l)) {
                    for (int i31 = 0; i31 < childCount; i31++) {
                        q qVar8 = (q) map.get(motionLayout.getChildAt(i31));
                        if (!Float.isNaN(qVar8.f31758l)) {
                            fMin = Math.min(fMin, qVar8.f31758l);
                            fMax = Math.max(fMax, qVar8.f31758l);
                        }
                    }
                    while (i13 < childCount) {
                        q qVar9 = (q) map.get(motionLayout.getChildAt(i13));
                        if (!Float.isNaN(qVar9.f31758l)) {
                            qVar9.f31759n = 1.0f / (1.0f - fAbs);
                            if (z11) {
                                qVar9.m = fAbs - (((fMax - qVar9.f31758l) / (fMax - fMin)) * fAbs);
                            } else {
                                qVar9.m = fAbs - (((qVar9.f31758l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i13++;
                    }
                    return;
                }
                a0 a0Var = qVar7.f31753g;
                float f11 = a0Var.f31555e;
                float f12 = a0Var.f31556f;
                float f13 = z11 ? f12 - f11 : f12 + f11;
                fMin2 = Math.min(fMin2, f13);
                fMax2 = Math.max(fMax2, f13);
            }
            while (i13 < childCount) {
                q qVar10 = (q) map.get(motionLayout.getChildAt(i13));
                a0 a0Var2 = qVar10.f31753g;
                float f14 = a0Var2.f31555e;
                float f15 = a0Var2.f31556f;
                float f16 = z11 ? f15 - f14 : f15 + f14;
                qVar10.f31759n = 1.0f / (1.0f - fAbs);
                qVar10.m = fAbs - (((f16 - fMin2) * fAbs) / (fMax2 - fMin2));
                i13++;
            }
        }
    }

    public final void g(d4.h hVar, j4.p pVar) {
        j4.k kVar;
        j4.k kVar2;
        SparseArray sparseArray = new SparseArray();
        j4.q qVar = new j4.q();
        sparseArray.clear();
        sparseArray.put(0, hVar);
        MotionLayout motionLayout = this.f31797g;
        sparseArray.put(motionLayout.getId(), hVar);
        if (pVar != null && pVar.f36013d != 0) {
            d4.h hVar2 = this.f31792b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z11 = MotionLayout.f1268h1;
            motionLayout.o(hVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        ArrayList arrayList = hVar.f23161u0;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            d4.g gVar = (d4.g) obj;
            gVar.f23135j0 = true;
            sparseArray.put(gVar.f23131h0.getId(), gVar);
        }
        ArrayList arrayList2 = hVar.f23161u0;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            int i13 = i12 + 1;
            d4.g gVar2 = (d4.g) arrayList2.get(i12);
            View view = gVar2.f23131h0;
            int id2 = view.getId();
            HashMap map = pVar.f36016g;
            if (map.containsKey(Integer.valueOf(id2)) && (kVar2 = (j4.k) map.get(Integer.valueOf(id2))) != null) {
                kVar2.a(qVar);
            }
            gVar2.P(pVar.h(view.getId()).f35929e.f35938c);
            gVar2.M(pVar.h(view.getId()).f35929e.f35940d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id3 = constraintHelper.getId();
                HashMap map2 = pVar.f36016g;
                if (map2.containsKey(Integer.valueOf(id3)) && (kVar = (j4.k) map2.get(Integer.valueOf(id3))) != null && (gVar2 instanceof d4.m)) {
                    constraintHelper.l(kVar, (d4.m) gVar2, qVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).q();
                }
            }
            qVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z12 = MotionLayout.f1268h1;
            motionLayout.a(false, view, gVar2, qVar, sparseArray);
            if (pVar.h(view.getId()).f35927c.f35990c == 1) {
                gVar2.f23133i0 = view.getVisibility();
            } else {
                gVar2.f23133i0 = pVar.h(view.getId()).f35927c.f35989b;
            }
            i12 = i13;
        }
        ArrayList arrayList3 = hVar.f23161u0;
        int size3 = arrayList3.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            d4.g gVar3 = (d4.g) obj2;
            if (gVar3 instanceof d4.p) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) gVar3.f23131h0;
                d4.m mVar = (d4.m) gVar3;
                constraintHelper2.p(mVar, sparseArray);
                d4.p pVar2 = (d4.p) mVar;
                for (int i15 = 0; i15 < pVar2.f23196v0; i15++) {
                    d4.g gVar4 = pVar2.f23195u0[i15];
                    if (gVar4 != null) {
                        gVar4.G = true;
                    }
                }
            }
        }
    }
}
