package com.google.firebase.crashlytics.internal.persistence;

import bq.h;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import lf.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsReportPersistence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f18871e = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18872f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f18873g = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f18874h = new h(10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j0 f18875i = new j0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f18876a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileStore f18877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SettingsController f18878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f18879d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsController settingsController, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.f18877b = fileStore;
        this.f18878c = settingsController;
        this.f18879d = crashlyticsAppQualitySessionsSubscriber;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(bArr);
                if (i11 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f18871e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f18871e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        FileStore fileStore = this.f18877b;
        arrayList.addAll(FileStore.e(fileStore.f18885f.listFiles()));
        arrayList.addAll(FileStore.e(fileStore.f18886g.listFiles()));
        h hVar = f18874h;
        Collections.sort(arrayList, hVar);
        List listE = FileStore.e(fileStore.f18884e.listFiles());
        Collections.sort(listE, hVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(FileStore.e(this.f18877b.f18883d.list())).descendingSet();
    }

    public final void d(CrashlyticsReport.Session.Event event, String str, boolean z11) {
        FileStore fileStore = this.f18877b;
        int i11 = this.f18878c.d().f18915a.f18924a;
        f18873g.getClass();
        try {
            f(fileStore.b(str, a.g("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f18876a.getAndIncrement())), z11 ? "_" : BuildConfig.VERSION_NAME)), CrashlyticsReportJsonTransform.f18864a.b(event));
        } catch (IOException unused) {
        }
        j0 j0Var = new j0(4);
        fileStore.getClass();
        File file = new File(fileStore.f18883d, str);
        file.mkdirs();
        List<File> listE = FileStore.e(file.listFiles(j0Var));
        Collections.sort(listE, new h(11));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i11) {
                return;
            }
            FileStore.d(file2);
            size--;
        }
    }
}
