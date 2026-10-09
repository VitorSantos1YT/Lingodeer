package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfw {
    private final WebView zza;
    private final b0 zzb;

    public zzfw(WebView webView, b0 b0Var) {
        this.zza = webView;
        this.zzb = b0Var;
    }

    public final void zzb(String str, String... strArr) {
        e0.B(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
