package com.google.firebase.database.android;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.adjust.sdk.Constants;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.persistence.PersistenceStorageEngine;
import com.google.firebase.database.core.persistence.TrackedQuery;
import com.google.firebase.database.core.utilities.ImmutableTree;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QueryParams;
import com.google.firebase.database.core.view.QuerySpec;
import com.google.firebase.database.util.JsonMapper;
import java.io.IOException;
import java.nio.charset.Charset;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SqlPersistenceStorageEngine implements PersistenceStorageEngine {

    /* JADX INFO: renamed from: com.google.firebase.database.android.SqlPersistenceStorageEngine$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements ImmutableTree.TreeVisitor<Void, Integer> {
        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
        public final Object a(Path path, Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.android.SqlPersistenceStorageEngine$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 implements ImmutableTree.TreeVisitor<Void, Void> {
        @Override // com.google.firebase.database.core.utilities.ImmutableTree.TreeVisitor
        public final Object a(Path path, Object obj, Object obj2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class PersistentCacheOpenHelper extends SQLiteOpenHelper {
        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("CREATE TABLE writes (id INTEGER, path TEXT, type TEXT, part INTEGER, node BLOB, UNIQUE (id, part));");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            char[] cArr = Utilities.f19432a;
            if (i11 > 1) {
                throw new AssertionError(p.j(i12, "We don't handle upgrading to "));
            }
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("serverCache"));
            sQLiteDatabase.execSQL("CREATE TABLE serverCache (path TEXT PRIMARY KEY, value BLOB);");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat("complete"));
            sQLiteDatabase.execSQL("CREATE TABLE trackedKeys (id INTEGER, key TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE trackedQueries (id INTEGER PRIMARY KEY, path TEXT, queryParams TEXT, lastUse INTEGER, complete INTEGER, active INTEGER);");
        }
    }

    static {
        Charset.forName(Constants.ENCODING);
    }

    public final void a(TrackedQuery trackedQuery) {
        char[] cArr = Utilities.f19432a;
        System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(trackedQuery.f19401a));
        QuerySpec querySpec = trackedQuery.f19402b;
        Path path = querySpec.f19476a;
        String str = "/";
        if (!path.isEmpty()) {
            str = path.toString() + "/";
        }
        contentValues.put("path", str);
        QueryParams queryParams = querySpec.f19477b;
        if (queryParams.f19474h == null) {
            try {
                queryParams.f19474h = JsonMapper.b(queryParams.b());
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }
        contentValues.put("queryParams", queryParams.f19474h);
        contentValues.put("lastUse", Long.valueOf(trackedQuery.f19403c));
        contentValues.put("complete", Boolean.valueOf(trackedQuery.f19404d));
        contentValues.put("active", Boolean.valueOf(trackedQuery.f19405e));
        throw null;
    }
}
