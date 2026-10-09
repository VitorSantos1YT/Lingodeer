package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.ScrollingTabContainerView.TabView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f1103a;

    public j(ScrollingTabContainerView scrollingTabContainerView) {
        this.f1103a = scrollingTabContainerView;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1103a.f961b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        ((ScrollingTabContainerView.TabView) this.f1103a.f961b.getChildAt(i11)).getClass();
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        if (view != null) {
            getItem(i11);
            throw null;
        }
        getItem(i11);
        ScrollingTabContainerView scrollingTabContainerView = this.f1103a;
        scrollingTabContainerView.new TabView(scrollingTabContainerView.getContext());
        throw null;
    }
}
