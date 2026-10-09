package com.lingodeer.network.model;

import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AIAudioText {
    private String audio_text = BuildConfig.VERSION_NAME;

    public final String getAudio_text() {
        return this.audio_text;
    }

    public final void setAudio_text(String str) {
        m.f(str, "<set-?>");
        this.audio_text = str;
    }
}
