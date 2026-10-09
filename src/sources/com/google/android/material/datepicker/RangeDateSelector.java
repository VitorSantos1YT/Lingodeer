package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.adjust.sdk.Constants;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RangeDateSelector implements DateSelector<y4.b> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f14422b = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f14423c = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public final RangeDateSelector[] newArray(int i11) {
            return new RangeDateSelector[i11];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f14422b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f14423c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f14424d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f14425e = null;

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l9 = rangeDateSelector.f14424d;
        if (l9 == null || rangeDateSelector.f14425e == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f14421a.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            onSelectionChangedListener.a();
        } else if (l9.longValue() <= rangeDateSelector.f14425e.longValue()) {
            Long l11 = rangeDateSelector.f14424d;
            rangeDateSelector.f14422b = l11;
            Long l12 = rangeDateSelector.f14425e;
            rangeDateSelector.f14423c = l12;
            onSelectionChangedListener.b(new y4.b(l11, l12));
        } else {
            textInputLayout.setError(rangeDateSelector.f14421a);
            textInputLayout2.setError(" ");
            onSelectionChangedListener.a();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            textInputLayout.getError();
        } else {
            if (TextUtils.isEmpty(textInputLayout2.getError())) {
                return;
            }
            textInputLayout2.getError();
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList A() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new y4.b(this.f14422b, this.f14423c));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String C0(Context context) {
        Resources resources = context.getResources();
        y4.b bVarA = DateStrings.a(this.f14422b, this.f14423c);
        Object obj = bVarA.f57088a;
        String string = obj == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj;
        Object obj2 = bVarA.f57089b;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, obj2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : (String) obj2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int I0(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.d(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, context, MaterialDatePicker.class.getCanonicalName()).data;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean P0() {
        Long l9 = this.f14422b;
        return (l9 == null || this.f14423c == null || l9.longValue() > this.f14423c.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final ArrayList V0() {
        ArrayList arrayList = new ArrayList();
        Long l9 = this.f14422b;
        if (l9 != null) {
            arrayList.add(l9);
        }
        Long l11 = this.f14423c;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Object a1() {
        return new y4.b(this.f14422b, this.f14423c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    @Override // com.google.android.material.datepicker.DateSelector
    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, final OnSelectionChangedListener onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        Integer numD = MaterialColors.d(viewInflate.getContext(), R.attr.colorOnSurfaceVariant);
        if (numD != null) {
            editText.setHintTextColor(numD.intValue());
            editText2.setHintTextColor(numD.intValue());
        }
        String str = Build.MANUFACTURER;
        String lowerCase = BuildConfig.VERSION_NAME;
        if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.VERSION_NAME).equals("lge")) {
            editText.setInputType(17);
            editText2.setInputType(17);
        } else {
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ENGLISH);
            }
            if (lowerCase.equals(Constants.REFERRER_API_SAMSUNG)) {
                editText.setInputType(17);
                editText2.setInputType(17);
            }
        }
        this.f14421a = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatD = UtcDates.d();
        Long l9 = this.f14422b;
        if (l9 != null) {
            editText.setText(simpleDateFormatD.format(l9));
            this.f14424d = this.f14422b;
        }
        Long l11 = this.f14423c;
        if (l11 != null) {
            editText2.setText(simpleDateFormatD.format(l11));
            this.f14425e = this.f14423c;
        }
        String strE = UtcDates.e(viewInflate.getResources(), simpleDateFormatD);
        textInputLayout.setPlaceholderText(strE);
        textInputLayout2.setPlaceholderText(strE);
        editText.addTextChangedListener(new DateFormatTextWatcher(strE, simpleDateFormatD, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void a() {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f14424d = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void b(Long l12) {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f14424d = l12;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(strE, simpleDateFormatD, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void a() {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f14425e = null;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public final void b(Long l12) {
                RangeDateSelector rangeDateSelector = RangeDateSelector.this;
                rangeDateSelector.f14425e = l12;
                RangeDateSelector.a(rangeDateSelector, textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        AccessibilityManager accessibilityManager = (AccessibilityManager) viewInflate.getContext().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return viewInflate;
        }
        DateSelector.o0(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void q1(long j11) {
        Long l9 = this.f14422b;
        if (l9 == null) {
            this.f14422b = Long.valueOf(j11);
        } else if (this.f14423c == null && l9.longValue() <= j11) {
            this.f14423c = Long.valueOf(j11);
        } else {
            this.f14423c = null;
            this.f14422b = Long.valueOf(j11);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String v(Context context) {
        Resources resources = context.getResources();
        Long l9 = this.f14422b;
        if (l9 == null && this.f14423c == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l11 = this.f14423c;
        if (l11 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, DateStrings.b(l9.longValue()));
        }
        if (l9 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, DateStrings.b(l11.longValue()));
        }
        y4.b bVarA = DateStrings.a(l9, l11);
        return resources.getString(R.string.mtrl_picker_range_header_selected, bVarA.f57088a, bVarA.f57089b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeValue(this.f14422b);
        parcel.writeValue(this.f14423c);
    }
}
