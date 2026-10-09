package app.rive;

import app.rive.core.CommandQueue;
import com.google.api.Service;
import fz.c;
import java.util.List;
import qy.b0;
import vy.d;
import wy.a;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.Artboard$stateMachineNamesCache$2", f = "Artboard.kt", l = {Service.MONITORING_FIELD_NUMBER}, m = "invokeSuspend")
public final class Artboard$stateMachineNamesCache$2 extends i implements c {
    int label;
    final /* synthetic */ Artboard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard$stateMachineNamesCache$2(Artboard artboard, d<? super Artboard$stateMachineNamesCache$2> dVar) {
        super(1, dVar);
        this.this$0 = artboard;
    }

    @Override // xy.a
    public final d<b0> create(d<?> dVar) {
        return new Artboard$stateMachineNamesCache$2(this.this$0, dVar);
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
        CommandQueue commandQueue = this.this$0.commandQueue;
        long jM11getArtboardHandlenSTdbJo$kotlin_release = this.this$0.m11getArtboardHandlenSTdbJo$kotlin_release();
        this.label = 1;
        Object objM130getStateMachineNamesb88yb0A = commandQueue.m130getStateMachineNamesb88yb0A(jM11getArtboardHandlenSTdbJo$kotlin_release, this);
        return objM130getStateMachineNamesb88yb0A == aVar ? aVar : objM130getStateMachineNamesb88yb0A;
    }

    @Override // fz.c
    public final Object invoke(d<? super List<String>> dVar) {
        return ((Artboard$stateMachineNamesCache$2) create(dVar)).invokeSuspend(b0.f48488a);
    }
}
