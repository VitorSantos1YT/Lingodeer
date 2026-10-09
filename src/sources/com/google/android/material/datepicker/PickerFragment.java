package com.google.android.material.datepicker;

import androidx.fragment.app.k0;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class PickerFragment<S> extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f14420a = new LinkedHashSet();

    public void q(OnSelectionChangedListener onSelectionChangedListener) {
        this.f14420a.add(onSelectionChangedListener);
    }
}
