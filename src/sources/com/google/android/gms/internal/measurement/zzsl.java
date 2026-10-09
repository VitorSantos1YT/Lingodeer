package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsl extends zzsn implements zzsf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f11951a;

    public zzsl(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f11951a = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.f11951a;
    }
}
