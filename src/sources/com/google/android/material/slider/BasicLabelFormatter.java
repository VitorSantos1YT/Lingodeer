package com.google.android.material.slider;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    @Override // com.google.android.material.slider.LabelFormatter
    public final String a(float f5) {
        if (f5 >= 1.0E12f) {
            return String.format(Locale.US, "%.1fT", Float.valueOf(f5 / 1.0E12f));
        }
        if (f5 >= 1.0E9f) {
            return String.format(Locale.US, "%.1fB", Float.valueOf(f5 / 1.0E9f));
        }
        if (f5 >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", Float.valueOf(f5 / 1000000.0f));
        }
        return f5 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f5 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f5));
    }
}
