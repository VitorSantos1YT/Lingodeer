package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f2447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2448b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2449c = new ArrayList();

    public f(y0 y0Var) {
        this.f2447a = y0Var;
    }

    public final void a(View view, int i11, boolean z11) {
        RecyclerView recyclerView = this.f2447a.f2652a;
        int childCount = i11 < 0 ? recyclerView.getChildCount() : f(i11);
        this.f2448b.G(childCount, z11);
        if (z11) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        RecyclerView recyclerView = this.f2447a.f2652a;
        int childCount = i11 < 0 ? recyclerView.getChildCount() : f(i11);
        this.f2448b.G(childCount, z11);
        if (z11) {
            i(view);
        }
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(defpackage.e.j(recyclerView, sb2));
            }
            childViewHolderInt.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i11) {
        g2 childViewHolderInt;
        int iF = f(i11);
        this.f2448b.I(iF);
        RecyclerView recyclerView = this.f2447a.f2652a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(defpackage.e.j(recyclerView, sb2));
            }
            childViewHolderInt.addFlags(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i11) {
        return this.f2447a.f2652a.getChildAt(f(i11));
    }

    public final int e() {
        return this.f2447a.f2652a.getChildCount() - this.f2449c.size();
    }

    public final int f(int i11) {
        if (i11 < 0) {
            return -1;
        }
        int childCount = this.f2447a.f2652a.getChildCount();
        int i12 = i11;
        while (i12 < childCount) {
            e eVar = this.f2448b;
            int iD = i11 - (i12 - eVar.D(i12));
            if (iD == 0) {
                while (eVar.F(i12)) {
                    i12++;
                }
                return i12;
            }
            i12 += iD;
        }
        return -1;
    }

    public final View g(int i11) {
        return this.f2447a.f2652a.getChildAt(i11);
    }

    public final int h() {
        return this.f2447a.f2652a.getChildCount();
    }

    public final void i(View view) {
        this.f2449c.add(view);
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(this.f2447a.f2652a);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.f2447a.f2652a.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        e eVar = this.f2448b;
        if (eVar.F(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - eVar.D(iIndexOfChild);
    }

    public final void k(View view) {
        g2 childViewHolderInt;
        if (!this.f2449c.remove(view) || (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) == null) {
            return;
        }
        childViewHolderInt.onLeftHiddenState(this.f2447a.f2652a);
    }

    public final String toString() {
        return this.f2448b.toString() + ", hidden list:" + this.f2449c.size();
    }
}
