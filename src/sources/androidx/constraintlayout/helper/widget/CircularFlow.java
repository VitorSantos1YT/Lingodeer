package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import j4.e;
import j4.t;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static int f1253a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static float f1254b0;
    public ConstraintLayout N;
    public int O;
    public float[] P;
    public int[] Q;
    public int R;
    public int S;
    public String T;
    public String U;
    public Float V;
    public Integer W;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.S = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                s(str.substring(i11).trim());
                return;
            } else {
                s(str.substring(i11, iIndexOf).trim());
                i11 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.R = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i11);
            if (iIndexOf == -1) {
                t(str.substring(i11).trim());
                return;
            } else {
                t(str.substring(i11, iIndexOf).trim());
                i11 = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.P, this.S);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.Q, this.R);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36028c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 33) {
                    this.O = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.T = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.U = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, f1254b0));
                    this.V = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == 31) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, f1253a0));
                    this.W = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.T;
        if (str != null) {
            this.P = new float[1];
            setAngles(str);
        }
        String str2 = this.U;
        if (str2 != null) {
            this.Q = new int[1];
            setRadius(str2);
        }
        Float f5 = this.V;
        if (f5 != null) {
            setDefaultAngle(f5.floatValue());
        }
        Integer num = this.W;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.N = (ConstraintLayout) getParent();
        for (int i11 = 0; i11 < this.f1355b; i11++) {
            View viewE = this.N.e(this.f1354a[i11]);
            if (viewE != null) {
                int i12 = f1253a0;
                float f11 = f1254b0;
                int[] iArr = this.Q;
                HashMap map = this.K;
                if (iArr == null || i11 >= iArr.length) {
                    Integer num2 = this.W;
                    if (num2 == null || num2.intValue() == -1) {
                    } else {
                        this.R++;
                        if (this.Q == null) {
                            this.Q = new int[1];
                        }
                        int[] radius = getRadius();
                        this.Q = radius;
                        radius[this.R - 1] = i12;
                    }
                } else {
                    i12 = iArr[i11];
                }
                float[] fArr = this.P;
                if (fArr == null || i11 >= fArr.length) {
                    Float f12 = this.V;
                    if (f12 == null || f12.floatValue() == -1.0f) {
                    } else {
                        this.S++;
                        if (this.P == null) {
                            this.P = new float[1];
                        }
                        float[] angles = getAngles();
                        this.P = angles;
                        angles[this.S - 1] = f11;
                    }
                } else {
                    f11 = fArr[i11];
                }
                e eVar = (e) viewE.getLayoutParams();
                eVar.f35881r = f11;
                eVar.f35877p = this.O;
                eVar.f35879q = i12;
                viewE.setLayoutParams(eVar);
            }
        }
        e();
    }

    public final void s(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f1356c == null || (fArr = this.P) == null) {
            return;
        }
        if (this.S + 1 > fArr.length) {
            this.P = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.P[this.S] = Integer.parseInt(str);
        this.S++;
    }

    public void setDefaultAngle(float f5) {
        f1254b0 = f5;
    }

    public void setDefaultRadius(int i11) {
        f1253a0 = i11;
    }

    public final void t(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f1356c) == null || (iArr = this.Q) == null) {
            return;
        }
        if (this.R + 1 > iArr.length) {
            this.Q = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.Q[this.R] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.R++;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
