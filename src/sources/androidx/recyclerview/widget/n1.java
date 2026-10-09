package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class n1 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g2 f2546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2549d;

    public n1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2547b = new Rect();
        this.f2548c = true;
        this.f2549d = false;
    }

    public n1(int i11, int i12) {
        super(i11, i12);
        this.f2547b = new Rect();
        this.f2548c = true;
        this.f2549d = false;
    }

    public n1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2547b = new Rect();
        this.f2548c = true;
        this.f2549d = false;
    }

    public n1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2547b = new Rect();
        this.f2548c = true;
        this.f2549d = false;
    }

    public n1(n1 n1Var) {
        super((ViewGroup.LayoutParams) n1Var);
        this.f2547b = new Rect();
        this.f2548c = true;
        this.f2549d = false;
    }
}
