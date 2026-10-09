package com.lingodeer.database.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class LanguageHistoryEntity {
    private final String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22368id;
    private final int keyLanguage;
    private final long lastSelectedTime;
    private final int locate;
    private final String title;

    public LanguageHistoryEntity(String id2, int i11, int i12, String title, String description, long j11) {
        m.f(id2, "id");
        m.f(title, "title");
        m.f(description, "description");
        this.f22368id = id2;
        this.keyLanguage = i11;
        this.locate = i12;
        this.title = title;
        this.description = description;
        this.lastSelectedTime = j11;
    }

    public static /* synthetic */ LanguageHistoryEntity copy$default(LanguageHistoryEntity languageHistoryEntity, String str, int i11, int i12, String str2, String str3, long j11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = languageHistoryEntity.f22368id;
        }
        if ((i13 & 2) != 0) {
            i11 = languageHistoryEntity.keyLanguage;
        }
        if ((i13 & 4) != 0) {
            i12 = languageHistoryEntity.locate;
        }
        if ((i13 & 8) != 0) {
            str2 = languageHistoryEntity.title;
        }
        if ((i13 & 16) != 0) {
            str3 = languageHistoryEntity.description;
        }
        if ((i13 & 32) != 0) {
            j11 = languageHistoryEntity.lastSelectedTime;
        }
        long j12 = j11;
        String str4 = str3;
        int i14 = i12;
        return languageHistoryEntity.copy(str, i11, i14, str2, str4, j12);
    }

    public final String component1() {
        return this.f22368id;
    }

    public final int component2() {
        return this.keyLanguage;
    }

    public final int component3() {
        return this.locate;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final long component6() {
        return this.lastSelectedTime;
    }

    public final LanguageHistoryEntity copy(String id2, int i11, int i12, String title, String description, long j11) {
        m.f(id2, "id");
        m.f(title, "title");
        m.f(description, "description");
        return new LanguageHistoryEntity(id2, i11, i12, title, description, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageHistoryEntity)) {
            return false;
        }
        LanguageHistoryEntity languageHistoryEntity = (LanguageHistoryEntity) obj;
        return m.a(this.f22368id, languageHistoryEntity.f22368id) && this.keyLanguage == languageHistoryEntity.keyLanguage && this.locate == languageHistoryEntity.locate && m.a(this.title, languageHistoryEntity.title) && m.a(this.description, languageHistoryEntity.description) && this.lastSelectedTime == languageHistoryEntity.lastSelectedTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f22368id;
    }

    public final int getKeyLanguage() {
        return this.keyLanguage;
    }

    public final long getLastSelectedTime() {
        return this.lastSelectedTime;
    }

    public final int getLocate() {
        return this.locate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Long.hashCode(this.lastSelectedTime) + e.d(e.d(e.b(this.locate, e.b(this.keyLanguage, this.f22368id.hashCode() * 31, 31), 31), 31, this.title), 31, this.description);
    }

    public String toString() {
        String str = this.f22368id;
        int i11 = this.keyLanguage;
        int i12 = this.locate;
        String str2 = this.title;
        String str3 = this.description;
        long j11 = this.lastSelectedTime;
        StringBuilder sbQ = e.q(i11, "LanguageHistoryEntity(id=", str, ", keyLanguage=", ", locate=");
        sbQ.append(i12);
        sbQ.append(", title=");
        sbQ.append(str2);
        sbQ.append(", description=");
        sbQ.append(str3);
        sbQ.append(", lastSelectedTime=");
        sbQ.append(j11);
        sbQ.append(")");
        return sbQ.toString();
    }
}
