package com.lingodeer.database.model;

import b7.e0;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BookmarkEntity {
    private final String contentType;
    private final String folderId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22357id;
    private final int isFav;
    private final String lan;
    private final long time;

    public BookmarkEntity(String id2, String lan, int i11, String contentType, long j11, String str) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(contentType, "contentType");
        this.f22357id = id2;
        this.lan = lan;
        this.isFav = i11;
        this.contentType = contentType;
        this.time = j11;
        this.folderId = str;
    }

    public static /* synthetic */ BookmarkEntity copy$default(BookmarkEntity bookmarkEntity, String str, String str2, int i11, String str3, long j11, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bookmarkEntity.f22357id;
        }
        if ((i12 & 2) != 0) {
            str2 = bookmarkEntity.lan;
        }
        if ((i12 & 4) != 0) {
            i11 = bookmarkEntity.isFav;
        }
        if ((i12 & 8) != 0) {
            str3 = bookmarkEntity.contentType;
        }
        if ((i12 & 16) != 0) {
            j11 = bookmarkEntity.time;
        }
        if ((i12 & 32) != 0) {
            str4 = bookmarkEntity.folderId;
        }
        String str5 = str4;
        long j12 = j11;
        return bookmarkEntity.copy(str, str2, i11, str3, j12, str5);
    }

    public final String component1() {
        return this.f22357id;
    }

    public final String component2() {
        return this.lan;
    }

    public final int component3() {
        return this.isFav;
    }

    public final String component4() {
        return this.contentType;
    }

    public final long component5() {
        return this.time;
    }

    public final String component6() {
        return this.folderId;
    }

    public final BookmarkEntity copy(String id2, String lan, int i11, String contentType, long j11, String str) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(contentType, "contentType");
        return new BookmarkEntity(id2, lan, i11, contentType, j11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookmarkEntity)) {
            return false;
        }
        BookmarkEntity bookmarkEntity = (BookmarkEntity) obj;
        return m.a(this.f22357id, bookmarkEntity.f22357id) && m.a(this.lan, bookmarkEntity.lan) && this.isFav == bookmarkEntity.isFav && m.a(this.contentType, bookmarkEntity.contentType) && this.time == bookmarkEntity.time && m.a(this.folderId, bookmarkEntity.folderId);
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getFolderId() {
        return this.folderId;
    }

    public final String getId() {
        return this.f22357id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iF = e.f(this.time, e.d(e.b(this.isFav, e.d(this.f22357id.hashCode() * 31, 31, this.lan), 31), 31, this.contentType), 31);
        String str = this.folderId;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final int isFav() {
        return this.isFav;
    }

    public String toString() {
        String str = this.f22357id;
        String str2 = this.lan;
        int i11 = this.isFav;
        String str3 = this.contentType;
        long j11 = this.time;
        String str4 = this.folderId;
        StringBuilder sbS = e.s("BookmarkEntity(id=", str, ", lan=", str2, ", isFav=");
        sbS.append(i11);
        sbS.append(", contentType=");
        sbS.append(str3);
        sbS.append(", time=");
        e0.w(j11, ", folderId=", str4, sbS);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ BookmarkEntity(String str, String str2, int i11, String str3, long j11, String str4, int i12, f fVar) {
        this(str, str2, i11, str3, j11, (i12 & 32) != 0 ? null : str4);
    }
}
