package com.facebook;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookDialogException extends FacebookException {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7716c;

    public FacebookDialogException(String str, int i11, String str2) {
        super(str);
        this.f7715b = i11;
        this.f7716c = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f7715b + ", message: " + getMessage() + ", url: " + this.f7716c + "}";
        m.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
