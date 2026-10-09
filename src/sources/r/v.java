package r;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f48670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k2 f48671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48672c = 0;

    public v(ImageView imageView) {
        this.f48670a = imageView;
    }

    public final void a() {
        k2 k2Var;
        ImageView imageView = this.f48670a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            c1.a(drawable);
        }
        if (drawable == null || (k2Var = this.f48671b) == null) {
            return;
        }
        s.e(drawable, k2Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i11) {
        int resourceId;
        ImageView imageView = this.f48670a;
        Context context = imageView.getContext();
        int[] iArr = k.a.f37405g;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        z4.s0.p(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = jh.h.k(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(m4VarK.f(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(c1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            m4VarK.l();
        }
    }

    public final void c(int i11) {
        ImageView imageView = this.f48670a;
        if (i11 != 0) {
            Drawable drawableK = jh.h.k(imageView.getContext(), i11);
            if (drawableK != null) {
                c1.a(drawableK);
            }
            imageView.setImageDrawable(drawableK);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
