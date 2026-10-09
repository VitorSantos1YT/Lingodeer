package app.rive.runtime.kotlin.core;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FileAsset$uniqueFilename$2 extends n implements fz.a {
    final /* synthetic */ FileAsset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAsset$uniqueFilename$2(FileAsset fileAsset) {
        super(0);
        this.this$0 = fileAsset;
    }

    @Override // fz.a
    public final String invoke() {
        FileAsset fileAsset = this.this$0;
        return fileAsset.cppUniqueFilename(fileAsset.getCppPointer());
    }
}
