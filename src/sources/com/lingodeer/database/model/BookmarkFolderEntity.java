package com.lingodeer.database.model;

import com.google.android.material.datepicker.d;
import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BookmarkFolderEntity {
    private final String contentType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22358id;
    private final boolean isDeleted;
    private final String lan;
    private final String name;
    private final int serverId;
    private final long time;

    public BookmarkFolderEntity(String id2, String lan, String contentType, String name, int i11, boolean z11, long j11) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(contentType, "contentType");
        m.f(name, "name");
        this.f22358id = id2;
        this.lan = lan;
        this.contentType = contentType;
        this.name = name;
        this.serverId = i11;
        this.isDeleted = z11;
        this.time = j11;
    }

    public static /* synthetic */ BookmarkFolderEntity copy$default(BookmarkFolderEntity bookmarkFolderEntity, String str, String str2, String str3, String str4, int i11, boolean z11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bookmarkFolderEntity.f22358id;
        }
        if ((i12 & 2) != 0) {
            str2 = bookmarkFolderEntity.lan;
        }
        if ((i12 & 4) != 0) {
            str3 = bookmarkFolderEntity.contentType;
        }
        if ((i12 & 8) != 0) {
            str4 = bookmarkFolderEntity.name;
        }
        if ((i12 & 16) != 0) {
            i11 = bookmarkFolderEntity.serverId;
        }
        if ((i12 & 32) != 0) {
            z11 = bookmarkFolderEntity.isDeleted;
        }
        if ((i12 & 64) != 0) {
            j11 = bookmarkFolderEntity.time;
        }
        long j12 = j11;
        int i13 = i11;
        boolean z12 = z11;
        return bookmarkFolderEntity.copy(str, str2, str3, str4, i13, z12, j12);
    }

    public final String component1() {
        return this.f22358id;
    }

    public final String component2() {
        return this.lan;
    }

    public final String component3() {
        return this.contentType;
    }

    public final String component4() {
        return this.name;
    }

    public final int component5() {
        return this.serverId;
    }

    public final boolean component6() {
        return this.isDeleted;
    }

    public final long component7() {
        return this.time;
    }

    public final BookmarkFolderEntity copy(String id2, String lan, String contentType, String name, int i11, boolean z11, long j11) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(contentType, "contentType");
        m.f(name, "name");
        return new BookmarkFolderEntity(id2, lan, contentType, name, i11, z11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookmarkFolderEntity)) {
            return false;
        }
        BookmarkFolderEntity bookmarkFolderEntity = (BookmarkFolderEntity) obj;
        return m.a(this.f22358id, bookmarkFolderEntity.f22358id) && m.a(this.lan, bookmarkFolderEntity.lan) && m.a(this.contentType, bookmarkFolderEntity.contentType) && m.a(this.name, bookmarkFolderEntity.name) && this.serverId == bookmarkFolderEntity.serverId && this.isDeleted == bookmarkFolderEntity.isDeleted && this.time == bookmarkFolderEntity.time;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getId() {
        return this.f22358id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final String getName() {
        return this.name;
    }

    public final int getServerId() {
        return this.serverId;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + e.e(e.b(this.serverId, e.d(e.d(e.d(this.f22358id.hashCode() * 31, 31, this.lan), 31, this.contentType), 31, this.name), 31), 31, this.isDeleted);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public String toString() {
        String str = this.f22358id;
        String str2 = this.lan;
        String str3 = this.contentType;
        String str4 = this.name;
        int i11 = this.serverId;
        boolean z11 = this.isDeleted;
        long j11 = this.time;
        StringBuilder sbS = e.s("BookmarkFolderEntity(id=", str, ", lan=", str2, ", contentType=");
        d.w(sbS, str3, ", name=", str4, ", serverId=");
        sbS.append(i11);
        sbS.append(", isDeleted=");
        sbS.append(z11);
        sbS.append(", time=");
        return e.i(j11, ")", sbS);
    }
}
