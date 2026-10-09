package com.yalantis.ucrop.callback;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface BitmapCropCallback {
    void onBitmapCropped(Uri uri, int i11, int i12, int i13, int i14);

    void onCropFailure(Throwable th2);
}
