package com.google.android.gms.internal.fido;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzak f9640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzak f9641c;

    public /* synthetic */ zzam(String str) {
        zzak zzakVar = new zzak();
        this.f9640b = zzakVar;
        this.f9641c = zzakVar;
        this.f9639a = str;
    }

    public final void a(int i11) {
        String strValueOf = String.valueOf(i11);
        zzai zzaiVar = new zzai();
        this.f9641c.f9638c = zzaiVar;
        this.f9641c = zzaiVar;
        zzaiVar.f9637b = strValueOf;
        zzaiVar.f9636a = "errorCode";
    }

    public final void b(Object obj, String str) {
        zzak zzakVar = new zzak();
        this.f9641c.f9638c = zzakVar;
        this.f9641c = zzakVar;
        zzakVar.f9637b = obj;
        zzakVar.f9636a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f9639a);
        sb2.append('{');
        zzak zzakVar = this.f9640b.f9638c;
        String str = BuildConfig.VERSION_NAME;
        while (zzakVar != null) {
            Object obj = zzakVar.f9637b;
            sb2.append(str);
            String str2 = zzakVar.f9636a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzakVar = zzakVar.f9638c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
