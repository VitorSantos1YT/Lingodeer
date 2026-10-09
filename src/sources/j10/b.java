package j10;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Cursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CursorWindow f35521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35523c;

    public b(CursorWindow cursorWindow) {
        this.f35521a = cursorWindow;
        this.f35523c = cursorWindow.getNumRows();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i11, CharArrayBuffer charArrayBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i11) {
        return this.f35521a.getBlob(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        return this.f35521a.getNumRows();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i11) {
        return this.f35521a.getDouble(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i11) {
        return this.f35521a.getFloat(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final int getInt(int i11) {
        return this.f35521a.getInt(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final long getLong(int i11) {
        return this.f35521a.getLong(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.f35522b;
    }

    @Override // android.database.Cursor
    public final short getShort(int i11) {
        return this.f35521a.getShort(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final String getString(int i11) {
        return this.f35521a.getString(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final int getType(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.f35522b == 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.f35522b == this.f35523c - 1;
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i11) {
        return this.f35521a.isNull(this.f35522b, i11);
    }

    @Override // android.database.Cursor
    public final boolean move(int i11) {
        return moveToPosition(this.f35522b + i11);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        this.f35522b = 0;
        return this.f35523c > 0;
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        int i11 = this.f35523c;
        if (i11 <= 0) {
            return false;
        }
        this.f35522b = i11 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        int i11 = this.f35522b;
        if (i11 >= this.f35523c - 1) {
            return false;
        }
        this.f35522b = i11 + 1;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i11) {
        if (i11 < 0 || i11 >= this.f35523c) {
            return false;
        }
        this.f35522b = i11;
        return true;
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        int i11 = this.f35522b;
        if (i11 <= 0) {
            return false;
        }
        this.f35522b = i11 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }
}
