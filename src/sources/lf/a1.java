package lf;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import bw.ORXQ.ADSb;
import com.adjust.sdk.Constants;
import com.facebook.FacebookException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static File f39964a;

    public static final void a(List list) {
        InputStream fileInputStream;
        File fileD;
        if (list.isEmpty()) {
            return;
        }
        if (f39964a == null && (fileD = d()) != null) {
            cz.k.R(fileD);
        }
        File fileD2 = d();
        if (fileD2 != null) {
            fileD2.mkdirs();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z0 z0Var = (z0) it.next();
                if (z0Var.f40145g) {
                    UUID callId = z0Var.f40139a;
                    String str = z0Var.f40143e;
                    kotlin.jvm.internal.m.f(callId, "callId");
                    File fileE = e(callId, true);
                    File file = null;
                    if (fileE != null) {
                        try {
                            file = new File(fileE, URLEncoder.encode(str, Constants.ENCODING));
                        } catch (UnsupportedEncodingException unused) {
                        }
                    }
                    if (file != null) {
                        arrayList.add(file);
                        Bitmap bitmap = z0Var.f40140b;
                        if (bitmap != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                j1.d(fileOutputStream);
                            } catch (Throwable th2) {
                                j1.d(fileOutputStream);
                                throw th2;
                            }
                        } else {
                            Uri uri = z0Var.f40141c;
                            if (uri != null) {
                                boolean z11 = z0Var.f40144f;
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                if (z11) {
                                    fileInputStream = re.s.a().getContentResolver().openInputStream(uri);
                                } else {
                                    try {
                                        fileInputStream = new FileInputStream(uri.getPath());
                                    } catch (Throwable th3) {
                                        j1.d(fileOutputStream2);
                                        throw th3;
                                    }
                                }
                                j1.j(fileInputStream, fileOutputStream2);
                                j1.d(fileOutputStream2);
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (IOException e8) {
            e8.toString();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                File file2 = (File) obj;
                if (file2 != null) {
                    try {
                        file2.delete();
                    } catch (Exception unused2) {
                    }
                }
            }
            throw new FacebookException(e8);
        }
    }

    public static final z0 b(UUID callId, Bitmap attachmentBitmap) {
        kotlin.jvm.internal.m.f(callId, "callId");
        kotlin.jvm.internal.m.f(attachmentBitmap, "attachmentBitmap");
        return new z0(callId, attachmentBitmap, null);
    }

    public static final z0 c(UUID callId, Uri attachmentUri) {
        kotlin.jvm.internal.m.f(callId, "callId");
        kotlin.jvm.internal.m.f(attachmentUri, "attachmentUri");
        return new z0(callId, null, attachmentUri);
    }

    public static final synchronized File d() {
        try {
            if (f39964a == null) {
                f39964a = new File(re.s.a().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f39964a;
    }

    public static void f(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        if (e.a() != null) {
            e.a();
            return;
        }
        e eVar = new e(context);
        if (!qf.a.b(e.class)) {
            try {
                if (!qf.a.b(eVar)) {
                    try {
                        x6.b bVarA = x6.b.a((Context) eVar.f39996b);
                        kotlin.jvm.internal.m.e(bVarA, "getInstance(applicationContext)");
                        bVarA.b(eVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th2) {
                        qf.a.a(eVar, th2);
                    }
                }
            } catch (Throwable th3) {
                qf.a.a(e.class, th3);
            }
        }
        if (!qf.a.b(e.class)) {
            try {
                e.f39994c = eVar;
            } catch (Throwable th4) {
                qf.a.a(e.class, th4);
            }
        }
        e.a();
    }

    public static Uri g(String str, int i11, int i12, String str2) {
        v0.k(str, "userId");
        int iMax = Math.max(i11, 0);
        int iMax2 = Math.max(i12, 0);
        if (iMax == 0 && iMax2 == 0) {
            throw new IllegalArgumentException("Either width or height must be greater than 0");
        }
        Uri.Builder builderPath = Uri.parse(String.format("https://graph.%s", Arrays.copyOf(new Object[]{re.s.f()}, 1))).buildUpon().path(String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{re.s.e(), str}, 2)));
        if (iMax2 != 0) {
            builderPath.appendQueryParameter("height", String.valueOf(iMax2));
        }
        if (iMax != 0) {
            builderPath.appendQueryParameter("width", String.valueOf(iMax));
        }
        builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
        if (!j1.y(str2)) {
            builderPath.appendQueryParameter("access_token", str2);
        } else if (!j1.y(re.s.c()) && !j1.y(re.s.b())) {
            builderPath.appendQueryParameter("access_token", re.s.b() + '|' + re.s.c());
        }
        Uri uriBuild = builderPath.build();
        kotlin.jvm.internal.m.e(uriBuild, "builder.build()");
        return uriBuild;
    }

    public static final File e(UUID uuid, boolean z11) {
        kotlin.jvm.internal.m.f(uuid, ADSb.QMnseA);
        if (f39964a == null) {
            return null;
        }
        File file = new File(f39964a, uuid.toString());
        if (z11 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
