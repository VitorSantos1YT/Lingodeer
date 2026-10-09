package androidx.constraintlayout.helper.widget;

import aj.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import f4.a;
import h4.c0;
import h4.f0;
import j4.t;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public final ArrayList P;
    public int Q;
    public MotionLayout R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1248a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f1249b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1250c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1251d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f1252e0;

    public Carousel(Context context) {
        super(context);
        this.P = new ArrayList();
        this.Q = 0;
        this.S = -1;
        this.T = false;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f1248a0 = -1;
        this.f1249b0 = 0.9f;
        this.f1250c0 = 4;
        this.f1251d0 = 1;
        this.f1252e0 = 2.0f;
        new i(this, 4);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, h4.y
    public final void a(int i11) {
        int i12 = this.Q;
        if (i11 == this.f1248a0) {
            this.Q = i12 + 1;
        } else if (i11 == this.W) {
            this.Q = i12 - 1;
        }
        if (!this.T) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.Q;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        f0 f0Var;
        f0 f0Var2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            ArrayList arrayList = this.P;
            arrayList.clear();
            for (int i11 = 0; i11 < this.f1355b; i11++) {
                arrayList.add(motionLayout.e(this.f1354a[i11]));
            }
            this.R = motionLayout;
            if (this.f1251d0 == 2) {
                c0 c0VarX = motionLayout.x(this.V);
                if (c0VarX != null && (f0Var2 = c0VarX.f31576l) != null) {
                    f0Var2.f31618c = 5;
                }
                c0 c0VarX2 = this.R.x(this.U);
                if (c0VarX2 == null || (f0Var = c0VarX2.f31576l) == null) {
                    return;
                }
                f0Var.f31618c = 5;
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P.clear();
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36026a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 3) {
                    this.S = typedArrayObtainStyledAttributes.getResourceId(index, this.S);
                } else if (index == 1) {
                    this.U = typedArrayObtainStyledAttributes.getResourceId(index, this.U);
                } else if (index == 4) {
                    this.V = typedArrayObtainStyledAttributes.getResourceId(index, this.V);
                } else if (index == 2) {
                    this.f1250c0 = typedArrayObtainStyledAttributes.getInt(index, this.f1250c0);
                } else if (index == 7) {
                    this.W = typedArrayObtainStyledAttributes.getResourceId(index, this.W);
                } else if (index == 6) {
                    this.f1248a0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1248a0);
                } else if (index == 9) {
                    this.f1249b0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1249b0);
                } else if (index == 8) {
                    this.f1251d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1251d0);
                } else if (index == 10) {
                    this.f1252e0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1252e0);
                } else if (index == 5) {
                    this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setInfinite(boolean z11) {
        this.T = z11;
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new ArrayList();
        this.Q = 0;
        this.S = -1;
        this.T = false;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f1248a0 = -1;
        this.f1249b0 = 0.9f;
        this.f1250c0 = 4;
        this.f1251d0 = 1;
        this.f1252e0 = 2.0f;
        new i(this, 4);
        s(context, attributeSet);
    }

    public void setAdapter(a aVar) {
    }

    public Carousel(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.P = new ArrayList();
        this.Q = 0;
        this.S = -1;
        this.T = false;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f1248a0 = -1;
        this.f1249b0 = 0.9f;
        this.f1250c0 = 4;
        this.f1251d0 = 1;
        this.f1252e0 = 2.0f;
        new i(this, 4);
        s(context, attributeSet);
    }
}
