package com.adjust.sdk.sig;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7401a = false;

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) throws Exception {
        byte[] bArrA;
        if (f7401a || map == null || map.size() == 0 || str == null || str2 == null) {
            return;
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i11 = 2;
        while (true) {
            if (i11 <= 0) {
                bArrA = null;
                break;
            }
            try {
                cVar.b(context);
                bArrA = cVar.a(context, map.toString().getBytes(Constants.ENCODING));
                break;
            } catch (b e8) {
                f7401a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e8;
            } catch (InvalidKeyException e10) {
                e = e10;
            } catch (UnrecoverableKeyException e11) {
                e = e11;
            } catch (Exception e12) {
                e12.getMessage();
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e12;
            }
            e.getMessage();
            i11--;
            cVar.a(context);
        }
        if (i11 == 0) {
            f7401a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        byte[] bArrA2 = ((NativeLibHelper) aVar).a(context, map, bArrA, cVar.f7400a);
        if (bArrA2 == null) {
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = bArrA2.length;
        char[] cArr = e.f7402a;
        char[] cArr2 = new char[length * 2];
        for (int i12 = 0; i12 < length; i12++) {
            byte b3 = bArrA2[i12];
            int i13 = i12 * 2;
            char[] cArr3 = e.f7402a;
            cArr2[i13] = cArr3[(b3 & 255) >>> 4];
            cArr2[i13 + 1] = cArr3[b3 & 15];
        }
        map.put("signature", new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
    }
}
