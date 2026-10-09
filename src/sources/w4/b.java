package w4;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import androidx.recyclerview.widget.p2;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f54627a = new p2(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bq.h f54628b = new bq.h(28);

    public static u a(Context context, List list) {
        Trace.beginSection(v10.c.L("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                d dVar = (d) list.get(i11);
                ProviderInfo providerInfoB = b(context.getPackageManager(), dVar, context.getResources());
                if (providerInfoB == null) {
                    return new u();
                }
                arrayList.add(c(context, dVar, providerInfoB.authority));
            }
            return new u(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        bq.h hVar = f54628b;
        p2 p2Var = f54627a;
        Trace.beginSection(v10.c.L("FontProvider.getProvider"));
        try {
            List listL = dVar.f54632d;
            String str = dVar.f54629a;
            String str2 = dVar.f54630b;
            if (listL == null) {
                listL = q4.a.l(resources, 0);
            }
            a aVar = new a();
            aVar.f54624a = str;
            aVar.f54625b = str2;
            aVar.f54626c = listL;
            ProviderInfo providerInfo = (ProviderInfo) p2Var.j(aVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, hVar);
            for (int i11 = 0; i11 < listL.size(); i11++) {
                ArrayList arrayList2 = new ArrayList((Collection) listL.get(i11));
                Collections.sort(arrayList2, hVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            p2Var.q(aVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i12), (byte[]) arrayList2.get(i12))) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h[] c(Context context, d dVar, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        String str2 = OCBJEWZHh.hWAnsW;
        Trace.beginSection(v10.c.L("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(str2).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(str2).authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(v10.c.L("ContentQueryWrapper.query"));
                try {
                    try {
                        String[] strArr2 = {dVar.f54631c};
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        Trace.endSection();
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                            int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                            int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                            while (cursorQuery.moveToNext()) {
                                int i11 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                arrayList2.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i11));
                                contentProviderClientAcquireUnstableContentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                            }
                            contentProviderClient2 = contentProviderClientAcquireUnstableContentProviderClient;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        h[] hVarArr = (h[]) arrayList.toArray(new h[0]);
                        Trace.endSection();
                        return hVarArr;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    contentProviderClient = context;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != 0) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }
}
