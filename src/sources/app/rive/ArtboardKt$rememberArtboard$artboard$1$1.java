package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.FileHandle;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ArtboardKt$rememberArtboard$artboard$1$1 extends n implements a {
    final /* synthetic */ String $artboardName;
    final /* synthetic */ RiveFile $file;
    final /* synthetic */ long $handle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtboardKt$rememberArtboard$artboard$1$1(long j11, String str, RiveFile riveFile) {
        super(0);
        this.$handle = j11;
        this.$artboardName = str;
        this.$file = riveFile;
    }

    @Override // fz.a
    public final String invoke() {
        return "Created " + ((Object) ArtboardHandle.m94toStringimpl(this.$handle)) + MzwEyWCkjXL.diPFrDxuVMGy + this.$artboardName + " (" + ((Object) FileHandle.m166toStringimpl(this.$file.m22getFileHandleENT3xMk$kotlin_release())) + ')';
    }
}
