package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f1860a;

    public w0(k1 k1Var) {
        this.f1860a = k1Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        u1 u1VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        k1 k1Var = this.f1860a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, k1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.a.f58924a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = k0.class.isAssignableFrom(c1.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    k0 k0VarC = resourceId != -1 ? k1Var.C(resourceId) : null;
                    if (k0VarC == null && string != null) {
                        k0VarC = k1Var.D(string);
                    }
                    if (k0VarC == null && id2 != -1) {
                        k0VarC = k1Var.C(id2);
                    }
                    if (k0VarC == null) {
                        c1 c1VarJ = k1Var.J();
                        context.getClassLoader();
                        k0VarC = c1VarJ.a(attributeValue);
                        k0VarC.mFromLayout = true;
                        k0VarC.mFragmentId = resourceId != 0 ? resourceId : id2;
                        k0VarC.mContainerId = id2;
                        k0VarC.mTag = string;
                        k0VarC.mInLayout = true;
                        k0VarC.mFragmentManager = k1Var;
                        u0 u0Var = k1Var.f1731x;
                        k0VarC.mHost = u0Var;
                        k0VarC.onInflate((Context) u0Var.f1841b, attributeSet, k0VarC.mSavedFragmentState);
                        u1VarG = k1Var.a(k0VarC);
                        if (k1.L(2)) {
                            k0VarC.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (k0VarC.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        k0VarC.mInLayout = true;
                        k0VarC.mFragmentManager = k1Var;
                        u0 u0Var2 = k1Var.f1731x;
                        k0VarC.mHost = u0Var2;
                        k0VarC.onInflate((Context) u0Var2.f1841b, attributeSet, k0VarC.mSavedFragmentState);
                        u1VarG = k1Var.g(k0VarC);
                        if (k1.L(2)) {
                            k0VarC.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    a6.a aVar = a6.b.f387a;
                    a6.b.b(new FragmentTagUsageViolation(k0VarC, "Attempting to use <fragment> tag to add fragment " + k0VarC + " to container " + viewGroup));
                    a6.b.a(k0VarC).getClass();
                    k0VarC.mContainer = viewGroup;
                    u1VarG.i();
                    u1VarG.h();
                    View view2 = k0VarC.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(ep.a.g("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (k0VarC.mView.getTag() == null) {
                        k0VarC.mView.setTag(string);
                    }
                    k0VarC.mView.addOnAttachStateChangeListener(new v0(this, u1VarG));
                    return k0VarC.mView;
                }
            }
        }
        return null;
    }
}
