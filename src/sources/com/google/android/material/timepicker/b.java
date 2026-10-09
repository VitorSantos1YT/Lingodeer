package com.google.android.material.timepicker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15841b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f15840a = i11;
        this.f15841b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15840a) {
            case 0:
                Object obj = ((MaterialTimePicker) this.f15841b).f15778a0;
                if (obj instanceof TimePickerTextInputPresenter) {
                    ((TimePickerTextInputPresenter) obj).d();
                }
                break;
            default:
                ((RadialViewGroup) this.f15841b).q();
                break;
        }
    }
}
