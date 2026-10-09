package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class KnowledgeNote {
    private final long elemId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22309id;
    private final boolean isDeleted;
    private final String lan;
    private final String note;
    private final String noteTypeCode;
    private final boolean pendingUpdate;
    private final long updatedAt;

    public KnowledgeNote(String id2, String lan, String noteTypeCode, long j11, String note, long j12, boolean z11, boolean z12) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(noteTypeCode, "noteTypeCode");
        m.f(note, "note");
        this.f22309id = id2;
        this.lan = lan;
        this.noteTypeCode = noteTypeCode;
        this.elemId = j11;
        this.note = note;
        this.updatedAt = j12;
        this.isDeleted = z11;
        this.pendingUpdate = z12;
    }

    public static /* synthetic */ KnowledgeNote copy$default(KnowledgeNote knowledgeNote, String str, String str2, String str3, long j11, String str4, long j12, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = knowledgeNote.f22309id;
        }
        if ((i11 & 2) != 0) {
            str2 = knowledgeNote.lan;
        }
        if ((i11 & 4) != 0) {
            str3 = knowledgeNote.noteTypeCode;
        }
        if ((i11 & 8) != 0) {
            j11 = knowledgeNote.elemId;
        }
        if ((i11 & 16) != 0) {
            str4 = knowledgeNote.note;
        }
        if ((i11 & 32) != 0) {
            j12 = knowledgeNote.updatedAt;
        }
        if ((i11 & 64) != 0) {
            z11 = knowledgeNote.isDeleted;
        }
        if ((i11 & 128) != 0) {
            z12 = knowledgeNote.pendingUpdate;
        }
        String str5 = str4;
        long j13 = j11;
        String str6 = str3;
        return knowledgeNote.copy(str, str2, str6, j13, str5, j12, z11, z12);
    }

    public final String component1() {
        return this.f22309id;
    }

    public final String component2() {
        return this.lan;
    }

    public final String component3() {
        return this.noteTypeCode;
    }

    public final long component4() {
        return this.elemId;
    }

    public final String component5() {
        return this.note;
    }

    public final long component6() {
        return this.updatedAt;
    }

    public final boolean component7() {
        return this.isDeleted;
    }

    public final boolean component8() {
        return this.pendingUpdate;
    }

    public final KnowledgeNote copy(String id2, String lan, String noteTypeCode, long j11, String note, long j12, boolean z11, boolean z12) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(noteTypeCode, "noteTypeCode");
        m.f(note, "note");
        return new KnowledgeNote(id2, lan, noteTypeCode, j11, note, j12, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnowledgeNote)) {
            return false;
        }
        KnowledgeNote knowledgeNote = (KnowledgeNote) obj;
        return m.a(this.f22309id, knowledgeNote.f22309id) && m.a(this.lan, knowledgeNote.lan) && m.a(this.noteTypeCode, knowledgeNote.noteTypeCode) && this.elemId == knowledgeNote.elemId && m.a(this.note, knowledgeNote.note) && this.updatedAt == knowledgeNote.updatedAt && this.isDeleted == knowledgeNote.isDeleted && this.pendingUpdate == knowledgeNote.pendingUpdate;
    }

    public final long getElemId() {
        return this.elemId;
    }

    public final String getId() {
        return this.f22309id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getNoteTypeCode() {
        return this.noteTypeCode;
    }

    public final boolean getPendingUpdate() {
        return this.pendingUpdate;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pendingUpdate) + e.e(e.f(this.updatedAt, e.d(e.f(this.elemId, e.d(e.d(this.f22309id.hashCode() * 31, 31, this.lan), 31, this.noteTypeCode), 31), 31, this.note), 31), 31, this.isDeleted);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public String toString() {
        String str = this.f22309id;
        String str2 = this.lan;
        String str3 = this.noteTypeCode;
        long j11 = this.elemId;
        String str4 = this.note;
        long j12 = this.updatedAt;
        boolean z11 = this.isDeleted;
        boolean z12 = this.pendingUpdate;
        StringBuilder sbS = e.s("KnowledgeNote(id=", str, ", lan=", str2, ", noteTypeCode=");
        sbS.append(str3);
        sbS.append(", elemId=");
        sbS.append(j11);
        e.C(sbS, ", note=", str4, ", updatedAt=");
        sbS.append(j12);
        sbS.append(", isDeleted=");
        sbS.append(z11);
        sbS.append(", pendingUpdate=");
        sbS.append(z12);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ KnowledgeNote(String str, String str2, String str3, long j11, String str4, long j12, boolean z11, boolean z12, int i11, f fVar) {
        this(str, str2, str3, j11, str4, j12, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? true : z12);
    }
}
