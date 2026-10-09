package app.rive;

import app.rive.core.CommandQueue;
import fz.c;
import java.util.List;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.RiveFile$viewModelNamesCache$2", f = "RiveFile.kt", l = {48}, m = "invokeSuspend")
public final class RiveFile$viewModelNamesCache$2 extends i implements c {
    int label;
    final /* synthetic */ RiveFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$viewModelNamesCache$2(RiveFile riveFile, d<? super RiveFile$viewModelNamesCache$2> dVar) {
        super(1, dVar);
        this.this$0 = riveFile;
    }

    @Override // xy.a
    public final d<b0> create(d<?> dVar) {
        return new RiveFile$viewModelNamesCache$2(this.this$0, dVar);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        CommandQueue commandQueue$kotlin_release = this.this$0.getCommandQueue$kotlin_release();
        long jM22getFileHandleENT3xMk$kotlin_release = this.this$0.m22getFileHandleENT3xMk$kotlin_release();
        this.label = 1;
        Object objM133getViewModelNamesevklBmw = commandQueue$kotlin_release.m133getViewModelNamesevklBmw(jM22getFileHandleENT3xMk$kotlin_release, this);
        return objM133getViewModelNamesevklBmw == aVar ? aVar : objM133getViewModelNamesevklBmw;
    }

    @Override // fz.c
    public final Object invoke(d<? super List<String>> dVar) {
        return ((RiveFile$viewModelNamesCache$2) create(dVar)).invokeSuspend(b0.f48488a);
    }
}
