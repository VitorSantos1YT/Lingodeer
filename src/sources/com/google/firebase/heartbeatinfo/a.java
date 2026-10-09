package com.google.firebase.heartbeatinfo;

import android.util.Base64OutputStream;
import com.adjust.sdk.Constants;
import com.google.firebase.datastorage.JavaDataStorageKt;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import jh.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f19682b;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i11) {
        this.f19681a = i11;
        this.f19682b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f19681a) {
            case 0:
                DefaultHeartBeatController defaultHeartBeatController = this.f19682b;
                synchronized (defaultHeartBeatController) {
                    try {
                        final HeartBeatInfoStorage heartBeatInfoStorage = (HeartBeatInfoStorage) defaultHeartBeatController.f19672a.get();
                        ArrayList arrayListA = heartBeatInfoStorage.a();
                        synchronized (heartBeatInfoStorage) {
                            heartBeatInfoStorage.f19680a.a(new fz.c() { // from class: com.google.firebase.heartbeatinfo.f
                                @Override // fz.c
                                public final Object invoke(Object obj) {
                                    r5.b bVar = (r5.b) obj;
                                    r5.d dVar = HeartBeatInfoStorage.f19678c;
                                    long j11 = 0;
                                    for (Map.Entry entry : bVar.a().entrySet()) {
                                        if (entry.getValue() instanceof Set) {
                                            r5.d dVar2 = (r5.d) entry.getKey();
                                            Set set = (Set) entry.getValue();
                                            String strB = heartBeatInfoStorage.b(System.currentTimeMillis());
                                            if (set.contains(strB)) {
                                                Object[] objArr = {strB};
                                                HashSet hashSet = new HashSet(1);
                                                Object obj2 = objArr[0];
                                                Objects.requireNonNull(obj2);
                                                if (!hashSet.add(obj2)) {
                                                    throw new IllegalArgumentException(p0.k(obj2, "duplicate element: "));
                                                }
                                                bVar.e(dVar2, Collections.unmodifiableSet(hashSet));
                                                j11++;
                                            } else {
                                                bVar.d(dVar2);
                                            }
                                        }
                                    }
                                    if (j11 == 0) {
                                        bVar.d(dVar);
                                        return null;
                                    }
                                    bVar.e(dVar, Long.valueOf(j11));
                                    return null;
                                }
                            });
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
                            HeartBeatResult heartBeatResult = (HeartBeatResult) arrayListA.get(i11);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", heartBeatResult.b());
                            jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes(Constants.ENCODING));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString(Constants.ENCODING);
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return string;
            default:
                DefaultHeartBeatController defaultHeartBeatController2 = this.f19682b;
                synchronized (defaultHeartBeatController2) {
                    final HeartBeatInfoStorage heartBeatInfoStorage2 = (HeartBeatInfoStorage) defaultHeartBeatController2.f19672a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strA = ((UserAgentPublisher) defaultHeartBeatController2.f19674c.get()).a();
                    synchronized (heartBeatInfoStorage2) {
                        final String strB = heartBeatInfoStorage2.b(jCurrentTimeMillis);
                        final r5.d dVarX = h.x(strA);
                        heartBeatInfoStorage2.f19680a.a(new fz.c() { // from class: com.google.firebase.heartbeatinfo.e
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // fz.c
                            public final Object invoke(Object obj) {
                                Object obj2;
                                HeartBeatInfoStorage heartBeatInfoStorage3 = heartBeatInfoStorage2;
                                String str = strB;
                                String str2 = strA;
                                r5.d dVar = dVarX;
                                r5.b bVar = (r5.b) obj;
                                r5.d dVar2 = HeartBeatInfoStorage.f19677b;
                                Object obj3 = null;
                                if (((String) JavaDataStorageKt.a(bVar, HeartBeatInfoStorage.f19679d, BuildConfig.VERSION_NAME)).equals(str)) {
                                    r5.d dVarC = heartBeatInfoStorage3.c(bVar, str);
                                    if (dVarC == null || dVarC.f48822a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (heartBeatInfoStorage3) {
                                        heartBeatInfoStorage3.d(bVar, str);
                                        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.a(bVar, dVar, new HashSet()));
                                        hashSet.add(str);
                                        bVar.f(dVar, hashSet);
                                    }
                                    return null;
                                }
                                r5.d dVar3 = HeartBeatInfoStorage.f19678c;
                                long jLongValue = ((Long) JavaDataStorageKt.a(bVar, dVar3, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (heartBeatInfoStorage3) {
                                        try {
                                            long jLongValue2 = ((Long) JavaDataStorageKt.a(bVar, dVar3, 0L)).longValue();
                                            String str3 = BuildConfig.VERSION_NAME;
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : bVar.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        Object obj4 = obj3;
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((r5.d) entry.getKey()).f48822a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            bVar.f(h.x(str3), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            bVar.e(HeartBeatInfoStorage.f19678c, Long.valueOf(jLongValue));
                                        } catch (Throwable th7) {
                                            throw th7;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) JavaDataStorageKt.a(bVar, dVar, new HashSet()));
                                hashSet4.add(str);
                                bVar.f(dVar, hashSet4);
                                bVar.e(HeartBeatInfoStorage.f19678c, Long.valueOf(jLongValue + 1));
                                bVar.e(HeartBeatInfoStorage.f19679d, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
