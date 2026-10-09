package app.rive;

import app.rive.core.CommandQueue;
import fz.c;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import l1.c0;
import l1.g;
import l1.i0;
import l1.j0;
import l1.s;
import l1.t;
import rz.b0;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInstanceKt {

    /* JADX INFO: renamed from: app.rive.ViewModelInstanceKt$rememberViewModelInstance$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass1 extends n implements c {
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ RiveFile $file;
        final /* synthetic */ ViewModelInstance $instance;
        final /* synthetic */ b0 $instanceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, ViewModelInstance viewModelInstance, b0 b0Var, RiveFile riveFile) {
            super(1);
            this.$commandQueue = commandQueue;
            this.$instance = viewModelInstance;
            this.$instanceScope = b0Var;
            this.$file = riveFile;
        }

        @Override // fz.c
        public final i0 invoke(j0 DisposableEffect) {
            m.f(DisposableEffect, "$this$DisposableEffect");
            final CommandQueue commandQueue = this.$commandQueue;
            final ViewModelInstance viewModelInstance = this.$instance;
            final b0 b0Var = this.$instanceScope;
            final RiveFile riveFile = this.$file;
            return new i0() { // from class: app.rive.ViewModelInstanceKt$rememberViewModelInstance$1$invoke$$inlined$onDispose$1
                @Override // l1.i0
                public void dispose() {
                    RiveLog.INSTANCE.getLogger().d(RiveUIKt.VM_INSTANCE_TAG, new ViewModelInstanceKt$rememberViewModelInstance$1$1$1(viewModelInstance, riveFile));
                    commandQueue.m121deleteViewModelInstancemBajs_U(viewModelInstance.m43getInstanceHandleVPLto4w$kotlin_release());
                    e0.i(b0Var, null);
                }
            };
        }
    }

    public static final ViewModelInstance rememberViewModelInstance(RiveFile file, ViewModelInstanceSource source, l1.n nVar, int i11) {
        m.f(file, "file");
        m.f(source, "source");
        s sVar = (s) nVar;
        sVar.d0(-2097877121);
        CommandQueue commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            c0 c0Var = new c0(t.q(sVar));
            sVar.o0(c0Var);
            objQ = c0Var;
        }
        b0 b0Var = ((c0) objQ).f39245a;
        sVar.d0(-1220639964);
        boolean z11 = true;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && sVar.f(file)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !sVar.f(source)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objQ2 = sVar.Q();
        if (z13 || objQ2 == gVar) {
            long jM111createViewModelInstancej73Dd8U = commandQueue$kotlin_release.m111createViewModelInstancej73Dd8U(file.m22getFileHandleENT3xMk$kotlin_release(), source);
            RiveLog.INSTANCE.getLogger().d(RiveUIKt.VM_INSTANCE_TAG, new ViewModelInstanceKt$rememberViewModelInstance$instance$1$1(jM111createViewModelInstancej73Dd8U, source, file));
            ViewModelInstance viewModelInstance = new ViewModelInstance(jM111createViewModelInstancej73Dd8U, commandQueue$kotlin_release, b0Var, null);
            sVar.o0(viewModelInstance);
            objQ2 = viewModelInstance;
        }
        ViewModelInstance viewModelInstance2 = (ViewModelInstance) objQ2;
        sVar.p(false);
        t.c(viewModelInstance2, new AnonymousClass1(commandQueue$kotlin_release, viewModelInstance2, b0Var, file), sVar);
        sVar.p(false);
        return viewModelInstance2;
    }
}
