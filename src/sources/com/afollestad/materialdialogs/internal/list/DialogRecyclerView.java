package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.m1;
import androidx.recyclerview.widget.w;
import kotlin.jvm.internal.m;
import rc.b;
import rc.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f7409b;

    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7409b = new w(this, 2);
    }

    public final void b() {
        b bVar;
        if (getChildCount() == 0 || getMeasuredHeight() == 0 || (bVar = this.f7408a) == null) {
            return;
        }
        bVar.invoke(Boolean.valueOf(!d()), Boolean.valueOf(!c()));
    }

    public final boolean c() {
        b1 adapter = getAdapter();
        if (adapter == null) {
            m.l();
            throw null;
        }
        int itemCount = adapter.getItemCount() - 1;
        m1 layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() != itemCount) {
                return false;
            }
        } else if (!(layoutManager instanceof GridLayoutManager) || ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() != itemCount) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        m1 layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
        }
        return (layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int measuredWidth = getMeasuredWidth();
        c cVar = c.f49077a;
        if (measuredWidth <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new vc.b(this, cVar));
        } else {
            cVar.invoke(this);
        }
        addOnScrollListener(this.f7409b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeOnScrollListener(this.f7409b);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        b();
    }
}
