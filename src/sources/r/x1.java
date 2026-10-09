package r;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f48708a;

    public x1(SearchView searchView) {
        this.f48708a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        SearchView searchView = this.f48708a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f983p0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z11);
        }
    }
}
