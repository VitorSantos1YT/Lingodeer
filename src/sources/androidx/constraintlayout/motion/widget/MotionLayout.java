package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ay.k0;
import b2.c;
import c4.e;
import c4.k;
import com.yalantis.ucrop.view.CropImageView;
import d4.g;
import fb.g0;
import g4.b;
import g4.l;
import h4.a;
import h4.a0;
import h4.b0;
import h4.c0;
import h4.d0;
import h4.e0;
import h4.f0;
import h4.h0;
import h4.n;
import h4.q;
import h4.r;
import h4.s;
import h4.u;
import h4.v;
import h4.x;
import h4.y;
import h4.z;
import j4.h;
import j4.i;
import j4.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements t {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static boolean f1268h1;
    public long A0;
    public float B0;
    public boolean C0;
    public ArrayList D0;
    public ArrayList E0;
    public ArrayList F0;
    public CopyOnWriteArrayList G0;
    public int H0;
    public long I0;
    public float J0;
    public int K0;
    public float L0;
    public boolean M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public d0 S;
    public int S0;
    public r T;
    public float T0;
    public Interpolator U;
    public final e U0;
    public float V;
    public boolean V0;
    public int W;
    public x W0;
    public c X0;
    public final Rect Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1269a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public z f1270a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1271b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final v f1272b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1273c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f1274c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1275d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final RectF f1276d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1277e0;
    public View e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final HashMap f1278f0;
    public Matrix f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f1279g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final ArrayList f1280g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f1281h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f1282i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f1283j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f1284k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f1285l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f1286m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f1287n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public y f1288o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f1289p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public u f1290q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f1291r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final b f1292s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final h4.t f1293t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public a f1294u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f1295v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1296w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1297x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f1298y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public float f1299z0;

    public MotionLayout(Context context) {
        super(context);
        this.U = null;
        this.V = CropImageView.DEFAULT_ASPECT_RATIO;
        this.W = -1;
        this.f1269a0 = -1;
        this.f1271b0 = -1;
        this.f1273c0 = 0;
        this.f1275d0 = 0;
        this.f1277e0 = true;
        this.f1278f0 = new HashMap();
        this.f1279g0 = 0L;
        this.f1281h0 = 1.0f;
        this.f1282i0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1285l0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1287n0 = false;
        this.f1289p0 = 0;
        this.f1291r0 = false;
        this.f1292s0 = new b();
        this.f1293t0 = new h4.t(this);
        this.f1297x0 = false;
        this.C0 = false;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = 0;
        this.I0 = -1L;
        this.J0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.K0 = 0;
        this.L0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.M0 = false;
        this.U0 = new e(1);
        this.V0 = false;
        this.X0 = null;
        new HashMap();
        this.Y0 = new Rect();
        this.Z0 = false;
        this.f1270a1 = z.UNDEFINED;
        this.f1272b1 = new v(this);
        this.f1274c1 = false;
        this.f1276d1 = new RectF();
        this.e1 = null;
        this.f1 = null;
        this.f1280g1 = new ArrayList();
        z(null);
    }

    public static Rect q(MotionLayout motionLayout, g gVar) {
        Rect rect = motionLayout.Y0;
        rect.top = gVar.t();
        rect.left = gVar.s();
        rect.right = gVar.r() + rect.left;
        rect.bottom = gVar.l() + rect.top;
        return rect;
    }

    public final void A() {
        c0 c0Var;
        f0 f0Var;
        View viewFindViewById;
        View viewFindViewById2;
        d0 d0Var = this.S;
        if (d0Var == null) {
            return;
        }
        if (d0Var.a(this.f1269a0, this)) {
            requestLayout();
            return;
        }
        int i11 = this.f1269a0;
        View viewFindViewById3 = null;
        if (i11 != -1) {
            d0 d0Var2 = this.S;
            ArrayList arrayList = d0Var2.f31588f;
            ArrayList arrayList2 = d0Var2.f31586d;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                c0 c0Var2 = (c0) obj;
                if (c0Var2.m.size() > 0) {
                    ArrayList arrayList3 = c0Var2.m;
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList3.get(i13);
                        i13++;
                        int i14 = ((b0) obj2).f31559b;
                        if (i14 != -1 && (viewFindViewById2 = findViewById(i14)) != null) {
                            viewFindViewById2.setOnClickListener(null);
                        }
                    }
                }
            }
            int size3 = arrayList.size();
            int i15 = 0;
            while (i15 < size3) {
                Object obj3 = arrayList.get(i15);
                i15++;
                c0 c0Var3 = (c0) obj3;
                if (c0Var3.m.size() > 0) {
                    ArrayList arrayList4 = c0Var3.m;
                    int size4 = arrayList4.size();
                    int i16 = 0;
                    while (i16 < size4) {
                        Object obj4 = arrayList4.get(i16);
                        i16++;
                        int i17 = ((b0) obj4).f31559b;
                        if (i17 != -1 && (viewFindViewById = findViewById(i17)) != null) {
                            viewFindViewById.setOnClickListener(null);
                        }
                    }
                }
            }
            int size5 = arrayList2.size();
            int i18 = 0;
            while (i18 < size5) {
                Object obj5 = arrayList2.get(i18);
                i18++;
                c0 c0Var4 = (c0) obj5;
                if (c0Var4.m.size() > 0) {
                    ArrayList arrayList5 = c0Var4.m;
                    int size6 = arrayList5.size();
                    int i19 = 0;
                    while (i19 < size6) {
                        Object obj6 = arrayList5.get(i19);
                        i19++;
                        ((b0) obj6).a(this, i11, c0Var4);
                    }
                }
            }
            int size7 = arrayList.size();
            int i21 = 0;
            while (i21 < size7) {
                Object obj7 = arrayList.get(i21);
                i21++;
                c0 c0Var5 = (c0) obj7;
                if (c0Var5.m.size() > 0) {
                    ArrayList arrayList6 = c0Var5.m;
                    int size8 = arrayList6.size();
                    int i22 = 0;
                    while (i22 < size8) {
                        Object obj8 = arrayList6.get(i22);
                        i22++;
                        ((b0) obj8).a(this, i11, c0Var5);
                    }
                }
            }
        }
        if (!this.S.o() || (c0Var = this.S.f31585c) == null || (f0Var = c0Var.f31576l) == null) {
            return;
        }
        MotionLayout motionLayout = f0Var.f31632r;
        int i23 = f0Var.f31619d;
        if (i23 != -1 && (viewFindViewById3 = motionLayout.findViewById(i23)) == null) {
            g0.s(motionLayout.getContext(), f0Var.f31619d);
        }
        if (viewFindViewById3 instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById3;
            nestedScrollView.setOnTouchListener(new e0());
            nestedScrollView.setOnScrollChangeListener(new k0(14));
        }
    }

    public final void B() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f1288o0 == null && ((copyOnWriteArrayList = this.G0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList = this.f1280g1;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            y yVar = this.f1288o0;
            if (yVar != null) {
                yVar.a(num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.G0;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((y) it.next()).a(num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public final void C() {
        this.f1272b1.f();
        invalidate();
    }

    public final void D(int i11) {
        setState(z.SETUP);
        this.f1269a0 = i11;
        this.W = -1;
        this.f1271b0 = -1;
        i iVar = this.M;
        if (iVar == null) {
            d0 d0Var = this.S;
            if (d0Var != null) {
                d0Var.b(i11).b(this);
                return;
            }
            return;
        }
        float f5 = -1;
        ConstraintLayout constraintLayout = (ConstraintLayout) iVar.f35910c;
        SparseArray sparseArray = (SparseArray) iVar.f35911d;
        int i12 = iVar.f35908a;
        int i13 = 0;
        if (i12 != i11) {
            iVar.f35908a = i11;
            j4.g gVar = (j4.g) sparseArray.get(i11);
            ArrayList arrayList = gVar.f35899b;
            while (true) {
                if (i13 >= arrayList.size()) {
                    i13 = -1;
                    break;
                } else if (((h) arrayList.get(i13)).a(f5, f5)) {
                    break;
                } else {
                    i13++;
                }
            }
            ArrayList arrayList2 = gVar.f35899b;
            p pVar = i13 == -1 ? gVar.f35901d : ((h) arrayList2.get(i13)).f35907f;
            if (i13 != -1) {
                int i14 = ((h) arrayList2.get(i13)).f35906e;
            }
            if (pVar == null) {
                return;
            }
            iVar.f35909b = i13;
            pVar.b(constraintLayout);
            return;
        }
        j4.g gVar2 = i11 == -1 ? (j4.g) sparseArray.valueAt(0) : (j4.g) sparseArray.get(i12);
        int i15 = iVar.f35909b;
        if (i15 == -1 || !((h) gVar2.f35899b.get(i15)).a(f5, f5)) {
            ArrayList arrayList3 = gVar2.f35899b;
            while (true) {
                if (i13 >= arrayList3.size()) {
                    i13 = -1;
                    break;
                } else if (((h) arrayList3.get(i13)).a(f5, f5)) {
                    break;
                } else {
                    i13++;
                }
            }
            ArrayList arrayList4 = gVar2.f35899b;
            if (iVar.f35909b == i13) {
                return;
            }
            p pVar2 = i13 == -1 ? null : ((h) arrayList4.get(i13)).f35907f;
            if (i13 != -1) {
                int i16 = ((h) arrayList4.get(i13)).f35906e;
            }
            if (pVar2 == null) {
                return;
            }
            iVar.f35909b = i13;
            pVar2.b(constraintLayout);
        }
    }

    public final void E(int i11, int i12) {
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new x(this);
            }
            x xVar = this.W0;
            xVar.f31802c = i11;
            xVar.f31803d = i12;
            return;
        }
        d0 d0Var = this.S;
        if (d0Var != null) {
            this.W = i11;
            this.f1271b0 = i12;
            d0Var.n(i11, i12);
            this.f1272b1.e(this.S.b(i11), this.S.b(i12));
            C();
            this.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
            r(CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x012d  */
    public final void F(float f5, float f11, int i11) {
        d0 d0Var;
        c0 c0Var;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        int i13;
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        f0 f0Var5;
        c0 c0Var2;
        f0 f0Var6;
        f0 f0Var7;
        c0 c0Var3;
        float f16;
        f0 f0Var8;
        if (this.S == null || this.f1283j0 == f5) {
            return;
        }
        this.f1291r0 = true;
        this.f1279g0 = getNanoTime();
        float fC = this.S.c() / 1000.0f;
        this.f1281h0 = fC;
        this.f1285l0 = f5;
        this.f1287n0 = true;
        float f17 = 1.0f;
        b bVar = this.f1292s0;
        float f18 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (i11 != 1 || i11 == 7) {
                f17 = 0.0f;
            } else if (i11 != 2 && i11 != 6) {
                f17 = f5;
            }
            d0Var = this.S;
            c0Var = d0Var.f31585c;
            if (c0Var != null || (f0Var7 = c0Var.f31576l) == null) {
                i12 = 0;
            } else {
                i12 = f0Var7.D;
            }
            if (i12 == 0) {
                float f19 = this.f1283j0;
                float fG = d0Var.g();
                c0Var2 = this.S.f31585c;
                if (c0Var2 != null && (f0Var6 = c0Var2.f31576l) != null) {
                    f18 = f0Var6.f31633s;
                }
                this.f1292s0.b(f19, f17, f11, fC, fG, f18);
            } else {
                float f21 = this.f1283j0;
                if (c0Var != null || (f0Var5 = c0Var.f31576l) == null) {
                    f12 = 0.0f;
                } else {
                    f12 = f0Var5.f31640z;
                }
                if (c0Var != null || (f0Var4 = c0Var.f31576l) == null) {
                    f13 = 0.0f;
                } else {
                    f13 = f0Var4.A;
                }
                if (c0Var != null || (f0Var3 = c0Var.f31576l) == null) {
                    f14 = 0.0f;
                } else {
                    f14 = f0Var3.f31639y;
                }
                if (c0Var != null || (f0Var2 = c0Var.f31576l) == null) {
                    f15 = 0.0f;
                } else {
                    f15 = f0Var2.B;
                }
                if (c0Var != null || (f0Var = c0Var.f31576l) == null) {
                    i13 = 0;
                } else {
                    i13 = f0Var.C;
                }
                if (bVar.f28740b == null) {
                    k kVar = new k();
                    kVar.f6571a = 0.5d;
                    kVar.f6579i = 0;
                    bVar.f28740b = kVar;
                }
                k kVar2 = bVar.f28740b;
                bVar.f28741c = kVar2;
                kVar2.f6573c = f17;
                kVar2.f6571a = f14;
                kVar2.f6575e = f21;
                kVar2.f6572b = f13;
                kVar2.f6577g = f12;
                kVar2.f6578h = f15;
                kVar2.f6579i = i13;
                kVar2.f6574d = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            int i14 = this.f1269a0;
            this.f1285l0 = f17;
            this.f1269a0 = i14;
            this.T = bVar;
        } else {
            h4.t tVar = this.f1293t0;
            if (i11 == 4) {
                float f22 = this.f1283j0;
                float fG2 = this.S.g();
                tVar.f31774a = f11;
                tVar.f31775b = f22;
                tVar.f31776c = fG2;
                this.T = tVar;
            } else if (i11 == 5) {
                float f23 = this.f1283j0;
                float fG3 = this.S.g();
                if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f24 = f11 / fG3;
                    if (((f11 * f24) - (((fG3 * f24) * f24) / 2.0f)) + f23 > 1.0f) {
                        float f25 = this.f1283j0;
                        float fG4 = this.S.g();
                        tVar.f31774a = f11;
                        tVar.f31775b = f25;
                        tVar.f31776c = fG4;
                        this.T = tVar;
                    } else {
                        float f26 = this.f1283j0;
                        float f27 = this.f1281h0;
                        float fG5 = this.S.g();
                        c0Var3 = this.S.f31585c;
                        if (c0Var3 != null || (f0Var8 = c0Var3.f31576l) == null) {
                            f16 = 0.0f;
                        } else {
                            f16 = f0Var8.f31633s;
                        }
                        this.f1292s0.b(f26, f5, f11, f27, fG5, f16);
                        this.V = CropImageView.DEFAULT_ASPECT_RATIO;
                        int i15 = this.f1269a0;
                        this.f1285l0 = f5;
                        this.f1269a0 = i15;
                        this.T = bVar;
                    }
                } else {
                    float f28 = (-f11) / fG3;
                    if ((((fG3 * f28) * f28) / 2.0f) + (f11 * f28) + f23 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        float f29 = this.f1283j0;
                        float fG6 = this.S.g();
                        tVar.f31774a = f11;
                        tVar.f31775b = f29;
                        tVar.f31776c = fG6;
                        this.T = tVar;
                    } else {
                        float f210 = this.f1283j0;
                        float f211 = this.f1281h0;
                        float fG7 = this.S.g();
                        c0Var3 = this.S.f31585c;
                        if (c0Var3 != null) {
                            f16 = 0.0f;
                        } else {
                            f16 = 0.0f;
                        }
                        this.f1292s0.b(f210, f5, f11, f211, fG7, f16);
                        this.V = CropImageView.DEFAULT_ASPECT_RATIO;
                        int i16 = this.f1269a0;
                        this.f1285l0 = f5;
                        this.f1269a0 = i16;
                        this.T = bVar;
                    }
                }
            } else if (i11 == 6 || i11 == 7) {
                if (i11 != 1) {
                    f17 = 0.0f;
                } else {
                    f17 = 0.0f;
                }
                d0Var = this.S;
                c0Var = d0Var.f31585c;
                if (c0Var != null) {
                    i12 = 0;
                } else {
                    i12 = 0;
                }
                if (i12 == 0) {
                    float f110 = this.f1283j0;
                    float fG8 = d0Var.g();
                    c0Var2 = this.S.f31585c;
                    if (c0Var2 != null) {
                        f18 = f0Var6.f31633s;
                    }
                    this.f1292s0.b(f110, f17, f11, fC, fG8, f18);
                } else {
                    float f212 = this.f1283j0;
                    if (c0Var != null) {
                        f12 = 0.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (c0Var != null) {
                        f13 = 0.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    if (c0Var != null) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    if (c0Var != null) {
                        f15 = 0.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (c0Var != null) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                    }
                    if (bVar.f28740b == null) {
                        k kVar3 = new k();
                        kVar3.f6571a = 0.5d;
                        kVar3.f6579i = 0;
                        bVar.f28740b = kVar3;
                    }
                    k kVar4 = bVar.f28740b;
                    bVar.f28741c = kVar4;
                    kVar4.f6573c = f17;
                    kVar4.f6571a = f14;
                    kVar4.f6575e = f212;
                    kVar4.f6572b = f13;
                    kVar4.f6577g = f12;
                    kVar4.f6578h = f15;
                    kVar4.f6579i = i13;
                    kVar4.f6574d = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                int i17 = this.f1269a0;
                this.f1285l0 = f17;
                this.f1269a0 = i17;
                this.T = bVar;
            }
        }
        this.f1286m0 = false;
        this.f1279g0 = getNanoTime();
        invalidate();
    }

    public final void G(int i11, p pVar) {
        d0 d0Var = this.S;
        if (d0Var != null) {
            d0Var.f31589g.put(i11, pVar);
        }
        this.f1272b1.e(this.S.b(this.W), this.S.b(this.f1271b0));
        C();
        if (this.f1269a0 == i11) {
            pVar.b(this);
        }
    }

    public final void H(int i11, View... viewArr) {
        d0 d0Var = this.S;
        if (d0Var != null) {
            a9.i iVar = d0Var.f31598q;
            iVar.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) iVar.f518b;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                h0 h0Var = (h0) arrayList2.get(i12);
                if (h0Var.f31673a == i11) {
                    for (View view : viewArr) {
                        if (h0Var.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        MotionLayout motionLayout = (MotionLayout) iVar.f517a;
                        int currentState = motionLayout.getCurrentState();
                        if (h0Var.f31677e == 2) {
                            h0Var.a(iVar, (MotionLayout) iVar.f517a, currentState, null, viewArr2);
                        } else if (currentState == -1) {
                            motionLayout.toString();
                        } else {
                            d0 d0Var2 = motionLayout.S;
                            p pVarB = d0Var2 == null ? null : d0Var2.b(currentState);
                            if (pVarB != null) {
                                h0Var.a(iVar, (MotionLayout) iVar.f517a, currentState, pVarB, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
                i12 = i13;
            }
        }
    }

    @Override // z4.t
    public final void c(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.f1297x0 || i11 != 0 || i12 != 0) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
        }
        this.f1297x0 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i11;
        a0 a0Var;
        ArrayList arrayList;
        int i12;
        Paint paint;
        Paint paint2;
        Paint paint3;
        int i13;
        q qVar;
        Paint paint4;
        int i14;
        float fMin;
        double dA;
        Paint paint5;
        a9.i iVar;
        ArrayList arrayList2 = this.F0;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList2.get(i15);
                i15++;
                ((MotionHelper) obj).getClass();
            }
        }
        t(false);
        d0 d0Var = this.S;
        if (d0Var != null && (iVar = d0Var.f31598q) != null) {
            ArrayList arrayList3 = (ArrayList) iVar.f521e;
            ArrayList arrayList4 = (ArrayList) iVar.f520d;
            if (arrayList4 != null) {
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj2 = arrayList4.get(i16);
                    i16++;
                    ((h4.g0) obj2).a();
                }
                ((ArrayList) iVar.f520d).removeAll(arrayList3);
                arrayList3.clear();
                if (((ArrayList) iVar.f520d).isEmpty()) {
                    iVar.f520d = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.S == null) {
            return;
        }
        if ((this.f1289p0 & 1) == 1 && !isInEditMode()) {
            this.H0++;
            long nanoTime = getNanoTime();
            long j11 = this.I0;
            if (j11 != -1) {
                long j12 = nanoTime - j11;
                if (j12 > 200000000) {
                    this.J0 = ((int) ((this.H0 / (j12 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.H0 = 0;
                    this.I0 = nanoTime;
                }
            } else {
                this.I0 = nanoTime;
            }
            Paint paint6 = new Paint();
            paint6.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.J0);
            sb2.append(" fps ");
            int i17 = this.W;
            StringBuilder sbN = ep.a.n(ep.a.k(sb2, i17 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i17), " -> "));
            int i18 = this.f1271b0;
            sbN.append(i18 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i18));
            sbN.append(" (progress: ");
            sbN.append(progress);
            sbN.append(" ) state=");
            int i19 = this.f1269a0;
            sbN.append(i19 == -1 ? "undefined" : i19 != -1 ? getContext().getResources().getResourceEntryName(i19) : "UNDEFINED");
            String string = sbN.toString();
            paint6.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint6);
            paint6.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint6);
        }
        if (this.f1289p0 > 1) {
            if (this.f1290q0 == null) {
                this.f1290q0 = new u(this);
            }
            u uVar = this.f1290q0;
            int iC = this.S.c();
            int i21 = this.f1289p0;
            Paint paint7 = uVar.f31784g;
            Paint paint8 = uVar.f31783f;
            Paint paint9 = uVar.f31786i;
            int i22 = uVar.m;
            Paint paint10 = uVar.f31782e;
            MotionLayout motionLayout = uVar.f31790n;
            i11 = 0;
            HashMap map = this.f1278f0;
            if (map != null && map.size() != 0) {
                canvas.save();
                if (!motionLayout.isInEditMode() && (i21 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.f1271b0) + ":" + motionLayout.getProgress();
                    canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, uVar.f31785h);
                    canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint10);
                }
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    q qVar2 = (q) it.next();
                    a0 a0Var2 = qVar2.f31752f;
                    ArrayList arrayList5 = qVar2.f31766u;
                    int iMax = a0Var2.f31552b;
                    int size3 = arrayList5.size();
                    it = it;
                    for (int i23 = 0; i23 < size3; i23++) {
                        iMax = Math.max(iMax, ((a0) arrayList5.get(i23)).f31552b);
                    }
                    int iMax2 = Math.max(iMax, qVar2.f31753g.f31552b);
                    if (i21 > 0 && iMax2 == 0) {
                        iMax2 = 1;
                    }
                    if (iMax2 != 0) {
                        float[] fArr = uVar.f31780c;
                        int[] iArr = uVar.f31779b;
                        if (fArr != null) {
                            double[] dArrW = qVar2.f31756j[0].w();
                            if (iArr != null) {
                                int i24 = 0;
                                int i25 = 0;
                                for (int size4 = arrayList5.size(); i24 < size4; size4 = size4) {
                                    Object obj3 = arrayList5.get(i24);
                                    i24++;
                                    iArr[i25] = ((a0) obj3).Q;
                                    i25++;
                                }
                            }
                            int i26 = 0;
                            int i27 = 0;
                            while (i26 < dArrW.length) {
                                double[] dArr = dArrW;
                                qVar2.f31756j[0].q(dArrW[i26], qVar2.f31761p);
                                qVar2.f31752f.c(dArr[i26], qVar2.f31760o, qVar2.f31761p, fArr, i27);
                                i27 += 2;
                                i26++;
                                a0Var2 = a0Var2;
                                arrayList5 = arrayList5;
                                dArrW = dArr;
                            }
                            a0Var = a0Var2;
                            arrayList = arrayList5;
                            i12 = i27 / 2;
                        } else {
                            a0Var = a0Var2;
                            arrayList = arrayList5;
                            i21 = i21;
                            i12 = 0;
                        }
                        uVar.f31788k = i12;
                        if (iMax2 >= 1) {
                            int i28 = iC / 16;
                            float[] fArr2 = uVar.f31778a;
                            if (fArr2 == null || fArr2.length != i28 * 2) {
                                uVar.f31778a = new float[i28 * 2];
                                uVar.f31781d = new Path();
                            }
                            float f5 = i22;
                            canvas.translate(f5, f5);
                            paint10.setColor(1996488704);
                            paint9.setColor(1996488704);
                            paint8.setColor(1996488704);
                            paint7.setColor(1996488704);
                            float[] fArr3 = uVar.f31778a;
                            float f11 = 1.0f / (i28 - 1);
                            HashMap map2 = qVar2.f31770y;
                            float f12 = 1.0f;
                            l lVar = map2 == null ? null : (l) map2.get("translationX");
                            HashMap map3 = qVar2.f31770y;
                            l lVar2 = map3 == null ? null : (l) map3.get("translationY");
                            a0 a0Var3 = a0Var;
                            HashMap map4 = qVar2.f31771z;
                            g4.g gVar = map4 == null ? null : (g4.g) map4.get("translationX");
                            HashMap map5 = qVar2.f31771z;
                            g4.g gVar2 = map5 == null ? null : (g4.g) map5.get("translationY");
                            int i29 = 0;
                            while (true) {
                                float f13 = Float.NaN;
                                if (i29 >= i28) {
                                    break;
                                }
                                float f14 = i29 * f11;
                                float f15 = qVar2.f31759n;
                                if (f15 != f12) {
                                    float f16 = qVar2.m;
                                    fMin = f14 < f16 ? CropImageView.DEFAULT_ASPECT_RATIO : f14;
                                    paint4 = paint9;
                                    i14 = i22;
                                    if (fMin > f16 && fMin < 1.0d) {
                                        fMin = Math.min((fMin - f16) * f15, f12);
                                    }
                                } else {
                                    paint4 = paint9;
                                    i14 = i22;
                                    fMin = f14;
                                }
                                double d5 = fMin;
                                int i30 = i28;
                                a0 a0Var4 = a0Var3;
                                e eVar = a0Var4.f31551a;
                                int size5 = arrayList.size();
                                int i31 = i29;
                                int i32 = 0;
                                float f17 = CropImageView.DEFAULT_ASPECT_RATIO;
                                while (i32 < size5) {
                                    int i33 = size5;
                                    Object obj4 = arrayList.get(i32);
                                    int i34 = i32 + 1;
                                    a0 a0Var5 = (a0) obj4;
                                    e eVar2 = a0Var5.f31551a;
                                    if (eVar2 != null) {
                                        float f18 = a0Var5.f31553c;
                                        if (f18 < fMin) {
                                            f17 = f18;
                                            eVar = eVar2;
                                        } else if (Float.isNaN(f13)) {
                                            f13 = a0Var5.f31553c;
                                        }
                                    }
                                    size5 = i33;
                                    i32 = i34;
                                }
                                if (eVar != null) {
                                    if (Float.isNaN(f13)) {
                                        f13 = 1.0f;
                                    }
                                    float f19 = f13 - f17;
                                    dA = (((float) eVar.a((fMin - f17) / f19)) * f19) + f17;
                                } else {
                                    dA = d5;
                                }
                                qVar2.f31756j[0].q(dA, qVar2.f31761p);
                                c4.b bVar = qVar2.f31757k;
                                if (bVar != null) {
                                    double[] dArr2 = qVar2.f31761p;
                                    paint5 = paint7;
                                    if (dArr2.length > 0) {
                                        bVar.q(dA, dArr2);
                                    }
                                } else {
                                    paint5 = paint7;
                                }
                                int i35 = i31 * 2;
                                qVar2.f31752f.c(dA, qVar2.f31760o, qVar2.f31761p, fArr3, i35);
                                if (gVar != null) {
                                    fArr3[i35] = gVar.a(fMin) + fArr3[i35];
                                } else if (lVar != null) {
                                    fArr3[i35] = lVar.a(fMin) + fArr3[i35];
                                }
                                if (gVar2 != null) {
                                    int i36 = i35 + 1;
                                    fArr3[i36] = gVar2.a(fMin) + fArr3[i36];
                                } else if (lVar2 != null) {
                                    int i37 = i35 + 1;
                                    fArr3[i37] = lVar2.a(fMin) + fArr3[i37];
                                }
                                i29 = i31 + 1;
                                a0Var3 = a0Var4;
                                paint9 = paint4;
                                i22 = i14;
                                i28 = i30;
                                paint8 = paint8;
                                paint7 = paint5;
                                f12 = 1.0f;
                            }
                            a0 a0Var6 = a0Var3;
                            uVar.a(canvas, iMax2, uVar.f31788k, qVar2);
                            paint10.setColor(-21965);
                            Paint paint11 = paint8;
                            paint11.setColor(-2067046);
                            paint3 = paint9;
                            paint3.setColor(-2067046);
                            paint = paint7;
                            paint.setColor(-13391360);
                            int i38 = i22;
                            float f21 = -i38;
                            canvas.translate(f21, f21);
                            uVar.a(canvas, iMax2, uVar.f31788k, qVar2);
                            char c11 = 5;
                            if (iMax2 == 5) {
                                float[] fArr4 = uVar.f31787j;
                                uVar.f31781d.reset();
                                int i39 = 0;
                                while (i39 <= 50) {
                                    char c12 = c11;
                                    qVar2.f31756j[0].q(qVar2.b(i39 / 50, null), qVar2.f31761p);
                                    int[] iArr2 = qVar2.f31760o;
                                    double[] dArr3 = qVar2.f31761p;
                                    float f22 = a0Var6.f31555e;
                                    float fCos = a0Var6.f31556f;
                                    float f23 = a0Var6.f31557t;
                                    int i40 = i38;
                                    float f24 = a0Var6.H;
                                    float[] fArr5 = fArr4;
                                    int i41 = 0;
                                    while (true) {
                                        qVar = qVar2;
                                        if (i41 >= iArr2.length) {
                                            break;
                                        }
                                        Paint paint12 = paint11;
                                        float f25 = (float) dArr3[i41];
                                        int i42 = iArr2[i41];
                                        if (i42 == 1) {
                                            f22 = f25;
                                        } else if (i42 == 2) {
                                            fCos = f25;
                                        } else if (i42 == 3) {
                                            f23 = f25;
                                        } else if (i42 == 4) {
                                            f24 = f25;
                                        }
                                        i41++;
                                        qVar2 = qVar;
                                        paint11 = paint12;
                                    }
                                    Paint paint13 = paint11;
                                    if (a0Var6.O != null) {
                                        double d11 = CropImageView.DEFAULT_ASPECT_RATIO;
                                        double d12 = f22;
                                        double d13 = fCos;
                                        float fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f23 / 2.0f)));
                                        fCos = (float) ((d11 - (Math.cos(d13) * d12)) - ((double) (f24 / 2.0f)));
                                        f22 = fSin;
                                    }
                                    float f26 = f23 + f22;
                                    float f27 = fCos + f24;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f28 = f22 + CropImageView.DEFAULT_ASPECT_RATIO;
                                    float f29 = fCos + CropImageView.DEFAULT_ASPECT_RATIO;
                                    float f30 = f26 + CropImageView.DEFAULT_ASPECT_RATIO;
                                    float f31 = f27 + CropImageView.DEFAULT_ASPECT_RATIO;
                                    fArr5[0] = f28;
                                    fArr5[1] = f29;
                                    fArr5[2] = f30;
                                    fArr5[3] = f29;
                                    fArr5[4] = f30;
                                    fArr5[c12] = f31;
                                    fArr5[6] = f28;
                                    fArr5[7] = f31;
                                    uVar.f31781d.moveTo(f28, f29);
                                    uVar.f31781d.lineTo(fArr5[2], fArr5[3]);
                                    uVar.f31781d.lineTo(fArr5[4], fArr5[c12]);
                                    uVar.f31781d.lineTo(fArr5[6], fArr5[7]);
                                    uVar.f31781d.close();
                                    i39++;
                                    c11 = c12;
                                    fArr4 = fArr5;
                                    qVar2 = qVar;
                                    i38 = i40;
                                    paint11 = paint13;
                                }
                                i13 = i38;
                                paint2 = paint11;
                                paint10.setColor(1140850688);
                                canvas.translate(2.0f, 2.0f);
                                canvas.drawPath(uVar.f31781d, paint10);
                                canvas.translate(-2.0f, -2.0f);
                                paint10.setColor(-65536);
                                canvas.drawPath(uVar.f31781d, paint10);
                            } else {
                                i13 = i38;
                                paint2 = paint11;
                            }
                            paint9 = paint3;
                            paint7 = paint;
                            iC = iC;
                            i21 = i21;
                            i22 = i13;
                            paint8 = paint2;
                        } else {
                            paint = paint7;
                            paint2 = paint8;
                            paint3 = paint9;
                            i13 = i22;
                        }
                        paint9 = paint3;
                        paint7 = paint;
                        iC = iC;
                        i21 = i21;
                        i22 = i13;
                        paint8 = paint2;
                    }
                }
                canvas.restore();
            }
        } else {
            i11 = 0;
        }
        ArrayList arrayList6 = this.F0;
        if (arrayList6 != null) {
            int size6 = arrayList6.size();
            int i43 = i11;
            while (i43 < size6) {
                Object obj5 = arrayList6.get(i43);
                i43++;
                ((MotionHelper) obj5).getClass();
            }
        }
    }

    @Override // z4.s
    public final boolean f(View view, View view2, int i11, int i12) {
        c0 c0Var;
        f0 f0Var;
        d0 d0Var = this.S;
        return (d0Var == null || (c0Var = d0Var.f31585c) == null || (f0Var = c0Var.f31576l) == null || (f0Var.f31637w & 2) != 0) ? false : true;
    }

    @Override // z4.s
    public final void g(View view, View view2, int i11, int i12) {
        this.A0 = getNanoTime();
        this.B0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1298y0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1299z0 = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public int[] getConstraintSetIds() {
        d0 d0Var = this.S;
        if (d0Var == null) {
            return null;
        }
        SparseArray sparseArray = d0Var.f31589g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = sparseArray.keyAt(i11);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f1269a0;
    }

    public ArrayList<c0> getDefinedTransitions() {
        d0 d0Var = this.S;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f31586d;
    }

    public a getDesignTool() {
        if (this.f1294u0 == null) {
            this.f1294u0 = new a();
        }
        return this.f1294u0;
    }

    public int getEndState() {
        return this.f1271b0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1283j0;
    }

    public d0 getScene() {
        return this.S;
    }

    public int getStartState() {
        return this.W;
    }

    public float getTargetPosition() {
        return this.f1285l0;
    }

    public Bundle getTransitionState() {
        if (this.W0 == null) {
            this.W0 = new x(this);
        }
        x xVar = this.W0;
        MotionLayout motionLayout = xVar.f31804e;
        xVar.f31803d = motionLayout.f1271b0;
        xVar.f31802c = motionLayout.W;
        xVar.f31801b = motionLayout.getVelocity();
        xVar.f31800a = motionLayout.getProgress();
        x xVar2 = this.W0;
        xVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", xVar2.f31800a);
        bundle.putFloat("motion.velocity", xVar2.f31801b);
        bundle.putInt("motion.StartState", xVar2.f31802c);
        bundle.putInt("motion.EndState", xVar2.f31803d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        d0 d0Var = this.S;
        if (d0Var != null) {
            this.f1281h0 = d0Var.c() / 1000.0f;
        }
        return (long) (this.f1281h0 * 1000.0f);
    }

    public float getVelocity() {
        return this.V;
    }

    @Override // z4.s
    public final void h(View view, int i11) {
        f0 f0Var;
        int i12;
        d0 d0Var = this.S;
        if (d0Var != null) {
            float f5 = this.B0;
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            float f12 = this.f1298y0 / f5;
            float f13 = this.f1299z0 / f5;
            c0 c0Var = d0Var.f31585c;
            if (c0Var == null || (f0Var = c0Var.f31576l) == null) {
                return;
            }
            f0Var.m = false;
            MotionLayout motionLayout = f0Var.f31632r;
            float progress = motionLayout.getProgress();
            f0Var.f31632r.w(f0Var.f31619d, progress, f0Var.f31623h, f0Var.f31622g, f0Var.f31628n);
            float f14 = f0Var.f31626k;
            float[] fArr = f0Var.f31628n;
            float f15 = f14 != CropImageView.DEFAULT_ASPECT_RATIO ? (f12 * f14) / fArr[0] : (f13 * f0Var.f31627l) / fArr[1];
            if (!Float.isNaN(f15)) {
                progress += f15 / 3.0f;
            }
            if (progress == CropImageView.DEFAULT_ASPECT_RATIO || progress == 1.0f || (i12 = f0Var.f31618c) == 3) {
                return;
            }
            if (progress >= 0.5d) {
                f11 = 1.0f;
            }
            motionLayout.F(f11, f15, i12);
        }
    }

    @Override // z4.s
    public final void i(View view, int i11, int i12, int[] iArr, int i13) {
        c0 c0Var;
        boolean z11;
        float f5;
        f0 f0Var;
        float f11;
        f0 f0Var2;
        f0 f0Var3;
        f0 f0Var4;
        int i14;
        d0 d0Var = this.S;
        if (d0Var == null || (c0Var = d0Var.f31585c) == null || (z11 = c0Var.f31578o)) {
            return;
        }
        int i15 = -1;
        if (z11 || (f0Var4 = c0Var.f31576l) == null || (i14 = f0Var4.f31620e) == -1 || view.getId() == i14) {
            c0 c0Var2 = d0Var.f31585c;
            if ((c0Var2 == null || (f0Var3 = c0Var2.f31576l) == null) ? false : f0Var3.f31635u) {
                f0 f0Var5 = c0Var.f31576l;
                if (f0Var5 != null && (f0Var5.f31637w & 4) != 0) {
                    i15 = i12;
                }
                float f12 = this.f1282i0;
                if ((f12 == 1.0f || f12 == CropImageView.DEFAULT_ASPECT_RATIO) && view.canScrollVertically(i15)) {
                    return;
                }
            }
            f0 f0Var6 = c0Var.f31576l;
            if (f0Var6 == null || (f0Var6.f31637w & 1) == 0) {
                f5 = 0.0f;
            } else {
                float f13 = i11;
                float f14 = i12;
                c0 c0Var3 = d0Var.f31585c;
                if (c0Var3 == null || (f0Var2 = c0Var3.f31576l) == null) {
                    f5 = 0.0f;
                    f11 = 0.0f;
                } else {
                    float[] fArr = f0Var2.f31628n;
                    f5 = 0.0f;
                    f0Var2.f31632r.w(f0Var2.f31619d, f0Var2.f31632r.getProgress(), f0Var2.f31623h, f0Var2.f31622g, fArr);
                    float f15 = f0Var2.f31626k;
                    if (f15 != CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (fArr[0] == CropImageView.DEFAULT_ASPECT_RATIO) {
                            fArr[0] = 1.0E-7f;
                        }
                        f11 = (f13 * f15) / fArr[0];
                    } else {
                        if (fArr[1] == CropImageView.DEFAULT_ASPECT_RATIO) {
                            fArr[1] = 1.0E-7f;
                        }
                        f11 = (f14 * f0Var2.f31627l) / fArr[1];
                    }
                }
                float f16 = this.f1283j0;
                if ((f16 <= f5 && f11 < f5) || (f16 >= 1.0f && f11 > f5)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new s(view, 0));
                    return;
                }
            }
            float f17 = this.f1282i0;
            long nanoTime = getNanoTime();
            float f18 = i11;
            this.f1298y0 = f18;
            float f19 = i12;
            this.f1299z0 = f19;
            this.B0 = (float) ((nanoTime - this.A0) * 1.0E-9d);
            this.A0 = nanoTime;
            c0 c0Var4 = d0Var.f31585c;
            if (c0Var4 != null && (f0Var = c0Var4.f31576l) != null) {
                float[] fArr2 = f0Var.f31628n;
                MotionLayout motionLayout = f0Var.f31632r;
                float progress = motionLayout.getProgress();
                if (!f0Var.m) {
                    f0Var.m = true;
                    motionLayout.setProgress(progress);
                }
                f0Var.f31632r.w(f0Var.f31619d, progress, f0Var.f31623h, f0Var.f31622g, fArr2);
                if (Math.abs((f0Var.f31627l * fArr2[1]) + (f0Var.f31626k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f21 = f0Var.f31626k;
                float fMax = Math.max(Math.min(progress + (f21 != f5 ? (f18 * f21) / fArr2[0] : (f19 * f0Var.f31627l) / fArr2[1]), 1.0f), f5);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f17 != this.f1282i0) {
                iArr[0] = i11;
                iArr[1] = i12;
            }
            t(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f1297x0 = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void m(int i11) {
        this.M = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c0 c0Var;
        int i11;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        d0 d0Var = this.S;
        if (d0Var != null && (i11 = this.f1269a0) != -1) {
            p pVarB = d0Var.b(i11);
            d0 d0Var2 = this.S;
            SparseArray sparseArray = d0Var2.f31589g;
            int i12 = 0;
            loop0: for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                int iKeyAt = sparseArray.keyAt(i13);
                SparseIntArray sparseIntArray = d0Var2.f31591i;
                int i14 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (i14 > 0) {
                    if (i14 == iKeyAt) {
                        break loop0;
                    }
                    int i15 = size - 1;
                    if (size < 0) {
                        break loop0;
                    }
                    i14 = sparseIntArray.get(i14);
                    size = i15;
                }
                d0Var2.m(iKeyAt, this);
            }
            ArrayList arrayList = this.F0;
            if (arrayList != null) {
                int size2 = arrayList.size();
                while (i12 < size2) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((MotionHelper) obj).getClass();
                }
            }
            if (pVarB != null) {
                pVarB.b(this);
            }
            this.W = this.f1269a0;
        }
        A();
        x xVar = this.W0;
        if (xVar != null) {
            if (this.Z0) {
                post(new s(this, 1));
                return;
            } else {
                xVar.a();
                return;
            }
        }
        d0 d0Var3 = this.S;
        if (d0Var3 == null || (c0Var = d0Var3.f31585c) == null || c0Var.f31577n != 4) {
            return;
        }
        r(1.0f);
        this.X0 = null;
        setState(z.SETUP);
        setState(z.MOVING);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:75:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        f0 f0Var;
        int i11;
        RectF rectFB;
        d0 d0Var = this.S;
        if (d0Var == null || !this.f1277e0) {
            return false;
        }
        a9.i iVar = d0Var.f31598q;
        if (iVar != null) {
            ArrayList arrayList = (ArrayList) iVar.f518b;
            MotionLayout motionLayout = (MotionLayout) iVar.f517a;
            int currentState = motionLayout.getCurrentState();
            if (currentState == -1) {
                z11 = false;
            } else {
                if (((HashSet) iVar.f519c) == null) {
                    iVar.f519c = new HashSet();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        h0 h0Var = (h0) obj;
                        int childCount = motionLayout.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = motionLayout.getChildAt(i13);
                            if (h0Var.c(childAt)) {
                                childAt.getId();
                                ((HashSet) iVar.f519c).add(childAt);
                            }
                        }
                    }
                }
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) iVar.f520d;
                int i14 = 2;
                int i15 = 1;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    ArrayList arrayList3 = (ArrayList) iVar.f520d;
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj2 = arrayList3.get(i16);
                        i16++;
                        h4.g0 g0Var = (h4.g0) obj2;
                        Rect rect2 = g0Var.f31670l;
                        if (action != i15) {
                            if (action == i14) {
                                g0Var.f31661c.f31748b.getHitRect(rect2);
                                if (!rect2.contains((int) x11, (int) y10) && !g0Var.f31666h) {
                                    g0Var.b();
                                }
                            }
                        } else if (!g0Var.f31666h) {
                            g0Var.b();
                        }
                        i14 = 2;
                        i15 = 1;
                    }
                }
                z11 = false;
                if (action == 0 || action == 1) {
                    d0 d0Var2 = motionLayout.S;
                    p pVarB = d0Var2 == null ? null : d0Var2.b(currentState);
                    int size3 = arrayList.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj3 = arrayList.get(i17);
                        i17++;
                        h0 h0Var2 = (h0) obj3;
                        int i18 = h0Var2.f31674b;
                        if (i18 == 1) {
                            if (action == 0) {
                                for (View view : (HashSet) iVar.f519c) {
                                    if (h0Var2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x11, (int) y10)) {
                                            h0Var2.a(iVar, (MotionLayout) iVar.f517a, currentState, pVarB, view);
                                        }
                                    }
                                }
                            }
                        } else if (i18 == 2) {
                            if (action == 1) {
                                while (r18.hasNext()) {
                                    if (h0Var2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x11, (int) y10)) {
                                            h0Var2.a(iVar, (MotionLayout) iVar.f517a, currentState, pVarB, view);
                                        }
                                    }
                                }
                            }
                        } else if (i18 == 3 && action == 0) {
                            while (r18.hasNext()) {
                                if (h0Var2.c(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x11, (int) y10)) {
                                        h0Var2.a(iVar, (MotionLayout) iVar.f517a, currentState, pVarB, view);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z11 = false;
        }
        c0 c0Var = this.S.f31585c;
        if (c0Var == null || c0Var.f31578o || (f0Var = c0Var.f31576l) == null) {
            return z11;
        }
        if ((motionEvent.getAction() == 0 && (rectFB = f0Var.b(this, new RectF())) != null && !rectFB.contains(motionEvent.getX(), motionEvent.getY())) || (i11 = f0Var.f31620e) == -1) {
            return z11;
        }
        View view2 = this.e1;
        if (view2 == null || view2.getId() != i11) {
            this.e1 = findViewById(i11);
        }
        View view3 = this.e1;
        if (view3 == null) {
            return z11;
        }
        float left = view3.getLeft();
        float top = this.e1.getTop();
        float right = this.e1.getRight();
        float bottom = this.e1.getBottom();
        RectF rectF = this.f1276d1;
        rectF.set(left, top, right, bottom);
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || y((float) this.e1.getLeft(), (float) this.e1.getTop(), this.e1, motionEvent)) ? z11 : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) throws Throwable {
        MotionLayout motionLayout;
        this.V0 = true;
        try {
            if (this.S == null) {
                super.onLayout(z11, i11, i12, i13, i14);
                this.V0 = false;
                return;
            }
            motionLayout = this;
            int i15 = i13 - i11;
            int i16 = i14 - i12;
            try {
                if (motionLayout.f1295v0 != i15 || motionLayout.f1296w0 != i16) {
                    C();
                    t(true);
                }
                motionLayout.f1295v0 = i15;
                motionLayout.f1296w0 = i16;
                motionLayout.V0 = false;
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            motionLayout = this;
        }
        Throwable th4 = th;
        motionLayout.V0 = false;
        throw th4;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        boolean z11;
        if (this.S == null) {
            super.onMeasure(i11, i12);
            return;
        }
        boolean z12 = true;
        boolean z13 = (this.f1273c0 == i11 && this.f1275d0 == i12) ? false : true;
        if (this.f1274c1) {
            this.f1274c1 = false;
            A();
            B();
            z13 = true;
        }
        if (this.H) {
            z13 = true;
        }
        this.f1273c0 = i11;
        this.f1275d0 = i12;
        int iH = this.S.h();
        c0 c0Var = this.S.f31585c;
        int i13 = c0Var == null ? -1 : c0Var.f31567c;
        v vVar = this.f1272b1;
        if ((!z13 && iH == vVar.f31795e && i13 == vVar.f31796f) || this.W == -1) {
            if (z13) {
                super.onMeasure(i11, i12);
            }
            z11 = true;
        } else {
            super.onMeasure(i11, i12);
            vVar.e(this.S.b(iH), this.S.b(i13));
            vVar.f();
            vVar.f31795e = iH;
            vVar.f31796f = i13;
            z11 = false;
        }
        if (this.M0 || z11) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            d4.h hVar = this.f1363c;
            int iR = hVar.r() + paddingRight;
            int iL = hVar.l() + paddingBottom;
            int i14 = this.R0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.N0;
                iR = (int) ((this.T0 * (this.P0 - i15)) + i15);
                requestLayout();
            }
            int i16 = this.S0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                int i17 = this.O0;
                iL = (int) ((this.T0 * (this.Q0 - i17)) + i17);
                requestLayout();
            }
            setMeasuredDimension(iR, iL);
        }
        float fSignum = Math.signum(this.f1285l0 - this.f1283j0);
        long nanoTime = getNanoTime();
        r rVar = this.T;
        float interpolation = this.f1283j0 + (!(rVar instanceof b) ? (((nanoTime - this.f1284k0) * fSignum) * 1.0E-9f) / this.f1281h0 : 0.0f);
        if (this.f1286m0) {
            interpolation = this.f1285l0;
        }
        if ((fSignum <= CropImageView.DEFAULT_ASPECT_RATIO || interpolation < this.f1285l0) && (fSignum > CropImageView.DEFAULT_ASPECT_RATIO || interpolation > this.f1285l0)) {
            z12 = false;
        } else {
            interpolation = this.f1285l0;
        }
        if (rVar != null && !z12) {
            interpolation = this.f1291r0 ? rVar.getInterpolation((nanoTime - this.f1279g0) * 1.0E-9f) : rVar.getInterpolation(interpolation);
        }
        if ((fSignum > CropImageView.DEFAULT_ASPECT_RATIO && interpolation >= this.f1285l0) || (fSignum <= CropImageView.DEFAULT_ASPECT_RATIO && interpolation <= this.f1285l0)) {
            interpolation = this.f1285l0;
        }
        this.T0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.U;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f5 = interpolation;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            q qVar = (q) this.f1278f0.get(childAt);
            if (qVar != null) {
                qVar.f(f5, nanoTime2, childAt, this.U0);
            }
        }
        if (this.M0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f11, boolean z11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        f0 f0Var;
        d0 d0Var = this.S;
        if (d0Var != null) {
            boolean zL = l();
            d0Var.f31597p = zL;
            c0 c0Var = d0Var.f31585c;
            if (c0Var == null || (f0Var = c0Var.f31576l) == null) {
                return;
            }
            f0Var.c(zL);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: androidx.constraintlayout.motion.widget.MotionLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: androidx.constraintlayout.motion.widget.MotionLayout
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v64 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v64 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v65 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v65 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v68 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v68 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v71 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v71 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v62 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 1998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.G0 == null) {
                this.G0 = new CopyOnWriteArrayList();
            }
            this.G0.add(motionHelper);
            if (motionHelper.L) {
                if (this.D0 == null) {
                    this.D0 = new ArrayList();
                }
                this.D0.add(motionHelper);
            }
            if (motionHelper.M) {
                if (this.E0 == null) {
                    this.E0 = new ArrayList();
                }
                this.E0.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.F0 == null) {
                    this.F0 = new ArrayList();
                }
                this.F0.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.E0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void r(float f5) {
        d0 d0Var = this.S;
        if (d0Var == null) {
            return;
        }
        float f11 = this.f1283j0;
        float f12 = this.f1282i0;
        if (f11 != f12 && this.f1286m0) {
            this.f1283j0 = f12;
        }
        float f13 = this.f1283j0;
        if (f13 == f5) {
            return;
        }
        this.f1291r0 = false;
        this.f1285l0 = f5;
        this.f1281h0 = d0Var.c() / 1000.0f;
        setProgress(this.f1285l0);
        this.T = null;
        this.U = this.S.e();
        this.f1286m0 = false;
        this.f1279g0 = getNanoTime();
        this.f1287n0 = true;
        this.f1282i0 = f13;
        this.f1283j0 = f13;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        d0 d0Var;
        c0 c0Var;
        if (!this.M0 && this.f1269a0 == -1 && (d0Var = this.S) != null && (c0Var = d0Var.f31585c) != null) {
            int i11 = c0Var.f31580q;
            if (i11 == 0) {
                return;
            }
            if (i11 == 2) {
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    ((q) this.f1278f0.get(getChildAt(i12))).f31750d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            q qVar = (q) this.f1278f0.get(getChildAt(i11));
            if (qVar != null && "button".equals(g0.t(qVar.f31748b)) && qVar.A != null) {
                int i12 = 0;
                while (true) {
                    n[] nVarArr = qVar.A;
                    if (i12 < nVarArr.length) {
                        nVarArr[i12].h(qVar.f31748b, z11 ? -100.0f : 100.0f);
                        i12++;
                    }
                }
            }
        }
    }

    public void setDebugMode(int i11) {
        this.f1289p0 = i11;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z11) {
        this.Z0 = z11;
    }

    public void setInteractionEnabled(boolean z11) {
        this.f1277e0 = z11;
    }

    public void setInterpolatedProgress(float f5) {
        if (this.S != null) {
            setState(z.MOVING);
            Interpolator interpolatorE = this.S.e();
            if (interpolatorE != null) {
                setProgress(interpolatorE.getInterpolation(f5));
                return;
            }
        }
        setProgress(f5);
    }

    public void setOnHide(float f5) {
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((MotionHelper) this.E0.get(i11)).setProgress(f5);
            }
        }
    }

    public void setOnShow(float f5) {
        ArrayList arrayList = this.D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((MotionHelper) this.D0.get(i11)).setProgress(f5);
            }
        }
    }

    public void setProgress(float f5) {
        if (f5 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            int i11 = (f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.W0 == null) {
                this.W0 = new x(this);
            }
            this.W0.f31800a = f5;
            return;
        }
        if (f5 <= CropImageView.DEFAULT_ASPECT_RATIO) {
            if (this.f1283j0 == 1.0f && this.f1269a0 == this.f1271b0) {
                setState(z.MOVING);
            }
            this.f1269a0 = this.W;
            if (this.f1283j0 == CropImageView.DEFAULT_ASPECT_RATIO) {
                setState(z.FINISHED);
            }
        } else if (f5 >= 1.0f) {
            if (this.f1283j0 == CropImageView.DEFAULT_ASPECT_RATIO && this.f1269a0 == this.W) {
                setState(z.MOVING);
            }
            this.f1269a0 = this.f1271b0;
            if (this.f1283j0 == 1.0f) {
                setState(z.FINISHED);
            }
        } else {
            this.f1269a0 = -1;
            setState(z.MOVING);
        }
        if (this.S == null) {
            return;
        }
        this.f1286m0 = true;
        this.f1285l0 = f5;
        this.f1282i0 = f5;
        this.f1284k0 = -1L;
        this.f1279g0 = -1L;
        this.T = null;
        this.f1287n0 = true;
        invalidate();
    }

    public void setScene(d0 d0Var) {
        f0 f0Var;
        this.S = d0Var;
        boolean zL = l();
        d0Var.f31597p = zL;
        c0 c0Var = d0Var.f31585c;
        if (c0Var != null && (f0Var = c0Var.f31576l) != null) {
            f0Var.c(zL);
        }
        C();
    }

    public void setStartState(int i11) {
        if (isAttachedToWindow()) {
            this.f1269a0 = i11;
            return;
        }
        if (this.W0 == null) {
            this.W0 = new x(this);
        }
        x xVar = this.W0;
        xVar.f31802c = i11;
        xVar.f31803d = i11;
    }

    public void setState(z zVar) {
        z zVar2 = z.FINISHED;
        if (zVar == zVar2 && this.f1269a0 == -1) {
            return;
        }
        z zVar3 = this.f1270a1;
        this.f1270a1 = zVar;
        z zVar4 = z.MOVING;
        if (zVar3 == zVar4 && zVar == zVar4) {
            u();
        }
        int iOrdinal = zVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && zVar == zVar2) {
                v();
                return;
            }
            return;
        }
        if (zVar == zVar4) {
            u();
        }
        if (zVar == zVar2) {
            v();
        }
    }

    public void setTransition(int i11) {
        float f5;
        if (this.S != null) {
            c0 c0VarX = x(i11);
            this.W = c0VarX.f31568d;
            this.f1271b0 = c0VarX.f31567c;
            if (!isAttachedToWindow()) {
                if (this.W0 == null) {
                    this.W0 = new x(this);
                }
                x xVar = this.W0;
                xVar.f31802c = this.W;
                xVar.f31803d = this.f1271b0;
                return;
            }
            int i12 = this.f1269a0;
            if (i12 == this.W) {
                f5 = 0.0f;
            } else {
                f5 = i12 == this.f1271b0 ? 1.0f : Float.NaN;
            }
            d0 d0Var = this.S;
            d0Var.f31585c = c0VarX;
            f0 f0Var = c0VarX.f31576l;
            if (f0Var != null) {
                f0Var.c(d0Var.f31597p);
            }
            this.f1272b1.e(this.S.b(this.W), this.S.b(this.f1271b0));
            C();
            if (this.f1283j0 != f5) {
                if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    s(true);
                    this.S.b(this.W).b(this);
                } else if (f5 == 1.0f) {
                    s(false);
                    this.S.b(this.f1271b0).b(this);
                }
            }
            this.f1283j0 = Float.isNaN(f5) ? 0.0f : f5;
            if (!Float.isNaN(f5)) {
                setProgress(f5);
            } else {
                g0.r();
                r(CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
    }

    public void setTransitionDuration(int i11) {
        d0 d0Var = this.S;
        if (d0Var == null) {
            return;
        }
        c0 c0Var = d0Var.f31585c;
        if (c0Var != null) {
            c0Var.f31572h = Math.max(i11, 8);
        } else {
            d0Var.f31592j = i11;
        }
    }

    public void setTransitionListener(y yVar) {
        this.f1288o0 = yVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.W0 == null) {
            this.W0 = new x(this);
        }
        x xVar = this.W0;
        xVar.getClass();
        xVar.f31800a = bundle.getFloat("motion.progress");
        xVar.f31801b = bundle.getFloat("motion.velocity");
        xVar.f31802c = bundle.getInt("motion.StartState");
        xVar.f31803d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.W0.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00db A[PHI: r3
      0x00db: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    public final void t(boolean z11) {
        boolean z12;
        char c11;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i11;
        int i12;
        int i13;
        int i14;
        View childAt;
        q qVar;
        boolean z13;
        if (this.f1284k0 == -1) {
            this.f1284k0 = getNanoTime();
        }
        float f5 = this.f1283j0;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO && f5 < 1.0f) {
            this.f1269a0 = -1;
        }
        boolean z14 = false;
        if (this.C0 || (this.f1287n0 && (z11 || this.f1285l0 != f5))) {
            float fSignum = Math.signum(this.f1285l0 - f5);
            long nanoTime2 = getNanoTime();
            r rVar = this.T;
            float f11 = rVar == null ? (((nanoTime2 - this.f1284k0) * fSignum) * 1.0E-9f) / this.f1281h0 : 0.0f;
            float f12 = this.f1283j0 + f11;
            if (this.f1286m0) {
                f12 = this.f1285l0;
            }
            if ((fSignum <= CropImageView.DEFAULT_ASPECT_RATIO || f12 < this.f1285l0) && (fSignum > CropImageView.DEFAULT_ASPECT_RATIO || f12 > this.f1285l0)) {
                z12 = false;
            } else {
                f12 = this.f1285l0;
                this.f1287n0 = false;
                z12 = true;
            }
            this.f1283j0 = f12;
            this.f1282i0 = f12;
            this.f1284k0 = nanoTime2;
            if (rVar == null || z12) {
                this.V = f11;
            } else {
                if (this.f1291r0) {
                    float interpolation2 = rVar.getInterpolation((nanoTime2 - this.f1279g0) * 1.0E-9f);
                    r rVar2 = this.T;
                    b bVar = this.f1292s0;
                    c11 = rVar2 == bVar ? bVar.f28741c.a() ? (char) 2 : (char) 1 : (char) 0;
                    this.f1283j0 = interpolation2;
                    this.f1284k0 = nanoTime2;
                    r rVar3 = this.T;
                    if (rVar3 != null) {
                        float fA = rVar3.a();
                        this.V = fA;
                        if (Math.abs(fA) * this.f1281h0 <= 1.0E-5f && c11 == 2) {
                            this.f1287n0 = false;
                        }
                        if (fA > CropImageView.DEFAULT_ASPECT_RATIO && interpolation2 >= 1.0f) {
                            this.f1283j0 = 1.0f;
                            this.f1287n0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fA >= CropImageView.DEFAULT_ASPECT_RATIO || interpolation2 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            f12 = interpolation2;
                        } else {
                            this.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
                            this.f1287n0 = false;
                            f12 = 0.0f;
                        }
                    } else {
                        f12 = interpolation2;
                    }
                } else {
                    float interpolation3 = rVar.getInterpolation(f12);
                    r rVar4 = this.T;
                    if (rVar4 != null) {
                        this.V = rVar4.a();
                    } else {
                        this.V = ((rVar4.getInterpolation(f12 + f11) - interpolation3) * fSignum) / f11;
                    }
                    f12 = interpolation3;
                }
                if (Math.abs(this.V) > 1.0E-5f) {
                    setState(z.MOVING);
                }
                if (c11 != 1) {
                    if ((fSignum <= CropImageView.DEFAULT_ASPECT_RATIO && f12 >= this.f1285l0) || (fSignum <= CropImageView.DEFAULT_ASPECT_RATIO && f12 <= this.f1285l0)) {
                        f12 = this.f1285l0;
                        this.f1287n0 = false;
                    }
                    if (f12 < 1.0f || f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.f1287n0 = false;
                        setState(z.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.C0 = false;
                nanoTime = getNanoTime();
                this.T0 = f12;
                interpolator = this.U;
                if (interpolator == null) {
                    interpolation = f12;
                } else {
                    interpolation = interpolator.getInterpolation(f12);
                }
                interpolator2 = this.U;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f1281h0) + f12);
                    this.V = interpolation4;
                    this.V = interpolation4 - this.U.getInterpolation(f12);
                }
                for (i11 = 0; i11 < childCount; i11++) {
                    childAt = getChildAt(i11);
                    qVar = (q) this.f1278f0.get(childAt);
                    if (qVar != null) {
                        this.C0 = qVar.f(interpolation, nanoTime, childAt, this.U0) | this.C0;
                    }
                }
                boolean z15 = (fSignum <= CropImageView.DEFAULT_ASPECT_RATIO && f12 >= this.f1285l0) || (fSignum <= CropImageView.DEFAULT_ASPECT_RATIO && f12 <= this.f1285l0);
                if (!this.C0 && !this.f1287n0 && z15) {
                    setState(z.FINISHED);
                }
                if (this.M0) {
                    requestLayout();
                }
                this.C0 = (!z15) | this.C0;
                if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO && (i14 = this.W) != -1 && this.f1269a0 != i14) {
                    this.f1269a0 = i14;
                    this.S.b(i14).a(this);
                    setState(z.FINISHED);
                    z14 = true;
                }
                if (f12 >= 1.0d) {
                    i12 = this.f1269a0;
                    i13 = this.f1271b0;
                    if (i12 != i13) {
                        this.f1269a0 = i13;
                        this.S.b(i13).a(this);
                        setState(z.FINISHED);
                        z14 = true;
                    }
                }
                if (!this.C0 || this.f1287n0) {
                    invalidate();
                } else if ((fSignum > CropImageView.DEFAULT_ASPECT_RATIO && f12 == 1.0f) || (fSignum < CropImageView.DEFAULT_ASPECT_RATIO && f12 == CropImageView.DEFAULT_ASPECT_RATIO)) {
                    setState(z.FINISHED);
                }
                if (!this.C0 && !this.f1287n0 && ((fSignum > CropImageView.DEFAULT_ASPECT_RATIO && f12 == 1.0f) || (fSignum < CropImageView.DEFAULT_ASPECT_RATIO && f12 == CropImageView.DEFAULT_ASPECT_RATIO))) {
                    A();
                }
            }
            c11 = 0;
            if (Math.abs(this.V) > 1.0E-5f) {
                setState(z.MOVING);
            }
            if (c11 != 1) {
                if (fSignum <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f12 = this.f1285l0;
                    this.f1287n0 = false;
                } else {
                    f12 = this.f1285l0;
                    this.f1287n0 = false;
                }
                if (f12 < 1.0f) {
                    this.f1287n0 = false;
                    setState(z.FINISHED);
                } else {
                    this.f1287n0 = false;
                    setState(z.FINISHED);
                }
            }
            childCount = getChildCount();
            this.C0 = false;
            nanoTime = getNanoTime();
            this.T0 = f12;
            interpolator = this.U;
            if (interpolator == null) {
                interpolation = f12;
            } else {
                interpolation = interpolator.getInterpolation(f12);
            }
            interpolator2 = this.U;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f1281h0) + f12);
                this.V = interpolation5;
                this.V = interpolation5 - this.U.getInterpolation(f12);
            }
            while (i11 < childCount) {
                childAt = getChildAt(i11);
                qVar = (q) this.f1278f0.get(childAt);
                if (qVar != null) {
                    this.C0 = qVar.f(interpolation, nanoTime, childAt, this.U0) | this.C0;
                }
            }
            if (fSignum <= CropImageView.DEFAULT_ASPECT_RATIO) {
            }
            if (!this.C0) {
                setState(z.FINISHED);
            }
            if (this.M0) {
                requestLayout();
            }
            this.C0 = (!z15) | this.C0;
            if (f12 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f1269a0 = i14;
                this.S.b(i14).a(this);
                setState(z.FINISHED);
                z14 = true;
            }
            if (f12 >= 1.0d) {
                i12 = this.f1269a0;
                i13 = this.f1271b0;
                if (i12 != i13) {
                    this.f1269a0 = i13;
                    this.S.b(i13).a(this);
                    setState(z.FINISHED);
                    z14 = true;
                }
            }
            if (this.C0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.C0) {
                A();
            }
        }
        float f13 = this.f1283j0;
        if (f13 < 1.0f) {
            if (f13 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                int i15 = this.f1269a0;
                int i16 = this.W;
                z13 = i15 == i16 ? z14 : true;
                this.f1269a0 = i16;
            }
            this.f1274c1 |= z14;
            if (z14 && !this.V0) {
                requestLayout();
            }
            this.f1282i0 = this.f1283j0;
        }
        int i17 = this.f1269a0;
        int i18 = this.f1271b0;
        z13 = i17 == i18 ? z14 : true;
        this.f1269a0 = i18;
        z14 = z13;
        this.f1274c1 |= z14;
        if (z14) {
            requestLayout();
        }
        this.f1282i0 = this.f1283j0;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return g0.s(context, this.W) + "->" + g0.s(context, this.f1271b0) + " (pos:" + this.f1283j0 + " Dpos/Dt:" + this.V;
    }

    public final void u() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        if ((this.f1288o0 == null && ((copyOnWriteArrayList2 = this.G0) == null || copyOnWriteArrayList2.isEmpty())) || this.L0 == this.f1282i0) {
            return;
        }
        if (this.K0 != -1 && (copyOnWriteArrayList = this.G0) != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((y) it.next()).getClass();
            }
        }
        this.K0 = -1;
        this.L0 = this.f1282i0;
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.G0;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((y) it2.next()).getClass();
            }
        }
    }

    public final void v() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f1288o0 != null || ((copyOnWriteArrayList = this.G0) != null && !copyOnWriteArrayList.isEmpty())) && this.K0 == -1) {
            this.K0 = this.f1269a0;
            ArrayList arrayList = this.f1280g1;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) nv.p.f(1, arrayList)).intValue() : -1;
            int i11 = this.f1269a0;
            if (iIntValue != i11 && i11 != -1) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        B();
        c cVar = this.X0;
        if (cVar != null) {
            cVar.run();
            this.X0 = null;
        }
    }

    public final void w(int i11, float f5, float f11, float f12, float[] fArr) {
        View viewE = e(i11);
        q qVar = (q) this.f1278f0.get(viewE);
        if (qVar != null) {
            qVar.d(f5, f11, f12, fArr);
            viewE.getY();
        } else {
            if (viewE == null) {
                return;
            }
            viewE.getContext().getResources().getResourceName(i11);
        }
    }

    public final c0 x(int i11) {
        ArrayList arrayList = this.S.f31586d;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            c0 c0Var = (c0) obj;
            if (c0Var.f31565a == i11) {
                return c0Var;
            }
        }
        return null;
    }

    public final boolean y(float f5, float f11, View view, MotionEvent motionEvent) {
        boolean z11;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z11 = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z11 = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (y((childAt.getLeft() + f5) - view.getScrollX(), (childAt.getTop() + f11) - view.getScrollY(), childAt, motionEvent)) {
                z11 = true;
                break;
            }
            childCount--;
        }
        if (!z11) {
            float right = (view.getRight() + f5) - view.getLeft();
            float bottom = (view.getBottom() + f11) - view.getTop();
            RectF rectF = this.f1276d1;
            rectF.set(f5, f11, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f5;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f12, f13);
                    if (this.f1 == null) {
                        this.f1 = new Matrix();
                    }
                    matrix.invert(this.f1);
                    motionEventObtain.transform(this.f1);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z11;
    }

    public final void z(AttributeSet attributeSet) {
        d0 d0Var;
        d0 d0Var2;
        f1268h1 = isInEditMode();
        int i11 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j4.t.f36046v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z11 = true;
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 2) {
                    this.S = new d0(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f1269a0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f1285l0 = typedArrayObtainStyledAttributes.getFloat(index, CropImageView.DEFAULT_ASPECT_RATIO);
                    this.f1287n0 = true;
                } else if (index == 0) {
                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                } else if (index == 5) {
                    if (this.f1289p0 == 0) {
                        this.f1289p0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f1289p0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (!z11) {
                this.S = null;
            }
        }
        if (this.f1289p0 != 0 && (d0Var2 = this.S) != null) {
            int iH = d0Var2.h();
            d0 d0Var3 = this.S;
            p pVarB = d0Var3.b(d0Var3.h());
            g0.s(getContext(), iH);
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (pVarB.i(childAt.getId()) == null) {
                    g0.t(childAt);
                }
            }
            Integer[] numArr = (Integer[]) pVarB.f36016g.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                iArr[i14] = numArr[i14].intValue();
            }
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                g0.s(getContext(), i16);
                findViewById(iArr[i15]);
                int i17 = pVarB.h(i16).f35929e.f35940d;
                int i18 = pVarB.h(i16).f35929e.f35938c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            ArrayList arrayList = this.S.f31586d;
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                c0 c0Var = (c0) obj;
                c0 c0Var2 = this.S.f31585c;
                int i19 = c0Var.f31568d;
                int i21 = c0Var.f31567c;
                g0.s(getContext(), i19);
                g0.s(getContext(), i21);
                sparseIntArray.get(i19);
                sparseIntArray2.get(i21);
                sparseIntArray.put(i19, i21);
                sparseIntArray2.put(i21, i19);
                this.S.b(i19);
                this.S.b(i21);
            }
        }
        if (this.f1269a0 != -1 || (d0Var = this.S) == null) {
            return;
        }
        this.f1269a0 = d0Var.h();
        this.W = this.S.h();
        c0 c0Var3 = this.S.f31585c;
        this.f1271b0 = c0Var3 != null ? c0Var3.f31567c : -1;
    }

    public void setTransition(c0 c0Var) {
        f0 f0Var;
        d0 d0Var = this.S;
        d0Var.f31585c = c0Var;
        if (c0Var != null && (f0Var = c0Var.f31576l) != null) {
            f0Var.c(d0Var.f31597p);
        }
        setState(z.SETUP);
        int i11 = this.f1269a0;
        c0 c0Var2 = this.S.f31585c;
        if (i11 == (c0Var2 == null ? -1 : c0Var2.f31567c)) {
            this.f1283j0 = 1.0f;
            this.f1282i0 = 1.0f;
            this.f1285l0 = 1.0f;
        } else {
            this.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f1282i0 = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f1285l0 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        this.f1284k0 = (c0Var.f31581r & 1) != 0 ? -1L : getNanoTime();
        int iH = this.S.h();
        d0 d0Var2 = this.S;
        c0 c0Var3 = d0Var2.f31585c;
        int i12 = c0Var3 != null ? c0Var3.f31567c : -1;
        if (iH == this.W && i12 == this.f1271b0) {
            return;
        }
        this.W = iH;
        this.f1271b0 = i12;
        d0Var2.n(iH, i12);
        p pVarB = this.S.b(this.W);
        p pVarB2 = this.S.b(this.f1271b0);
        v vVar = this.f1272b1;
        vVar.e(pVarB, pVarB2);
        int i13 = this.W;
        int i14 = this.f1271b0;
        vVar.f31795e = i13;
        vVar.f31796f = i14;
        vVar.f();
        C();
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = null;
        this.V = CropImageView.DEFAULT_ASPECT_RATIO;
        this.W = -1;
        this.f1269a0 = -1;
        this.f1271b0 = -1;
        this.f1273c0 = 0;
        this.f1275d0 = 0;
        this.f1277e0 = true;
        this.f1278f0 = new HashMap();
        this.f1279g0 = 0L;
        this.f1281h0 = 1.0f;
        this.f1282i0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1285l0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1287n0 = false;
        this.f1289p0 = 0;
        this.f1291r0 = false;
        this.f1292s0 = new b();
        this.f1293t0 = new h4.t(this);
        this.f1297x0 = false;
        this.C0 = false;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = 0;
        this.I0 = -1L;
        this.J0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.K0 = 0;
        this.L0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.M0 = false;
        this.U0 = new e(1);
        this.V0 = false;
        this.X0 = null;
        new HashMap();
        this.Y0 = new Rect();
        this.Z0 = false;
        this.f1270a1 = z.UNDEFINED;
        this.f1272b1 = new v(this);
        this.f1274c1 = false;
        this.f1276d1 = new RectF();
        this.e1 = null;
        this.f1 = null;
        this.f1280g1 = new ArrayList();
        z(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.U = null;
        this.V = CropImageView.DEFAULT_ASPECT_RATIO;
        this.W = -1;
        this.f1269a0 = -1;
        this.f1271b0 = -1;
        this.f1273c0 = 0;
        this.f1275d0 = 0;
        this.f1277e0 = true;
        this.f1278f0 = new HashMap();
        this.f1279g0 = 0L;
        this.f1281h0 = 1.0f;
        this.f1282i0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1283j0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1285l0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1287n0 = false;
        this.f1289p0 = 0;
        this.f1291r0 = false;
        this.f1292s0 = new b();
        this.f1293t0 = new h4.t(this);
        this.f1297x0 = false;
        this.C0 = false;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.G0 = null;
        this.H0 = 0;
        this.I0 = -1L;
        this.J0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.K0 = 0;
        this.L0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.M0 = false;
        this.U0 = new e(1);
        this.V0 = false;
        this.X0 = null;
        new HashMap();
        this.Y0 = new Rect();
        this.Z0 = false;
        this.f1270a1 = z.UNDEFINED;
        this.f1272b1 = new v(this);
        this.f1274c1 = false;
        this.f1276d1 = new RectF();
        this.e1 = null;
        this.f1 = null;
        this.f1280g1 = new ArrayList();
        z(attributeSet);
    }

    @Override // z4.s
    public final void d(View view, int i11, int i12, int i13, int i14, int i15) {
    }
}
