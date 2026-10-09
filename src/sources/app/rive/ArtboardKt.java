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

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ArtboardKt {

    /* JADX INFO: renamed from: app.rive.ArtboardKt$rememberArtboard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AnonymousClass1 extends n implements c {
        final /* synthetic */ Artboard $artboard;
        final /* synthetic */ String $artboardName;
        final /* synthetic */ CommandQueue $commandQueue;
        final /* synthetic */ RiveFile $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommandQueue commandQueue, Artboard artboard, String str, RiveFile riveFile) {
            super(1);
            this.$commandQueue = commandQueue;
            this.$artboard = artboard;
            this.$artboardName = str;
            this.$file = riveFile;
        }

        @Override // fz.c
        public final i0 invoke(j0 DisposableEffect) {
            m.f(DisposableEffect, "$this$DisposableEffect");
            final CommandQueue commandQueue = this.$commandQueue;
            final Artboard artboard = this.$artboard;
            final String str = this.$artboardName;
            final RiveFile riveFile = this.$file;
            return new i0() { // from class: app.rive.ArtboardKt$rememberArtboard$1$invoke$$inlined$onDispose$1
                @Override // l1.i0
                public void dispose() {
                    RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new ArtboardKt$rememberArtboard$1$1$1(artboard, str, riveFile));
                    commandQueue.m115deleteArtboarduiJWFY8(artboard.m11getArtboardHandlenSTdbJo$kotlin_release());
                }
            };
        }
    }

    public static final Artboard rememberArtboard(RiveFile file, String str, l1.n nVar, int i11, int i12) {
        m.f(file, "file");
        s sVar = (s) nVar;
        sVar.d0(976856554);
        if ((i12 & 2) != 0) {
            str = null;
        }
        CommandQueue commandQueue$kotlin_release = file.getCommandQueue$kotlin_release();
        Object objQ = sVar.Q();
        g gVar = l1.m.f39353a;
        if (objQ == gVar) {
            c0 c0Var = new c0(t.q(sVar));
            sVar.o0(c0Var);
            objQ = c0Var;
        }
        b0 b0Var = ((c0) objQ).f39245a;
        sVar.d0(-829740003);
        boolean z11 = true;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && sVar.f(file)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) <= 32 || !sVar.f(str)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean z13 = z12 | z11;
        Object objQ2 = sVar.Q();
        if (z13 || objQ2 == gVar) {
            long jM107createArtboardByName2ZIOzHc = str != null ? commandQueue$kotlin_release.m107createArtboardByName2ZIOzHc(file.m22getFileHandleENT3xMk$kotlin_release(), str) : commandQueue$kotlin_release.m108createDefaultArtboard6NrLy0M(file.m22getFileHandleENT3xMk$kotlin_release());
            RiveLog.INSTANCE.getLogger().d("Rive/Artboard", new ArtboardKt$rememberArtboard$artboard$1$1(jM107createArtboardByName2ZIOzHc, str, file));
            Artboard artboard = new Artboard(jM107createArtboardByName2ZIOzHc, commandQueue$kotlin_release, b0Var, null);
            sVar.o0(artboard);
            objQ2 = artboard;
        }
        Artboard artboard2 = (Artboard) objQ2;
        sVar.p(false);
        t.c(artboard2, new AnonymousClass1(commandQueue$kotlin_release, artboard2, str, file), sVar);
        sVar.p(false);
        return artboard2;
    }
}
