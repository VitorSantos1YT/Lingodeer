package com.lingodeer.network.model;

import com.google.gson.Gson;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class AIAudioTextResult extends ServerResult<AIAudioText> {
    private final String audio_text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIAudioTextResult(String audio_text) {
        super(0, null, null, 7, null);
        m.f(audio_text, "audio_text");
        this.audio_text = audio_text;
    }

    public final String getAudio_text() {
        return this.audio_text;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.lingodeer.network.model.ServerResult
    public AIAudioText converter() {
        Object objFromJson = new Gson().fromJson(this.audio_text, (Class<Object>) AIAudioText.class);
        m.e(objFromJson, "fromJson(...)");
        return (AIAudioText) objFromJson;
    }
}
