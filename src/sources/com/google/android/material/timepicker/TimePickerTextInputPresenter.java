package com.google.android.material.timepicker;

import a5.g;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.lingodeer.R;
import java.util.Arrays;
import java.util.Locale;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    public final EditText H;
    public final MaterialButtonToggleGroup K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f15816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeModel f15817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextWatcher f15818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextWatcher f15819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ChipTextInputComboView f15820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ChipTextInputComboView f15821f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EditText f15822t;

    public TimePickerTextInputPresenter(LinearLayout linearLayout, final TimeModel timeModel) {
        TextWatcherAdapter textWatcherAdapter = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                TimeModel timeModel2 = TimePickerTextInputPresenter.this.f15817b;
                try {
                    if (TextUtils.isEmpty(editable)) {
                        timeModel2.f15800e = 0;
                    } else {
                        timeModel2.f15800e = Integer.parseInt(editable.toString()) % 60;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.f15818c = textWatcherAdapter;
        TextWatcherAdapter textWatcherAdapter2 = new TextWatcherAdapter() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.2
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(editable);
                    TimePickerTextInputPresenter timePickerTextInputPresenter = TimePickerTextInputPresenter.this;
                    if (zIsEmpty) {
                        timePickerTextInputPresenter.f15817b.c(0);
                    } else {
                        timePickerTextInputPresenter.f15817b.c(Integer.parseInt(editable.toString()));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        };
        this.f15819d = textWatcherAdapter2;
        this.f15816a = linearLayout;
        this.f15817b = timeModel;
        final Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f15820e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f15821f = chipTextInputComboView2;
        View viewFindViewById = chipTextInputComboView.findViewById(R.id.material_label);
        TextInputLayout textInputLayout = chipTextInputComboView.f15750b;
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = chipTextInputComboView2.findViewById(R.id.material_label);
        TextInputLayout textInputLayout2 = chipTextInputComboView2.f15750b;
        TextView textView2 = (TextView) viewFindViewById2;
        final int i11 = R.string.material_timepicker_minute;
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView.setImportantForAccessibility(2);
        final int i12 = R.string.material_timepicker_hour;
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        textView2.setImportantForAccessibility(2);
        chipTextInputComboView.setTag(R.id.selection_type, 12);
        chipTextInputComboView2.setTag(R.id.selection_type, 10);
        if (timeModel.f15798c == 0) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) linearLayout.findViewById(R.id.material_clock_period_toggle);
            this.K = materialButtonToggleGroup;
            materialButtonToggleGroup.N.add(new c(this, 0));
            this.K.setVisibility(0);
            f();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimePickerTextInputPresenter.this.b(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        MaxInputValidator maxInputValidator = timeModel.f15797b;
        EditText editText = chipTextInputComboView2.f15751c;
        InputFilter[] filters = editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = maxInputValidator;
        editText.setFilters(inputFilterArr);
        MaxInputValidator maxInputValidator2 = timeModel.f15796a;
        EditText editText2 = chipTextInputComboView.f15751c;
        InputFilter[] filters2 = editText2.getFilters();
        InputFilter[] inputFilterArr2 = (InputFilter[]) Arrays.copyOf(filters2, filters2.length + 1);
        inputFilterArr2[filters2.length] = maxInputValidator2;
        editText2.setFilters(inputFilterArr2);
        EditText editText3 = textInputLayout2.getEditText();
        this.f15822t = editText3;
        final Resources resources2 = linearLayout.getResources();
        editText3.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.6
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(resources2.getString(i12));
            }
        });
        EditText editText4 = textInputLayout.getEditText();
        this.H = editText4;
        final Resources resources3 = linearLayout.getResources();
        editText4.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.6
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setText(resources3.getString(i11));
            }
        });
        TimePickerTextInputKeyController timePickerTextInputKeyController = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        s0.q(chipTextInputComboView2.f15749a, new ClickActionDelegate(linearLayout.getContext()) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.4
            @Override // com.google.android.material.timepicker.ClickActionDelegate, z4.b
            public final void d(View view, g gVar) {
                super.d(view, gVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(resources.getString(R.string.material_timepicker_hour));
                sb2.append(" ");
                Resources resources4 = view.getResources();
                TimeModel timeModel2 = timeModel;
                sb2.append(resources4.getString(timeModel2.f15798c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(timeModel2.b())));
                gVar.p(sb2.toString());
            }
        });
        s0.q(chipTextInputComboView.f15749a, new ClickActionDelegate(linearLayout.getContext()) { // from class: com.google.android.material.timepicker.TimePickerTextInputPresenter.5
            @Override // com.google.android.material.timepicker.ClickActionDelegate, z4.b
            public final void d(View view, g gVar) {
                super.d(view, gVar);
                gVar.p(resources.getString(R.string.material_timepicker_minute) + " " + view.getResources().getString(R.string.material_minute_suffix, String.valueOf(timeModel.f15800e)));
            }
        });
        editText3.addTextChangedListener(textWatcherAdapter2);
        editText4.addTextChangedListener(textWatcherAdapter);
        e(timeModel);
        EditText editText5 = textInputLayout2.getEditText();
        EditText editText6 = textInputLayout.getEditText();
        editText5.setImeOptions(268435461);
        editText6.setImeOptions(268435462);
        editText5.setOnEditorActionListener(timePickerTextInputKeyController);
        editText5.setOnKeyListener(timePickerTextInputKeyController);
        editText6.setOnKeyListener(timePickerTextInputKeyController);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void a() {
        this.f15816a.setVisibility(0);
        b(this.f15817b.f15801f);
    }

    public final void b(int i11) {
        this.f15817b.f15801f = i11;
        this.f15820e.setChecked(i11 == 12);
        this.f15821f.setChecked(i11 == 10);
        f();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void c() {
        LinearLayout linearLayout = this.f15816a;
        View focusedChild = linearLayout.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.f(focusedChild, false);
        }
        linearLayout.setVisibility(8);
    }

    public final void d() {
        TimeModel timeModel = this.f15817b;
        this.f15820e.setChecked(timeModel.f15801f == 12);
        this.f15821f.setChecked(timeModel.f15801f == 10);
    }

    public final void e(TimeModel timeModel) {
        EditText editText = this.f15822t;
        TextWatcher textWatcher = this.f15819d;
        editText.removeTextChangedListener(textWatcher);
        EditText editText2 = this.H;
        TextWatcher textWatcher2 = this.f15818c;
        editText2.removeTextChangedListener(textWatcher2);
        Locale locale = this.f15816a.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.f15800e));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.b()));
        ChipTextInputComboView chipTextInputComboView = this.f15820e;
        TextWatcher textWatcher3 = chipTextInputComboView.f15752d;
        EditText editText3 = chipTextInputComboView.f15751c;
        String strA = TimeModel.a(chipTextInputComboView.getResources(), str, "%02d");
        chipTextInputComboView.f15749a.setText(strA);
        if (!TextUtils.isEmpty(strA)) {
            editText3.removeTextChangedListener(textWatcher3);
            editText3.setText(strA);
            editText3.addTextChangedListener(textWatcher3);
        }
        ChipTextInputComboView chipTextInputComboView2 = this.f15821f;
        TextWatcher textWatcher4 = chipTextInputComboView2.f15752d;
        EditText editText4 = chipTextInputComboView2.f15751c;
        String strA2 = TimeModel.a(chipTextInputComboView2.getResources(), str2, "%02d");
        chipTextInputComboView2.f15749a.setText(strA2);
        if (!TextUtils.isEmpty(strA2)) {
            editText4.removeTextChangedListener(textWatcher4);
            editText4.setText(strA2);
            editText4.addTextChangedListener(textWatcher4);
        }
        editText.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher2);
        f();
    }

    public final void f() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.K;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.f(this.f15817b.f15802t == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public final void invalidate() {
        e(this.f15817b);
    }
}
