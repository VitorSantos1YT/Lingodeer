package com.stkouyu.listener;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class OnRecorderListener {
    public abstract void onPause();

    public abstract void onRecordEnd();

    public abstract void onRecording(int i11, int i12);

    public abstract void onScore(String str);

    public abstract void onStart();

    public abstract void onStartRecordFail(String str);

    public abstract void onTick(long j11, double d5);
}
