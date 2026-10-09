package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import j4.e;
import j4.k;
import j4.l;
import j4.p;
import j4.q;
import j4.t;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f1368a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new q();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        q qVar = new q(context, attributeSet);
        qVar.f36017r0 = 1.0f;
        qVar.f36018s0 = false;
        qVar.f36019t0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.f36020u0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.f36021v0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.f36022w0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.f36023x0 = 1.0f;
        qVar.f36024y0 = 1.0f;
        qVar.f36025z0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.A0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.B0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.C0 = CropImageView.DEFAULT_ASPECT_RATIO;
        qVar.D0 = CropImageView.DEFAULT_ASPECT_RATIO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f36032g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            if (index == 15) {
                qVar.f36017r0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36017r0);
            } else if (index == 28) {
                qVar.f36019t0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36019t0);
                qVar.f36018s0 = true;
            } else if (index == 23) {
                qVar.f36021v0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36021v0);
            } else if (index == 24) {
                qVar.f36022w0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36022w0);
            } else if (index == 22) {
                qVar.f36020u0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36020u0);
            } else if (index == 20) {
                qVar.f36023x0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36023x0);
            } else if (index == 21) {
                qVar.f36024y0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36024y0);
            } else if (index == 16) {
                qVar.f36025z0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.f36025z0);
            } else if (index == 17) {
                qVar.A0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.A0);
            } else if (index == 18) {
                qVar.B0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.B0);
            } else if (index == 19) {
                qVar.C0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.C0);
            } else if (index == 27) {
                qVar.D0 = typedArrayObtainStyledAttributes.getFloat(index, qVar.D0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return qVar;
    }

    public p getConstraintSet() {
        if (this.f1368a == null) {
            this.f1368a = new p();
        }
        p pVar = this.f1368a;
        pVar.getClass();
        int childCount = getChildCount();
        HashMap map = pVar.f36016g;
        map.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            q qVar = (q) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (pVar.f36015f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new k());
            }
            k kVar = (k) map.get(Integer.valueOf(id2));
            if (kVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    l lVar = kVar.f35929e;
                    kVar.d(id2, qVar);
                    if (constraintHelper instanceof Barrier) {
                        lVar.f35951i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        lVar.f35947g0 = barrier.getType();
                        lVar.f35953j0 = barrier.getReferencedIds();
                        lVar.f35949h0 = barrier.getMargin();
                    }
                }
                kVar.d(id2, qVar);
            }
        }
        return this.f1368a;
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
