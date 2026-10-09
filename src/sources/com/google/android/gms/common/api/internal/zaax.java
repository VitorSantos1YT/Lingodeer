package com.google.android.gms.common.api.internal;

import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zaax extends com.google.android.gms.internal.base.zao {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1 || i11 == 2) {
            throw null;
        }
        new StringBuilder(String.valueOf(i11).length() + 20);
    }
}
