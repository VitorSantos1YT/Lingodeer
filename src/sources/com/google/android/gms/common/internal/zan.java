package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zan implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 1) {
            Log.wtf("GmsClientEvents", e.g(i11, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i11).length() + 34)), new Exception());
            return false;
        }
        throw null;
    }
}
