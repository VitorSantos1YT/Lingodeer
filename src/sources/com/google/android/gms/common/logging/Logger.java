package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fa.EQx.nuRcCS;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9048c;

    public Logger(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = BuildConfig.VERSION_NAME;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append(nuRcCS.uhmGLOBezEI);
            string = sb2.toString();
        }
        this.f9047b = string;
        this.f9046a = str;
        new GmsLogger(str, null);
        int i11 = 2;
        while (i11 <= 7 && !Log.isLoggable(this.f9046a, i11)) {
            i11++;
        }
        this.f9048c = i11;
    }

    public final void a(String str, Object... objArr) {
        if (this.f9048c <= 3) {
            b(str, objArr);
        }
    }

    public final String b(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f9047b.concat(str);
    }

    public final void c(String str, Object... objArr) {
        if (this.f9048c <= 2) {
            b(str, objArr);
        }
    }
}
