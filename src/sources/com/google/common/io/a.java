package com.google.common.io;

import java.io.IOException;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Closer.Suppressor, TempFileCreator.JavaNioCreator.PermissionSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17462a;

    public /* synthetic */ a(int i11) {
        this.f17462a = i11;
    }

    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
    public FileAttribute get() throws IOException {
        switch (this.f17462a) {
            case 1:
                return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
            default:
                TempFileCreator.JavaNioCreator.c();
                throw null;
        }
    }
}
