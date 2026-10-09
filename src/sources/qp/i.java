package qp;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f47965a;

    public /* synthetic */ i(View view) {
        this.f47965a = view;
    }

    public void a() {
        View view = this.f47965a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.m.f(it, "it");
        this.f47965a.setEnabled(true);
    }

    public void b() {
        View viewFindViewById;
        View view = this.f47965a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new com.google.android.material.bottomappbar.a(viewFindViewById, 3));
    }
}
