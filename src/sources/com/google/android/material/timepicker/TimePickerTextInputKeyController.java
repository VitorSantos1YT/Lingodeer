package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChipTextInputComboView f15812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChipTextInputComboView f15813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeModel f15814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15815d = false;

    public TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f15812a = chipTextInputComboView;
        this.f15813b = chipTextInputComboView2;
        this.f15814c = timeModel;
    }

    public final void a(int i11) {
        this.f15813b.setChecked(i11 == 12);
        this.f15812a.setChecked(i11 == 10);
        this.f15814c.f15801f = i11;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
        boolean z11 = i11 == 5;
        if (z11) {
            a(12);
        }
        return z11;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (this.f15815d) {
            return false;
        }
        boolean z11 = true;
        this.f15815d = true;
        EditText editText = (EditText) view;
        if (this.f15814c.f15801f != 12) {
            Editable text = editText.getText();
            if (text == null) {
                z11 = false;
            } else if (i11 >= 7 && i11 <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                a(12);
            } else {
                if (i11 >= 7 && i11 <= 16 && editText.getSelectionStart() == 0 && editText.length() == 2) {
                    editText.getText().clear();
                }
                z11 = false;
            }
        } else if (i11 == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            a(10);
        } else {
            if (i11 >= 7 && i11 <= 16 && editText.getSelectionStart() == 0 && editText.length() == 2) {
                editText.getText().clear();
            }
            z11 = false;
        }
        this.f15815d = false;
        return z11;
    }
}
