package com.stkouyu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SkEgn {
    public static int SKEGN_MESSAGE_TYPE_BIN = 0;
    public static int SKEGN_MESSAGE_TYPE_JSON = 0;
    public static int SKEGN_OPT_GET_MODULES = 0;
    public static int SKEGN_OPT_GET_PROVISION = 0;
    public static int SKEGN_OPT_GET_SERIAL_NUMBER = 0;
    public static int SKEGN_OPT_GET_TRAFFIC = 0;
    public static int SKEGN_OPT_GET_VERSION = 0;
    public static int SKEGN_OPT_SET_WIFI_STATUS = 0;
    private static boolean isLibraryLoaded = false;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface skegn_callback {
        int run(byte[] bArr, int i11, byte[] bArr2, int i12);
    }

    static {
        try {
            System.loadLibrary("skegn");
            isLibraryLoaded = true;
        } catch (Exception e8) {
            e8.printStackTrace();
            isLibraryLoaded = false;
        } catch (Throwable th2) {
            th2.printStackTrace();
            isLibraryLoaded = false;
        }
        SKEGN_MESSAGE_TYPE_JSON = 1;
        SKEGN_MESSAGE_TYPE_BIN = 2;
        SKEGN_OPT_GET_VERSION = 1;
        SKEGN_OPT_GET_MODULES = 2;
        SKEGN_OPT_GET_TRAFFIC = 3;
        SKEGN_OPT_SET_WIFI_STATUS = 4;
        SKEGN_OPT_GET_PROVISION = 5;
        SKEGN_OPT_GET_SERIAL_NUMBER = 6;
    }

    public static boolean isLibraryLoaded() {
        return isLibraryLoaded;
    }

    public static native int skegn_cancel(long j11);

    public static native int skegn_delete(long j11);

    public static native int skegn_feed(long j11, byte[] bArr, int i11);

    public static native int skegn_get_device_id(byte[] bArr, Object obj);

    public static native int skegn_get_last_error();

    public static native String skegn_inquire_oov(long j11, String str);

    public static native int skegn_inquire_provision(String str, skegn_callback skegn_callbackVar, Object obj);

    public static native long skegn_new(String str, Object obj);

    public static native int skegn_opt(long j11, int i11, byte[] bArr, int i12);

    public static native int skegn_start(long j11, String str, byte[] bArr, skegn_callback skegn_callbackVar, Object obj);

    public static native int skegn_stop(long j11);

    public static native int skegn_update_provision(String str, String str2, String str3, Object obj);
}
