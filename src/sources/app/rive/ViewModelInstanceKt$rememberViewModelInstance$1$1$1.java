package app.rive;

import app.rive.core.FileHandle;
import app.rive.core.ViewModelInstanceHandle;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInstanceKt$rememberViewModelInstance$1$1$1 extends n implements a {
    final /* synthetic */ RiveFile $file;
    final /* synthetic */ ViewModelInstance $instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstanceKt$rememberViewModelInstance$1$1$1(ViewModelInstance viewModelInstance, RiveFile riveFile) {
        super(0);
        this.$instance = viewModelInstance;
        this.$file = riveFile;
    }

    @Override // fz.a
    public final String invoke() {
        return "Deleting " + ((Object) ViewModelInstanceHandle.m198toStringimpl(this.$instance.m43getInstanceHandleVPLto4w$kotlin_release())) + " (" + ((Object) FileHandle.m166toStringimpl(this.$file.m22getFileHandleENT3xMk$kotlin_release())) + ')';
    }
}
