package app.rive.runtime.kotlin.core;

import a.ar.MFeWs;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SMITrigger extends SMIInput {
    public static final int $stable = 0;

    public SMITrigger(long j11) {
        super(j11);
    }

    private final native void cppFire(long j11);

    public final void fire$kotlin_release() {
        cppFire(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return MFeWs.GIdItFlCKHyu + getName() + '\n';
    }
}
