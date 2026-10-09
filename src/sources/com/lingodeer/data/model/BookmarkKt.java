package com.lingodeer.data.model;

import com.lingodeer.database.model.BookmarkEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BookmarkKt {
    public static final BookmarkEntity asEntityModel(Bookmark bookmark) {
        m.f(bookmark, "<this>");
        return new BookmarkEntity(bookmark.getId(), bookmark.getLan(), bookmark.isFav(), bookmark.getValue(), bookmark.getTime(), bookmark.getFolderId());
    }

    public static final Bookmark asExternalModel(BookmarkEntity bookmarkEntity) {
        m.f(bookmarkEntity, "<this>");
        return new Bookmark(bookmarkEntity.getId(), bookmarkEntity.getLan(), bookmarkEntity.isFav(), bookmarkEntity.getContentType(), bookmarkEntity.getTime(), bookmarkEntity.getFolderId());
    }
}
