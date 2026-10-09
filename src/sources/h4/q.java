package h4;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.utils.widget.MotionLabel;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public n[] A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f31748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31749c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public v10.c[] f31756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c4.b f31757k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f31760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double[] f31761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public double[] f31762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f31763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f31764s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public HashMap f31769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f31770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public HashMap f31771z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f31747a = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31750d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31751e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f31752f = new a0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f31753g = new a0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f31754h = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f31755i = new o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31758l = Float.NaN;
    public float m = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31759n = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f31765t = new float[4];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f31766u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f31767v = new float[1];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f31768w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public q(View view) {
        this.f31748b = view;
        this.f31749c = view.getId();
        view.getLayoutParams();
    }

    public static void h(Rect rect, Rect rect2, int i11, int i12, int i13) {
        if (i11 == 1) {
            int i14 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i13 - ((rect.height() + i14) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 == 2) {
            int i15 = rect.left + rect.right;
            rect2.left = i12 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i15 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 == 3) {
            int i16 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i16 / 2);
            rect2.top = i13 - ((rect.height() + i16) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i11 != 4) {
            return;
        }
        int i17 = rect.left + rect.right;
        rect2.left = i12 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i17 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(c cVar) {
        this.f31768w.add(cVar);
    }

    public final float b(float f5, float[] fArr) {
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f31759n;
            if (f12 != 1.0d) {
                float f13 = this.m;
                if (f5 < f13) {
                    f5 = 0.0f;
                }
                if (f5 > f13 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f13) * f12, 1.0f);
                }
            }
        }
        c4.e eVar = this.f31752f.f31551a;
        ArrayList arrayList = this.f31766u;
        int size = arrayList.size();
        float f14 = Float.NaN;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            a0 a0Var = (a0) obj;
            c4.e eVar2 = a0Var.f31551a;
            if (eVar2 != null) {
                float f15 = a0Var.f31553c;
                if (f15 < f5) {
                    eVar = eVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = a0Var.f31553c;
                }
            }
        }
        if (eVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d5 = (f5 - f11) / f16;
            f5 = (((float) eVar.a(d5)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) eVar.b(d5);
            }
        }
        return f5;
    }

    public final void c(double d5, float[] fArr, float[] fArr2) {
        float f5;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f31756j[0].q(d5, dArr);
        this.f31756j[0].u(d5, dArr2);
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        Arrays.fill(fArr2, CropImageView.DEFAULT_ASPECT_RATIO);
        int[] iArr = this.f31760o;
        a0 a0Var = this.f31752f;
        float f12 = a0Var.f31555e;
        float f13 = a0Var.f31556f;
        float f14 = a0Var.f31557t;
        float f15 = a0Var.H;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f19 = (float) dArr[i11];
            float f21 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f19;
                f11 = f21;
            } else if (i12 == 2) {
                f13 = f19;
                f18 = f21;
            } else if (i12 == 3) {
                f14 = f19;
                f16 = f21;
            } else if (i12 == 4) {
                f15 = f19;
                f17 = f21;
            }
        }
        float fCos = (f16 / 2.0f) + f11;
        float fSin = (f17 / 2.0f) + f18;
        q qVar = a0Var.O;
        if (qVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            qVar.c(d5, fArr3, fArr4);
            float f22 = fArr3[0];
            float f23 = fArr3[1];
            float f24 = fArr4[0];
            float f25 = fArr4[1];
            double d11 = f12;
            double d12 = f13;
            float fSin2 = (float) (((Math.sin(d12) * d11) + ((double) f22)) - ((double) (f14 / 2.0f)));
            float fCos2 = (float) ((((double) f23) - (Math.cos(d12) * d11)) - ((double) (f15 / 2.0f)));
            double d13 = f11;
            double d14 = f18;
            f5 = 2.0f;
            f13 = fCos2;
            fCos = (float) ((Math.cos(d12) * d14) + (Math.sin(d12) * d13) + ((double) f24));
            fSin = (float) ((Math.sin(d12) * d14) + (((double) f25) - (Math.cos(d12) * d13)));
            f12 = fSin2;
        } else {
            f5 = 2.0f;
        }
        fArr[0] = (f14 / f5) + f12 + CropImageView.DEFAULT_ASPECT_RATIO;
        fArr[1] = (f15 / f5) + f13 + CropImageView.DEFAULT_ASPECT_RATIO;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    public final void d(float f5, float f11, float f12, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f31767v;
        float fB = b(f5, fArr2);
        v10.c[] cVarArr = this.f31756j;
        a0 a0Var = this.f31752f;
        int i11 = 0;
        if (cVarArr == null) {
            a0 a0Var2 = this.f31753g;
            float f13 = a0Var2.f31555e - a0Var.f31555e;
            float f14 = a0Var2.f31556f - a0Var.f31556f;
            float f15 = a0Var2.f31557t - a0Var.f31557t;
            float f16 = (a0Var2.H - a0Var.H) + f14;
            fArr[0] = ((f15 + f13) * f11) + ((1.0f - f11) * f13);
            fArr[1] = (f16 * f12) + ((1.0f - f12) * f14);
            return;
        }
        double d5 = fB;
        cVarArr[0].u(d5, this.f31762q);
        this.f31756j[0].q(d5, this.f31761p);
        float f17 = fArr2[0];
        while (true) {
            dArr = this.f31762q;
            if (i11 >= dArr.length) {
                break;
            }
            dArr[i11] = dArr[i11] * ((double) f17);
            i11++;
        }
        c4.b bVar = this.f31757k;
        if (bVar == null) {
            int[] iArr = this.f31760o;
            double[] dArr2 = this.f31761p;
            a0Var.getClass();
            a0.f(f11, f12, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f31761p;
        if (dArr3.length > 0) {
            bVar.q(d5, dArr3);
            this.f31757k.u(d5, this.f31762q);
            int[] iArr2 = this.f31760o;
            double[] dArr4 = this.f31762q;
            double[] dArr5 = this.f31761p;
            a0Var.getClass();
            a0.f(f11, f12, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float e() {
        float[] fArr = new float[2];
        float f5 = 1.0f / 99;
        double d5 = 0.0d;
        double d11 = 0.0d;
        int i11 = 0;
        float fHypot = CropImageView.DEFAULT_ASPECT_RATIO;
        while (i11 < 100) {
            float f11 = i11 * f5;
            double dA = f11;
            c4.e eVar = this.f31752f.f31551a;
            ArrayList arrayList = this.f31766u;
            int size = arrayList.size();
            float f12 = Float.NaN;
            int i12 = 0;
            float f13 = CropImageView.DEFAULT_ASPECT_RATIO;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                a0 a0Var = (a0) obj;
                float f14 = f5;
                c4.e eVar2 = a0Var.f31551a;
                if (eVar2 != null) {
                    float f15 = a0Var.f31553c;
                    if (f15 < f11) {
                        f13 = f15;
                        eVar = eVar2;
                    } else if (Float.isNaN(f12)) {
                        f12 = a0Var.f31553c;
                    }
                }
                f5 = f14;
            }
            float f16 = f5;
            if (eVar != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                float f17 = f12 - f13;
                dA = (((float) eVar.a((f11 - f13) / f17)) * f17) + f13;
            }
            double d12 = dA;
            this.f31756j[0].q(d12, this.f31761p);
            int i13 = i11;
            this.f31752f.c(d12, this.f31760o, this.f31761p, fArr, 0);
            if (i13 > 0) {
                fHypot += (float) Math.hypot(d11 - ((double) fArr[1]), d5 - ((double) fArr[0]));
            }
            d5 = fArr[0];
            d11 = fArr[1];
            i11 = i13 + 1;
            f5 = f16;
        }
        return fHypot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(float f5, long j11, View view, c4.e eVar) {
        boolean zD;
        boolean z11;
        float f11;
        boolean z12;
        double d5;
        float f12;
        float f13;
        float f14;
        float fSin;
        float f15;
        g4.o oVar = null;
        float fB = b(f5, null);
        int i11 = this.E;
        if (i11 != -1) {
            float f16 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fB / f16)) * f16;
            float f17 = (fB % f16) / f16;
            if (!Float.isNaN(this.F)) {
                f17 = (f17 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fB = ((interpolator != null ? interpolator.getInterpolation(f17) : ((double) f17) > 0.5d ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO) * f16) + fFloor;
        }
        HashMap map = this.f31770y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((g4.l) it.next()).c(view, fB);
            }
        }
        HashMap map2 = this.f31769x;
        if (map2 != null) {
            g4.o oVar2 = null;
            zD = false;
            for (g4.q qVar : map2.values()) {
                if (qVar instanceof g4.o) {
                    oVar2 = (g4.o) qVar;
                } else {
                    zD |= qVar.d(fB, j11, view, eVar);
                }
            }
            oVar = oVar2;
        } else {
            zD = false;
        }
        v10.c[] cVarArr = this.f31756j;
        a0 a0Var = this.f31752f;
        if (cVarArr != null) {
            double d11 = fB;
            cVarArr[0].q(d11, this.f31761p);
            this.f31756j[0].u(d11, this.f31762q);
            c4.b bVar = this.f31757k;
            if (bVar != null) {
                double[] dArr = this.f31761p;
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (dArr.length > 0) {
                    bVar.q(d11, dArr);
                    this.f31757k.u(d11, this.f31762q);
                }
            } else {
                f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            }
            if (this.H) {
                z12 = zD;
                d5 = d11;
                f12 = 2.0f;
            } else {
                int[] iArr = this.f31760o;
                double[] dArr2 = this.f31761p;
                f12 = 2.0f;
                double[] dArr3 = this.f31762q;
                boolean z13 = this.f31750d;
                float f18 = a0Var.f31555e;
                float fCos = a0Var.f31556f;
                float f19 = a0Var.f31557t;
                int i12 = 1;
                float f21 = a0Var.H;
                if (iArr.length != 0) {
                    f13 = f19;
                    if (a0Var.R.length <= iArr[iArr.length - 1]) {
                        int i13 = iArr[iArr.length - 1] + 1;
                        a0Var.R = new double[i13];
                        a0Var.S = new double[i13];
                    }
                } else {
                    f13 = f19;
                }
                Arrays.fill(a0Var.R, Double.NaN);
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    double[] dArr4 = a0Var.R;
                    int i15 = iArr[i14];
                    dArr4[i15] = dArr2[i14];
                    a0Var.S[i15] = dArr3[i14];
                }
                float f22 = Float.NaN;
                float f23 = f11;
                float f24 = f23;
                float f25 = f24;
                float f26 = f25;
                int i16 = 0;
                while (true) {
                    double[] dArr5 = a0Var.R;
                    f14 = f21;
                    if (i16 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i16])) {
                        f15 = f18;
                    } else {
                        f15 = f18;
                        float f27 = (float) (Double.isNaN(a0Var.R[i16]) ? 0.0d : a0Var.R[i16] + 0.0d);
                        float f28 = (float) a0Var.S[i16];
                        if (i16 == i12) {
                            f24 = f28;
                            f21 = f14;
                            f18 = f27;
                        } else if (i16 == 2) {
                            f23 = f28;
                            f18 = f15;
                            f21 = f14;
                            fCos = f27;
                        } else if (i16 == 3) {
                            f25 = f28;
                            f18 = f15;
                            f21 = f14;
                            f13 = f27;
                        } else if (i16 == 4) {
                            f26 = f28;
                            f18 = f15;
                            f21 = f27;
                        } else if (i16 == 5) {
                            f18 = f15;
                            f21 = f14;
                            f22 = f27;
                        }
                        i16++;
                        i12 = 1;
                    }
                    f18 = f15;
                    f21 = f14;
                    i16++;
                    i12 = 1;
                }
                float f29 = f18;
                q qVar2 = a0Var.O;
                if (qVar2 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    qVar2.c(d11, fArr, fArr2);
                    float f30 = fArr[0];
                    float f31 = fArr[1];
                    float f32 = fArr2[0];
                    float f33 = fArr2[1];
                    z12 = zD;
                    d5 = d11;
                    double d12 = f29;
                    double d13 = fCos;
                    fSin = (float) (((Math.sin(d13) * d12) + ((double) f30)) - ((double) (f13 / 2.0f)));
                    fCos = (float) ((((double) f31) - (Math.cos(d13) * d12)) - ((double) (f14 / 2.0f)));
                    double d14 = f24;
                    double d15 = f23;
                    float fCos2 = (float) ((Math.cos(d13) * d12 * d15) + (Math.sin(d13) * d14) + ((double) f32));
                    float fSin2 = (float) ((Math.sin(d13) * d12 * d15) + (((double) f33) - (Math.cos(d13) * d14)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f22)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f22)));
                    }
                } else {
                    fSin = f29;
                    z12 = zD;
                    d5 = d11;
                    if (!Float.isNaN(f22)) {
                        view.setRotation(f22 + ((float) Math.toDegrees(Math.atan2((f26 / 2.0f) + f23, (f25 / 2.0f) + f24))) + f11);
                    }
                }
                float f34 = fSin;
                if (view instanceof b) {
                    ((MotionLabel) ((b) view)).c(f34, fCos, f34 + f13, fCos + f14);
                } else {
                    float f35 = f34 + 0.5f;
                    int i17 = (int) f35;
                    float f36 = fCos + 0.5f;
                    int i18 = (int) f36;
                    int i19 = (int) (f35 + f13);
                    int i21 = (int) (f36 + f14);
                    int i22 = i19 - i17;
                    int i23 = i21 - i18;
                    if (i22 != view.getMeasuredWidth() || i23 != view.getMeasuredHeight() || z13) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i22, 1073741824), View.MeasureSpec.makeMeasureSpec(i23, 1073741824));
                    }
                    view.layout(i17, i18, i19, i21);
                }
                this.f31750d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view.getParent()).findViewById(this.C);
                }
                View view2 = this.D;
                if (view2 != null) {
                    float bottom = (this.D.getBottom() + view2.getTop()) / f12;
                    float right = (this.D.getRight() + this.D.getLeft()) / f12;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap map3 = this.f31770y;
            if (map3 != null) {
                for (g4.l lVar : map3.values()) {
                    if (lVar instanceof g4.j) {
                        double[] dArr6 = this.f31762q;
                        if (dArr6.length > 1) {
                            view.setRotation(((g4.j) lVar).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (oVar != 0) {
                double[] dArr7 = this.f31762q;
                double d16 = dArr7[0];
                double d17 = dArr7[1];
                g4.o oVar3 = oVar;
                view.setRotation(oVar3.b(fB, j11, view, eVar) + ((float) Math.toDegrees(Math.atan2(d17, d16))));
                z11 = z12 | oVar3.f28773h;
            } else {
                z11 = z12;
            }
            int i24 = 1;
            while (true) {
                v10.c[] cVarArr2 = this.f31756j;
                if (i24 >= cVarArr2.length) {
                    break;
                }
                v10.c cVar = cVarArr2[i24];
                float[] fArr3 = this.f31765t;
                cVar.r(d5, fArr3);
                ve.i.G((j4.b) a0Var.P.get(this.f31763r[i24 - 1]), view, fArr3);
                i24++;
            }
            o oVar4 = this.f31754h;
            if (oVar4.f31739b == 0) {
                if (fB <= f11) {
                    view.setVisibility(oVar4.f31740c);
                } else {
                    o oVar5 = this.f31755i;
                    if (fB >= 1065353216) {
                        view.setVisibility(oVar5.f31740c);
                    } else if (oVar5.f31740c != oVar4.f31740c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i25 = 0;
                while (true) {
                    n[] nVarArr = this.A;
                    if (i25 >= nVarArr.length) {
                        break;
                    }
                    nVarArr[i25].h(view, fB);
                    i25++;
                }
            }
        } else {
            boolean z14 = zD;
            float f37 = a0Var.f31555e;
            a0 a0Var2 = this.f31753g;
            float fA = p0.a(a0Var2.f31555e, f37, fB, f37);
            float f38 = a0Var.f31556f;
            float fA2 = p0.a(a0Var2.f31556f, f38, fB, f38);
            float f39 = a0Var.f31557t;
            float f40 = a0Var2.f31557t;
            float fA3 = p0.a(f40, f39, fB, f39);
            float f41 = a0Var.H;
            float f42 = a0Var2.H;
            float f43 = fA + 0.5f;
            int i26 = (int) f43;
            float f44 = fA2 + 0.5f;
            int i27 = (int) f44;
            int i28 = (int) (f43 + fA3);
            int iA = (int) (f44 + p0.a(f42, f41, fB, f41));
            int i29 = i28 - i26;
            int i30 = iA - i27;
            if (f40 != f39 || f42 != f41 || this.f31750d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i29, 1073741824), View.MeasureSpec.makeMeasureSpec(i30, 1073741824));
                this.f31750d = false;
            }
            view.layout(i26, i27, i28, iA);
            z11 = z14;
        }
        HashMap map4 = this.f31771z;
        if (map4 != null) {
            for (g4.g gVar : map4.values()) {
                if (gVar instanceof g4.e) {
                    double[] dArr8 = this.f31762q;
                    view.setRotation(((g4.e) gVar).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    gVar.e(view, fB);
                }
            }
        }
        return z11;
    }

    public final void g(a0 a0Var) {
        a0Var.e((int) this.f31748b.getX(), (int) this.f31748b.getY(), this.f31748b.getWidth(), this.f31748b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:201:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:278:0x0859 A[PHI: r1 r3 r11 r12
      0x0859: PHI (r1v81 java.lang.String) = (r1v78 java.lang.String), (r1v79 java.lang.String), (r1v80 java.lang.String), (r1v83 java.lang.String) binds: [B:277:0x0857, B:273:0x082c, B:268:0x07fc, B:264:0x07e7] A[DONT_GENERATE, DONT_INLINE]
      0x0859: PHI (r3v54 java.lang.String) = (r3v51 java.lang.String), (r3v52 java.lang.String), (r3v53 java.lang.String), (r3v56 java.lang.String) binds: [B:277:0x0857, B:273:0x082c, B:268:0x07fc, B:264:0x07e7] A[DONT_GENERATE, DONT_INLINE]
      0x0859: PHI (r11v40 java.lang.String) = (r11v37 java.lang.String), (r11v38 java.lang.String), (r11v39 java.lang.String), (r11v42 java.lang.String) binds: [B:277:0x0857, B:273:0x082c, B:268:0x07fc, B:264:0x07e7] A[DONT_GENERATE, DONT_INLINE]
      0x0859: PHI (r12v47 java.lang.String) = (r12v44 java.lang.String), (r12v45 java.lang.String), (r12v46 java.lang.String), (r12v49 java.lang.String) binds: [B:277:0x0857, B:273:0x082c, B:268:0x07fc, B:264:0x07e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:381:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:450:0x0d6d  */
    /* JADX WARN: Code duplicated, block: B:595:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:432:0x0cd4. Please report as an issue. */
    public final void i(long j11, int i11, int i12) {
        String str;
        ArrayList arrayList;
        HashSet hashSet;
        HashSet<String> hashSet2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        HashSet hashSet3;
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        a0 a0Var;
        Object obj3;
        a0 a0Var2;
        String str8;
        int i13;
        String str9;
        int i14;
        j4.b bVar;
        String str10;
        HashSet hashSet4;
        HashMap map;
        Iterator it;
        String str11;
        Object obj4;
        Object obj5;
        Object obj6;
        byte b3;
        byte b11;
        g4.q mVar;
        g4.n nVar;
        g4.q qVar;
        j4.b bVar2;
        Integer num;
        HashSet hashSet5;
        HashSet hashSet6;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Iterator it2;
        String str17;
        HashSet hashSet7;
        Object obj7;
        a0 a0Var3;
        Object obj8;
        a0 a0Var4;
        Object obj9;
        ArrayList arrayList3;
        Object obj10;
        byte b12;
        byte b13;
        Object obj11;
        g4.l hVar;
        j4.b bVar3;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int i15;
        float fMin;
        float fA;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap map2 = new HashMap();
        int i16 = this.B;
        a0 a0Var5 = this.f31752f;
        if (i16 != -1) {
            a0Var5.L = i16;
        }
        o oVar = this.f31754h;
        float f5 = oVar.f31742e;
        o oVar2 = this.f31755i;
        boolean zB = o.b(f5, oVar2.f31742e);
        String str23 = ualZoVVCQs.amaMaCqkBO;
        if (zB) {
            hashSet9.add(str23);
        }
        String str24 = "elevation";
        if (o.b(oVar.f31743f, oVar2.f31743f)) {
            hashSet9.add("elevation");
        }
        int i17 = oVar.f31740c;
        int i18 = oVar2.f31740c;
        if (i17 != i18 && oVar.f31739b == 0 && (i17 == 0 || i18 == 0)) {
            hashSet9.add(str23);
        }
        String str25 = "rotation";
        if (o.b(oVar.f31744t, oVar2.f31744t)) {
            hashSet9.add("rotation");
        }
        String str26 = "transitionPathRotate";
        if (!Float.isNaN(oVar.R) || !Float.isNaN(oVar2.R)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(oVar.S) || !Float.isNaN(oVar2.S)) {
            hashSet9.add("progress");
        }
        if (o.b(oVar.H, oVar2.H)) {
            hashSet9.add("rotationX");
        }
        if (o.b(oVar.f31738a, oVar2.f31738a)) {
            hashSet9.add("rotationY");
        }
        Object obj12 = "rotationX";
        if (o.b(oVar.M, oVar2.M)) {
            hashSet9.add("transformPivotX");
        }
        if (o.b(oVar.N, oVar2.N)) {
            hashSet9.add("transformPivotY");
        }
        String str27 = "scaleX";
        if (o.b(oVar.K, oVar2.K)) {
            hashSet9.add("scaleX");
        }
        Object obj13 = "rotationY";
        String str28 = "scaleY";
        if (o.b(oVar.L, oVar2.L)) {
            hashSet9.add("scaleY");
        }
        Object obj14 = "progress";
        if (o.b(oVar.O, oVar2.O)) {
            hashSet9.add("translationX");
        }
        Object obj15 = "translationX";
        if (o.b(oVar.P, oVar2.P)) {
            hashSet9.add("translationY");
        }
        if (o.b(oVar.Q, oVar2.Q)) {
            hashSet9.add("translationZ");
        }
        a0 a0Var6 = this.f31753g;
        ArrayList arrayList4 = this.f31766u;
        ArrayList arrayList5 = this.f31768w;
        Object obj16 = "translationY";
        if (arrayList5 != null) {
            int size = arrayList5.size();
            int i19 = 0;
            ArrayList arrayList6 = null;
            while (i19 < size) {
                Object obj17 = arrayList5.get(i19);
                int i21 = i19 + 1;
                int i22 = size;
                c cVar = (c) obj17;
                if (cVar instanceof j) {
                    j jVar = (j) cVar;
                    a0 a0Var7 = new a0();
                    str18 = str28;
                    a0Var7.f31552b = 0;
                    a0Var7.K = Float.NaN;
                    a0Var7.L = -1;
                    a0Var7.M = -1;
                    a0Var7.N = Float.NaN;
                    a0Var7.O = null;
                    a0Var7.P = new LinkedHashMap();
                    a0Var7.Q = 0;
                    str21 = str25;
                    a0Var7.R = new double[18];
                    a0Var7.S = new double[18];
                    if (a0Var5.M != -1) {
                        float f11 = jVar.f31561a / 100.0f;
                        a0Var7.f31553c = f11;
                        a0Var7.f31552b = jVar.f31697h;
                        a0Var7.Q = jVar.m;
                        float f12 = Float.isNaN(jVar.f31698i) ? f11 : jVar.f31698i;
                        str20 = str24;
                        float f13 = Float.isNaN(jVar.f31699j) ? f11 : jVar.f31699j;
                        str22 = str26;
                        float f14 = a0Var6.f31557t;
                        float f15 = a0Var5.f31557t;
                        float f16 = f14 - f15;
                        float f17 = a0Var6.H;
                        float f18 = a0Var5.H;
                        a0Var7.f31554d = a0Var7.f31553c;
                        a0Var7.f31557t = (int) ((f16 * f12) + f15);
                        a0Var7.H = (int) (((f17 - f18) * f13) + f18);
                        str19 = str23;
                        if (jVar.m != 2) {
                            float f19 = Float.isNaN(jVar.f31700k) ? f11 : jVar.f31700k;
                            float f21 = a0Var6.f31555e;
                            float f22 = a0Var5.f31555e;
                            a0Var7.f31555e = p0.a(f21, f22, f19, f22);
                            if (!Float.isNaN(jVar.f31701l)) {
                                f11 = jVar.f31701l;
                            }
                            float f23 = a0Var6.f31556f;
                            float f24 = a0Var5.f31556f;
                            a0Var7.f31556f = p0.a(f23, f24, f11, f24);
                        } else {
                            if (Float.isNaN(jVar.f31700k)) {
                                float f25 = a0Var6.f31555e;
                                float f26 = a0Var5.f31555e;
                                fMin = p0.a(f25, f26, f11, f26);
                            } else {
                                fMin = jVar.f31700k * Math.min(f13, f12);
                            }
                            a0Var7.f31555e = fMin;
                            if (Float.isNaN(jVar.f31701l)) {
                                float f27 = a0Var6.f31556f;
                                float f28 = a0Var5.f31556f;
                                fA = p0.a(f27, f28, f11, f28);
                            } else {
                                fA = jVar.f31701l;
                            }
                            a0Var7.f31556f = fA;
                        }
                        a0Var7.M = a0Var5.M;
                        a0Var7.f31551a = c4.e.d(jVar.f31695f);
                        a0Var7.L = jVar.f31696g;
                    } else {
                        str19 = str23;
                        str20 = str24;
                        str22 = str26;
                        int i23 = jVar.m;
                        if (i23 == 1) {
                            float f29 = jVar.f31561a / 100.0f;
                            a0Var7.f31553c = f29;
                            a0Var7.f31552b = jVar.f31697h;
                            float f30 = Float.isNaN(jVar.f31698i) ? f29 : jVar.f31698i;
                            float f31 = Float.isNaN(jVar.f31699j) ? f29 : jVar.f31699j;
                            float f32 = a0Var6.f31557t - a0Var5.f31557t;
                            float f33 = f29;
                            float f34 = a0Var6.H - a0Var5.H;
                            a0Var7.f31554d = a0Var7.f31553c;
                            if (!Float.isNaN(jVar.f31700k)) {
                                f33 = jVar.f31700k;
                            }
                            float f35 = a0Var5.f31555e;
                            float f36 = a0Var5.f31557t;
                            float f37 = (f36 / 2.0f) + f35;
                            float f38 = a0Var5.f31556f;
                            float f39 = a0Var5.H;
                            float f40 = ((a0Var6.f31557t / 2.0f) + a0Var6.f31555e) - f37;
                            float f41 = ((a0Var6.H / 2.0f) + a0Var6.f31556f) - ((f39 / 2.0f) + f38);
                            float f42 = f40 * f33;
                            float f43 = f32 * f30;
                            float f44 = f43 / 2.0f;
                            a0Var7.f31555e = (int) ((f35 + f42) - f44);
                            float f45 = f33 * f41;
                            float f46 = f34 * f31;
                            float f47 = f46 / 2.0f;
                            a0Var7.f31556f = (int) ((f38 + f45) - f47);
                            a0Var7.f31557t = (int) (f36 + f43);
                            a0Var7.H = (int) (f39 + f46);
                            float f48 = Float.isNaN(jVar.f31701l) ? CropImageView.DEFAULT_ASPECT_RATIO : jVar.f31701l;
                            float f49 = (-f41) * f48;
                            float f50 = f40 * f48;
                            a0Var7.Q = 1;
                            float f51 = (int) ((a0Var5.f31555e + f42) - f44);
                            float f52 = (int) ((a0Var5.f31556f + f45) - f47);
                            a0Var7.f31555e = f51 + f49;
                            a0Var7.f31556f = f52 + f50;
                            a0Var7.M = a0Var7.M;
                            a0Var7.f31551a = c4.e.d(jVar.f31695f);
                            a0Var7.L = jVar.f31696g;
                        } else if (i23 == 2) {
                            float f53 = jVar.f31561a / 100.0f;
                            a0Var7.f31553c = f53;
                            a0Var7.f31552b = jVar.f31697h;
                            float f54 = Float.isNaN(jVar.f31698i) ? f53 : jVar.f31698i;
                            float f55 = Float.isNaN(jVar.f31699j) ? f53 : jVar.f31699j;
                            float f56 = a0Var6.f31557t;
                            float f57 = a0Var5.f31557t;
                            float f58 = f56 - f57;
                            float f59 = a0Var6.H;
                            float f60 = a0Var5.H;
                            float f61 = f59 - f60;
                            a0Var7.f31554d = a0Var7.f31553c;
                            float f62 = a0Var5.f31555e;
                            float f63 = (f57 / 2.0f) + f62;
                            float f64 = a0Var5.f31556f;
                            float f65 = (f56 / 2.0f) + a0Var6.f31555e;
                            float f66 = ((f59 / 2.0f) + a0Var6.f31556f) - ((f60 / 2.0f) + f64);
                            float f67 = f58 * f54;
                            a0Var7.f31555e = (int) ((((f65 - f63) * f53) + f62) - (f67 / 2.0f));
                            float f68 = f61 * f55;
                            a0Var7.f31556f = (int) (((f66 * f53) + f64) - (f68 / 2.0f));
                            a0Var7.f31557t = (int) (f57 + f67);
                            a0Var7.H = (int) (f60 + f68);
                            a0Var7.Q = 2;
                            if (!Float.isNaN(jVar.f31700k)) {
                                a0Var7.f31555e = (int) (jVar.f31700k * (i11 - ((int) a0Var7.f31557t)));
                            }
                            if (!Float.isNaN(jVar.f31701l)) {
                                a0Var7.f31556f = (int) (jVar.f31701l * (i12 - ((int) a0Var7.H)));
                            }
                            a0Var7.M = a0Var7.M;
                            a0Var7.f31551a = c4.e.d(jVar.f31695f);
                            a0Var7.L = jVar.f31696g;
                        } else if (i23 != 3) {
                            float f69 = jVar.f31561a / 100.0f;
                            a0Var7.f31553c = f69;
                            a0Var7.f31552b = jVar.f31697h;
                            float f70 = Float.isNaN(jVar.f31698i) ? f69 : jVar.f31698i;
                            float f71 = Float.isNaN(jVar.f31699j) ? f69 : jVar.f31699j;
                            float f72 = a0Var6.f31557t;
                            float f73 = a0Var5.f31557t;
                            float f74 = f72 - f73;
                            float f75 = a0Var6.H;
                            float f76 = a0Var5.H;
                            float f77 = f75 - f76;
                            a0Var7.f31554d = a0Var7.f31553c;
                            float f78 = a0Var5.f31555e;
                            float f79 = (f73 / 2.0f) + f78;
                            float f80 = a0Var5.f31556f;
                            float f81 = ((f72 / 2.0f) + a0Var6.f31555e) - f79;
                            float f82 = ((f75 / 2.0f) + a0Var6.f31556f) - ((f76 / 2.0f) + f80);
                            float f83 = f74 * f70;
                            float f84 = f83 / 2.0f;
                            a0Var7.f31555e = (int) (((f81 * f69) + f78) - f84);
                            float f85 = f77 * f71;
                            float f86 = f85 / 2.0f;
                            a0Var7.f31556f = (int) (((f82 * f69) + f80) - f86);
                            a0Var7.f31557t = (int) (f73 + f83);
                            a0Var7.H = (int) (f76 + f85);
                            float f87 = Float.isNaN(jVar.f31700k) ? f69 : jVar.f31700k;
                            float f88 = Float.isNaN(Float.NaN) ? CropImageView.DEFAULT_ASPECT_RATIO : Float.NaN;
                            float f89 = f87;
                            float f90 = Float.isNaN(jVar.f31701l) ? f69 : jVar.f31701l;
                            float f91 = Float.isNaN(Float.NaN) ? CropImageView.DEFAULT_ASPECT_RATIO : Float.NaN;
                            float f92 = f90;
                            a0Var7.Q = 0;
                            a0Var7.f31555e = (int) (((f91 * f82) + ((f89 * f81) + a0Var5.f31555e)) - f84);
                            a0Var7.f31556f = (int) (((f82 * f92) + ((f81 * f88) + a0Var5.f31556f)) - f86);
                            a0Var7.f31551a = c4.e.d(jVar.f31695f);
                            a0Var7.L = jVar.f31696g;
                        } else {
                            float f93 = jVar.f31561a / 100.0f;
                            a0Var7.f31553c = f93;
                            a0Var7.f31552b = jVar.f31697h;
                            float f94 = Float.isNaN(jVar.f31698i) ? f93 : jVar.f31698i;
                            float f95 = Float.isNaN(jVar.f31699j) ? f93 : jVar.f31699j;
                            float f96 = a0Var6.f31557t;
                            float f97 = a0Var5.f31557t;
                            float f98 = f96 - f97;
                            float f99 = a0Var6.H;
                            float f100 = a0Var5.H;
                            float f101 = f99 - f100;
                            a0Var7.f31554d = a0Var7.f31553c;
                            float f102 = a0Var5.f31555e;
                            float f103 = (f97 / 2.0f) + f102;
                            float f104 = a0Var5.f31556f;
                            float f105 = (f100 / 2.0f) + f104;
                            float f106 = (f96 / 2.0f) + a0Var6.f31555e;
                            float f107 = (f99 / 2.0f) + a0Var6.f31556f;
                            if (f103 > f106) {
                                f103 = f106;
                                f106 = f103;
                            }
                            if (f105 <= f107) {
                                f105 = f107;
                                f107 = f105;
                            }
                            float f108 = f106 - f103;
                            float f109 = f105 - f107;
                            float f110 = f98 * f94;
                            float f111 = f110 / 2.0f;
                            a0Var7.f31555e = (int) (((f108 * f93) + f102) - f111);
                            float f112 = f101 * f95;
                            float f113 = f112 / 2.0f;
                            a0Var7.f31556f = (int) (((f109 * f93) + f104) - f113);
                            a0Var7.f31557t = (int) (f97 + f110);
                            a0Var7.H = (int) (f100 + f112);
                            float f114 = Float.isNaN(jVar.f31700k) ? f93 : jVar.f31700k;
                            float f115 = Float.isNaN(Float.NaN) ? CropImageView.DEFAULT_ASPECT_RATIO : Float.NaN;
                            float f116 = f114;
                            float f117 = Float.isNaN(jVar.f31701l) ? f93 : jVar.f31701l;
                            float f118 = Float.isNaN(Float.NaN) ? CropImageView.DEFAULT_ASPECT_RATIO : Float.NaN;
                            float f119 = f117;
                            a0Var7.Q = 0;
                            a0Var7.f31555e = (int) (((f118 * f109) + ((f116 * f108) + a0Var5.f31555e)) - f111);
                            a0Var7.f31556f = (int) (((f109 * f119) + ((f108 * f115) + a0Var5.f31556f)) - f113);
                            a0Var7.f31551a = c4.e.d(jVar.f31695f);
                            a0Var7.L = jVar.f31696g;
                        }
                        arrayList4.add((-Collections.binarySearch(arrayList4, a0Var7)) - 1, a0Var7);
                        i15 = jVar.f31694e;
                        if (i15 != -1) {
                            this.f31751e = i15;
                        }
                    }
                    arrayList4.add((-Collections.binarySearch(arrayList4, a0Var7)) - 1, a0Var7);
                    i15 = jVar.f31694e;
                    if (i15 != -1) {
                        this.f31751e = i15;
                    }
                } else {
                    str18 = str28;
                    str19 = str23;
                    str20 = str24;
                    str21 = str25;
                    str22 = str26;
                    if (cVar instanceof g) {
                        cVar.d(hashSet10);
                    } else if (cVar instanceof l) {
                        cVar.d(hashSet8);
                    } else if (cVar instanceof n) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add((n) cVar);
                        arrayList6 = arrayList7;
                    } else {
                        cVar.f(map2);
                        cVar.d(hashSet9);
                    }
                }
                i19 = i21;
                size = i22;
                str28 = str18;
                str25 = str21;
                str24 = str20;
                str26 = str22;
                str23 = str19;
            }
            str = str28;
            arrayList = arrayList6;
        } else {
            str = "scaleY";
            arrayList = null;
        }
        String str29 = str23;
        String str30 = str24;
        String str31 = str25;
        String str32 = str26;
        if (arrayList != null) {
            this.A = (n[]) arrayList.toArray(new n[0]);
        }
        String str33 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            hashSet2 = hashSet10;
            str2 = str27;
            str3 = str;
            str4 = str31;
            str5 = str30;
            str6 = str32;
            str7 = str29;
            hashSet3 = hashSet9;
            obj = obj14;
            obj2 = obj15;
            arrayList2 = arrayList4;
            a0Var = a0Var5;
            obj3 = obj16;
            a0Var2 = a0Var6;
        } else {
            this.f31770y = new HashMap();
            Iterator it3 = hashSet9.iterator();
            while (it3.hasNext()) {
                String str34 = (String) it3.next();
                if (!str34.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    hashSet6 = hashSet10;
                    switch (str34.hashCode()) {
                        case -1249320806:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            a0Var4 = a0Var6;
                            obj9 = obj15;
                            arrayList3 = arrayList4;
                            obj10 = obj12;
                            b12 = str34.equals(obj10) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            a0Var4 = a0Var6;
                            obj9 = obj15;
                            arrayList3 = arrayList4;
                            Object obj18 = obj13;
                            if (str34.equals(obj18)) {
                                obj13 = obj18;
                                obj10 = obj12;
                                b12 = 1;
                            } else {
                                obj13 = obj18;
                                obj10 = obj12;
                            }
                            break;
                        case -1225497657:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            a0Var4 = a0Var6;
                            obj9 = obj15;
                            if (str34.equals(obj9)) {
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 2;
                            } else {
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -1225497656:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            if (str34.equals(obj8)) {
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 3;
                            } else {
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -1225497655:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            if (str34.equals("translationZ")) {
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 4;
                            } else {
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -1001078227:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            if (str34.equals(obj7)) {
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 5;
                            } else {
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -908189618:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            if (str34.equals(str17)) {
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 6;
                            } else {
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -908189617:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals(str12)) {
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 7;
                            } else {
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -797520672:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals("waveVariesBy")) {
                                str12 = str;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 8;
                            } else {
                                str12 = str;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -760884510:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals("transformPivotX")) {
                                str12 = str;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 9;
                            } else {
                                str12 = str;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case -760884509:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals("transformPivotY")) {
                                b13 = 10;
                                String str35 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = b13;
                                str12 = str;
                                it2 = it3;
                                str17 = str35;
                            }
                            str12 = str;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            a0Var4 = a0Var6;
                            obj9 = obj15;
                            arrayList3 = arrayList4;
                            obj10 = obj12;
                            break;
                        case -40300674:
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals(str13)) {
                                b13 = 11;
                                String str36 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = b13;
                                str12 = str;
                                it2 = it3;
                                str17 = str36;
                            }
                            str12 = str;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            a0Var4 = a0Var6;
                            obj9 = obj15;
                            arrayList3 = arrayList4;
                            obj10 = obj12;
                            break;
                        case -4379043:
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals(str14)) {
                                str12 = str;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 12;
                                str13 = str31;
                            } else {
                                str12 = str;
                                str13 = str31;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case 37232917:
                            str15 = str32;
                            str16 = str29;
                            if (str34.equals(str15)) {
                                str12 = str;
                                str13 = str31;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 13;
                                str14 = str30;
                            } else {
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case 92909918:
                            str16 = str29;
                            if (str34.equals(str16)) {
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 14;
                                str15 = str32;
                            } else {
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                str15 = str32;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                            }
                            break;
                        case 156108012:
                            if (str34.equals("waveOffset")) {
                                str12 = str;
                                str13 = str31;
                                str14 = str30;
                                str15 = str32;
                                it2 = it3;
                                str17 = str27;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                a0Var3 = a0Var5;
                                obj8 = obj16;
                                a0Var4 = a0Var6;
                                obj9 = obj15;
                                arrayList3 = arrayList4;
                                obj10 = obj12;
                                b12 = 15;
                                str16 = str29;
                                break;
                            }
                        default:
                            str12 = str;
                            str13 = str31;
                            str14 = str30;
                            str15 = str32;
                            str16 = str29;
                            it2 = it3;
                            str17 = str27;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            a0Var3 = a0Var5;
                            obj8 = obj16;
                            a0Var4 = a0Var6;
                            obj9 = obj15;
                            arrayList3 = arrayList4;
                            obj10 = obj12;
                            break;
                    }
                    switch (b12) {
                        case 0:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(5);
                            break;
                        case 1:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(6);
                            break;
                        case 2:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(9);
                            break;
                        case 3:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(10);
                            break;
                        case 4:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(11);
                            break;
                        case 5:
                            obj12 = obj10;
                            obj11 = obj9;
                            g4.k kVar = new g4.k();
                            kVar.f28755f = false;
                            hVar = kVar;
                            break;
                        case 6:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(7);
                            break;
                        case 7:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(8);
                            break;
                        case 8:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(0);
                            break;
                        case 9:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(2);
                            break;
                        case 10:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(3);
                            break;
                        case 11:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(4);
                            break;
                        case 12:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(1);
                            break;
                        case 13:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.j();
                            break;
                        case 14:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(0);
                            break;
                        case 15:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = new g4.h(0);
                            break;
                        default:
                            obj12 = obj10;
                            obj11 = obj9;
                            hVar = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str37 = str34.split(",")[1];
                    int size2 = arrayList5.size();
                    hashSet5 = hashSet8;
                    int i24 = 0;
                    while (i24 < size2) {
                        Object obj19 = arrayList5.get(i24);
                        int i25 = i24 + 1;
                        c cVar2 = (c) obj19;
                        HashSet hashSet11 = hashSet10;
                        HashMap map3 = cVar2.f31564d;
                        if (map3 != null && (bVar3 = (j4.b) map3.get(str37)) != null) {
                            sparseArray.append(cVar2.f31561a, bVar3);
                        }
                        hashSet10 = hashSet11;
                        i24 = i25;
                    }
                    hashSet6 = hashSet10;
                    g4.i iVar = new g4.i();
                    String str38 = str34.split(",")[1];
                    iVar.f28753f = sparseArray;
                    str12 = str;
                    str13 = str31;
                    str14 = str30;
                    str15 = str32;
                    it2 = it3;
                    obj11 = obj15;
                    str17 = str27;
                    hashSet7 = hashSet9;
                    arrayList3 = arrayList4;
                    obj7 = obj14;
                    hVar = iVar;
                    a0Var3 = a0Var5;
                    obj8 = obj16;
                    str16 = str29;
                    a0Var4 = a0Var6;
                }
                if (hVar != null) {
                    hVar.f28760e = str34;
                    this.f31770y.put(str34, hVar);
                }
                str29 = str16;
                str32 = str15;
                str30 = str14;
                arrayList4 = arrayList3;
                a0Var6 = a0Var4;
                obj15 = obj11;
                hashSet8 = hashSet5;
                hashSet10 = hashSet6;
                obj16 = obj8;
                str31 = str13;
                a0Var5 = a0Var3;
                obj14 = obj7;
                hashSet9 = hashSet7;
                str27 = str17;
                it3 = it2;
                str = str12;
            }
            hashSet = hashSet8;
            hashSet2 = hashSet10;
            str2 = str27;
            str3 = str;
            str4 = str31;
            str5 = str30;
            str6 = str32;
            str7 = str29;
            hashSet3 = hashSet9;
            obj = obj14;
            obj2 = obj15;
            arrayList2 = arrayList4;
            a0Var = a0Var5;
            obj3 = obj16;
            a0Var2 = a0Var6;
            if (arrayList5 != null) {
                int size3 = arrayList5.size();
                int i26 = 0;
                while (i26 < size3) {
                    Object obj20 = arrayList5.get(i26);
                    i26++;
                    c cVar3 = (c) obj20;
                    int i27 = size3;
                    if (cVar3 instanceof e) {
                        cVar3.a(this.f31770y);
                    }
                    size3 = i27;
                }
            }
            oVar.a(this.f31770y, 0);
            oVar2.a(this.f31770y, 100);
            Iterator it4 = this.f31770y.keySet().iterator();
            while (it4.hasNext()) {
                String str39 = (String) it4.next();
                int iIntValue = (!map2.containsKey(str39) || (num = (Integer) map2.get(str39)) == null) ? 0 : num.intValue();
                Iterator it5 = it4;
                g4.l lVar = (g4.l) this.f31770y.get(str39);
                if (lVar != null) {
                    lVar.d(iIntValue);
                }
                it4 = it5;
            }
        }
        if (hashSet.isEmpty()) {
            str8 = "CUSTOM,";
        } else {
            if (this.f31769x == null) {
                this.f31769x = new HashMap();
            }
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String str40 = (String) it6.next();
                if (!this.f31769x.containsKey(str40)) {
                    if (str40.startsWith(str33)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str41 = str40.split(",")[1];
                        str11 = str33;
                        int size4 = arrayList5.size();
                        map = map2;
                        int i28 = 0;
                        while (i28 < size4) {
                            Object obj21 = arrayList5.get(i28);
                            int i29 = i28 + 1;
                            c cVar4 = (c) obj21;
                            int i30 = size4;
                            HashMap map4 = cVar4.f31564d;
                            if (map4 != null && (bVar2 = (j4.b) map4.get(str41)) != null) {
                                sparseArray2.append(cVar4.f31561a, bVar2);
                            }
                            size4 = i30;
                            i28 = i29;
                        }
                        g4.n nVar2 = new g4.n();
                        nVar2.m = new SparseArray();
                        nVar2.f28762k = str40.split(",")[1];
                        nVar2.f28763l = sparseArray2;
                        nVar = nVar2;
                        obj4 = obj12;
                        obj5 = obj13;
                        obj6 = obj2;
                    } else {
                        map = map2;
                        it = it6;
                        str11 = str33;
                        switch (str40.hashCode()) {
                            case -1249320806:
                                obj4 = obj12;
                                obj5 = obj13;
                                obj6 = obj2;
                                b3 = str40.equals(obj4) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj5 = obj13;
                                obj6 = obj2;
                                if (str40.equals(obj5)) {
                                    obj4 = obj12;
                                    b3 = 1;
                                } else {
                                    obj4 = obj12;
                                }
                                break;
                            case -1225497657:
                                obj6 = obj2;
                                obj4 = obj12;
                                if (str40.equals(obj6)) {
                                    obj5 = obj13;
                                    b3 = 2;
                                } else {
                                    obj5 = obj13;
                                }
                                break;
                            case -1225497656:
                                if (str40.equals(obj3)) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 3;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case -1225497655:
                                if (str40.equals("translationZ")) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 4;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case -1001078227:
                                if (str40.equals(obj)) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 5;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case -908189618:
                                if (str40.equals(str2)) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 6;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case -908189617:
                                if (str40.equals(str3)) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 7;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case -40300674:
                                if (str40.equals(str4)) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 8;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case -4379043:
                                if (str40.equals(str5)) {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                    b3 = 9;
                                } else {
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                break;
                            case 37232917:
                                if (str40.equals(str6)) {
                                    b11 = 10;
                                    b3 = b11;
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                obj4 = obj12;
                                obj5 = obj13;
                                obj6 = obj2;
                                break;
                            case 92909918:
                                if (str40.equals(str7)) {
                                    b11 = 11;
                                    b3 = b11;
                                    obj4 = obj12;
                                    obj5 = obj13;
                                    obj6 = obj2;
                                }
                                obj4 = obj12;
                                obj5 = obj13;
                                obj6 = obj2;
                                break;
                            default:
                                obj4 = obj12;
                                obj5 = obj13;
                                obj6 = obj2;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                mVar = new g4.m(3);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 1:
                                mVar = new g4.m(4);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 2:
                                mVar = new g4.m(7);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 3:
                                mVar = new g4.m(8);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 4:
                                mVar = new g4.m(9);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 5:
                                g4.p pVar = new g4.p();
                                pVar.f28765k = false;
                                mVar = pVar;
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 6:
                                mVar = new g4.m(5);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 7:
                                mVar = new g4.m(6);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 8:
                                mVar = new g4.m(2);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 9:
                                mVar = new g4.m(1);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 10:
                                mVar = new g4.o();
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            case 11:
                                mVar = new g4.m(0);
                                obj = obj;
                                mVar.f28774i = j11;
                                qVar = mVar;
                                break;
                            default:
                                nVar = null;
                                break;
                        }
                        if (qVar != null) {
                            qVar.f28771f = str40;
                            this.f31769x.put(str40, qVar);
                        }
                        obj2 = obj6;
                        obj13 = obj5;
                        obj = obj;
                        str33 = str11;
                        it6 = it;
                        map2 = map;
                        str7 = str7;
                        obj12 = obj4;
                    }
                    qVar = nVar;
                    if (qVar != null) {
                        qVar.f28771f = str40;
                        this.f31769x.put(str40, qVar);
                    }
                    obj2 = obj6;
                    obj13 = obj5;
                    obj = obj;
                    str33 = str11;
                    it6 = it;
                    map2 = map;
                    str7 = str7;
                    obj12 = obj4;
                }
            }
            HashMap map5 = map2;
            str8 = str33;
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i31 = 0;
                while (i31 < size5) {
                    Object obj22 = arrayList5.get(i31);
                    i31++;
                    c cVar5 = (c) obj22;
                    if (cVar5 instanceof l) {
                        ((l) cVar5).h(this.f31769x);
                    }
                }
            }
            for (String str42 : this.f31769x.keySet()) {
                HashMap map6 = map5;
                ((g4.q) this.f31769x.get(str42)).e(map6.containsKey(str42) ? ((Integer) map6.get(str42)).intValue() : 0);
                map5 = map6;
            }
        }
        int size6 = arrayList2.size();
        int i32 = size6 + 2;
        a0[] a0VarArr = new a0[i32];
        a0VarArr[0] = a0Var;
        a0VarArr[size6 + 1] = a0Var2;
        if (arrayList2.size() > 0 && this.f31751e == -1) {
            this.f31751e = 0;
        }
        int size7 = arrayList2.size();
        int i33 = 0;
        int i34 = 1;
        while (i33 < size7) {
            Object obj23 = arrayList2.get(i33);
            i33++;
            a0VarArr[i34] = (a0) obj23;
            i34++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str43 : a0Var2.P.keySet()) {
            a0 a0Var8 = a0Var;
            if (a0Var8.P.containsKey(str43)) {
                str10 = str8;
                hashSet4 = hashSet3;
                if (!hashSet4.contains(str10 + str43)) {
                    hashSet12.add(str43);
                }
            } else {
                str10 = str8;
                hashSet4 = hashSet3;
            }
            a0Var = a0Var8;
            str8 = str10;
            hashSet3 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.f31763r = strArr;
        this.f31764s = new int[strArr.length];
        int i35 = 0;
        while (true) {
            String[] strArr2 = this.f31763r;
            if (i35 < strArr2.length) {
                String str44 = strArr2[i35];
                this.f31764s[i35] = 0;
                for (int i36 = 0; i36 < i32; i36++) {
                    if (a0VarArr[i36].P.containsKey(str44) && (bVar = (j4.b) a0VarArr[i36].P.get(str44)) != null) {
                        int[] iArr = this.f31764s;
                        iArr[i35] = bVar.c() + iArr[i35];
                        break;
                    }
                }
                i35++;
            } else {
                boolean z11 = a0VarArr[0].L != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i37 = 1; i37 < i32; i37++) {
                    a0 a0Var9 = a0VarArr[i37];
                    a0 a0Var10 = a0VarArr[i37 - 1];
                    boolean zB2 = a0.b(a0Var9.f31555e, a0Var10.f31555e);
                    boolean zB3 = a0.b(a0Var9.f31556f, a0Var10.f31556f);
                    zArr[0] = zArr[0] | a0.b(a0Var9.f31554d, a0Var10.f31554d);
                    boolean z12 = zB2 | zB3 | z11;
                    zArr[1] = zArr[1] | z12;
                    zArr[2] = z12 | zArr[2];
                    zArr[3] = zArr[3] | a0.b(a0Var9.f31557t, a0Var10.f31557t);
                    zArr[4] = a0.b(a0Var9.H, a0Var10.H) | zArr[4];
                }
                int i38 = 0;
                for (int i39 = 1; i39 < length; i39++) {
                    if (zArr[i39]) {
                        i38++;
                    }
                }
                this.f31760o = new int[i38];
                int iMax = Math.max(2, i38);
                this.f31761p = new double[iMax];
                this.f31762q = new double[iMax];
                int i40 = 0;
                for (int i41 = 1; i41 < length; i41++) {
                    if (zArr[i41]) {
                        this.f31760o[i40] = i41;
                        i40++;
                    }
                }
                int[] iArr2 = {i32, this.f31760o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i32];
                int i42 = 0;
                while (i42 < i32) {
                    a0 a0Var11 = a0VarArr[i42];
                    double[] dArr3 = dArr[i42];
                    int[] iArr3 = this.f31760o;
                    a0[] a0VarArr2 = a0VarArr;
                    int i43 = i42;
                    int i44 = 6;
                    float[] fArr = {a0Var11.f31554d, a0Var11.f31555e, a0Var11.f31556f, a0Var11.f31557t, a0Var11.H, a0Var11.K};
                    int i45 = 0;
                    int i46 = 0;
                    while (i45 < iArr3.length) {
                        int i47 = iArr3[i45];
                        if (i47 < i44) {
                            dArr3[i46] = fArr[i47];
                            i46++;
                        }
                        i45++;
                        i44 = 6;
                    }
                    dArr2[i43] = a0VarArr2[i43].f31553c;
                    i42 = i43 + 1;
                    a0VarArr = a0VarArr2;
                }
                a0[] a0VarArr3 = a0VarArr;
                int i48 = 0;
                while (true) {
                    int[] iArr4 = this.f31760o;
                    if (i48 < iArr4.length) {
                        if (iArr4[i48] < 6) {
                            String strK = ep.a.k(new StringBuilder(), a0.T[this.f31760o[i48]], " [");
                            for (int i49 = 0; i49 < i32; i49++) {
                                StringBuilder sbN = ep.a.n(strK);
                                sbN.append(dArr[i49][i48]);
                                strK = sbN.toString();
                            }
                        }
                        i48++;
                    } else {
                        this.f31756j = new v10.c[this.f31763r.length + 1];
                        int i50 = 0;
                        while (true) {
                            String[] strArr3 = this.f31763r;
                            if (i50 >= strArr3.length) {
                                int i51 = 0;
                                this.f31756j[0] = v10.c.j(this.f31751e, dArr2, dArr);
                                if (a0VarArr3[0].L != -1) {
                                    int[] iArr5 = new int[i32];
                                    double[] dArr4 = new double[i32];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i32, 2);
                                    for (int i52 = 0; i52 < i32; i52++) {
                                        a0 a0Var12 = a0VarArr3[i52];
                                        iArr5[i52] = a0Var12.L;
                                        dArr4[i52] = a0Var12.f31553c;
                                        double[] dArr6 = dArr5[i52];
                                        dArr6[0] = a0Var12.f31555e;
                                        dArr6[1] = a0Var12.f31556f;
                                    }
                                    i51 = 0;
                                    this.f31757k = new c4.b(iArr5, dArr4, dArr5);
                                }
                                this.f31771z = new HashMap();
                                if (arrayList5 != null) {
                                    float fE = Float.NaN;
                                    for (String str45 : hashSet2) {
                                        g4.g gVarC = g4.g.c(str45);
                                        if (gVarC != null) {
                                            if (gVarC.f28750e == 1 && Float.isNaN(fE)) {
                                                fE = e();
                                            }
                                            gVarC.f28747b = str45;
                                            this.f31771z.put(str45, gVarC);
                                        }
                                    }
                                    int size8 = arrayList5.size();
                                    int i53 = i51;
                                    while (i53 < size8) {
                                        Object obj24 = arrayList5.get(i53);
                                        i53++;
                                        c cVar6 = (c) obj24;
                                        if (cVar6 instanceof g) {
                                            ((g) cVar6).h(this.f31771z);
                                        }
                                    }
                                    Iterator it7 = this.f31771z.values().iterator();
                                    while (it7.hasNext()) {
                                        ((g4.g) it7.next()).f();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str46 = strArr3[i50];
                            int i54 = 0;
                            int i55 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i54 < i32) {
                                if (a0VarArr3[i54].P.containsKey(str46)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i32];
                                        j4.b bVar4 = (j4.b) a0VarArr3[i54].P.get(str46);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i32, bVar4 == null ? 0 : bVar4.c());
                                    }
                                    a0 a0Var13 = a0VarArr3[i54];
                                    dArr7[i55] = a0Var13.f31553c;
                                    double[] dArr9 = dArr8[i55];
                                    j4.b bVar5 = (j4.b) a0Var13.P.get(str46);
                                    if (bVar5 != null) {
                                        if (bVar5.c() == 1) {
                                            dArr9[0] = bVar5.a();
                                        } else {
                                            int iC = bVar5.c();
                                            float[] fArr2 = new float[iC];
                                            bVar5.b(fArr2);
                                            int i56 = 0;
                                            int i57 = 0;
                                            while (i56 < iC) {
                                                dArr9[i57] = fArr2[i56];
                                                i56++;
                                                str46 = str46;
                                                i57++;
                                                i50 = i50;
                                                i54 = i54;
                                            }
                                        }
                                    }
                                    i13 = i50;
                                    str9 = str46;
                                    i14 = i54;
                                    i55++;
                                } else {
                                    i13 = i50;
                                    str9 = str46;
                                    i14 = i54;
                                }
                                i54 = i14 + 1;
                                str46 = str9;
                                i50 = i13;
                            }
                            int i58 = i50;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i55);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i55);
                            int i59 = i58 + 1;
                            this.f31756j[i59] = v10.c.j(this.f31751e, dArrCopyOf, dArr10);
                            i50 = i59;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        a0 a0Var = this.f31752f;
        sb2.append(a0Var.f31555e);
        sb2.append(" y: ");
        sb2.append(a0Var.f31556f);
        sb2.append(" end: x: ");
        a0 a0Var2 = this.f31753g;
        sb2.append(a0Var2.f31555e);
        sb2.append(" y: ");
        sb2.append(a0Var2.f31556f);
        return sb2.toString();
    }
}
