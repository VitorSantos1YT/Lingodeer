package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MaxInputValidator implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15795a;

    public MaxInputValidator(int i11) {
        this.f15795a = i11;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i13, i14, charSequence.subSequence(i11, i12).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f15795a) {
                return null;
            }
            return BuildConfig.VERSION_NAME;
        } catch (NumberFormatException unused) {
            return BuildConfig.VERSION_NAME;
        }
    }
}
