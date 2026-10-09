package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveGeneralEvent extends RiveEvent {
    public static final int $stable = 0;

    public RiveGeneralEvent(long j11, float f5) {
        super(j11, f5);
    }

    @Override // app.rive.runtime.kotlin.core.RiveEvent
    public String toString() {
        return "GeneralRiveEvent, name: " + getName() + ", properties: " + getProperties();
    }
}
