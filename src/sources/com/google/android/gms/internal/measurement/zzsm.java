package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsm extends zzso implements zzsf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f11952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f11953b;

    public zzsm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f11952a = fileOutputStream;
        this.f11953b = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.f11953b;
    }
}
