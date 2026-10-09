package com.google.common.base;

import android.util.Base64;
import f7.j;
import g7.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16417a;

    public /* synthetic */ a(int i11) {
        this.f16417a = i11;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f16417a) {
            case 0:
                throw new IllegalStateException();
            case 1:
                return new j();
            case 2:
                byte[] bArr = new byte[12];
                h.f28819i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e8) {
                    throw new IllegalStateException(e8);
                }
        }
    }
}
