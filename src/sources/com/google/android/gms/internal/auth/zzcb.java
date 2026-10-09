package com.google.android.gms.internal.auth;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f9457a;

    static {
        Uri.parse("content://com.google.android.gsf.gservices");
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
        f9457a = new AtomicBoolean();
        new HashMap(16, 1.0f);
        new HashMap(16, 1.0f);
        new HashMap(16, 1.0f);
        new HashMap(16, 1.0f);
    }
}
