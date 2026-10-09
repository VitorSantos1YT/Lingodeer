package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BookMarkCollectionItem {
    private final int folderId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22284id;
    private final int isFav;
    private final String lan;
    private final long time;
    private final String value;

    public BookMarkCollectionItem(String id2, String lan, int i11, String value, long j11, int i12) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(value, "value");
        this.f22284id = id2;
        this.lan = lan;
        this.isFav = i11;
        this.value = value;
        this.time = j11;
        this.folderId = i12;
    }

    public static /* synthetic */ BookMarkCollectionItem copy$default(BookMarkCollectionItem bookMarkCollectionItem, String str, String str2, int i11, String str3, long j11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bookMarkCollectionItem.f22284id;
        }
        if ((i13 & 2) != 0) {
            str2 = bookMarkCollectionItem.lan;
        }
        if ((i13 & 4) != 0) {
            i11 = bookMarkCollectionItem.isFav;
        }
        if ((i13 & 8) != 0) {
            str3 = bookMarkCollectionItem.value;
        }
        if ((i13 & 16) != 0) {
            j11 = bookMarkCollectionItem.time;
        }
        if ((i13 & 32) != 0) {
            i12 = bookMarkCollectionItem.folderId;
        }
        int i14 = i12;
        long j12 = j11;
        return bookMarkCollectionItem.copy(str, str2, i11, str3, j12, i14);
    }

    public final String component1() {
        return this.f22284id;
    }

    public final String component2() {
        return this.lan;
    }

    public final int component3() {
        return this.isFav;
    }

    public final String component4() {
        return this.value;
    }

    public final long component5() {
        return this.time;
    }

    public final int component6() {
        return this.folderId;
    }

    public final BookMarkCollectionItem copy(String id2, String lan, int i11, String value, long j11, int i12) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(value, "value");
        return new BookMarkCollectionItem(id2, lan, i11, value, j11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookMarkCollectionItem)) {
            return false;
        }
        BookMarkCollectionItem bookMarkCollectionItem = (BookMarkCollectionItem) obj;
        return m.a(this.f22284id, bookMarkCollectionItem.f22284id) && m.a(this.lan, bookMarkCollectionItem.lan) && this.isFav == bookMarkCollectionItem.isFav && m.a(this.value, bookMarkCollectionItem.value) && this.time == bookMarkCollectionItem.time && this.folderId == bookMarkCollectionItem.folderId;
    }

    public final int getFolderId() {
        return this.folderId;
    }

    public final String getId() {
        return this.f22284id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.folderId) + e.f(this.time, e.d(e.b(this.isFav, e.d(this.f22284id.hashCode() * 31, 31, this.lan), 31), 31, this.value), 31);
    }

    public final int isFav() {
        return this.isFav;
    }

    public String toString() {
        String str = this.f22284id;
        String str2 = this.lan;
        int i11 = this.isFav;
        String str3 = this.value;
        long j11 = this.time;
        int i12 = this.folderId;
        StringBuilder sbS = e.s("BookMarkCollectionItem(id=", str, ", lan=", str2, ", isFav=");
        sbS.append(i11);
        sbS.append(", value=");
        sbS.append(str3);
        sbS.append(", time=");
        sbS.append(j11);
        sbS.append(", folderId=");
        sbS.append(i12);
        sbS.append(")");
        return sbS.toString();
    }

    public /* synthetic */ BookMarkCollectionItem(String str, String str2, int i11, String str3, long j11, int i12, int i13, f fVar) {
        this(str, str2, i11, str3, j11, (i13 & 32) != 0 ? 0 : i12);
    }
}
