package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateSelector f14394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CalendarConstraints f14395d;

    @Override // androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f14393b = bundle.getInt("THEME_RES_ID_KEY");
        this.f14394c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f14395d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f14394c.n1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f14393b)), viewGroup, this.f14395d, new OnSelectionChangedListener<Object>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void a() {
                Iterator it = MaterialTextInputPicker.this.f14420a.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).a();
                }
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void b(Object obj) {
                Iterator it = MaterialTextInputPicker.this.f14420a.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).b(obj);
                }
            }
        });
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14393b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f14394c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14395d);
    }
}
