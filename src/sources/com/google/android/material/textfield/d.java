package com.google.android.material.textfield;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15741b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f15740a = i11;
        this.f15741b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15740a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f15741b).s(true);
                break;
            case 1:
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = (DropdownMenuEndIconDelegate) this.f15741b;
                boolean zIsPopupShowing = dropdownMenuEndIconDelegate.f15608h.isPopupShowing();
                dropdownMenuEndIconDelegate.s(zIsPopupShowing);
                dropdownMenuEndIconDelegate.m = zIsPopupShowing;
                break;
            default:
                ((TextInputLayout) this.f15741b).f15701e.requestLayout();
                break;
        }
    }
}
