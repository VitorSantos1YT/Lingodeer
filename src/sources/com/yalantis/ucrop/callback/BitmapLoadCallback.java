package com.yalantis.ucrop.callback;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yalantis.ucrop.model.ExifInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface BitmapLoadCallback {
    void onBitmapLoaded(Bitmap bitmap, ExifInfo exifInfo, Uri uri, Uri uri2);

    void onFailure(Exception exc);
}
