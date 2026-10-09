package app.rive;

import a.ar.MFeWs;
import app.rive.core.CommandQueue;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveFileKt$rememberRiveFile$1$release$1 extends n implements a {
    final /* synthetic */ CommandQueue $commandQueue;
    final /* synthetic */ String $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileKt$rememberRiveFile$1$release$1(String str, CommandQueue commandQueue) {
        super(0);
        this.$label = str;
        this.$commandQueue = commandQueue;
    }

    @Override // fz.a
    public final String invoke() {
        return MFeWs.HSluNCDbq + this.$label + ") (ref before: " + this.$commandQueue.getRefCount$kotlin_release() + ')';
    }
}
