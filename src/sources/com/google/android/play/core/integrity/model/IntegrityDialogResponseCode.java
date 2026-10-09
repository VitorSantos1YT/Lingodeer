package com.google.android.play.core.integrity.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface IntegrityDialogResponseCode {
    public static final int DIALOG_CANCELLED = 2;
    public static final int DIALOG_FAILED = 1;
    public static final int DIALOG_SUCCESSFUL = 3;
    public static final int DIALOG_UNAVAILABLE = 0;
}
