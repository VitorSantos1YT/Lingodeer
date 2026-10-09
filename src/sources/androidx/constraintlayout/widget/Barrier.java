package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import d4.a;
import d4.g;
import d4.h;
import d4.m;
import j4.k;
import j4.l;
import j4.q;
import j4.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int L;
    public int M;
    public a N;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.N.f23087x0;
    }

    public int getMargin() {
        return this.N.f23088y0;
    }

    public int getType() {
        return this.L;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.N = new a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36028c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.N.f23087x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.N.f23088y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
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
        l lVar = kVar.f35929e;
        if (mVar instanceof a) {
            a aVar = (a) mVar;
            r(aVar, lVar.f35947g0, ((h) mVar.V).f23166z0);
            aVar.f23087x0 = lVar.f35962o0;
            aVar.f23088y0 = lVar.f35949h0;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void m(g gVar, boolean z11) {
        r(gVar, this.L, z11);
    }

    public final void r(g gVar, int i11, boolean z11) {
        this.M = i11;
        if (z11) {
            int i12 = this.L;
            if (i12 == 5) {
                this.M = 1;
            } else if (i12 == 6) {
                this.M = 0;
            }
        } else {
            int i13 = this.L;
            if (i13 == 5) {
                this.M = 0;
            } else if (i13 == 6) {
                this.M = 1;
            }
        }
        if (gVar instanceof a) {
            ((a) gVar).f23086w0 = this.M;
        }
    }

    public void setAllowsGoneWidget(boolean z11) {
        this.N.f23087x0 = z11;
    }

    public void setDpMargin(int i11) {
        this.N.f23088y0 = (int) ((i11 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i11) {
        this.N.f23088y0 = i11;
    }

    public void setType(int i11) {
        this.L = i11;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        super.setVisibility(8);
    }
}
