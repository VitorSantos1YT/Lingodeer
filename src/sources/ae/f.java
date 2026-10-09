package ae;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.k;
import java.io.File;
import java.io.FileNotFoundException;
import td.j;
import zd.p;
import zd.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements com.bumptech.glide.load.data.d {
    public static final String[] M = {"_data"};
    public final Class H;
    public volatile boolean K;
    public volatile com.bumptech.glide.load.data.d L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f676f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f677t;

    public f(Context context, q qVar, q qVar2, Uri uri, int i11, int i12, j jVar, Class cls) {
        this.f671a = context.getApplicationContext();
        this.f672b = qVar;
        this.f673c = qVar2;
        this.f674d = uri;
        this.f675e = i11;
        this.f676f = i12;
        this.f677t = jVar;
        this.H = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.H;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.L;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final com.bumptech.glide.load.data.d c() throws Throwable {
        p pVarB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f671a;
        j jVar = this.f677t;
        int i11 = this.f676f;
        int i12 = this.f675e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f674d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, M, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            pVarB = this.f672b.b(file, i12, i11, jVar);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            Uri requireOriginal = this.f674d;
            boolean zB = ud.a.b(requireOriginal);
            q qVar = this.f673c;
            if (zB && requireOriginal.getPathSegments().contains("picker")) {
                pVarB = qVar.b(requireOriginal, i12, i11, jVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                pVarB = qVar.b(requireOriginal, i12, i11, jVar);
            }
        }
        if (pVarB != null) {
            return pVarB.f59182c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.K = true;
        com.bumptech.glide.load.data.d dVar = this.L;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(k kVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        try {
            com.bumptech.glide.load.data.d dVarC = c();
            if (dVarC == null) {
                cVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f674d));
            } else {
                this.L = dVarC;
                if (this.K) {
                    cancel();
                } else {
                    dVarC.e(kVar, cVar);
                }
            }
        } catch (FileNotFoundException e8) {
            cVar.c(e8);
        }
    }
}
