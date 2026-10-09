package app.rive;

import fz.e;
import fz.f;
import kotlin.jvm.internal.n;
import l1.b3;
import l1.s;
import l1.t;
import qy.b0;
import uz.i1;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveUIView$compose$1$1 extends n implements e {
    final /* synthetic */ RiveUIView this$0;

    /* JADX INFO: renamed from: app.rive.RiveUIView$compose$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @xy.e(c = "app.rive.RiveUIView$compose$1$1$1", f = "RiveUIView.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements e {
        final /* synthetic */ b3 $fileState;
        int label;
        final /* synthetic */ RiveUIView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RiveUIView riveUIView, b3 b3Var, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = riveUIView;
            this.$fileState = b3Var;
        }

        @Override // xy.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$fileState, dVar);
        }

        @Override // xy.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            ((i1) this.this$0._fileFlow).k(this.$fileState.getValue());
            return b0.f48488a;
        }

        @Override // fz.e
        public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveUIView$compose$1$1(RiveUIView riveUIView) {
        super(2);
        this.this$0 = riveUIView;
    }

    @Override // fz.e
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((l1.n) obj, ((Number) obj2).intValue());
        return b0.f48488a;
    }

    public final void invoke(l1.n nVar, int i11) {
        if ((i11 & 11) == 2) {
            s sVar = (s) nVar;
            if (sVar.F()) {
                sVar.W();
                return;
            }
        }
        RiveFileSource fileSpec = this.this$0.getFileSpec();
        if (fileSpec != null) {
            b3 b3VarRememberRiveFile = RiveFileKt.rememberRiveFile(fileSpec, null, nVar, 0, 2);
            t.f(new AnonymousClass1(this.this$0, b3VarRememberRiveFile, null), b3VarRememberRiveFile.getValue(), nVar);
            Result result = (Result) b3VarRememberRiveFile.getValue();
            if (result instanceof Result.Loading) {
                s sVar2 = (s) nVar;
                sVar2.d0(-692423516);
                e loadingContent = this.this$0.getLoadingContent();
                if (loadingContent != null) {
                    loadingContent.invoke(nVar, 0);
                }
                sVar2.p(false);
                return;
            }
            if (result instanceof Result.Error) {
                s sVar3 = (s) nVar;
                sVar3.d0(-692421489);
                f errorContent = this.this$0.getErrorContent();
                if (errorContent != null) {
                    errorContent.invoke(new Throwable(), nVar, 8);
                }
                sVar3.p(false);
                return;
            }
            if (!(result instanceof Result.Success)) {
                s sVar4 = (s) nVar;
                sVar4.d0(10274662);
                sVar4.p(false);
            } else {
                s sVar5 = (s) nVar;
                sVar5.d0(9863757);
                Result.Success success = (Result.Success) result;
                RiveUIKt.RiveUI((RiveFile) success.getValue(), null, ArtboardKt.rememberArtboard((RiveFile) success.getValue(), this.this$0.getArtboardName(), nVar, 0, 0), this.this$0.getStateMachineName(), null, this.this$0.getFit(), this.this$0.getAlignment(), 0, nVar, 512, 146);
                sVar5.p(false);
            }
        }
    }
}
