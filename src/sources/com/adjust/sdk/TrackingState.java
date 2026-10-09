package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum TrackingState {
    OPTED_OUT(1);

    private int value;

    TrackingState(int i11) {
        this.value = i11;
    }

    public int getValue() {
        return this.value;
    }
}
