package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.io.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsd implements zzsx {
    public zzsd() {
        new zzsh();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream a(Uri uri) throws zzsi {
        File fileA = zzsc.a(uri);
        return new zzsl(new FileInputStream(fileA), fileA);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean b(Uri uri) {
        return zzsc.a(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File c(Uri uri) {
        return zzsc.a(uri);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream d(Uri uri) throws IOException {
        File fileA = zzsc.a(uri);
        Files.a(fileA);
        return new zzsm(new FileOutputStream(fileA), fileA);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void e(Uri uri) throws IOException {
        File fileA = zzsc.a(uri);
        if (fileA.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileA.delete()) {
            return;
        }
        if (!fileA.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void f(Uri uri, Uri uri2) throws IOException {
        File fileA = zzsc.a(uri);
        File fileA2 = zzsc.a(uri2);
        Files.a(fileA2);
        if (!fileA.renameTo(fileA2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "file";
    }
}
