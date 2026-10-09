package com.lingo.lingoskill.object;

import com.chad.library.adapter.base.entity.SectionEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LessonItemSection extends SectionEntity<Lesson> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonItemSection(boolean z11, String header) {
        super(z11, header);
        m.f(header, "header");
    }
}
