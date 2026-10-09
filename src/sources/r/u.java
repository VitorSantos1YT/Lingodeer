package r;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f48668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7.d f48669b;

    public u(TextView textView) {
        this.f48668a = textView;
        this.f48669b = new t7.d(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((c.a) this.f48669b.f52059b).p(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes = this.f48668a.getContext().obtainStyledAttributes(attributeSet, k.a.f37408j, i11, 0);
        try {
            boolean z11 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z11);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z11) {
        ((c.a) this.f48669b.f52059b).E(z11);
    }

    public final void d(boolean z11) {
        ((c.a) this.f48669b.f52059b).F(z11);
    }
}
