package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f14426a = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final SingleDateSelector[] newArray(int i11) {
            return new SingleDateSelector[i11];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f14426a;

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList A() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String C0(Context context) {
        Resources resources = context.getResources();
        Long l9 = this.f14426a;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l9 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : DateStrings.d(l9.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int I0(Context context) {
        return MaterialAttributes.d(R.attr.materialCalendarTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean P0() {
        return this.f14426a != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList V0() {
        ArrayList arrayList = new ArrayList();
        Long l9 = this.f14426a;
        if (l9 != null) {
            arrayList.add(l9);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object a1() {
        return this.f14426a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void q1(long j11) {
        this.f14426a = Long.valueOf(j11);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String v(Context context) {
        Resources resources = context.getResources();
        Long l9 = this.f14426a;
        return l9 == null ? resources.getString(R.string.mtrl_picker_date_header_unselected) : resources.getString(R.string.mtrl_picker_date_header_selected, DateStrings.d(l9.longValue(), Locale.getDefault()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeValue(this.f14426a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    @Override // com.google.android.material.datepicker.DateSelector
    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, final OnSelectionChangedListener onSelectionChangedListener) {
        String lowerCase;
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        Integer numD = MaterialColors.d(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (numD != null) {
            editText.setHintTextColor(numD.intValue());
        }
        String str = Build.MANUFACTURER;
        String lowerCase2 = BuildConfig.VERSION_NAME;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = BuildConfig.VERSION_NAME;
        }
        if (!lowerCase.equals("lge")) {
            if (str != null) {
                lowerCase2 = str.toLowerCase(Locale.ENGLISH);
            }
            if (lowerCase2.equals(PQgum.MKrXqBySjX)) {
                editText.setInputType(17);
            }
        } else {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatD = UtcDates.d();
        String strE = UtcDates.e(viewInflate.getResources(), simpleDateFormatD);
        textInputLayout.setPlaceholderText(strE);
        Long l9 = this.f14426a;
        if (l9 != null) {
            editText.setText(simpleDateFormatD.format(l9));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(strE, simpleDateFormatD, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void a() {
                textInputLayout.getError();
                Parcelable.Creator<SingleDateSelector> creator = SingleDateSelector.CREATOR;
                SingleDateSelector.this.getClass();
                onSelectionChangedListener.a();
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void b(Long l11) {
                SingleDateSelector singleDateSelector = SingleDateSelector.this;
                if (l11 == null) {
                    singleDateSelector.f14426a = null;
                } else {
                    singleDateSelector.f14426a = l11;
                }
                Parcelable.Creator<SingleDateSelector> creator = SingleDateSelector.CREATOR;
                singleDateSelector.getClass();
                onSelectionChangedListener.b(singleDateSelector.f14426a);
            }
        });
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewInflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return viewInflate;
        }
        DateSelector.o0(editText);
        return viewInflate;
    }
}
