package app.rive.runtime.kotlin.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SMIInput extends NativeObject {
    public static final int $stable = 0;

    public SMIInput(long j11) {
        super(j11);
    }

    private final native boolean cppIsBoolean(long j11);

    private final native boolean cppIsNumber(long j11);

    private final native boolean cppIsTrigger(long j11);

    private final native String cppName(long j11);

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final boolean isBoolean() {
        return cppIsBoolean(getCppPointer());
    }

    public final boolean isNumber() {
        return cppIsNumber(getCppPointer());
    }

    public final boolean isTrigger() {
        return cppIsTrigger(getCppPointer());
    }

    public String toString() {
        return "SMIInput " + getName() + '\n';
    }
}
