package r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f48624a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k2 f48627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k2 f48628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k2 f48629f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48626c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f48625b = s.a();

    public q(View view) {
        this.f48624a = view;
    }

    public final void a() {
        View view = this.f48624a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f48627d != null) {
                if (this.f48629f == null) {
                    this.f48629f = new k2();
                }
                k2 k2Var = this.f48629f;
                k2Var.f48597c = null;
                k2Var.f48596b = false;
                k2Var.f48598d = null;
                k2Var.f48595a = false;
                WeakHashMap weakHashMap = z4.s0.f58893a;
                ColorStateList colorStateListC = z4.j0.c(view);
                if (colorStateListC != null) {
                    k2Var.f48596b = true;
                    k2Var.f48597c = colorStateListC;
                }
                PorterDuff.Mode modeD = z4.j0.d(view);
                if (modeD != null) {
                    k2Var.f48595a = true;
                    k2Var.f48598d = modeD;
                }
                if (k2Var.f48596b || k2Var.f48595a) {
                    s.e(background, k2Var, view.getDrawableState());
                    return;
                }
            }
            k2 k2Var2 = this.f48628e;
            if (k2Var2 != null) {
                s.e(background, k2Var2, view.getDrawableState());
                return;
            }
            k2 k2Var3 = this.f48627d;
            if (k2Var3 != null) {
                s.e(background, k2Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        k2 k2Var = this.f48628e;
        if (k2Var != null) {
            return (ColorStateList) k2Var.f48597c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        k2 k2Var = this.f48628e;
        if (k2Var != null) {
            return (PorterDuff.Mode) k2Var.f48598d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i11) {
        ColorStateList colorStateListF;
        View view = this.f48624a;
        Context context = view.getContext();
        int[] iArr = k.a.C;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        View view2 = this.f48624a;
        z4.s0.p(view2, view2.getContext(), iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        try {
            if (typedArray.hasValue(0)) {
                this.f48626c = typedArray.getResourceId(0, -1);
                s sVar = this.f48625b;
                Context context2 = view.getContext();
                int i12 = this.f48626c;
                synchronized (sVar) {
                    colorStateListF = sVar.f48642a.f(context2, i12);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                z4.j0.i(view, m4VarK.f(1));
            }
            if (typedArray.hasValue(2)) {
                z4.j0.j(view, c1.c(typedArray.getInt(2, -1), null));
            }
            m4VarK.l();
        } catch (Throwable th2) {
            m4VarK.l();
            throw th2;
        }
    }

    public final void e() {
        this.f48626c = -1;
        g(null);
        a();
    }

    public final void f(int i11) {
        ColorStateList colorStateListF;
        this.f48626c = i11;
        s sVar = this.f48625b;
        if (sVar != null) {
            Context context = this.f48624a.getContext();
            synchronized (sVar) {
                colorStateListF = sVar.f48642a.f(context, i11);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f48627d == null) {
                this.f48627d = new k2();
            }
            k2 k2Var = this.f48627d;
            k2Var.f48597c = colorStateList;
            k2Var.f48596b = true;
        } else {
            this.f48627d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f48628e == null) {
            this.f48628e = new k2();
        }
        k2 k2Var = this.f48628e;
        k2Var.f48597c = colorStateList;
        k2Var.f48596b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f48628e == null) {
            this.f48628e = new k2();
        }
        k2 k2Var = this.f48628e;
        k2Var.f48598d = mode;
        k2Var.f48595a = true;
        a();
    }
}
