package app.rive;

import app.rive.core.CommandQueue;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import qy.h;
import rz.b0;
import rz.h0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Artboard {
    public static final int $stable = 8;
    private final long artboardHandle;
    private final CommandQueue commandQueue;
    private final h stateMachineNamesCache$delegate;

    public /* synthetic */ Artboard(long j11, CommandQueue commandQueue, b0 b0Var, f fVar) {
        this(j11, commandQueue, b0Var);
    }

    private final h0 getStateMachineNamesCache() {
        return (h0) this.stateMachineNamesCache$delegate.getValue();
    }

    /* JADX INFO: renamed from: getArtboardHandle-nSTdbJo$kotlin_release, reason: not valid java name */
    public final long m11getArtboardHandlenSTdbJo$kotlin_release() {
        return this.artboardHandle;
    }

    public final Object getStateMachineNames(d<? super List<String>> dVar) {
        return getStateMachineNamesCache().await(dVar);
    }

    private Artboard(long j11, CommandQueue commandQueue, b0 parentScope) {
        m.f(commandQueue, "commandQueue");
        m.f(parentScope, "parentScope");
        this.artboardHandle = j11;
        this.commandQueue = commandQueue;
        this.stateMachineNamesCache$delegate = RiveUIKt.lazyDeferred(parentScope, new Artboard$stateMachineNamesCache$2(this, null));
    }
}
