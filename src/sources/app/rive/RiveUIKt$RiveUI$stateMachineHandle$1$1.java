package app.rive;

import app.rive.core.ArtboardHandle;
import app.rive.core.FileHandle;
import app.rive.core.StateMachineHandle;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIKt$RiveUI$stateMachineHandle$1$1 extends n implements a {
    final /* synthetic */ long $artboardHandle;
    final /* synthetic */ RiveFile $file;
    final /* synthetic */ long $handle;
    final /* synthetic */ String $stateMachineName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIKt$RiveUI$stateMachineHandle$1$1(long j11, String str, long j12, RiveFile riveFile) {
        super(0);
        this.$handle = j11;
        this.$stateMachineName = str;
        this.$artboardHandle = j12;
        this.$file = riveFile;
    }

    @Override // fz.a
    public final String invoke() {
        return "Created " + ((Object) StateMachineHandle.m191toStringimpl(this.$handle)) + " with name " + this.$stateMachineName + " (" + ((Object) ArtboardHandle.m94toStringimpl(this.$artboardHandle)) + "; " + ((Object) FileHandle.m166toStringimpl(this.$file.m22getFileHandleENT3xMk$kotlin_release())) + ')';
    }
}
