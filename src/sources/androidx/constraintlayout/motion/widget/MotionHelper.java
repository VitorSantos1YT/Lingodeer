package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import h4.y;
import j4.t;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements y {
    public boolean L;
    public boolean M;
    public float N;
    public View[] O;

    public MotionHelper(Context context) {
        super(context);
        this.L = false;
        this.M = false;
    }

    public float getProgress() {
        return this.N;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.f36044t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 1) {
                    this.L = typedArrayObtainStyledAttributes.getBoolean(index, this.L);
                } else if (index == 0) {
                    this.M = typedArrayObtainStyledAttributes.getBoolean(index, this.M);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f5) {
        this.N = f5;
        int i11 = 0;
        if (this.f1355b > 0) {
            this.O = j((ConstraintLayout) getParent());
            while (i11 < this.f1355b) {
                View view = this.O[i11];
                i11++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i11 < childCount) {
            viewGroup.getChildAt(i11);
            i11++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        this.M = false;
        k(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.L = false;
        this.M = false;
        k(attributeSet);
    }

    public void a(int i11) {
    }

    public void r(MotionLayout motionLayout, HashMap map) {
    }
}
