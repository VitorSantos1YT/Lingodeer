package com.facebook;

import app.rive.runtime.kotlin.b;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Random;
import lf.a0;
import lf.x;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7717a = 0;
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? BuildConfig.VERSION_NAME : message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !s.f49215p.get() || random.nextInt(100) <= 50) {
            return;
        }
        a0.a(new b(str, 7), x.ErrorReport);
    }
}
