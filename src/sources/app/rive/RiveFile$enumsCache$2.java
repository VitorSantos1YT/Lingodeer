package app.rive;

import app.rive.core.CommandQueue;
import app.rive.runtime.kotlin.core.File;
import fz.c;
import java.util.List;
import l0.Eeqr.HOBXIlHxIkMBEA;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.RiveFile$enumsCache$2", f = "RiveFile.kt", l = {84}, m = "invokeSuspend")
public final class RiveFile$enumsCache$2 extends i implements c {
    int label;
    final /* synthetic */ RiveFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$enumsCache$2(RiveFile riveFile, d<? super RiveFile$enumsCache$2> dVar) {
        super(1, dVar);
        this.this$0 = riveFile;
    }

    @Override // xy.a
    public final d<b0> create(d<?> dVar) {
        return new RiveFile$enumsCache$2(this.this$0, dVar);
    }

    @Override // fz.c
    public final Object invoke(d<? super List<File.Enum>> dVar) {
        return ((RiveFile$enumsCache$2) create(dVar)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException(HOBXIlHxIkMBEA.HtdfD);
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        CommandQueue commandQueue$kotlin_release = this.this$0.getCommandQueue$kotlin_release();
        long jM22getFileHandleENT3xMk$kotlin_release = this.this$0.m22getFileHandleENT3xMk$kotlin_release();
        this.label = 1;
        Object objM128getEnumsevklBmw = commandQueue$kotlin_release.m128getEnumsevklBmw(jM22getFileHandleENT3xMk$kotlin_release, this);
        return objM128getEnumsevklBmw == aVar ? aVar : objM128getEnumsevklBmw;
    }
}
