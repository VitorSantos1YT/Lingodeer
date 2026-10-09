package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import d4.g;
import d4.j;
import d4.m;
import d4.p;
import j4.k;
import j4.q;
import j4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public j N;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.N = new j();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36028c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 0) {
                    this.N.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    j jVar = this.N;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar.f23198w0 = dimensionPixelSize;
                    jVar.f23199x0 = dimensionPixelSize;
                    jVar.f23200y0 = dimensionPixelSize;
                    jVar.f23201z0 = dimensionPixelSize;
                } else if (index == 18) {
                    j jVar2 = this.N;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar2.f23200y0 = dimensionPixelSize2;
                    jVar2.A0 = dimensionPixelSize2;
                    jVar2.B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.N.f23201z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.N.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.N.f23198w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.N.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.N.f23199x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.N.X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.N.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.N.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.N.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.N.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.N.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.N.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.N.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.N.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.N.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.N.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.N.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.N.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.N.V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.N.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.N.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.N.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.N.Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1357d = this.N;
        q();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(k kVar, m mVar, q qVar, SparseArray sparseArray) {
        super.l(kVar, mVar, qVar, sparseArray);
        if (mVar instanceof j) {
            j jVar = (j) mVar;
            int i11 = qVar.V;
            if (i11 != -1) {
                jVar.Z0 = i11;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(g gVar, boolean z11) {
        j jVar = this.N;
        int i11 = jVar.f23200y0;
        if (i11 > 0 || jVar.f23201z0 > 0) {
            if (z11) {
                jVar.A0 = jVar.f23201z0;
                jVar.B0 = i11;
            } else {
                jVar.A0 = i11;
                jVar.B0 = jVar.f23201z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i11, int i12) {
        r(this.N, i11, i12);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void r(p pVar, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (pVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            pVar.V(mode, size, mode2, size2);
            setMeasuredDimension(pVar.D0, pVar.E0);
        }
    }

    public void setFirstHorizontalBias(float f5) {
        this.N.P0 = f5;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i11) {
        this.N.J0 = i11;
        requestLayout();
    }

    public void setFirstVerticalBias(float f5) {
        this.N.Q0 = f5;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i11) {
        this.N.K0 = i11;
        requestLayout();
    }

    public void setHorizontalAlign(int i11) {
        this.N.V0 = i11;
        requestLayout();
    }

    public void setHorizontalBias(float f5) {
        this.N.N0 = f5;
        requestLayout();
    }

    public void setHorizontalGap(int i11) {
        this.N.T0 = i11;
        requestLayout();
    }

    public void setHorizontalStyle(int i11) {
        this.N.H0 = i11;
        requestLayout();
    }

    public void setLastHorizontalBias(float f5) {
        this.N.R0 = f5;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i11) {
        this.N.L0 = i11;
        requestLayout();
    }

    public void setLastVerticalBias(float f5) {
        this.N.S0 = f5;
        requestLayout();
    }

    public void setLastVerticalStyle(int i11) {
        this.N.M0 = i11;
        requestLayout();
    }

    public void setMaxElementsWrap(int i11) {
        this.N.Y0 = i11;
        requestLayout();
    }

    public void setOrientation(int i11) {
        this.N.Z0 = i11;
        requestLayout();
    }

    public void setPadding(int i11) {
        j jVar = this.N;
        jVar.f23198w0 = i11;
        jVar.f23199x0 = i11;
        jVar.f23200y0 = i11;
        jVar.f23201z0 = i11;
        requestLayout();
    }

    public void setPaddingBottom(int i11) {
        this.N.f23199x0 = i11;
        requestLayout();
    }

    public void setPaddingLeft(int i11) {
        this.N.A0 = i11;
        requestLayout();
    }

    public void setPaddingRight(int i11) {
        this.N.B0 = i11;
        requestLayout();
    }

    public void setPaddingTop(int i11) {
        this.N.f23198w0 = i11;
        requestLayout();
    }

    public void setVerticalAlign(int i11) {
        this.N.W0 = i11;
        requestLayout();
    }

    public void setVerticalBias(float f5) {
        this.N.O0 = f5;
        requestLayout();
    }

    public void setVerticalGap(int i11) {
        this.N.U0 = i11;
        requestLayout();
    }

    public void setVerticalStyle(int i11) {
        this.N.I0 = i11;
        requestLayout();
    }

    public void setWrapMode(int i11) {
        this.N.X0 = i11;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
