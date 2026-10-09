package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalantis.ucrop.view.CropImageView;
import d4.g;
import j4.e;
import j4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public float L;
    public float M;
    public float N;
    public ConstraintLayout O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f1262a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public View[] f1263b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f1264c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f1265d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1266e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1267f0;

    public Layer(Context context) {
        super(context);
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.f1262a0 = true;
        this.f1263b0 = null;
        this.f1264c0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1265d0 = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.f1358e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36028c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 6) {
                    this.f1266e0 = true;
                } else if (index == 22) {
                    this.f1267f0 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n() {
        s();
        this.R = Float.NaN;
        this.S = Float.NaN;
        g gVar = ((e) getLayoutParams()).f35880q0;
        gVar.P(0);
        gVar.M(0);
        r();
        layout(((int) this.V) - getPaddingLeft(), ((int) this.W) - getPaddingTop(), getPaddingRight() + ((int) this.T), getPaddingBottom() + ((int) this.U));
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(ConstraintLayout constraintLayout) {
        this.O = constraintLayout;
        float rotation = getRotation();
        if (rotation != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.N = rotation;
        } else {
            if (Float.isNaN(this.N)) {
                return;
            }
            this.N = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = (ConstraintLayout) getParent();
        if (this.f1266e0 || this.f1267f0) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i11 = 0; i11 < this.f1355b; i11++) {
                View viewE = this.O.e(this.f1354a[i11]);
                if (viewE != null) {
                    if (this.f1266e0) {
                        viewE.setVisibility(visibility);
                    }
                    if (this.f1267f0 && elevation > CropImageView.DEFAULT_ASPECT_RATIO) {
                        viewE.setTranslationZ(viewE.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void r() {
        if (this.O == null) {
            return;
        }
        if (this.f1262a0 || Float.isNaN(this.R) || Float.isNaN(this.S)) {
            if (!Float.isNaN(this.L) && !Float.isNaN(this.M)) {
                this.S = this.M;
                this.R = this.L;
                return;
            }
            View[] viewArrJ = j(this.O);
            int left = viewArrJ[0].getLeft();
            int top = viewArrJ[0].getTop();
            int right = viewArrJ[0].getRight();
            int bottom = viewArrJ[0].getBottom();
            for (int i11 = 0; i11 < this.f1355b; i11++) {
                View view = viewArrJ[i11];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.T = right;
            this.U = bottom;
            this.V = left;
            this.W = top;
            if (Float.isNaN(this.L)) {
                this.R = (left + right) / 2;
            } else {
                this.R = this.L;
            }
            if (Float.isNaN(this.M)) {
                this.S = (top + bottom) / 2;
            } else {
                this.S = this.M;
            }
        }
    }

    public final void s() {
        int i11;
        if (this.O == null || (i11 = this.f1355b) == 0) {
            return;
        }
        View[] viewArr = this.f1263b0;
        if (viewArr == null || viewArr.length != i11) {
            this.f1263b0 = new View[i11];
        }
        for (int i12 = 0; i12 < this.f1355b; i12++) {
            this.f1263b0[i12] = this.O.e(this.f1354a[i12]);
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        e();
    }

    @Override // android.view.View
    public void setPivotX(float f5) {
        this.L = f5;
        t();
    }

    @Override // android.view.View
    public void setPivotY(float f5) {
        this.M = f5;
        t();
    }

    @Override // android.view.View
    public void setRotation(float f5) {
        this.N = f5;
        t();
    }

    @Override // android.view.View
    public void setScaleX(float f5) {
        this.P = f5;
        t();
    }

    @Override // android.view.View
    public void setScaleY(float f5) {
        this.Q = f5;
        t();
    }

    @Override // android.view.View
    public void setTranslationX(float f5) {
        this.f1264c0 = f5;
        t();
    }

    @Override // android.view.View
    public void setTranslationY(float f5) {
        this.f1265d0 = f5;
        t();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        e();
    }

    public final void t() {
        if (this.O == null) {
            return;
        }
        if (this.f1263b0 == null) {
            s();
        }
        r();
        double radians = Float.isNaN(this.N) ? 0.0d : Math.toRadians(this.N);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f5 = this.P;
        float f11 = f5 * fCos;
        float f12 = this.Q;
        float f13 = (-f12) * fSin;
        float f14 = f5 * fSin;
        float f15 = f12 * fCos;
        for (int i11 = 0; i11 < this.f1355b; i11++) {
            View view = this.f1263b0[i11];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f16 = right - this.R;
            float f17 = bottom - this.S;
            float f18 = (((f13 * f17) + (f11 * f16)) - f16) + this.f1264c0;
            float f19 = (((f15 * f17) + (f16 * f14)) - f17) + this.f1265d0;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.Q);
            view.setScaleX(this.P);
            if (!Float.isNaN(this.N)) {
                view.setRotation(this.N);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.f1262a0 = true;
        this.f1263b0 = null;
        this.f1264c0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1265d0 = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public Layer(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.f1262a0 = true;
        this.f1263b0 = null;
        this.f1264c0 = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1265d0 = CropImageView.DEFAULT_ASPECT_RATIO;
    }
}
