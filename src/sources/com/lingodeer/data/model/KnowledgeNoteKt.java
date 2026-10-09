package com.lingodeer.data.model;

import com.lingodeer.database.model.KnowledgeNoteEntity;
import dt.Xk.wuoM;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class KnowledgeNoteKt {
    public static final KnowledgeNoteEntity asEntityModel(KnowledgeNote knowledgeNote) {
        m.f(knowledgeNote, "<this>");
        return new KnowledgeNoteEntity(knowledgeNote.getId(), knowledgeNote.getLan(), knowledgeNote.getNoteTypeCode(), knowledgeNote.getElemId(), knowledgeNote.getNote(), knowledgeNote.getUpdatedAt(), knowledgeNote.isDeleted(), knowledgeNote.getPendingUpdate());
    }

    public static final KnowledgeNote asExternalModel(KnowledgeNoteEntity knowledgeNoteEntity) {
        m.f(knowledgeNoteEntity, wuoM.EAS);
        return new KnowledgeNote(knowledgeNoteEntity.getId(), knowledgeNoteEntity.getLan(), knowledgeNoteEntity.getValue(), knowledgeNoteEntity.getElemId(), knowledgeNoteEntity.getNote(), knowledgeNoteEntity.getUpdatedAt(), knowledgeNoteEntity.isDeleted(), knowledgeNoteEntity.getPendingUpdate());
    }
}
