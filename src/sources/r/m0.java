package r;

import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i11, int i12, int i13, int i14) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
    }

    public static void c(TextView textView, int[] iArr, int i11) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
