package zd;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f59174d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f59176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f59177c;

    public /* synthetic */ m(int i11, Object obj, Object obj2) {
        this.f59175a = i11;
        this.f59176b = obj;
        this.f59177c = obj2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f59175a) {
            case 0:
                return File.class;
            default:
                return ((x) this.f59177c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        int i11 = this.f59175a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i11 = this.f59175a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        switch (this.f59175a) {
            case 0:
                break;
        }
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, com.bumptech.glide.load.data.c cVar) {
        Object objWrap;
        switch (this.f59175a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f59176b).getContentResolver().query((Uri) this.f59177c, f59174d, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    cVar.f(new File(string));
                    return;
                }
                cVar.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f59177c)));
                return;
            default:
                x xVar = (x) this.f59177c;
                byte[] bArr = (byte[]) this.f59176b;
                switch (xVar.f59203a) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                cVar.f(objWrap);
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
