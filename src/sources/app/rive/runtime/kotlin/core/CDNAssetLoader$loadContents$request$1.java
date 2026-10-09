package app.rive.runtime.kotlin.core;

import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CDNAssetLoader$loadContents$request$1 extends n implements c {
    final /* synthetic */ FileAsset $asset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNAssetLoader$loadContents$request$1(FileAsset fileAsset) {
        super(1);
        this.$asset = fileAsset;
    }

    @Override // fz.c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((byte[]) obj);
        return b0.f48488a;
    }

    public final void invoke(byte[] bytes) {
        m.f(bytes, "bytes");
        this.$asset.decode(bytes);
    }
}
