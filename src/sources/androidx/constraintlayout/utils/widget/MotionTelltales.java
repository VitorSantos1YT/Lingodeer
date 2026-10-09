package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import c4.b;
import c4.o;
import com.yalantis.ucrop.view.CropImageView;
import g4.g;
import g4.l;
import h4.a0;
import h4.q;
import h4.r;
import j4.t;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {
    public final Paint N;
    public MotionLayout O;
    public final float[] P;
    public final Matrix Q;
    public int R;
    public int S;
    public float T;

    public MotionTelltales(Context context) {
        super(context);
        this.N = new Paint();
        this.P = new float[2];
        this.Q = new Matrix();
        this.R = 0;
        this.S = -65281;
        this.T = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36048x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.S = typedArrayObtainStyledAttributes.getColor(index, this.S);
                } else if (index == 2) {
                    this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                } else if (index == 1) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i12 = this.S;
        Paint paint = this.N;
        paint.setColor(i12);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i11;
        Matrix matrix;
        int i12;
        float f5;
        float[] fArr;
        int i13;
        int i14;
        int i15;
        char c11;
        g gVar;
        double[] dArr;
        o oVar;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        Matrix matrix2 = motionTelltales.getMatrix();
        Matrix matrix3 = motionTelltales.Q;
        matrix2.invert(matrix3);
        if (motionTelltales.O == null) {
            ViewParent parent = motionTelltales.getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.O = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = motionTelltales.getWidth();
        int height = motionTelltales.getHeight();
        int i16 = 5;
        float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i17 = 0;
        while (i17 < i16) {
            float f11 = fArr2[i17];
            int i18 = 0;
            while (i18 < i16) {
                float f12 = fArr2[i18];
                MotionLayout motionLayout = motionTelltales.O;
                int i19 = motionTelltales.R;
                float fA = motionLayout.V;
                float f13 = motionLayout.f1283j0;
                if (motionLayout.T != null) {
                    float fSignum = Math.signum(motionLayout.f1285l0 - f13);
                    float interpolation = motionLayout.T.getInterpolation(motionLayout.f1283j0 + 1.0E-5f);
                    float interpolation2 = motionLayout.T.getInterpolation(motionLayout.f1283j0);
                    fA = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / motionLayout.f1281h0;
                    f13 = interpolation2;
                }
                r rVar = motionLayout.T;
                if (rVar != null) {
                    fA = rVar.a();
                }
                float f14 = fA;
                q qVar = (q) motionLayout.f1278f0.get(motionTelltales);
                int i21 = i19 & 1;
                float[] fArr3 = motionTelltales.P;
                if (i21 == 0) {
                    int width2 = motionTelltales.getWidth();
                    int height2 = motionTelltales.getHeight();
                    float[] fArr4 = qVar.f31767v;
                    c11 = 0;
                    a0 a0Var = qVar.f31752f;
                    float fB = qVar.b(f13, fArr4);
                    f5 = f14;
                    HashMap map = qVar.f31770y;
                    fArr = fArr2;
                    l lVar = map == null ? null : (l) map.get("translationX");
                    i13 = i17;
                    HashMap map2 = qVar.f31770y;
                    l lVar2 = map2 == null ? null : (l) map2.get("translationY");
                    float f15 = f11;
                    HashMap map3 = qVar.f31770y;
                    l lVar3 = map3 == null ? null : (l) map3.get("rotation");
                    i14 = i18;
                    HashMap map4 = qVar.f31770y;
                    i12 = height;
                    l lVar4 = map4 == null ? null : (l) map4.get("scaleX");
                    i11 = width;
                    HashMap map5 = qVar.f31770y;
                    matrix = matrix3;
                    l lVar5 = map5 == null ? null : (l) map5.get("scaleY");
                    HashMap map6 = qVar.f31771z;
                    g gVar2 = map6 == null ? null : (g) map6.get("translationX");
                    HashMap map7 = qVar.f31771z;
                    g gVar3 = map7 == null ? null : (g) map7.get("translationY");
                    HashMap map8 = qVar.f31771z;
                    g gVar4 = map8 == null ? null : (g) map8.get("rotation");
                    HashMap map9 = qVar.f31771z;
                    g gVar5 = map9 == null ? null : (g) map9.get("scaleX");
                    HashMap map10 = qVar.f31771z;
                    g gVar6 = map10 != null ? (g) map10.get("scaleY") : null;
                    o oVar2 = new o();
                    i15 = i19;
                    oVar2.f6598e = CropImageView.DEFAULT_ASPECT_RATIO;
                    oVar2.f6597d = CropImageView.DEFAULT_ASPECT_RATIO;
                    oVar2.f6596c = CropImageView.DEFAULT_ASPECT_RATIO;
                    oVar2.f6595b = CropImageView.DEFAULT_ASPECT_RATIO;
                    oVar2.f6594a = CropImageView.DEFAULT_ASPECT_RATIO;
                    if (lVar3 != null) {
                        oVar2.f6598e = (float) lVar3.f28756a.t(fB);
                        oVar2.f6599f = lVar3.a(fB);
                    }
                    if (lVar != null) {
                        oVar2.f6596c = (float) lVar.f28756a.t(fB);
                    }
                    if (lVar2 != null) {
                        oVar2.f6597d = (float) lVar2.f28756a.t(fB);
                    }
                    if (lVar4 != null) {
                        oVar2.f6594a = (float) lVar4.f28756a.t(fB);
                    }
                    if (lVar5 != null) {
                        oVar2.f6595b = (float) lVar5.f28756a.t(fB);
                    }
                    if (gVar4 != null) {
                        oVar2.f6598e = gVar4.b(fB);
                    }
                    if (gVar2 != null) {
                        oVar2.f6596c = gVar2.b(fB);
                    }
                    if (gVar3 != null) {
                        oVar2.f6597d = gVar3.b(fB);
                    }
                    g gVar7 = gVar5;
                    if (gVar5 != null) {
                        oVar2.f6594a = gVar7.b(fB);
                    }
                    if (gVar6 != 0) {
                        gVar = gVar6;
                        oVar2.f6595b = gVar.b(fB);
                    } else {
                        gVar = gVar6;
                    }
                    b bVar = qVar.f31757k;
                    if (bVar != null) {
                        double[] dArr2 = qVar.f31761p;
                        if (dArr2.length > 0) {
                            double d5 = fB;
                            bVar.q(d5, dArr2);
                            qVar.f31757k.u(d5, qVar.f31762q);
                            int[] iArr = qVar.f31760o;
                            double[] dArr3 = qVar.f31762q;
                            double[] dArr4 = qVar.f31761p;
                            a0Var.getClass();
                            a0.f(f12, f15, fArr3, iArr, dArr3, dArr4);
                            fArr3 = fArr3;
                            f11 = f15;
                            f12 = f12;
                            oVar = oVar2;
                        } else {
                            oVar = oVar2;
                            f12 = f12;
                            f11 = f15;
                            fArr3 = fArr3;
                        }
                        oVar.a(f12, f11, width2, height2, fArr3);
                    } else if (qVar.f31756j != null) {
                        fArr3 = fArr3;
                        double dB = qVar.b(fB, fArr4);
                        qVar.f31756j[0].u(dB, qVar.f31762q);
                        qVar.f31756j[0].q(dB, qVar.f31761p);
                        float f16 = fArr4[0];
                        int i22 = 0;
                        while (true) {
                            dArr = qVar.f31762q;
                            if (i22 >= dArr.length) {
                                break;
                            }
                            dArr[i22] = dArr[i22] * ((double) f16);
                            i22++;
                        }
                        int[] iArr2 = qVar.f31760o;
                        double[] dArr5 = qVar.f31761p;
                        a0Var.getClass();
                        a0.f(f12, f15, fArr3, iArr2, dArr, dArr5);
                        fArr3 = fArr3;
                        f11 = f15;
                        f12 = f12;
                        oVar2.a(f12, f11, width2, height2, fArr3);
                    } else {
                        a0 a0Var2 = qVar.f31753g;
                        float f17 = a0Var2.f31555e - a0Var.f31555e;
                        float f18 = a0Var2.f31556f - a0Var.f31556f;
                        float f19 = a0Var2.f31557t - a0Var.f31557t;
                        float f21 = f18 + (a0Var2.H - a0Var.H);
                        fArr3[0] = ((f17 + f19) * f12) + ((1.0f - f12) * f17);
                        fArr3[1] = (f21 * f15) + ((1.0f - f15) * f18);
                        oVar2.f6598e = CropImageView.DEFAULT_ASPECT_RATIO;
                        oVar2.f6597d = CropImageView.DEFAULT_ASPECT_RATIO;
                        oVar2.f6596c = CropImageView.DEFAULT_ASPECT_RATIO;
                        oVar2.f6595b = CropImageView.DEFAULT_ASPECT_RATIO;
                        oVar2.f6594a = CropImageView.DEFAULT_ASPECT_RATIO;
                        if (lVar3 != null) {
                            oVar2.f6598e = (float) lVar3.f28756a.t(fB);
                            oVar2.f6599f = lVar3.a(fB);
                        }
                        if (lVar != 0) {
                            fArr3 = fArr3;
                            fArr3 = fArr3;
                            oVar2.f6596c = (float) lVar.f28756a.t(fB);
                        }
                        if (lVar2 != null) {
                            oVar2.f6597d = (float) lVar2.f28756a.t(fB);
                        }
                        if (lVar4 != null) {
                            oVar2.f6594a = (float) lVar4.f28756a.t(fB);
                        }
                        if (lVar5 != null) {
                            oVar2.f6595b = (float) lVar5.f28756a.t(fB);
                        }
                        if (gVar4 != null) {
                            oVar2.f6598e = gVar4.b(fB);
                        }
                        if (gVar2 != null) {
                            oVar2.f6596c = gVar2.b(fB);
                        }
                        if (gVar3 != null) {
                            oVar2.f6597d = gVar3.b(fB);
                        }
                        if (gVar7 != 0) {
                            oVar2.f6594a = gVar7.b(fB);
                        }
                        if (gVar != 0) {
                            oVar2.f6595b = gVar.b(fB);
                        }
                        f12 = f12;
                        f11 = f15;
                        oVar2.a(f12, f11, width2, height2, fArr3);
                    }
                } else {
                    i11 = width;
                    matrix = matrix3;
                    i12 = height;
                    f5 = f14;
                    fArr = fArr2;
                    i13 = i17;
                    i14 = i18;
                    i15 = i19;
                    c11 = 0;
                    qVar.d(f13, f12, f11, fArr3);
                }
                if (i15 < 2) {
                    fArr3[c11] = fArr3[c11] * f5;
                    fArr3[1] = fArr3[1] * f5;
                }
                motionTelltales = this;
                float[] fArr5 = motionTelltales.P;
                matrix3 = matrix;
                matrix3.mapVectors(fArr5);
                int i23 = i11;
                float f22 = i23 * f12;
                int i24 = i12;
                float f23 = i24 * f11;
                float f24 = fArr5[c11];
                float f25 = motionTelltales.T;
                float f26 = f23 - (fArr5[1] * f25);
                matrix3.mapVectors(fArr5);
                canvas.drawLine(f22, f23, f22 - (f24 * f25), f26, motionTelltales.N);
                i18 = i14 + 1;
                width = i23;
                height = i24;
                fArr2 = fArr;
                i17 = i13;
                i16 = 5;
            }
            i17++;
            height = height;
            i16 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f1316f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = new Paint();
        this.P = new float[2];
        this.Q = new Matrix();
        this.R = 0;
        this.S = -65281;
        this.T = 0.25f;
        b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.N = new Paint();
        this.P = new float[2];
        this.Q = new Matrix();
        this.R = 0;
        this.S = -65281;
        this.T = 0.25f;
        b(context, attributeSet);
    }
}
