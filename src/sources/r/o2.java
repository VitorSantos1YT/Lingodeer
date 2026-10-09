package r;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements q.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q.l f48618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q.n f48619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f48620c;

    public o2(Toolbar toolbar) {
        this.f48620c = toolbar;
    }

    @Override // q.v
    public final void c(boolean z11) {
        if (this.f48619b != null) {
            q.l lVar = this.f48618a;
            if (lVar != null) {
                int size = lVar.f47285f.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (this.f48618a.getItem(i11) == this.f48619b) {
                        return;
                    }
                }
            }
            m(this.f48619b);
        }
    }

    @Override // q.v
    public final boolean e() {
        return false;
    }

    @Override // q.v
    public final boolean f(q.b0 b0Var) {
        return false;
    }

    @Override // q.v
    public final int getId() {
        return 0;
    }

    @Override // q.v
    public final boolean i(q.n nVar) {
        Toolbar toolbar = this.f48620c;
        toolbar.c();
        ViewParent parent = toolbar.H.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.H);
            }
            toolbar.addView(toolbar.H);
        }
        View actionView = nVar.getActionView();
        toolbar.K = actionView;
        this.f48619b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.K);
            }
            p2 p2VarH = Toolbar.h();
            p2VarH.f48622a = (toolbar.P & 112) | 8388611;
            p2VarH.f48623b = 2;
            toolbar.K.setLayoutParams(p2VarH);
            toolbar.addView(toolbar.K);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((p2) childAt.getLayoutParams()).f48623b != 2 && childAt != toolbar.f1028a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1043j0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f47299e0 = true;
        nVar.P.p(false);
        KeyEvent.Callback callback = toolbar.K;
        if (callback instanceof p.d) {
            ((p.d) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // q.v
    public final void j(Context context, q.l lVar) {
        q.n nVar;
        q.l lVar2 = this.f48618a;
        if (lVar2 != null && (nVar = this.f48619b) != null) {
            lVar2.d(nVar);
        }
        this.f48618a = lVar;
    }

    @Override // q.v
    public final Parcelable k() {
        return null;
    }

    @Override // q.v
    public final boolean m(q.n nVar) {
        Toolbar toolbar = this.f48620c;
        KeyEvent.Callback callback = toolbar.K;
        if (callback instanceof p.d) {
            ((p.d) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.K);
        toolbar.removeView(toolbar.H);
        toolbar.K = null;
        ArrayList arrayList = toolbar.f1043j0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f48619b = null;
        toolbar.requestLayout();
        nVar.f47299e0 = false;
        nVar.P.p(false);
        toolbar.w();
        return true;
    }

    @Override // q.v
    public final void g(Parcelable parcelable) {
    }

    @Override // q.v
    public final void d(q.l lVar, boolean z11) {
    }
}
