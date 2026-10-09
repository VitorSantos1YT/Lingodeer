package app.rive.runtime.kotlin.core;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RiveEventReport extends NativeObject {
    public static final int $stable = 0;
    private final RiveEvent event;
    private final long unsafeCppPointer;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.OpenURLEvent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.GeneralEvent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RiveEventReport(long j11, float f5) {
        super(j11);
        this.unsafeCppPointer = j11;
        this.event = convertEvent(new RiveEvent(j11, f5));
    }

    private final RiveEvent convertEvent(RiveEvent riveEvent) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[riveEvent.getType().ordinal()];
        if (i11 == 1) {
            return new RiveOpenURLEvent(riveEvent.getCppPointer(), riveEvent.getDelay());
        }
        if (i11 == 2) {
            return new RiveGeneralEvent(riveEvent.getCppPointer(), riveEvent.getDelay());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RiveEvent getEvent() {
        return this.event;
    }

    public final long getUnsafeCppPointer() {
        return this.unsafeCppPointer;
    }
}
