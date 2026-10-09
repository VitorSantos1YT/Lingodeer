package com.google.firebase.crashlytics.internal.metadata;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.encoders.DataEncoder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class MetaDataStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f18404b = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f18405a;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends JSONObject {
    }

    public MetaDataStore(FileStore fileStore) {
        this.f18405a = fileStore;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String string = jSONArray.getString(i11);
            try {
                DataEncoder dataEncoder = RolloutAssignment.f18428a;
                JSONObject jSONObject = new JSONObject(string);
                arrayList.add(RolloutAssignment.a(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion")));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.f18428a.b(list.get(i11))));
            } catch (JSONException unused) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map c(String str, boolean z11) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th2;
        FileStore fileStore = this.f18405a;
        File fileB = z11 ? fileStore.b(str, "internal-keys") : fileStore.b(str, "keys");
        if (!fileB.exists() || fileB.length() == 0) {
            g(fileB, ep.a.e("The file has a length of zero for session: ", str));
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileB);
                try {
                    HashMap mapA = a(CommonUtils.i(fileInputStream));
                    CommonUtils.b(fileInputStream);
                    return mapA;
                } catch (Exception unused) {
                    fileInputStream2 = fileInputStream;
                    f(fileB);
                    CommonUtils.b(fileInputStream2);
                    return Collections.EMPTY_MAP;
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

    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileB = this.f18405a.b(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!fileB.exists() || fileB.length() == 0) {
            f(fileB);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileB);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                    String strOptString = jSONObject.isNull("userId") ? null : jSONObject.optString("userId", null);
                    CommonUtils.b(fileInputStream);
                    return strOptString;
                } catch (Exception unused) {
                    f(fileB);
                    CommonUtils.b(fileInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                CommonUtils.b(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.b(fileInputStream2);
            throw th;
        }
    }

    public final void h(String str, Map map, boolean z11) throws Throwable {
        FileStore fileStore = this.f18405a;
        File fileB = z11 ? fileStore.b(str, "internal-keys") : fileStore.b(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f18404b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.b(bufferedWriter2);
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    f(fileB);
                    CommonUtils.b(bufferedWriter);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.b(bufferedWriter);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void i(String str, List list) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th2;
        File fileB = this.f18405a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            g(fileB, ep.a.e("Rollout state is empty for session: ", str));
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                String strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), f18404b));
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    CommonUtils.b(bufferedWriter);
                } catch (Exception unused) {
                    bufferedWriter2 = bufferedWriter;
                    f(fileB);
                    CommonUtils.b(bufferedWriter2);
                } catch (Throwable th3) {
                    th2 = th3;
                    CommonUtils.b(bufferedWriter);
                    throw th2;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th4) {
            bufferedWriter = bufferedWriter2;
            th2 = th4;
        }
    }
}
