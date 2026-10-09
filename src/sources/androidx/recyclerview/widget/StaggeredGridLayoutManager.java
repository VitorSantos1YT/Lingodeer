package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends m1 implements a2 {
    public boolean H;
    public final BitSet L;
    public final b1.p O;
    public final int P;
    public boolean Q;
    public boolean R;
    public o2 S;
    public int T;
    public final Rect U;
    public final l2 V;
    public boolean W;
    public final boolean X;
    public int[] Y;
    public final v Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2[] f2392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f2393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f2394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2396f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f2397t;
    public boolean K = false;
    public int M = -1;
    public int N = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.f2391a = -1;
        this.H = false;
        b1.p pVar = new b1.p(1, false);
        this.O = pVar;
        this.P = 2;
        this.U = new Rect();
        this.V = new l2(this);
        this.W = false;
        this.X = true;
        this.Z = new v(this, 1);
        RecyclerView$LayoutManager$Properties properties = m1.getProperties(context, attributeSet, i11, i12);
        int i13 = properties.orientation;
        if (i13 != 0 && i13 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i13 != this.f2395e) {
            this.f2395e = i13;
            u0 u0Var = this.f2393c;
            this.f2393c = this.f2394d;
            this.f2394d = u0Var;
            requestLayout();
        }
        int i14 = properties.spanCount;
        assertNotInLayoutOrScroll(null);
        if (i14 != this.f2391a) {
            pVar.s();
            requestLayout();
            this.f2391a = i14;
            this.L = new BitSet(this.f2391a);
            this.f2392b = new p2[this.f2391a];
            for (int i15 = 0; i15 < this.f2391a; i15++) {
                this.f2392b[i15] = new p2(this, i15);
            }
            requestLayout();
        }
        boolean z11 = properties.reverseLayout;
        assertNotInLayoutOrScroll(null);
        o2 o2Var = this.S;
        if (o2Var != null && o2Var.H != z11) {
            o2Var.H = z11;
        }
        this.H = z11;
        requestLayout();
        l0 l0Var = new l0();
        l0Var.f2506a = true;
        l0Var.f2511f = 0;
        l0Var.f2512g = 0;
        this.f2397t = l0Var;
        this.f2393c = u0.a(this, this.f2395e);
        this.f2394d = u0.a(this, 1 - this.f2395e);
    }

    public static int M(int i11, int i12, int i13) {
        int mode;
        return (!(i12 == 0 && i13 == 0) && ((mode = View.MeasureSpec.getMode(i11)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - i12) - i13), mode) : i11;
    }

    public final void A(View view, int i11, int i12) {
        Rect rect = this.U;
        calculateItemDecorationsForChild(view, rect);
        m2 m2Var = (m2) view.getLayoutParams();
        int iM = M(i11, ((ViewGroup.MarginLayoutParams) m2Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) m2Var).rightMargin + rect.right);
        int iM2 = M(i12, ((ViewGroup.MarginLayoutParams) m2Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) m2Var).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM, iM2, m2Var)) {
            view.measure(iM, iM2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:259:0x042b  */
    /* JADX WARN: Code duplicated, block: B:270:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x01fc A[SYNTHETIC] */
    public final void B(u1 u1Var, c2 c2Var, boolean z11) {
        boolean z12;
        o2 o2Var;
        int childCount;
        int i11;
        int position;
        int position2;
        int childCount2;
        int i12;
        boolean z13;
        o2 o2Var2 = this.S;
        l2 l2Var = this.V;
        if (!(o2Var2 == null && this.M == -1) && c2Var.b() == 0) {
            removeAndRecycleAllViews(u1Var);
            l2Var.a();
            return;
        }
        boolean z14 = l2Var.f2519e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = l2Var.f2521g;
        boolean z15 = (z14 && this.M == -1 && this.S == null) ? false : true;
        b1.p pVar = this.O;
        if (z15) {
            l2Var.a();
            o2 o2Var3 = this.S;
            if (o2Var3 != null) {
                int i13 = o2Var3.f2571c;
                if (i13 > 0) {
                    if (i13 == this.f2391a) {
                        for (int i14 = 0; i14 < this.f2391a; i14++) {
                            this.f2392b[i14].d();
                            o2 o2Var4 = this.S;
                            int iG = o2Var4.f2572d[i14];
                            if (iG != Integer.MIN_VALUE) {
                                iG += o2Var4.K ? this.f2393c.g() : this.f2393c.k();
                            }
                            p2 p2Var = this.f2392b[i14];
                            p2Var.f2585b = iG;
                            p2Var.f2586c = iG;
                        }
                    } else {
                        o2Var3.f2572d = null;
                        o2Var3.f2571c = 0;
                        o2Var3.f2573e = 0;
                        o2Var3.f2574f = null;
                        o2Var3.f2575t = null;
                        o2Var3.f2569a = o2Var3.f2570b;
                    }
                }
                o2 o2Var5 = this.S;
                this.R = o2Var5.L;
                boolean z16 = o2Var5.H;
                assertNotInLayoutOrScroll(null);
                o2 o2Var6 = this.S;
                if (o2Var6 != null && o2Var6.H != z16) {
                    o2Var6.H = z16;
                }
                this.H = z16;
                requestLayout();
                H();
                o2 o2Var7 = this.S;
                int i15 = o2Var7.f2569a;
                if (i15 != -1) {
                    this.M = i15;
                    l2Var.f2517c = o2Var7.K;
                } else {
                    l2Var.f2517c = this.K;
                }
                if (o2Var7.f2573e > 1) {
                    pVar.f3800b = o2Var7.f2574f;
                    pVar.f3801c = o2Var7.f2575t;
                }
            } else {
                H();
                l2Var.f2517c = this.K;
            }
            if (c2Var.f2430g || (i12 = this.M) == -1) {
                if (this.Q) {
                    int iB = c2Var.b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        }
                        position2 = getPosition(getChildAt(childCount2));
                        if (position2 < 0 && position2 < iB) {
                            break;
                        } else {
                            childCount2--;
                        }
                    }
                } else {
                    int iB2 = c2Var.b();
                    childCount = getChildCount();
                    i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            position2 = 0;
                            break;
                        }
                        position = getPosition(getChildAt(i11));
                        if (position < 0 && position < iB2) {
                            position2 = position;
                            break;
                        }
                        i11++;
                    }
                }
                l2Var.f2515a = position2;
                l2Var.f2516b = Integer.MIN_VALUE;
            } else if (i12 < 0 || i12 >= c2Var.b()) {
                this.M = -1;
                this.N = Integer.MIN_VALUE;
                if (this.Q) {
                    int iB3 = c2Var.b();
                    childCount2 = getChildCount() - 1;
                    while (true) {
                        if (childCount2 < 0) {
                            position2 = 0;
                            break;
                        } else {
                            position2 = getPosition(getChildAt(childCount2));
                            if (position2 < 0) {
                            }
                            childCount2--;
                        }
                    }
                } else {
                    int iB4 = c2Var.b();
                    childCount = getChildCount();
                    i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            position2 = 0;
                            break;
                        } else {
                            position = getPosition(getChildAt(i11));
                            if (position < 0) {
                            }
                            i11++;
                        }
                    }
                }
                l2Var.f2515a = position2;
                l2Var.f2516b = Integer.MIN_VALUE;
            } else {
                o2 o2Var8 = this.S;
                if (o2Var8 == null || o2Var8.f2569a == -1 || o2Var8.f2571c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.M);
                    if (viewFindViewByPosition != null) {
                        l2Var.f2515a = this.K ? v() : u();
                        if (this.N != Integer.MIN_VALUE) {
                            if (l2Var.f2517c) {
                                l2Var.f2516b = (this.f2393c.g() - this.N) - this.f2393c.b(viewFindViewByPosition);
                            } else {
                                l2Var.f2516b = (this.f2393c.k() + this.N) - this.f2393c.e(viewFindViewByPosition);
                            }
                        } else if (this.f2393c.c(viewFindViewByPosition) > this.f2393c.l()) {
                            l2Var.f2516b = l2Var.f2517c ? this.f2393c.g() : this.f2393c.k();
                        } else {
                            int iE = this.f2393c.e(viewFindViewByPosition) - this.f2393c.k();
                            if (iE < 0) {
                                l2Var.f2516b = -iE;
                            } else {
                                int iG2 = this.f2393c.g() - this.f2393c.b(viewFindViewByPosition);
                                if (iG2 < 0) {
                                    l2Var.f2516b = iG2;
                                } else {
                                    l2Var.f2516b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i16 = this.M;
                        l2Var.f2515a = i16;
                        int i17 = this.N;
                        if (i17 == Integer.MIN_VALUE) {
                            if (getChildCount() != 0) {
                                if ((i16 < u()) != this.K) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                            } else if (this.K) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            l2Var.f2517c = z13;
                            l2Var.f2516b = z13 ? staggeredGridLayoutManager.f2393c.g() : staggeredGridLayoutManager.f2393c.k();
                        } else if (l2Var.f2517c) {
                            l2Var.f2516b = staggeredGridLayoutManager.f2393c.g() - i17;
                        } else {
                            l2Var.f2516b = staggeredGridLayoutManager.f2393c.k() + i17;
                        }
                        l2Var.f2518d = true;
                    }
                } else {
                    l2Var.f2516b = Integer.MIN_VALUE;
                    l2Var.f2515a = this.M;
                }
            }
            l2Var.f2519e = true;
        }
        if (this.S == null && this.M == -1 && (l2Var.f2517c != this.Q || isLayoutRTL() != this.R)) {
            pVar.s();
            l2Var.f2518d = true;
        }
        if (getChildCount() > 0 && ((o2Var = this.S) == null || o2Var.f2571c < 1)) {
            if (l2Var.f2518d) {
                for (int i18 = 0; i18 < this.f2391a; i18++) {
                    this.f2392b[i18].d();
                    int i19 = l2Var.f2516b;
                    if (i19 != Integer.MIN_VALUE) {
                        p2 p2Var2 = this.f2392b[i18];
                        p2Var2.f2585b = i19;
                        p2Var2.f2586c = i19;
                    }
                }
            } else if (z15 || l2Var.f2520f == null) {
                for (int i21 = 0; i21 < this.f2391a; i21++) {
                    p2 p2Var3 = this.f2392b[i21];
                    boolean z17 = this.K;
                    int i22 = l2Var.f2516b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) p2Var3.f2590g;
                    int iK = z17 ? p2Var3.k(Integer.MIN_VALUE) : p2Var3.m(Integer.MIN_VALUE);
                    p2Var3.d();
                    if (iK != Integer.MIN_VALUE && ((!z17 || iK >= staggeredGridLayoutManager2.f2393c.g()) && (z17 || iK <= staggeredGridLayoutManager2.f2393c.k()))) {
                        if (i22 != Integer.MIN_VALUE) {
                            iK += i22;
                        }
                        p2Var3.f2586c = iK;
                        p2Var3.f2585b = iK;
                    }
                }
                p2[] p2VarArr = this.f2392b;
                int length = p2VarArr.length;
                int[] iArr = l2Var.f2520f;
                if (iArr == null || iArr.length < length) {
                    l2Var.f2520f = new int[staggeredGridLayoutManager.f2392b.length];
                }
                for (int i23 = 0; i23 < length; i23++) {
                    l2Var.f2520f[i23] = p2VarArr[i23].m(Integer.MIN_VALUE);
                }
            } else {
                for (int i24 = 0; i24 < this.f2391a; i24++) {
                    p2 p2Var4 = this.f2392b[i24];
                    p2Var4.d();
                    int i25 = l2Var.f2520f[i24];
                    p2Var4.f2585b = i25;
                    p2Var4.f2586c = i25;
                }
            }
        }
        detachAndScrapAttachedViews(u1Var);
        l0 l0Var = this.f2397t;
        l0Var.f2506a = false;
        this.W = false;
        int iL = this.f2394d.l();
        this.f2396f = iL / this.f2391a;
        this.T = View.MeasureSpec.makeMeasureSpec(iL, this.f2394d.i());
        K(l2Var.f2515a, c2Var);
        if (l2Var.f2517c) {
            I(-1);
            p(u1Var, l0Var, c2Var);
            I(1);
            l0Var.f2508c = l2Var.f2515a + l0Var.f2509d;
            p(u1Var, l0Var, c2Var);
        } else {
            I(1);
            p(u1Var, l0Var, c2Var);
            I(-1);
            l0Var.f2508c = l2Var.f2515a + l0Var.f2509d;
            p(u1Var, l0Var, c2Var);
        }
        if (this.f2394d.i() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = CropImageView.DEFAULT_ASPECT_RATIO;
            for (int i26 = 0; i26 < childCount3; i26++) {
                View childAt = getChildAt(i26);
                float fC = this.f2394d.c(childAt);
                if (fC >= fMax) {
                    if (((m2) childAt.getLayoutParams()).f2540f) {
                        fC = (fC * 1.0f) / this.f2391a;
                    }
                    fMax = Math.max(fMax, fC);
                }
            }
            int i27 = this.f2396f;
            int iRound = Math.round(fMax * this.f2391a);
            if (this.f2394d.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f2394d.l());
            }
            this.f2396f = iRound / this.f2391a;
            this.T = View.MeasureSpec.makeMeasureSpec(iRound, this.f2394d.i());
            if (this.f2396f != i27) {
                for (int i28 = 0; i28 < childCount3; i28++) {
                    View childAt2 = getChildAt(i28);
                    m2 m2Var = (m2) childAt2.getLayoutParams();
                    if (!m2Var.f2540f) {
                        if (isLayoutRTL() && this.f2395e == 1) {
                            int i29 = -((this.f2391a - 1) - m2Var.f2539e.f2588e);
                            childAt2.offsetLeftAndRight((this.f2396f * i29) - (i29 * i27));
                        } else {
                            int i30 = m2Var.f2539e.f2588e;
                            int i31 = this.f2396f * i30;
                            int i32 = i30 * i27;
                            if (this.f2395e == 1) {
                                childAt2.offsetLeftAndRight(i31 - i32);
                            } else {
                                childAt2.offsetTopAndBottom(i31 - i32);
                            }
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.K) {
                s(u1Var, c2Var, true);
                t(u1Var, c2Var, false);
            } else {
                t(u1Var, c2Var, true);
                s(u1Var, c2Var, false);
            }
        }
        if (z11 && !c2Var.f2430g && this.P != 0 && getChildCount() > 0 && (this.W || z() != null)) {
            removeCallbacks(this.Z);
            z12 = n();
        }
        if (c2Var.f2430g) {
            l2Var.a();
        }
        this.Q = l2Var.f2517c;
        this.R = isLayoutRTL();
        if (z12) {
            l2Var.a();
            B(u1Var, c2Var, false);
        }
    }

    public final boolean C(int i11) {
        if (this.f2395e == 0) {
            return (i11 == -1) != this.K;
        }
        return ((i11 == -1) == this.K) == isLayoutRTL();
    }

    public final void D(int i11, c2 c2Var) {
        int iU;
        int i12;
        if (i11 > 0) {
            iU = v();
            i12 = 1;
        } else {
            iU = u();
            i12 = -1;
        }
        l0 l0Var = this.f2397t;
        l0Var.f2506a = true;
        K(iU, c2Var);
        I(i12);
        l0Var.f2508c = iU + l0Var.f2509d;
        l0Var.f2507b = Math.abs(i11);
    }

    public final void E(u1 u1Var, l0 l0Var) {
        int iMin;
        if (!l0Var.f2506a || l0Var.f2514i) {
            return;
        }
        if (l0Var.f2507b == 0) {
            if (l0Var.f2510e == -1) {
                F(l0Var.f2512g, u1Var);
                return;
            } else {
                G(l0Var.f2511f, u1Var);
                return;
            }
        }
        int i11 = 1;
        if (l0Var.f2510e == -1) {
            int i12 = l0Var.f2511f;
            int iM = this.f2392b[0].m(i12);
            while (i11 < this.f2391a) {
                int iM2 = this.f2392b[i11].m(i12);
                if (iM2 > iM) {
                    iM = iM2;
                }
                i11++;
            }
            int i13 = i12 - iM;
            F(i13 < 0 ? l0Var.f2512g : l0Var.f2512g - Math.min(i13, l0Var.f2507b), u1Var);
            return;
        }
        int i14 = l0Var.f2512g;
        int iK = this.f2392b[0].k(i14);
        while (i11 < this.f2391a) {
            int iK2 = this.f2392b[i11].k(i14);
            if (iK2 < iK) {
                iK = iK2;
            }
            i11++;
        }
        int i15 = iK - l0Var.f2512g;
        if (i15 < 0) {
            iMin = l0Var.f2511f;
        } else {
            iMin = Math.min(i15, l0Var.f2507b) + l0Var.f2511f;
        }
        G(iMin, u1Var);
    }

    public final void F(int i11, u1 u1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2393c.e(childAt) < i11 || this.f2393c.o(childAt) < i11) {
                return;
            }
            m2 m2Var = (m2) childAt.getLayoutParams();
            if (m2Var.f2540f) {
                for (int i12 = 0; i12 < this.f2391a; i12++) {
                    if (((ArrayList) this.f2392b[i12].f2589f).size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f2391a; i13++) {
                    this.f2392b[i13].n();
                }
            } else if (((ArrayList) m2Var.f2539e.f2589f).size() == 1) {
                return;
            } else {
                m2Var.f2539e.n();
            }
            removeAndRecycleView(childAt, u1Var);
        }
    }

    public final void G(int i11, u1 u1Var) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2393c.b(childAt) > i11 || this.f2393c.n(childAt) > i11) {
                return;
            }
            m2 m2Var = (m2) childAt.getLayoutParams();
            if (m2Var.f2540f) {
                for (int i12 = 0; i12 < this.f2391a; i12++) {
                    if (((ArrayList) this.f2392b[i12].f2589f).size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f2391a; i13++) {
                    this.f2392b[i13].o();
                }
            } else if (((ArrayList) m2Var.f2539e.f2589f).size() == 1) {
                return;
            } else {
                m2Var.f2539e.o();
            }
            removeAndRecycleView(childAt, u1Var);
        }
    }

    public final void H() {
        if (this.f2395e == 1 || !isLayoutRTL()) {
            this.K = this.H;
        } else {
            this.K = !this.H;
        }
    }

    public final void I(int i11) {
        l0 l0Var = this.f2397t;
        l0Var.f2510e = i11;
        l0Var.f2509d = this.K != (i11 == -1) ? -1 : 1;
    }

    public final void J(int i11, int i12) {
        for (int i13 = 0; i13 < this.f2391a; i13++) {
            if (!((ArrayList) this.f2392b[i13].f2589f).isEmpty()) {
                L(this.f2392b[i13], i11, i12);
            }
        }
    }

    public final void K(int i11, c2 c2Var) {
        int iL;
        int iL2;
        int i12;
        l0 l0Var = this.f2397t;
        boolean z11 = false;
        l0Var.f2507b = 0;
        l0Var.f2508c = i11;
        if (!isSmoothScrolling() || (i12 = c2Var.f2424a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.K == (i12 < i11)) {
                iL = this.f2393c.l();
                iL2 = 0;
            } else {
                iL2 = this.f2393c.l();
                iL = 0;
            }
        }
        if (getClipToPadding()) {
            l0Var.f2511f = this.f2393c.k() - iL2;
            l0Var.f2512g = this.f2393c.g() + iL;
        } else {
            l0Var.f2512g = this.f2393c.f() + iL;
            l0Var.f2511f = -iL2;
        }
        l0Var.f2513h = false;
        l0Var.f2506a = true;
        if (this.f2393c.i() == 0 && this.f2393c.f() == 0) {
            z11 = true;
        }
        l0Var.f2514i = z11;
    }

    public final void L(p2 p2Var, int i11, int i12) {
        int i13 = p2Var.f2587d;
        int i14 = p2Var.f2588e;
        if (i11 == -1) {
            int i15 = p2Var.f2585b;
            if (i15 == Integer.MIN_VALUE) {
                p2Var.c();
                i15 = p2Var.f2585b;
            }
            if (i15 + i13 <= i12) {
                this.L.set(i14, false);
                return;
            }
            return;
        }
        int i16 = p2Var.f2586c;
        if (i16 == Integer.MIN_VALUE) {
            p2Var.b();
            i16 = p2Var.f2586c;
        }
        if (i16 - i13 >= i12) {
            this.L.set(i14, false);
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.S == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean canScrollHorizontally() {
        return this.f2395e == 0;
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean canScrollVertically() {
        return this.f2395e == 1;
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean checkLayoutParams(n1 n1Var) {
        return n1Var instanceof m2;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void collectAdjacentPrefetchPositions(int i11, int i12, c2 c2Var, l1 l1Var) {
        l0 l0Var;
        int iK;
        int iM;
        if (this.f2395e != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        D(i11, c2Var);
        int[] iArr = this.Y;
        if (iArr == null || iArr.length < this.f2391a) {
            this.Y = new int[this.f2391a];
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = this.f2391a;
            l0Var = this.f2397t;
            if (i13 >= i15) {
                break;
            }
            if (l0Var.f2509d == -1) {
                iK = l0Var.f2511f;
                iM = this.f2392b[i13].m(iK);
            } else {
                iK = this.f2392b[i13].k(l0Var.f2512g);
                iM = l0Var.f2512g;
            }
            int i16 = iK - iM;
            if (i16 >= 0) {
                this.Y[i14] = i16;
                i14++;
            }
            i13++;
        }
        Arrays.sort(this.Y, 0, i14);
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = l0Var.f2508c;
            if (i18 < 0 || i18 >= c2Var.b()) {
                return;
            }
            ((a0) l1Var).a(l0Var.f2508c, this.Y[i17]);
            l0Var.f2508c += l0Var.f2509d;
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollExtent(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.X;
        return u.b(c2Var, this.f2393c, r(z11), q(z11), this, this.X);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollOffset(c2 c2Var) {
        return o(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeHorizontalScrollRange(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.X;
        return u.d(c2Var, this.f2393c, r(z11), q(z11), this, this.X);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.a2
    public final PointF computeScrollVectorForPosition(int i11) {
        int i12 = -1;
        if (getChildCount() != 0) {
            if ((i11 < u()) == this.K) {
                i12 = 1;
            }
        } else if (this.K) {
            i12 = 1;
        }
        PointF pointF = new PointF();
        if (i12 == 0) {
            return null;
        }
        if (this.f2395e == 0) {
            pointF.x = i12;
            pointF.y = CropImageView.DEFAULT_ASPECT_RATIO;
            return pointF;
        }
        pointF.x = CropImageView.DEFAULT_ASPECT_RATIO;
        pointF.y = i12;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollExtent(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.X;
        return u.b(c2Var, this.f2393c, r(z11), q(z11), this, this.X);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollOffset(c2 c2Var) {
        return o(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final int computeVerticalScrollRange(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.X;
        return u.d(c2Var, this.f2393c, r(z11), q(z11), this, this.X);
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateDefaultLayoutParams() {
        return this.f2395e == 0 ? new m2(-2, -1) : new m2(-1, -2);
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new m2(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean isAutoMeasureEnabled() {
        return this.P != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final boolean n() {
        int iU;
        int iV;
        if (getChildCount() != 0 && this.P != 0 && isAttachedToWindow()) {
            if (this.K) {
                iU = v();
                iV = u();
            } else {
                iU = u();
                iV = v();
            }
            b1.p pVar = this.O;
            if (iU == 0 && z() != null) {
                pVar.s();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
            if (this.W) {
                int i11 = this.K ? -1 : 1;
                int i12 = iV + 1;
                n2 n2VarX = pVar.x(iU, i12, i11);
                if (n2VarX == null) {
                    this.W = false;
                    pVar.v(i12);
                    return false;
                }
                n2 n2VarX2 = pVar.x(iU, n2VarX.f2550a, i11 * (-1));
                if (n2VarX2 == null) {
                    pVar.v(n2VarX.f2550a);
                } else {
                    pVar.v(n2VarX2.f2550a + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int o(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z11 = !this.X;
        return u.c(c2Var, this.f2393c, r(z11), q(z11), this, this.X, this.K);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void offsetChildrenHorizontal(int i11) {
        super.offsetChildrenHorizontal(i11);
        for (int i12 = 0; i12 < this.f2391a; i12++) {
            p2 p2Var = this.f2392b[i12];
            int i13 = p2Var.f2585b;
            if (i13 != Integer.MIN_VALUE) {
                p2Var.f2585b = i13 + i11;
            }
            int i14 = p2Var.f2586c;
            if (i14 != Integer.MIN_VALUE) {
                p2Var.f2586c = i14 + i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void offsetChildrenVertical(int i11) {
        super.offsetChildrenVertical(i11);
        for (int i12 = 0; i12 < this.f2391a; i12++) {
            p2 p2Var = this.f2392b[i12];
            int i13 = p2Var.f2585b;
            if (i13 != Integer.MIN_VALUE) {
                p2Var.f2585b = i13 + i11;
            }
            int i14 = p2Var.f2586c;
            if (i14 != Integer.MIN_VALUE) {
                p2Var.f2586c = i14 + i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onAdapterChanged(b1 b1Var, b1 b1Var2) {
        this.O.s();
        for (int i11 = 0; i11 < this.f2391a; i11++) {
            this.f2392b[i11].d();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onDetachedFromWindow(RecyclerView recyclerView, u1 u1Var) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.Z);
        for (int i11 = 0; i11 < this.f2391a; i11++) {
            this.f2392b[i11].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0032  */
    /* JADX WARN: Code duplicated, block: B:29:0x003d  */
    @Override // androidx.recyclerview.widget.m1
    public final View onFocusSearchFailed(View view, int i11, u1 u1Var, c2 c2Var) {
        View viewFindContainingItemView;
        int i12;
        View viewL;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        H();
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 17) {
                    if (i11 != 33) {
                        if (i11 == 66 ? this.f2395e == 0 : !(i11 != 130 || this.f2395e != 1)) {
                            i12 = 1;
                        }
                    } else if (this.f2395e == 1) {
                        i12 = -1;
                    }
                    i12 = Integer.MIN_VALUE;
                } else if (this.f2395e == 0) {
                    i12 = -1;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
            } else if (this.f2395e != 1 && isLayoutRTL()) {
                i12 = -1;
            } else {
                i12 = 1;
            }
        } else if (this.f2395e != 1 && isLayoutRTL()) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        if (i12 == Integer.MIN_VALUE) {
            return null;
        }
        m2 m2Var = (m2) viewFindContainingItemView.getLayoutParams();
        boolean z11 = m2Var.f2540f;
        p2 p2Var = m2Var.f2539e;
        int iV = i12 == 1 ? v() : u();
        K(iV, c2Var);
        I(i12);
        l0 l0Var = this.f2397t;
        l0Var.f2508c = l0Var.f2509d + iV;
        l0Var.f2507b = (int) (this.f2393c.l() * 0.33333334f);
        l0Var.f2513h = true;
        l0Var.f2506a = false;
        p(u1Var, l0Var, c2Var);
        this.Q = this.K;
        if (!z11 && (viewL = p2Var.l(iV, i12)) != null && viewL != viewFindContainingItemView) {
            return viewL;
        }
        if (C(i12)) {
            for (int i13 = this.f2391a - 1; i13 >= 0; i13--) {
                View viewL2 = this.f2392b[i13].l(iV, i12);
                if (viewL2 != null && viewL2 != viewFindContainingItemView) {
                    return viewL2;
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f2391a; i14++) {
                View viewL3 = this.f2392b[i14].l(iV, i12);
                if (viewL3 != null && viewL3 != viewFindContainingItemView) {
                    return viewL3;
                }
            }
        }
        boolean z12 = (this.H ^ true) == (i12 == -1);
        if (!z11) {
            View viewFindViewByPosition = findViewByPosition(z12 ? p2Var.g() : p2Var.h());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (!C(i12)) {
            for (int i15 = 0; i15 < this.f2391a; i15++) {
                View viewFindViewByPosition2 = findViewByPosition(z12 ? this.f2392b[i15].g() : this.f2392b[i15].h());
                if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                    return viewFindViewByPosition2;
                }
            }
            return null;
        }
        for (int i16 = this.f2391a - 1; i16 >= 0; i16--) {
            if (i16 != p2Var.f2588e) {
                View viewFindViewByPosition3 = findViewByPosition(z12 ? this.f2392b[i16].g() : this.f2392b[i16].h());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewR = r(false);
            View viewQ = q(false);
            if (viewR == null || viewQ == null) {
                return;
            }
            int position = getPosition(viewR);
            int position2 = getPosition(viewQ);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        y(i11, i12, 1);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.O.s();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        y(i11, i12, 8);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        y(i11, i12, 2);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        y(i11, i12, 4);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onLayoutChildren(u1 u1Var, c2 c2Var) {
        B(u1Var, c2Var, true);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onLayoutCompleted(c2 c2Var) {
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.S = null;
        this.V.a();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof o2) {
            o2 o2Var = (o2) parcelable;
            this.S = o2Var;
            if (this.M != -1) {
                o2Var.f2569a = -1;
                o2Var.f2570b = -1;
                o2Var.f2572d = null;
                o2Var.f2571c = 0;
                o2Var.f2573e = 0;
                o2Var.f2574f = null;
                o2Var.f2575t = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final Parcelable onSaveInstanceState() {
        int iM;
        int iK;
        int[] iArr;
        o2 o2Var = this.S;
        if (o2Var != null) {
            o2 o2Var2 = new o2();
            o2Var2.f2571c = o2Var.f2571c;
            o2Var2.f2569a = o2Var.f2569a;
            o2Var2.f2570b = o2Var.f2570b;
            o2Var2.f2572d = o2Var.f2572d;
            o2Var2.f2573e = o2Var.f2573e;
            o2Var2.f2574f = o2Var.f2574f;
            o2Var2.H = o2Var.H;
            o2Var2.K = o2Var.K;
            o2Var2.L = o2Var.L;
            o2Var2.f2575t = o2Var.f2575t;
            return o2Var2;
        }
        o2 o2Var3 = new o2();
        o2Var3.H = this.H;
        o2Var3.K = this.Q;
        o2Var3.L = this.R;
        b1.p pVar = this.O;
        if (pVar == null || (iArr = (int[]) pVar.f3800b) == null) {
            o2Var3.f2573e = 0;
        } else {
            o2Var3.f2574f = iArr;
            o2Var3.f2573e = iArr.length;
            o2Var3.f2575t = (ArrayList) pVar.f3801c;
        }
        if (getChildCount() <= 0) {
            o2Var3.f2569a = -1;
            o2Var3.f2570b = -1;
            o2Var3.f2571c = 0;
            return o2Var3;
        }
        o2Var3.f2569a = this.Q ? v() : u();
        View viewQ = this.K ? q(true) : r(true);
        o2Var3.f2570b = viewQ != null ? getPosition(viewQ) : -1;
        int i11 = this.f2391a;
        o2Var3.f2571c = i11;
        o2Var3.f2572d = new int[i11];
        for (int i12 = 0; i12 < this.f2391a; i12++) {
            if (this.Q) {
                iM = this.f2392b[i12].k(Integer.MIN_VALUE);
                if (iM != Integer.MIN_VALUE) {
                    iK = this.f2393c.g();
                    iM -= iK;
                }
            } else {
                iM = this.f2392b[i12].m(Integer.MIN_VALUE);
                if (iM != Integer.MIN_VALUE) {
                    iK = this.f2393c.k();
                    iM -= iK;
                }
            }
            o2Var3.f2572d[i12] = iM;
        }
        return o2Var3;
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onScrollStateChanged(int i11) {
        if (i11 == 0) {
            n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bc A[LOOP:2: B:144:0x02ba->B:145:0x02bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d8 A[LOOP:3: B:150:0x02d6->B:151:0x02d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:152:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:163:0x031b  */
    /* JADX WARN: Code duplicated, block: B:165:0x031f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0327  */
    /* JADX WARN: Code duplicated, block: B:170:0x0340  */
    /* JADX WARN: Code duplicated, block: B:171:0x0346  */
    /* JADX WARN: Code duplicated, block: B:174:0x0357  */
    /* JADX WARN: Code duplicated, block: B:176:0x035f  */
    public final int p(u1 u1Var, l0 l0Var, c2 c2Var) {
        p2 p2Var;
        int i11;
        int iX;
        int iC;
        int i12;
        int i13;
        int iK;
        int iC2;
        int i14;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        int i19;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        u1 u1Var2 = u1Var;
        int i21 = 0;
        int i22 = 1;
        staggeredGridLayoutManager.L.set(0, staggeredGridLayoutManager.f2391a, true);
        l0 l0Var2 = staggeredGridLayoutManager.f2397t;
        int i23 = l0Var2.f2514i ? l0Var.f2510e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : l0Var.f2510e == 1 ? l0Var.f2512g + l0Var.f2507b : l0Var.f2511f - l0Var.f2507b;
        staggeredGridLayoutManager.J(l0Var.f2510e, i23);
        int iG = staggeredGridLayoutManager.K ? staggeredGridLayoutManager.f2393c.g() : staggeredGridLayoutManager.f2393c.k();
        boolean z12 = false;
        while (true) {
            int i24 = l0Var.f2508c;
            if (i24 < 0 || i24 >= c2Var.b() || (!l0Var2.f2514i && staggeredGridLayoutManager.L.isEmpty())) {
                break;
            }
            View viewD = u1Var2.d(l0Var.f2508c);
            l0Var.f2508c += l0Var.f2509d;
            m2 m2Var = (m2) viewD.getLayoutParams();
            int layoutPosition = m2Var.f2546a.getLayoutPosition();
            b1.p pVar = staggeredGridLayoutManager.O;
            int[] iArr = (int[]) pVar.f3800b;
            int i25 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            int i26 = i25 == -1 ? i22 : i21;
            if (i26 != 0) {
                if (m2Var.f2540f) {
                    p2Var = staggeredGridLayoutManager.f2392b[i21];
                } else {
                    if (staggeredGridLayoutManager.C(l0Var.f2510e)) {
                        i18 = staggeredGridLayoutManager.f2391a - i22;
                        i17 = -1;
                        i19 = -1;
                    } else {
                        i17 = staggeredGridLayoutManager.f2391a;
                        i18 = i21;
                        i19 = i22;
                    }
                    p2 p2Var2 = null;
                    if (l0Var.f2510e == i22) {
                        int iK2 = staggeredGridLayoutManager.f2393c.k();
                        int i27 = Integer.MAX_VALUE;
                        while (i18 != i17) {
                            p2 p2Var3 = staggeredGridLayoutManager.f2392b[i18];
                            int i28 = i18;
                            int iK3 = p2Var3.k(iK2);
                            if (iK3 < i27) {
                                i27 = iK3;
                                p2Var2 = p2Var3;
                            }
                            i18 = i28 + i19;
                        }
                    } else {
                        int iG2 = staggeredGridLayoutManager.f2393c.g();
                        int i29 = Integer.MIN_VALUE;
                        while (i18 != i17) {
                            p2 p2Var4 = staggeredGridLayoutManager.f2392b[i18];
                            int i30 = i18;
                            int iM = p2Var4.m(iG2);
                            if (iM > i29) {
                                i29 = iM;
                                p2Var2 = p2Var4;
                            }
                            i18 = i30 + i19;
                        }
                    }
                    p2Var = p2Var2;
                }
                pVar.u(layoutPosition);
                ((int[]) pVar.f3800b)[layoutPosition] = p2Var.f2588e;
            } else {
                p2Var = staggeredGridLayoutManager.f2392b[i25];
            }
            p2 p2Var5 = p2Var;
            m2Var.f2539e = p2Var5;
            if (l0Var.f2510e == 1) {
                staggeredGridLayoutManager.addView(viewD);
            } else {
                staggeredGridLayoutManager.addView(viewD, 0);
            }
            if (!m2Var.f2540f) {
                i11 = i26;
                if (staggeredGridLayoutManager.f2395e == 1) {
                    staggeredGridLayoutManager.A(viewD, m1.getChildMeasureSpec(staggeredGridLayoutManager.f2396f, staggeredGridLayoutManager.getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) m2Var).width, false), m1.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) m2Var).height, true));
                } else {
                    staggeredGridLayoutManager.A(viewD, m1.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) m2Var).width, true), m1.getChildMeasureSpec(staggeredGridLayoutManager.f2396f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) m2Var).height, false));
                }
            } else if (staggeredGridLayoutManager.f2395e == 1) {
                i11 = i26;
                staggeredGridLayoutManager.A(viewD, staggeredGridLayoutManager.T, m1.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) m2Var).height, true));
            } else {
                i11 = i26;
                staggeredGridLayoutManager.A(viewD, m1.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) m2Var).width, true), staggeredGridLayoutManager.T);
            }
            if (l0Var.f2510e == 1) {
                iC = m2Var.f2540f ? staggeredGridLayoutManager.w(iG) : p2Var5.k(iG);
                iX = staggeredGridLayoutManager.f2393c.c(viewD) + iC;
                if (i11 != 0 && m2Var.f2540f) {
                    n2 n2Var = new n2();
                    n2Var.f2552c = new int[staggeredGridLayoutManager.f2391a];
                    for (int i31 = 0; i31 < staggeredGridLayoutManager.f2391a; i31++) {
                        n2Var.f2552c[i31] = iC - staggeredGridLayoutManager.f2392b[i31].k(iC);
                    }
                    n2Var.f2551b = -1;
                    n2Var.f2550a = layoutPosition;
                    pVar.p(n2Var);
                }
            } else {
                iX = m2Var.f2540f ? staggeredGridLayoutManager.x(iG) : p2Var5.m(iG);
                iC = iX - staggeredGridLayoutManager.f2393c.c(viewD);
                if (i11 != 0 && m2Var.f2540f) {
                    n2 n2Var2 = new n2();
                    n2Var2.f2552c = new int[staggeredGridLayoutManager.f2391a];
                    for (int i32 = 0; i32 < staggeredGridLayoutManager.f2391a; i32++) {
                        n2Var2.f2552c[i32] = staggeredGridLayoutManager.f2392b[i32].m(iX) - iX;
                    }
                    n2Var2.f2551b = 1;
                    n2Var2.f2550a = layoutPosition;
                    pVar.p(n2Var2);
                }
            }
            if (m2Var.f2540f && l0Var.f2509d == -1) {
                if (i11 != 0) {
                    staggeredGridLayoutManager.W = true;
                    i12 = 1;
                } else {
                    if (l0Var.f2510e != 1) {
                        int iM2 = staggeredGridLayoutManager.f2392b[0].m(Integer.MIN_VALUE);
                        int i33 = 1;
                        while (true) {
                            if (i33 >= staggeredGridLayoutManager.f2391a) {
                                z11 = true;
                                break;
                            }
                            if (staggeredGridLayoutManager.f2392b[i33].m(Integer.MIN_VALUE) != iM2) {
                                z11 = false;
                                break;
                            }
                            i33++;
                        }
                    } else {
                        int iK4 = staggeredGridLayoutManager.f2392b[0].k(Integer.MIN_VALUE);
                        int i34 = 1;
                        while (true) {
                            if (i34 >= staggeredGridLayoutManager.f2391a) {
                                z11 = true;
                                break;
                            }
                            if (staggeredGridLayoutManager.f2392b[i34].k(Integer.MIN_VALUE) != iK4) {
                                z11 = false;
                                break;
                            }
                            i34++;
                        }
                    }
                    i12 = 1;
                    if (!z11) {
                        n2 n2VarY = pVar.y(layoutPosition);
                        if (n2VarY != null) {
                            n2VarY.f2553d = true;
                        }
                        staggeredGridLayoutManager.W = true;
                    }
                }
                if (l0Var.f2510e == i12) {
                    if (m2Var.f2540f) {
                        for (i16 = staggeredGridLayoutManager.f2391a - i12; i16 >= 0; i16--) {
                            staggeredGridLayoutManager.f2392b[i16].a(viewD);
                        }
                    } else {
                        m2Var.f2539e.a(viewD);
                    }
                } else if (m2Var.f2540f) {
                    for (i13 = staggeredGridLayoutManager.f2391a - 1; i13 >= 0; i13--) {
                        staggeredGridLayoutManager.f2392b[i13].p(viewD);
                    }
                } else {
                    m2Var.f2539e.p(viewD);
                }
                if (staggeredGridLayoutManager.isLayoutRTL() || staggeredGridLayoutManager.f2395e != 1) {
                    if (m2Var.f2540f) {
                        iK = staggeredGridLayoutManager.f2394d.k();
                    } else {
                        iK = staggeredGridLayoutManager.f2394d.k() + (p2Var5.f2588e * staggeredGridLayoutManager.f2396f);
                    }
                    iC2 = staggeredGridLayoutManager.f2394d.c(viewD) + iK;
                } else {
                    iC2 = m2Var.f2540f ? staggeredGridLayoutManager.f2394d.g() : staggeredGridLayoutManager.f2394d.g() - (((staggeredGridLayoutManager.f2391a - 1) - p2Var5.f2588e) * staggeredGridLayoutManager.f2396f);
                    iK = iC2 - staggeredGridLayoutManager.f2394d.c(viewD);
                }
                i14 = iK;
                i15 = iC2;
                if (staggeredGridLayoutManager.f2395e == 1) {
                    staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, i14, iC, i15, iX);
                    staggeredGridLayoutManager = this;
                } else {
                    staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, iC, i14, iX, i15);
                }
                if (m2Var.f2540f) {
                    staggeredGridLayoutManager.J(l0Var2.f2510e, i23);
                } else {
                    staggeredGridLayoutManager.L(p2Var5, l0Var2.f2510e, i23);
                }
                u1Var2 = u1Var;
                staggeredGridLayoutManager.E(u1Var2, l0Var2);
                if (!l0Var2.f2513h && viewD.hasFocusable()) {
                    if (m2Var.f2540f) {
                        staggeredGridLayoutManager.L.clear();
                    } else {
                        staggeredGridLayoutManager.L.set(p2Var5.f2588e, false);
                    }
                }
                z12 = true;
                i22 = 1;
                i21 = 0;
            } else {
                i12 = 1;
            }
            if (l0Var.f2510e == i12) {
                if (m2Var.f2540f) {
                    while (i16 >= 0) {
                        staggeredGridLayoutManager.f2392b[i16].a(viewD);
                    }
                } else {
                    m2Var.f2539e.a(viewD);
                }
            } else if (m2Var.f2540f) {
                while (i13 >= 0) {
                    staggeredGridLayoutManager.f2392b[i13].p(viewD);
                }
            } else {
                m2Var.f2539e.p(viewD);
            }
            if (staggeredGridLayoutManager.isLayoutRTL()) {
                if (m2Var.f2540f) {
                    iK = staggeredGridLayoutManager.f2394d.k();
                } else {
                    iK = staggeredGridLayoutManager.f2394d.k() + (p2Var5.f2588e * staggeredGridLayoutManager.f2396f);
                }
                iC2 = staggeredGridLayoutManager.f2394d.c(viewD) + iK;
            } else {
                if (m2Var.f2540f) {
                    iK = staggeredGridLayoutManager.f2394d.k();
                } else {
                    iK = staggeredGridLayoutManager.f2394d.k() + (p2Var5.f2588e * staggeredGridLayoutManager.f2396f);
                }
                iC2 = staggeredGridLayoutManager.f2394d.c(viewD) + iK;
            }
            i14 = iK;
            i15 = iC2;
            if (staggeredGridLayoutManager.f2395e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, i14, iC, i15, iX);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewD, iC, i14, iX, i15);
            }
            if (m2Var.f2540f) {
                staggeredGridLayoutManager.J(l0Var2.f2510e, i23);
            } else {
                staggeredGridLayoutManager.L(p2Var5, l0Var2.f2510e, i23);
            }
            u1Var2 = u1Var;
            staggeredGridLayoutManager.E(u1Var2, l0Var2);
            if (!l0Var2.f2513h) {
            }
            z12 = true;
            i22 = 1;
            i21 = 0;
        }
        if (!z12) {
            staggeredGridLayoutManager.E(u1Var2, l0Var2);
        }
        int iK5 = l0Var2.f2510e == -1 ? staggeredGridLayoutManager.f2393c.k() - staggeredGridLayoutManager.x(staggeredGridLayoutManager.f2393c.k()) : staggeredGridLayoutManager.w(staggeredGridLayoutManager.f2393c.g()) - staggeredGridLayoutManager.f2393c.g();
        if (iK5 > 0) {
            return Math.min(l0Var.f2507b, iK5);
        }
        return 0;
    }

    public final View q(boolean z11) {
        int iK = this.f2393c.k();
        int iG = this.f2393c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iE = this.f2393c.e(childAt);
            int iB = this.f2393c.b(childAt);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View r(boolean z11) {
        int iK = this.f2393c.k();
        int iG = this.f2393c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int iE = this.f2393c.e(childAt);
            if (this.f2393c.b(childAt) > iK && iE < iG) {
                if (iE >= iK || !z11) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void s(u1 u1Var, c2 c2Var, boolean z11) {
        int iG;
        int iW = w(Integer.MIN_VALUE);
        if (iW != Integer.MIN_VALUE && (iG = this.f2393c.g() - iW) > 0) {
            int i11 = iG - (-scrollBy(-iG, u1Var, c2Var));
            if (!z11 || i11 <= 0) {
                return;
            }
            this.f2393c.p(i11);
        }
    }

    public final int scrollBy(int i11, u1 u1Var, c2 c2Var) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        D(i11, c2Var);
        l0 l0Var = this.f2397t;
        int iP = p(u1Var, l0Var, c2Var);
        if (l0Var.f2507b >= iP) {
            i11 = i11 < 0 ? -iP : iP;
        }
        this.f2393c.p(-i11);
        this.Q = this.K;
        l0Var.f2507b = 0;
        E(u1Var, l0Var);
        return i11;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int scrollHorizontallyBy(int i11, u1 u1Var, c2 c2Var) {
        return scrollBy(i11, u1Var, c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void scrollToPosition(int i11) {
        o2 o2Var = this.S;
        if (o2Var != null && o2Var.f2569a != i11) {
            o2Var.f2572d = null;
            o2Var.f2571c = 0;
            o2Var.f2569a = -1;
            o2Var.f2570b = -1;
        }
        this.M = i11;
        this.N = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.m1
    public final int scrollVerticallyBy(int i11, u1 u1Var, c2 c2Var) {
        return scrollBy(i11, u1Var, c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void setMeasuredDimension(Rect rect, int i11, int i12) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f2395e == 1) {
            iChooseSize2 = m1.chooseSize(i12, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = m1.chooseSize(i11, (this.f2396f * this.f2391a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = m1.chooseSize(i11, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = m1.chooseSize(i12, (this.f2396f * this.f2391a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void smoothScrollToPosition(RecyclerView recyclerView, c2 c2Var, int i11) {
        r0 r0Var = new r0(recyclerView.getContext());
        r0Var.setTargetPosition(i11);
        startSmoothScroll(r0Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean supportsPredictiveItemAnimations() {
        return this.S == null;
    }

    public final void t(u1 u1Var, c2 c2Var, boolean z11) {
        int iK;
        int iX = x(Integer.MAX_VALUE);
        if (iX != Integer.MAX_VALUE && (iK = iX - this.f2393c.k()) > 0) {
            int iScrollBy = iK - scrollBy(iK, u1Var, c2Var);
            if (!z11 || iScrollBy <= 0) {
                return;
            }
            this.f2393c.p(-iScrollBy);
        }
    }

    public final int u() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int v() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int w(int i11) {
        int iK = this.f2392b[0].k(i11);
        for (int i12 = 1; i12 < this.f2391a; i12++) {
            int iK2 = this.f2392b[i12].k(i11);
            if (iK2 > iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    public final int x(int i11) {
        int iM = this.f2392b[0].m(i11);
        for (int i12 = 1; i12 < this.f2391a; i12++) {
            int iM2 = this.f2392b[i12].m(i11);
            if (iM2 < iM) {
                iM = iM2;
            }
        }
        return iM;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final void y(int i11, int i12, int i13) {
        int i14;
        int i15;
        b1.p pVar;
        int iV;
        int iV2 = this.K ? v() : u();
        if (i13 == 8) {
            if (i11 < i12) {
                i14 = i12 + 1;
            } else {
                i14 = i11 + 1;
                i15 = i12;
            }
            pVar = this.O;
            pVar.C(i15);
            if (i13 != 1) {
                pVar.F(i11, i12);
            } else if (i13 != 2) {
                pVar.G(i11, i12);
            } else if (i13 == 8) {
                pVar.G(i11, 1);
                pVar.F(i12, 1);
            }
            if (i14 <= iV2) {
                return;
            }
            if (this.K) {
                iV = u();
            } else {
                iV = v();
            }
            if (i15 <= iV) {
                requestLayout();
            }
        }
        i14 = i11 + i12;
        i15 = i11;
        pVar = this.O;
        pVar.C(i15);
        if (i13 != 1) {
            pVar.F(i11, i12);
        } else if (i13 != 2) {
            pVar.G(i11, i12);
        } else if (i13 == 8) {
            pVar.G(i11, 1);
            pVar.F(i12, 1);
        }
        if (i14 <= iV2) {
            return;
        }
        if (this.K) {
            iV = u();
        } else {
            iV = v();
        }
        if (i15 <= iV) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6 A[SYNTHETIC] */
    public final View z() {
        int i11;
        View childAt;
        int iE;
        int iE2;
        boolean z11;
        boolean z12;
        boolean z13;
        int iB;
        int iB2;
        boolean z14;
        boolean z15;
        int childCount = getChildCount();
        int i12 = childCount - 1;
        BitSet bitSet = new BitSet(this.f2391a);
        bitSet.set(0, this.f2391a, true);
        byte b3 = (this.f2395e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.K) {
            childCount = -1;
        } else {
            i12 = 0;
        }
        int i13 = i12 < childCount ? 1 : -1;
        while (i12 != childCount) {
            View childAt2 = getChildAt(i12);
            m2 m2Var = (m2) childAt2.getLayoutParams();
            if (bitSet.get(m2Var.f2539e.f2588e)) {
                p2 p2Var = m2Var.f2539e;
                if (this.K) {
                    int i14 = p2Var.f2586c;
                    if (i14 == Integer.MIN_VALUE) {
                        p2Var.b();
                        i14 = p2Var.f2586c;
                    }
                    if (i14 < this.f2393c.g()) {
                        z14 = ((m2) ((View) nv.p.f(1, (ArrayList) p2Var.f2589f)).getLayoutParams()).f2540f;
                        z15 = !z14;
                    } else {
                        z15 = false;
                    }
                } else {
                    int i15 = p2Var.f2585b;
                    if (i15 == Integer.MIN_VALUE) {
                        p2Var.c();
                        i15 = p2Var.f2585b;
                    }
                    if (i15 > this.f2393c.k()) {
                        z14 = ((m2) ((View) ((ArrayList) p2Var.f2589f).get(0)).getLayoutParams()).f2540f;
                        z15 = !z14;
                    } else {
                        z15 = false;
                    }
                }
                if (!z15) {
                    bitSet.clear(m2Var.f2539e.f2588e);
                    if (!m2Var.f2540f && (i11 = i12 + i13) != childCount) {
                        childAt = getChildAt(i11);
                        if (this.K) {
                            iB = this.f2393c.b(childAt2);
                            iB2 = this.f2393c.b(childAt);
                            if (iB >= iB2) {
                                if (iB == iB2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (m2Var.f2539e.f2588e - ((m2) childAt.getLayoutParams()).f2539e.f2588e < 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (b3 < 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12 != z13) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            iE = this.f2393c.e(childAt2);
                            iE2 = this.f2393c.e(childAt);
                            if (iE <= iE2) {
                                if (iE == iE2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    if (m2Var.f2539e.f2588e - ((m2) childAt.getLayoutParams()).f2539e.f2588e < 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (b3 < 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12 != z13) {
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i12 += i13;
                }
            } else {
                if (!m2Var.f2540f) {
                    childAt = getChildAt(i11);
                    if (this.K) {
                        iB = this.f2393c.b(childAt2);
                        iB2 = this.f2393c.b(childAt);
                        if (iB >= iB2) {
                            if (iB == iB2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (m2Var.f2539e.f2588e - ((m2) childAt.getLayoutParams()).f2539e.f2588e < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (b3 < 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z12 != z13) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iE = this.f2393c.e(childAt2);
                        iE2 = this.f2393c.e(childAt);
                        if (iE <= iE2) {
                            if (iE == iE2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                if (m2Var.f2539e.f2588e - ((m2) childAt.getLayoutParams()).f2539e.f2588e < 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (b3 < 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z12 != z13) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i12 += i13;
            }
            return childAt2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new m2((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new m2(layoutParams);
    }
}
