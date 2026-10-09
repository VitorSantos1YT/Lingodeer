package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f15737b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i11) {
        this.f15736a = i11;
        this.f15737b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        switch (this.f15736a) {
            case 0:
                ClearTextEndIconDelegate clearTextEndIconDelegate = (ClearTextEndIconDelegate) this.f15737b;
                clearTextEndIconDelegate.s(clearTextEndIconDelegate.t());
                break;
            default:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f15737b;
                dropdownMenuEndIconDelegate.f15612l = z11;
                dropdownMenuEndIconDelegate.p();
                if (!z11) {
                    dropdownMenuEndIconDelegate.s(false);
                    dropdownMenuEndIconDelegate.m = false;
                }
                break;
        }
    }
}
