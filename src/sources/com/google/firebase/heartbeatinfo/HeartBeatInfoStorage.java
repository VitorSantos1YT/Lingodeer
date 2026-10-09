package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.os.Build;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jh.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class HeartBeatInfoStorage {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r5.d f19677b = new r5.d("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r5.d f19678c = new r5.d("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r5.d f19679d = h.w("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JavaDataStorage f19680a;

    public HeartBeatInfoStorage(Context context, String str) {
        this.f19680a = new JavaDataStorage(context, ep.a.e("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : this.f19680a.b().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new AutoValue_HeartBeatResult(new ArrayList(hashSet), ((r5.d) entry.getKey()).f48822a));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f19680a.a(new fz.c() { // from class: com.google.firebase.heartbeatinfo.g
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        ((r5.b) obj).e(HeartBeatInfoStorage.f19677b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String b(long j11) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j11)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j11));
    }

    public final synchronized r5.d c(r5.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return h.x(((r5.d) entry.getKey()).f48822a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(r5.b bVar, String str) {
        try {
            r5.d dVarC = c(bVar, str);
            if (dVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.a(bVar, dVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.d(dVarC);
            } else {
                bVar.f(dVarC, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean e(r5.d dVar, long j11) {
        long jLongValue;
        jLongValue = ((Long) this.f19680a.c(dVar)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j11))) {
            return false;
        }
        this.f19680a.d(dVar, Long.valueOf(j11));
        return true;
    }
}
