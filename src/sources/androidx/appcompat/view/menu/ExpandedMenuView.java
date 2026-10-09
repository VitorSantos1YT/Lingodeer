package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import q.k;
import q.l;
import q.n;
import q.x;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f834b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f835a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // q.x
    public final void a(l lVar) {
        this.f835a = lVar;
    }

    @Override // q.k
    public final boolean b(n nVar) {
        return this.f835a.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        b((n) getAdapter().getItem(i11));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        m4 m4VarK = m4.k(context, attributeSet, f834b, i11);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(m4VarK.g(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(m4VarK.g(1));
        }
        m4VarK.l();
    }
}
