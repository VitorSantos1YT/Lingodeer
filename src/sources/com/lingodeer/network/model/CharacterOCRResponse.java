package com.lingodeer.network.model;

import java.util.List;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CharacterOCRResponse {
    private List<OCRCharacter> ocr_chars = r.f50854a;

    public final List<OCRCharacter> getOcr_chars() {
        return this.ocr_chars;
    }

    public final void setOcr_chars(List<OCRCharacter> list) {
        m.f(list, "<set-?>");
        this.ocr_chars = list;
    }
}
