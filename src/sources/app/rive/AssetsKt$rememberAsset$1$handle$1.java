package app.rive;

import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AssetsKt$rememberAsset$1$handle$1 extends n implements a {
    final /* synthetic */ String $assetLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsKt$rememberAsset$1$handle$1(String str) {
        super(0);
        this.$assetLabel = str;
    }

    @Override // fz.a
    public final String invoke() {
        return "Decoding " + this.$assetLabel;
    }
}
