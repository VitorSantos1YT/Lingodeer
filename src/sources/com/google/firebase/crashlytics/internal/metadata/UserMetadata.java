package com.google.firebase.crashlytics.internal.metadata;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class UserMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetaDataStore f18431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsWorkers f18432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SerializeableKeysMap f18434d = new SerializeableKeysMap(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SerializeableKeysMap f18435e = new SerializeableKeysMap(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RolloutAssignmentList f18436f = new RolloutAssignmentList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference f18437g = new AtomicMarkableReference(null, false);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class SerializeableKeysMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f18438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f18439b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18440c;

        public SerializeableKeysMap(boolean z11) {
            this.f18440c = z11;
            this.f18438a = new AtomicMarkableReference(new KeysMap(z11 ? OSSConstants.DEFAULT_BUFFER_SIZE : 1024), false);
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.f18433c = str;
        this.f18431a = new MetaDataStore(fileStore);
        this.f18432b = crashlyticsWorkers;
    }

    public static UserMetadata c(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        List listB;
        FileInputStream fileInputStream;
        Throwable th2;
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        ((KeysMap) userMetadata.f18434d.f18438a.getReference()).c(metaDataStore.c(str, false));
        ((KeysMap) userMetadata.f18435e.f18438a.getReference()).c(metaDataStore.c(str, true));
        userMetadata.f18437g.set(metaDataStore.d(str), false);
        File fileB = fileStore.b(str, "rollouts-state");
        if (!fileB.exists() || fileB.length() == 0) {
            MetaDataStore.g(fileB, ep.a.e("The file has a length of zero for session: ", str));
            listB = Collections.EMPTY_LIST;
        } else {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(fileB);
                    try {
                        listB = MetaDataStore.b(CommonUtils.i(fileInputStream));
                        listB.toString();
                        CommonUtils.b(fileInputStream);
                    } catch (Exception unused) {
                        fileInputStream2 = fileInputStream;
                        MetaDataStore.f(fileB);
                        CommonUtils.b(fileInputStream2);
                        listB = Collections.EMPTY_LIST;
                    } catch (Throwable th3) {
                        th2 = th3;
                        CommonUtils.b(fileInputStream);
                        throw th2;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th4) {
                fileInputStream = fileInputStream2;
                th2 = th4;
            }
        }
        userMetadata.f18436f.b(listB);
        return userMetadata;
    }

    public static String d(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).d(str);
    }

    public final Map a(Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        SerializeableKeysMap serializeableKeysMap = this.f18434d;
        if (map.isEmpty()) {
            KeysMap keysMap = (KeysMap) serializeableKeysMap.f18438a.getReference();
            synchronized (keysMap) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(keysMap.f18398a));
            }
            return mapUnmodifiableMap2;
        }
        KeysMap keysMap2 = (KeysMap) serializeableKeysMap.f18438a.getReference();
        synchronized (keysMap2) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap2.f18398a));
        }
        HashMap map2 = new HashMap(mapUnmodifiableMap);
        for (Map.Entry entry : map.entrySet()) {
            String strA = KeysMap.a(1024, (String) entry.getKey());
            if (map2.size() < 64 || map2.containsKey(strA)) {
                map2.put(strA, KeysMap.a(1024, (String) entry.getValue()));
            }
        }
        return Collections.unmodifiableMap(map2);
    }

    public final Map b() {
        Map mapUnmodifiableMap;
        KeysMap keysMap = (KeysMap) this.f18435e.f18438a.getReference();
        synchronized (keysMap) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f18398a));
        }
        return mapUnmodifiableMap;
    }

    public final void e(String str) {
        final SerializeableKeysMap serializeableKeysMap = this.f18435e;
        synchronized (serializeableKeysMap) {
            try {
                if (((KeysMap) serializeableKeysMap.f18438a.getReference()).b(str)) {
                    AtomicMarkableReference atomicMarkableReference = serializeableKeysMap.f18438a;
                    atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                    Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.c
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            UserMetadata.SerializeableKeysMap serializeableKeysMap2 = serializeableKeysMap;
                            Map mapUnmodifiableMap = null;
                            serializeableKeysMap2.f18439b.set(null);
                            synchronized (serializeableKeysMap2) {
                                if (serializeableKeysMap2.f18438a.isMarked()) {
                                    KeysMap keysMap = (KeysMap) serializeableKeysMap2.f18438a.getReference();
                                    synchronized (keysMap) {
                                        mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f18398a));
                                    }
                                    AtomicMarkableReference atomicMarkableReference2 = serializeableKeysMap2.f18438a;
                                    atomicMarkableReference2.set((KeysMap) atomicMarkableReference2.getReference(), false);
                                }
                            }
                            if (mapUnmodifiableMap != null) {
                                UserMetadata userMetadata = UserMetadata.this;
                                userMetadata.f18431a.h(userMetadata.f18433c, mapUnmodifiableMap, serializeableKeysMap2.f18440c);
                            }
                        }
                    };
                    AtomicReference atomicReference = serializeableKeysMap.f18439b;
                    while (!atomicReference.compareAndSet(null, runnable)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    UserMetadata.this.f18432b.f18377b.a(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(final String str) {
        final Map mapUnmodifiableMap;
        synchronized (this.f18433c) {
            this.f18433c = str;
            KeysMap keysMap = (KeysMap) this.f18434d.f18438a.getReference();
            synchronized (keysMap) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f18398a));
            }
            final List listA = this.f18436f.a();
            this.f18432b.f18377b.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata userMetadata = this.f18442a;
                    MetaDataStore metaDataStore = userMetadata.f18431a;
                    AtomicMarkableReference atomicMarkableReference = userMetadata.f18437g;
                    String str2 = (String) atomicMarkableReference.getReference();
                    String str3 = str;
                    if (str2 != null) {
                        String str4 = (String) atomicMarkableReference.getReference();
                        File fileB = metaDataStore.f18405a.b(str3, "user-data");
                        BufferedWriter bufferedWriter = null;
                        try {
                            MetaDataStore.AnonymousClass1 anonymousClass1 = new MetaDataStore.AnonymousClass1();
                            anonymousClass1.put("userId", str4);
                            String string = anonymousClass1.toString();
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), MetaDataStore.f18404b));
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                                CommonUtils.b(bufferedWriter2);
                            } catch (Exception unused) {
                                bufferedWriter = bufferedWriter2;
                                CommonUtils.b(bufferedWriter);
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedWriter = bufferedWriter2;
                                CommonUtils.b(bufferedWriter);
                                throw th;
                            }
                        } catch (Exception unused2) {
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    Map map = mapUnmodifiableMap;
                    if (!map.isEmpty()) {
                        metaDataStore.h(str3, map, false);
                    }
                    List list = listA;
                    if (list.isEmpty()) {
                        return;
                    }
                    metaDataStore.i(str3, list);
                }
            });
        }
    }
}
