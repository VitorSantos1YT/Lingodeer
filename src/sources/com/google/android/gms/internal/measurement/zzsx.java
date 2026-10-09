package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.e;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface zzsx {
    default InputStream a(Uri uri) throws zzsk {
        throw new zzsk("openForRead not supported by ".concat(zzc()));
    }

    default boolean b(Uri uri) throws zzsk {
        throw new zzsk("exists not supported by ".concat(zzc()));
    }

    default File c(Uri uri) throws zzsk {
        String strZzc = zzc();
        String strValueOf = String.valueOf(uri);
        throw new zzsk(e.p(new StringBuilder(strZzc.length() + 28 + strValueOf.length()), "Cannot convert uri to file ", strZzc, " ", strValueOf));
    }

    default OutputStream d(Uri uri) throws zzsk {
        throw new zzsk("openForWrite not supported by ".concat(zzc()));
    }

    default void e(Uri uri) throws zzsk {
        throw new zzsk("deleteFile not supported by ".concat(zzc()));
    }

    default void f(Uri uri, Uri uri2) throws zzsk {
        throw new zzsk("rename not supported by ".concat(zzc()));
    }

    String zzc();
}
