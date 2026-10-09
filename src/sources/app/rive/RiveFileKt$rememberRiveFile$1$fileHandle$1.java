package app.rive;

import android.content.Context;
import app.rive.core.CommandQueue;
import app.rive.core.FileHandle;
import java.io.InputStream;
import kotlin.jvm.internal.m;
import ns.o;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.RiveFileKt$rememberRiveFile$1$fileHandle$1", f = "RiveFile.kt", l = {145}, m = "invokeSuspend")
public final class RiveFileKt$rememberRiveFile$1$fileHandle$1 extends i implements fz.e {
    final /* synthetic */ CommandQueue $commandQueue;
    final /* synthetic */ Context $context;
    final /* synthetic */ RiveFileSource $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileKt$rememberRiveFile$1$fileHandle$1(Context context, RiveFileSource riveFileSource, CommandQueue commandQueue, d<? super RiveFileKt$rememberRiveFile$1$fileHandle$1> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$source = riveFileSource;
        this.$commandQueue = commandQueue;
    }

    @Override // xy.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new RiveFileKt$rememberRiveFile$1$fileHandle$1(this.$context, this.$source, this.$commandQueue, dVar);
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
        InputStream inputStreamOpenRawResource = this.$context.getResources().openRawResource(((RiveFileSource.RawRes) this.$source).m37unboximpl());
        try {
            m.c(inputStreamOpenRawResource);
            byte[] bArrT = md.a.t(inputStreamOpenRawResource);
            o.m(inputStreamOpenRawResource, null);
            CommandQueue commandQueue = this.$commandQueue;
            this.label = 1;
            Object objM135loadFilexVnc2tA = commandQueue.m135loadFilexVnc2tA(bArrT, this);
            return objM135loadFilexVnc2tA == aVar ? aVar : objM135loadFilexVnc2tA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(inputStreamOpenRawResource, th2);
                throw th3;
            }
        }
    }

    @Override // fz.e
    public final Object invoke(rz.b0 b0Var, d<? super FileHandle> dVar) {
        return ((RiveFileKt$rememberRiveFile$1$fileHandle$1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
    }
}
