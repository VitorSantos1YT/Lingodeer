package com.lingodeer.data.model;

import com.lingodeer.database.model.BookmarkFolderEntity;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class BookmarkFolderKt {
    public static final BookmarkFolderEntity asEntityModel(BookmarkFolder bookmarkFolder) {
        m.f(bookmarkFolder, "<this>");
        return new BookmarkFolderEntity(bookmarkFolder.getId(), bookmarkFolder.getLan(), bookmarkFolder.getContentType(), bookmarkFolder.getName(), bookmarkFolder.getServerId(), bookmarkFolder.isDeleted(), bookmarkFolder.getTime());
    }

    public static final BookmarkFolder asExternalModel(BookmarkFolderEntity bookmarkFolderEntity) {
        m.f(bookmarkFolderEntity, "<this>");
        return new BookmarkFolder(bookmarkFolderEntity.getId(), bookmarkFolderEntity.getLan(), bookmarkFolderEntity.getContentType(), bookmarkFolderEntity.getName(), bookmarkFolderEntity.getServerId(), bookmarkFolderEntity.isDeleted(), bookmarkFolderEntity.getTime());
    }
}
