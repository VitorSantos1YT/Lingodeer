package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15843b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f15842a = i11;
        this.f15843b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void a(int i11, boolean z11) {
        int i12 = this.f15842a;
        Object obj = this.f15843b;
        switch (i12) {
            case 0:
                TimePickerTextInputPresenter timePickerTextInputPresenter = (TimePickerTextInputPresenter) obj;
                if (z11) {
                    timePickerTextInputPresenter.f15817b.d(i11 == R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
            default:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z11) {
                    int i13 = TimePickerView.f15832d0;
                } else {
                    TimePickerClockPresenter timePickerClockPresenter = timePickerView.f15833a0;
                    if (timePickerClockPresenter != null) {
                        timePickerClockPresenter.f15806b.d(i11 == R.id.material_clock_period_pm_button ? 1 : 0);
                    }
                }
                break;
        }
    }
}
