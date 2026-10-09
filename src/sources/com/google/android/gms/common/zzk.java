package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzk extends zzj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f9152c;

    public zzk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f9152c = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] h() {
        return this.f9152c;
    }
}
