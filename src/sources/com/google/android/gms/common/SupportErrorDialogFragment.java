package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SupportErrorDialogFragment extends y {
    public Dialog S;
    public DialogInterface.OnCancelListener T;
    public AlertDialog U;

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.T;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        Dialog dialog = this.S;
        if (dialog != null) {
            return dialog;
        }
        this.H = false;
        if (this.U == null) {
            Context context = getContext();
            Preconditions.g(context);
            this.U = new AlertDialog.Builder(context).create();
        }
        return this.U;
    }
}
