package app.rive;

import app.rive.core.FileHandle;
import app.rive.core.ViewModelInstanceHandle;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInstanceKt$rememberViewModelInstance$instance$1$1 extends n implements a {
    final /* synthetic */ RiveFile $file;
    final /* synthetic */ long $handle;
    final /* synthetic */ ViewModelInstanceSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstanceKt$rememberViewModelInstance$instance$1$1(long j11, ViewModelInstanceSource viewModelInstanceSource, RiveFile riveFile) {
        super(0);
        this.$handle = j11;
        this.$source = viewModelInstanceSource;
        this.$file = riveFile;
    }

    @Override // fz.a
    public final String invoke() {
        return "Created " + ((Object) ViewModelInstanceHandle.m198toStringimpl(this.$handle)) + " from source: " + this.$source + " (" + ((Object) FileHandle.m166toStringimpl(this.$file.m22getFileHandleENT3xMk$kotlin_release())) + ')';
    }
}
