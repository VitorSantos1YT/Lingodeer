package com.stkouyu.listener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface OnPlayerListener {
    void onPlayEnd();

    void onPlayStart();

    void onPlayStartFail(String str);

    void onTick(long j11, double d5);
}
