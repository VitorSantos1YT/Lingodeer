package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FileStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f18881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f18882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f18883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f18884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f18885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f18886g;

    public FileStore(Context context) {
        String string;
        String strD = ProcessDetailsProvider.f18223a.c(context).d();
        this.f18880a = strD;
        File filesDir = context.getFilesDir();
        this.f18881b = filesDir;
        if (strD.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            sb2.append(strD.length() > 40 ? CommonUtils.h(strD) : strD.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb2.toString();
        }
        File file = new File(filesDir, string);
        c(file);
        this.f18882c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f18883d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f18884e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f18885f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f18886g = file5;
    }

    public static synchronized void c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                file.delete();
            }
            if (!file.mkdirs()) {
                file.toString();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public final void a(String str) {
        File file = new File(this.f18881b, str);
        if (file.exists() && d(file)) {
            file.getPath();
        }
    }

    public final File b(String str, String str2) {
        File file = new File(this.f18883d, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
