package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7656a;

    public /* synthetic */ g(int i11) {
        this.f7656a = i11;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f7656a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        switch (this.f7656a) {
            case 0:
                return new h(obj);
            case 1:
                return new h((ParcelFileDescriptor) obj);
            default:
                return new ce.i(1, (ByteBuffer) obj);
        }
    }
}
