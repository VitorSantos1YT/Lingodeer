package com.google.firebase.database.connection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ConnectionUtils {
    public static void a(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public static String b(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z11) {
                sb2.append("/");
            }
            sb2.append(str);
            z11 = false;
        }
        return sb2.toString();
    }

    public static ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("/", -1);
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            if (!strArrSplit[i11].isEmpty()) {
                arrayList.add(strArrSplit[i11]);
            }
        }
        return arrayList;
    }
}
