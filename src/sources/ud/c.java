package ud;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.k;
import com.bumptech.glide.load.data.i;
import gb.r;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import zd.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f52917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f52918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f52919d;

    public /* synthetic */ c(Comparable comparable, Object obj, int i11) {
        this.f52916a = i11;
        this.f52917b = comparable;
        this.f52918c = obj;
    }

    public static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.c(context).f7609d.a().e(), dVar, com.bumptech.glide.c.c(context).f7610e, context.getContentResolver()), 0);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f52916a) {
            case 0:
                return InputStream.class;
            case 1:
                ((x) this.f52918c).getClass();
                return InputStream.class;
            default:
                return ((x) this.f52918c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        switch (this.f52916a) {
            case 0:
                InputStream inputStream = (InputStream) this.f52919d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f52919d).close();
                } catch (IOException unused2) {
                    return;
                }
                break;
            default:
                Object obj = this.f52919d;
                if (obj != null) {
                    try {
                        switch (((x) this.f52918c).f59203a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        int i11 = this.f52916a;
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        switch (this.f52916a) {
            case 0:
                break;
            case 1:
                break;
        }
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(k kVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        Object objOpen;
        switch (this.f52916a) {
            case 0:
                try {
                    InputStream inputStreamI = i();
                    this.f52919d = inputStreamI;
                    cVar.f(inputStreamI);
                } catch (FileNotFoundException e8) {
                    cVar.c(e8);
                    return;
                }
                break;
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = x.a((String) this.f52917b);
                    this.f52919d = byteArrayInputStreamA;
                    cVar.f(byteArrayInputStreamA);
                } catch (IllegalArgumentException e10) {
                    cVar.c(e10);
                    return;
                }
                break;
            default:
                try {
                    x xVar = (x) this.f52918c;
                    File file = (File) this.f52917b;
                    switch (xVar.f59203a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f52919d = objOpen;
                    cVar.f(objOpen);
                } catch (FileNotFoundException e11) {
                    cVar.c(e11);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public InputStream i() throws Throwable {
        Cursor cursorA;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iT;
        e eVar = (e) this.f52918c;
        ContentResolver contentResolver = eVar.f52922c;
        Uri uri = (Uri) this.f52917b;
        Cursor cursor = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorA = eVar.f52920a.a(uri);
            if (cursorA != null) {
                try {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Objects.toString(uri);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iT = r.t(eVar.f52923d, inputStreamOpenInputStream2, eVar.f52921b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (IOException | NullPointerException unused3) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Objects.toString(uri);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused4) {
                                        }
                                    }
                                    iT = -1;
                                    if (iT != -1) {
                                        return new i(inputStreamOpenInputStream, iT);
                                    }
                                    return inputStreamOpenInputStream;
                                }
                            } catch (Throwable th2) {
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                throw th2;
                            }
                        } else {
                            iT = -1;
                        }
                        if (iT != -1) {
                            return new i(inputStreamOpenInputStream, iT);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e8) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e8));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iT = r.t(eVar.f52923d, inputStreamOpenInputStream2, eVar.f52921b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iT = -1;
                    }
                    if (iT != -1) {
                        return new i(inputStreamOpenInputStream, iT);
                    }
                    return inputStreamOpenInputStream;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (SecurityException unused6) {
            cursorA = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                inputStreamOpenInputStream = null;
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iT = r.t(eVar.f52923d, inputStreamOpenInputStream2, eVar.f52921b);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iT = -1;
        }
        if (iT != -1) {
            return new i(inputStreamOpenInputStream, iT);
        }
        return inputStreamOpenInputStream;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
