package com.google.android.material.bottomappbar;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f13969b;

    public /* synthetic */ a(View view, int i11) {
        this.f13968a = i11;
        this.f13969b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f13968a;
        View view = this.f13969b;
        switch (i11) {
            case 0:
                int i12 = BottomAppBar.W0;
                view.requestLayout();
                break;
            case 1:
                view.requestFocus();
                view.post(new a(view, 2));
                break;
            case 2:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
        }
    }
}
