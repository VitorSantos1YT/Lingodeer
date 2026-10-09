package com.stkouyu.lame;

import com.stkouyu.util.MyLog;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class SimpleLame {
    static {
        try {
            System.loadLibrary("mp3lamest");
        } catch (Exception e8) {
            MyLog.e("lame", "===>ST Exception");
            e8.printStackTrace();
        } catch (Throwable th2) {
            MyLog.e("lame", "===>ST Exception");
            th2.printStackTrace();
        }
    }

    public static native void close();

    public static native int encode(short[] sArr, short[] sArr2, int i11, byte[] bArr);

    public static native int encodeInterleaved(short[] sArr, int i11, byte[] bArr);

    public static native int flush(byte[] bArr);

    public static native void init(int i11, int i12, int i13, int i14, int i15);

    public static native void tags(String str);
}
