package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.os.Bundle;
import com.google.android.material.dialog.InsetDialogOnTouchListener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(null);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, null));
    }
}
