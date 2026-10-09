package tb;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import sb.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements sb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f52118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52119b = false;

    public a(ViewGroup viewGroup, AttributeSet attributeSet) {
        this.f52118a = viewGroup;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = null;
            try {
                typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(attributeSet, b.f51531a);
                typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th2;
            }
        }
    }

    @Override // sb.a
    public final void b() {
        this.f52119b = true;
    }

    public final int[] c(int i11, int i12) {
        if (this.f52119b) {
            this.f52118a.setVisibility(8);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i12 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i11 = iMakeMeasureSpec;
        }
        return new int[]{i11, i12};
    }

    @Override // sb.a
    public final void a() {
    }
}
