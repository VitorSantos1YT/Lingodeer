package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.OSSLog;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ClientException extends Exception {
    private Boolean canceled;

    public ClientException() {
        this.canceled = Boolean.FALSE;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (getCause() == null) {
            return message;
        }
        return getCause().getMessage() + "\n" + message;
    }

    public Boolean isCanceledException() {
        return this.canceled;
    }

    public ClientException(String str) {
        super(a.e("[ErrorMessage]: ", str));
        this.canceled = Boolean.FALSE;
    }

    public ClientException(Throwable th2) {
        super(th2);
        this.canceled = Boolean.FALSE;
    }

    public ClientException(String str, Throwable th2) {
        this(str, th2, Boolean.FALSE);
    }

    public ClientException(String str, Throwable th2, Boolean bool) {
        super(a.e("[ErrorMessage]: ", str), th2);
        this.canceled = bool;
        OSSLog.logThrowable2Local(this);
    }
}
