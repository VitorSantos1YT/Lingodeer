package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TabHost.OnTabChangeListener f1607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1608c;

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f1606a = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.inflatedId}, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f1606a;
        if (arrayList.size() > 0) {
            throw hh.p0.e(0, arrayList);
        }
        this.f1608c = true;
        if (arrayList.size() > 0) {
            throw hh.p0.e(0, arrayList);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1608c = false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x1 x1Var = (x1) parcelable;
        super.onRestoreInstanceState(x1Var.getSuperState());
        setCurrentTabByTag(x1Var.f1868a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x1 x1Var = new x1(super.onSaveInstanceState());
        x1Var.f1868a = getCurrentTabTag();
        return x1Var;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        if (this.f1608c) {
            ArrayList arrayList = this.f1606a;
            if (arrayList.size() > 0) {
                throw hh.p0.e(0, arrayList);
            }
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f1607b;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f1607b = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1606a = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }
}
