package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        kotlin.jvm.internal.m.f(context, "context");
        this.f1602a = new ArrayList();
        this.f1603b = new ArrayList();
        this.f1605d = true;
    }

    public final void a(View view) {
        if (this.f1603b.contains(view)) {
            this.f1602a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i11, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.f(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof k0 ? (k0) tag : null) != null) {
            super.addView(child, i11, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        z4.v1 v1VarK;
        kotlin.jvm.internal.m.f(insets, "insets");
        z4.v1 v1VarH = z4.v1.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1604c;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.m.c(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.m.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            v1VarK = z4.v1.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            v1VarK = z4.s0.k(this, v1VarH);
        }
        kotlin.jvm.internal.m.e(v1VarK, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!v1VarK.f58905a.o()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                z4.s0.c(getChildAt(i11), v1VarK);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.m.f(canvas, "canvas");
        if (this.f1605d) {
            ArrayList arrayList = this.f1602a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j11) {
        kotlin.jvm.internal.m.f(canvas, "canvas");
        kotlin.jvm.internal.m.f(child, "child");
        if (this.f1605d) {
            ArrayList arrayList = this.f1602a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j11);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        this.f1603b.remove(view);
        if (this.f1602a.remove(view)) {
            this.f1605d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends k0> F getFragment() {
        return (F) k1.E(this).C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.m.f(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.m.e(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i11) {
        View view = getChildAt(i11);
        kotlin.jvm.internal.m.e(view, "view");
        a(view);
        super.removeViewAt(i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View view = getChildAt(i14);
            kotlin.jvm.internal.m.e(view, "view");
            a(view);
        }
        super.removeViews(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View view = getChildAt(i14);
            kotlin.jvm.internal.m.e(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i11, i12);
    }

    public final void setDrawDisappearingViewsLast(boolean z11) {
        this.f1605d = z11;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1604c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        if (view.getParent() == this) {
            this.f1603b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.m.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i11) {
        String str;
        super(context, attributeSet, i11);
        kotlin.jvm.internal.m.f(context, "context");
        this.f1602a = new ArrayList();
        this.f1603b = new ArrayList();
        this.f1605d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.a.f58925b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, k1 k1Var) {
        super(context, attrs);
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(attrs, "attrs");
        this.f1602a = new ArrayList();
        this.f1603b = new ArrayList();
        this.f1605d = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, z5.a.f58925b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        k0 k0VarC = k1Var.C(id2);
        if (classAttribute != null && k0VarC == null) {
            if (id2 == -1) {
                throw new IllegalStateException(ep.a.g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : BuildConfig.VERSION_NAME));
            }
            c1 c1VarJ = k1Var.J();
            context.getClassLoader();
            k0 k0VarA = c1VarJ.a(classAttribute);
            kotlin.jvm.internal.m.e(k0VarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            k0VarA.mFragmentId = id2;
            k0VarA.mContainerId = id2;
            k0VarA.mTag = string;
            k0VarA.mFragmentManager = k1Var;
            k0VarA.mHost = k1Var.f1731x;
            k0VarA.onInflate(context, attrs, (Bundle) null);
            a aVar = new a(k1Var);
            aVar.f1905p = true;
            aVar.b(this, k0VarA, string);
            if (!aVar.f1897g) {
                aVar.f1898h = false;
                aVar.f1609r.A(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        k1Var.S(this);
    }
}
