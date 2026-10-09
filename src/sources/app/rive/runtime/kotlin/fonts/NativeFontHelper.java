package app.rive.runtime.kotlin.fonts;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeFontHelper {
    public static final int $stable = 0;
    public static final NativeFontHelper INSTANCE = new NativeFontHelper();

    private NativeFontHelper() {
    }

    public final native boolean cppRegisterFallbackFont(byte[] bArr);
}
