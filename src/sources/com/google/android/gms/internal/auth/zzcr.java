package com.google.android.gms.internal.auth;

import android.net.Uri;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f9458a = new e(0);

    public static synchronized Uri a() {
        e eVar = f9458a;
        Uri uri = (Uri) eVar.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        eVar.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
