package com.google.android.material.search;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import z4.b2;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f15166b;

    public /* synthetic */ d(SearchView searchView, int i11) {
        this.f15165a = i11;
        this.f15166b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b2 b2VarI;
        switch (this.f15165a) {
            case 0:
                SearchView searchView = this.f15166b;
                EditText editText = searchView.M;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.f15129f0 && (b2VarI = s0.i(editText)) != null) {
                    b2VarI.f58814a.N();
                } else {
                    ((InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
            case 1:
                this.f15166b.n();
                break;
            case 2:
                SearchView searchView2 = this.f15166b;
                EditText editText2 = searchView2.M;
                editText2.clearFocus();
                ViewUtils.f(editText2, searchView2.f15129f0);
                break;
            default:
                this.f15166b.l();
                break;
        }
    }
}
