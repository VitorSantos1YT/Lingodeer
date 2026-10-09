package fr;

import com.lingodeer.data.model.KnowledgeNote;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KnowledgeNote f27770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27771b;

    public p0(KnowledgeNote knowledgeNote, long j11) {
        this.f27770a = knowledgeNote;
        this.f27771b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.m.a(this.f27770a, p0Var.f27770a) && this.f27771b == p0Var.f27771b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27771b) + (this.f27770a.hashCode() * 31);
    }

    public final String toString() {
        return "KnowledgeNoteRemoteRecord(note=" + this.f27770a + ", updateTimestamp=" + this.f27771b + ")";
    }
}
