package com.google.android.recaptcha.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzpx {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.VERSION_NAME),
    BYTE_STRING(zzle.zzb),
    ENUM(null),
    MESSAGE(null);

    zzpx(Object obj) {
    }
}
